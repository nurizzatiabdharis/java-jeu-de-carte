package Modele.jeu;

import java.util.LinkedList;
import java.util.Scanner;

import Modele.cartes.JeuDeCartes;
import Modele.cartes.Tricks;
import Modele.joueur.Bot;
import Modele.joueur.Date;
import Modele.joueur.Joueur;

public class Partie {

	public static int nbJoueur = 0;
	public static boolean presenceBOT = false;
	public static String niveauDifficulte = null;
	public static boolean botARealiseTrick1=false;
	public static boolean botARealiseTrick2=false;
	
	public LinkedList <Tricks> tricksDeck; //dect
	public LinkedList <Tricks> tricksPile;
	public PartieDeCartes pdc;
	public JeuDeCartes jdc;
	private Scanner menu; 
	private Scanner menu2;
	private Scanner menu3;
	private Scanner menu4;
	
	public Partie() {
		pdc = new PartieDeCartes();
		jdc = new JeuDeCartes();
		jdc.melangerTricks();
		tricksDeck = jdc.tasDeTricks;
		tricksPile = new LinkedList<Tricks>();
	}

        /**
         * Methode appeler pour lancer le jeu, le joueur sera demandé de creer son identifiant(nom, datedeNaissance) .
         */
	public void commencerJeu() {
		int compteurBot=0;
		System.out.println("*************************************************");
		System.out.println("*\t\tTHE OTHER HAT TRICK\t\t*");
		
		while(nbJoueur !=3) {
			//choix de joueur avant de commencer le jeu
			System.out.println("*************************************************");
			System.out.println("Choix 1 : Ajouter Joueur");
			if(compteurBot<2) {System.out.println("Choix 2 : Ajouter BOT");}
			System.out.println("Votre choix : ");
			
			menu = new Scanner(System.in);
			String choix = menu.nextLine();
			if(compteurBot<2)
			{
				switch(choix){
				case "1" : //creer des joueurs
					if(nbJoueur < 3) { //maximum 3 joueur
						creerJoueur();
					} else {
						System.out.print("Maximum 3 Jouers! Vous pouvez commencer le jeu \n");
					}
					break;
				case "2" : //creer BOT
					compteurBot++;
					if(nbJoueur < 3) { //maximum 3 joueur
						creerBOT();
						presenceBOT=true;
					} else {
						System.out.print("Maximum 3 Jouers! Vous pouvez commencer le jeu \n");
					}
					break;
				default :
					System.out.println("choix inconnu! Choisissez un parmis ces deux ");
					break;
				}
			}
			else
			{
				switch(choix){
				case "1" : //creer des joueurs
					if(nbJoueur < 3) { //maximum 3 joueur
						creerJoueur();
					} else {
						System.out.print("Maximum 3 Jouers! Vous pouvez commencer le jeu \n");
					}
					break;
				default :
					System.out.println("choix inconnu! ");
					break;
				}
			}
			
		}
		
		if (presenceBOT) { //s'il existe BOT dans jeu
			choisirDifficulteBot();
		}
		
		System.out.println("*************************************************");
		System.out.println("C'est parti! le joueur le plus jeune commence! \n");
		pdc.distribuerCartes();
		pdc.trierJoueur();
		tours();
	}

         /**
         * Méthode va demander au utilisateur de créer les joueurs 
         * Il va ensuite appeler le constructeur Joueur() pour creer les instances de Joueur.
         */
	public void creerJoueur(){
		menu2 = new Scanner(System.in);
		System.out.println("Saisir les informations de joueur ");
		System.out.println("nom : ");
		String nom = menu2.nextLine();
		System.out.println("date de naissance (yyyy-mm-dd): "); 
		String dateNais=menu2.next(); 
		
		if(dateNais.contains("-")){
			String[] date = dateNais.split("-");
			int year = Integer.parseInt(date[0]); 
			int month = Integer.parseInt(date[1]);
			int day = Integer.parseInt(date[2]);
			
			boolean dateValide = verifierDateValide(year,month,day);
			
			if(dateValide) {
				Date dateN = new Date(year, month, day);
				Joueur j = new Joueur(nom,dateN);
				pdc.ajouterJoueur(j);
				System.out.println("Joueur "+j.getNomJoueur()+" creé");
				nbJoueur++;
			} else {
				System.out.println("Invalide date, création de joueur échoué!");
			}
		}else{
			System.out.println("Création de joueur échoué! Veuillez saisir un bon format de date(yyyy-mm-dd)");
		}
	}

        /**
         * Méthode pour vérifier la validation de la date de naissance saisir par utilisateur
         * @param year nombre d'année doit être 4 chiffres
         * @param month mois compris entre 1 jusqu'à 12
         * @param day le nombre de jour
         * @return 
         */
	private boolean verifierDateValide(int year, int month, int day) {
            int count = 0;
            while(year != 0){ //verifie 4 digit annee
                year /= 10; ++count; 
            } 
        
            if((count == 4) && (month > 0 && month <= 12) && (day > 0 && day <= 31)) { 
                    return true; //date valide
            } else {
                    return false; //date invalide
            }
	}

        /**
         * Méthode qui va appeler le constructeur Bot() pour creer les instances de Joueur.
         */
	private void creerBOT() {
		String nomBot = "BOT";
		Joueur b = new Bot(nomBot);
		pdc.ajouterJoueur(b);
		System.out.println(b.getNomJoueur()+" creé!");
		nbJoueur++;
		presenceBOT = true;
	}
        /**
         * Méthode pour choisir la niveau de difficulté de jeu et le définir dans l'attribut niveauDifficulte.
         */
	public void choisirDifficulteBot(){
		while(niveauDifficulte == null) {
			System.out.println("*************************************************");
			System.out.println("Choisir le niveu de difficulte ");
			System.out.println("Choix 1 : Facile");
			System.out.println("Choix 2 : Difficile");
			
			menu4 = new Scanner(System.in);
			String choix = menu4.nextLine();
			switch(choix){
			case "1" : 
				niveauDifficulte = "facile";
				break;
			case "2" : 
				niveauDifficulte = "difficile";
				break;
			default :
				System.out.println("choix inconnu! Choisissez un parmis ces trois ");
				break;
			}
		}
	}
        
        /**
         * Méthode pour jouer le jeu chaque joueurs, chaque joueur passera son tour dans l’ordre jusqu’à la fin du jeu
         * Pour le jeu physique, le joueur en cours est demandé soit de réaliser le trick courant ou passer au prochain trick,
         * Une fois son choix effectué, la méthode permettant de préparer ses props est appelé.
         * Pour BOT,
         */
	public void tours() {
		while(!pdc.estTerminee()) {
			for(int nbJoueur = 0; nbJoueur < 3; nbJoueur ++) {
				Joueur joueurEnCours = pdc.joueurs.get(nbJoueur);
				if(tricksPile.isEmpty()) {
					tricksPile.add(tricksDeck.pop());
				}
				
				if (!joueurEnCours.getNomJoueur().contains("BOT")){ 
					System.out.println("_________________________________________");
					System.out.println("Tricks en cours : "+ tricksPile.get(0));
					System.out.println("_________________________________________");
					System.out.println("Joueur en cours : "+joueurEnCours.getNomJoueur());
					System.out.println("Votre props : \n"+joueurEnCours.afficherProps());
					System.out.println("Choix 1 : Realiser ce Tricks");
					System.out.println("Choix 2 : Passer au prochain Tricks");
					menu3 = new Scanner(System.in);
					String choix = menu3.nextLine();
					
					
					switch(choix) {
					case "1": //realiser le trick afficher au pile
						Tricks trickEnCours = tricksPile.get(0);
						joueurEnCours.preparerProps(pdc.joueurs);
						if(joueurEnCours.realiserTricks(trickEnCours)) {
							tricksPile.remove(trickEnCours);
							System.out.println("Vous avez réalisé ce Trick!");
							joueurEnCours.addPoint(trickEnCours.getPoint());
							pdc.closePropApresRealise(joueurEnCours.getMain());
							pdc.getProps().add(joueurEnCours.choisiDeuxParmiTroisProp(pdc.getSeptiemeProp()));
							System.out.println("Votre point courant :" + joueurEnCours.getPoint());
						}
						else
						{
							System.out.println("Vous n'avez pas réalisé ce Trick :(");
							joueurEnCours.choisiUnPropRevele();
							System.out.println("Votre point courant :" + joueurEnCours.getPoint());
							
						}
						break;
					case "2": //pop nouveau trick depuis deck et le realiser
						Tricks e = tricksDeck.pop();
						tricksPile.add(0,e);
						Tricks trickEnCours2 = tricksPile.get(0);
						System.out.println("_________________________________________");
						System.out.println("Tricks en cours : " + trickEnCours2);
						System.out.println("_________________________________________");
						joueurEnCours.preparerProps(pdc.joueurs);
						if(joueurEnCours.realiserTricks(trickEnCours2)) {
							tricksPile.remove(trickEnCours2);
							System.out.println("Vous avez réalisé ce Trick!");
							joueurEnCours.addPoint(trickEnCours2.getPoint());
							pdc.closePropApresRealise(joueurEnCours.getMain());
							pdc.getProps().add(joueurEnCours.choisiDeuxParmiTroisProp(pdc.getSeptiemeProp()));
							System.out.println("Votre point courant :" + joueurEnCours.getPoint());
						}
						else
						{
							System.out.println("Vous n'avez pas réalisé ce Trick :( ");
							joueurEnCours.choisiUnPropRevele();
							System.out.println("Votre point courant :" + joueurEnCours.getPoint());
						}
						break;
					default :
						System.out.println("choix inconnu! Choisissez un parmis ces deux ");
						break;
					}	
	
				}//Pour le bot on utilise strategie
				else {
					Tricks trickEnCours = tricksPile.get(0);
					Tricks e = tricksDeck.pop();
					tricksPile.add(0,e);
					Tricks trickEnCours2 = tricksPile.get(0);
					
					if (niveauDifficulte == "facile") {
						Bot.JouerFacile((Bot) joueurEnCours,trickEnCours,trickEnCours2,pdc);
						System.out.println(joueurEnCours.getNomJoueur() + " a joué son tour");
						System.out.println("*************************************************");
					} else if (niveauDifficulte == "difficile") {
						Bot.JouerDifficile((Bot) joueurEnCours,trickEnCours,trickEnCours2,pdc);
						System.out.println(joueurEnCours.getNomJoueur() + " a joué son tour");
						System.out.println("*************************************************");
					}
					
					if(botARealiseTrick1) {this.tricksPile.remove(trickEnCours);}
				}
			}
		}
		System.out.println("Jeu terminer!!!!!");
		System.out.println(pdc.quiGagne().getNomJoueur()+"EST GAGNE !!!!!!!!!!!!!");
	}

       
}