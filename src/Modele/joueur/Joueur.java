package Modele.joueur;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import Modele.cartes.Props;
import Modele.cartes.Tricks;
/**
 *
 * @author nurizzatibintiabdharis_nadwahazizahbintimohdkamalazhari
 */
public class Joueur {
	
	private static int nbJoueur=0;
	public static int DEFAULT_INT =0;
	public static Date DEFAULT_DATE= new Date(1900,1,1);
	
	private int numJouer;
	private String NomJoueur;
	private Date dateDeNaissance;
	private int point;
	private ArrayList<Props> main;
	private Scanner menu3;
	private Scanner menu5;
	private Scanner menu7;
	
	
	public Joueur(String NomJoueur, Date dateDeNaissance) {
		nbJoueur++;
		this.NomJoueur = NomJoueur;
		this.dateDeNaissance = dateDeNaissance;
		this.numJouer = nbJoueur;
		this.point = DEFAULT_INT;
		this.main = new ArrayList<Props>();
	}
	public Joueur(String NomJoueur) {//for robot
		nbJoueur++;
		this.NomJoueur = NomJoueur;
		this.dateDeNaissance = DEFAULT_DATE;
		this.numJouer = nbJoueur;
		this.point = DEFAULT_INT;
		this.main = new ArrayList<Props>();
	}
        
        /**
        *Ce sont les méthodes setter et getter
        * @author nurizzatibintiabdharis_nadwahazizahbintimohdkamalazhari
        */
	public ArrayList<Props> getMain(){return this.main;}
	public String getNomJoueur() {return this.NomJoueur;}
	public Date getDateNaissance() {return this.dateDeNaissance;}
	public int getNumJoueur() {return this.numJouer;}
	public int getPoint() {return this.point;}
	public void setStatusMain(int positionProps, boolean estRevele) {
		this.main.get(positionProps).setEstRevele(estRevele);
	}
	public void setnumJoueur(int num) {this.numJouer = num;}
	public void addPoint(int pointAjoute){this.point = this.point + pointAjoute;}
	public void removePoint(int pointEnleve){this.point = this.point - pointEnleve;}
	
        /**
         * Cette methode pour echange Carte entre les joueur 
         * echangeCarte est utilisé pour remplacer l'élément donnée au parametre dans la liste main
         * 
         * @param index le lieu où vous voulez remplacer le prop
         * @param prop le Prop qu'on met sur la liste
         */
	public void echangeCarte(int index, Props prop) {
		main.set(index, prop);
	}
        
	/**
         * Cette methode est utilisé pour prendre le prop au debut du jeu
         * @param prop le Prop qu'on met sur main
         */
	public void prendreProp(Props prop) {
		main.add(prop);
	}
	
	/**
         * Cette methode est utilisé pour prendre le prop au debut du jeu
         * @param positionProp l'index du Prop que nous voulons récuperer
         * @return retourner les Prop demandée
         */
	public Props getUnProp(int positionProp) {
		Props p = this.main.get(positionProp);		
		return p;
	}
	
        /**
        *Afficher tous les props du joueur
        * @return Une chaine du caractere des noms du props du joueurs
        */
	public StringBuffer afficherProps() {
		StringBuffer sb = new StringBuffer();
		
		for(int i =0 ; i<this.main.size() ; i++) {
			sb.append(i+1+".");
			sb.append(this.main.get(i));
			sb.append("\n");
		}
		
		return sb;
	}
	
        /**
        *Afficher tous les props du joueur aux autres joueurs
        * les Props qui n'a pas encore revelé va être caché
        * @return Une chaine du caractere des noms du props du joueurs aux autres joueurs
        */
	public StringBuffer afficherPropsAuxAutresJoueurs() {
		StringBuffer sb = new StringBuffer();
		sb.append(NomJoueur);
		sb.append("\n");
		sb.append("1.");
		if(this.main.get(0).getEstRevele()==true) {sb.append(this.main.get(0));}
		else {sb.append("*****");}
		sb.append("\n2.");
		if(this.main.get(1).getEstRevele()==true) {sb.append(this.main.get(1));}
		else {sb.append("*****");}
		sb.append("\n");
		
		return sb;
	}

        /**
        *Réalisation de trick par joueur en régardant les listes des props qu'il a
        * @return Une un boolean true si le joueur peut réaliser le trick et false sinon
        * @param le trick que le joueur doir réaliser
        */
	public boolean realiserTricks(Tricks trick){
		System.out.println(main);
		System.out.println(trick);
		boolean premierePropVerifie;
		boolean secondPropVerifie;
		if(trick.getNom() != "The Bunch of Carrots") {
			if(trick.premiereProps.contains(this.getUnProp(0).getNom()) || trick.premiereProps.contains(this.getUnProp(1).getNom())) {
				premierePropVerifie = true;
			}else {
				premierePropVerifie = false;
			}
			
			if(trick.secondProps.contains(this.getUnProp(0).getNom()) || trick.secondProps.contains(this.getUnProp(1).getNom())) {
				secondPropVerifie = true;
			}else {
				secondPropVerifie = false;
			}
		}else {
			if(this.getUnProp(0).getNom()=="Carrots" && this.getUnProp(1).getNom()=="Carrots"){
				premierePropVerifie = true;
				secondPropVerifie = true;
			}else {
				premierePropVerifie =false;
				secondPropVerifie = false;
			}
		}
		
		if(premierePropVerifie == true && secondPropVerifie == true) {
			return true;
		}else {
			
			return false;
		}
		
	}
	
        /**
        *Choisir un prop pour être revelée
        *
        */
	public void choisiUnPropRevele() {
		if(this.main.get(0).getEstRevele()==true && this.main.get(1).getEstRevele()==true)
		{
			System.out.println("les deux props sont deja reveles");
		}else {
			System.out.println("Choisissez l'un de votre prop pour étre revelé");
			
			if(this.main.get(0).getEstRevele()==true) {
				System.out.println("2."+this.main.get(1).getNom());
				System.out.println("Ce prop est revele");
				this.main.get(1).setEstRevele(true);
				System.out.println(this.afficherPropsAuxAutresJoueurs());
			}
			else
			{
				if(this.main.get(1).getEstRevele()==true) {
					System.out.println("1."+this.main.get(0).getNom());
					System.out.println("Ce prop est revele");
					this.main.get(0).setEstRevele(true);
					System.out.println(this.afficherPropsAuxAutresJoueurs());
				}
				else {
					menu7 = new Scanner(System.in);
					String choix = menu7.nextLine();
					int numPropChoisi = Integer.parseInt(choix);
					
					while(!(numPropChoisi>0 && numPropChoisi<3)) {
						System.out.println("erreur de choix, entrez la valeur des joueurs affichés :");
						choix = menu7.nextLine();
						numPropChoisi = Integer.parseInt(choix);
					}
					
					this.main.get(numPropChoisi-1).setEstRevele(true);
					System.out.println(this.afficherPropsAuxAutresJoueurs());
					
				}
			}			
		}
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(NomJoueur);
		sb.append(" : ");
		sb.append(this.main);
		sb.append("\n");
		return sb.toString();
	}
	
        /**
        *Preparer le prop avant de réaliser le trick
        * choisir un prop d'autre joueur pour echange avec le prop du joueur courant
        * @param joueurs contient la liste des joueurs dans le jeu
        */
	public void preparerProps(ArrayList<Joueur> joueurs) {
		System.out.println("Choisissez l'un de votre carte pour s'echanger, entrez la valeur 1 ou 2 :");
		System.out.println(this.afficherProps());
		menu5 = new Scanner(System.in);
		String choix = menu5.nextLine();
		int numPropJouer = Integer.parseInt(choix);
		
		while(!(numPropJouer>0 && numPropJouer<3)) {
			System.out.println("erreur de choix, entrez la valeur 1 ou 2 :");
			System.out.println(this.afficherProps());
			choix = menu5.nextLine();
			numPropJouer = Integer.parseInt(choix);
		}
		
		System.out.println("Choisissez l'un des props d'autres participants");
		
		Iterator <Joueur> it = joueurs.iterator();
		//int[] numAutresAdversaire = new int[2];
		while(it.hasNext()){
			Joueur[] j = new Joueur[3];
			j[0] = it.next();
			j[1] = it.next();
			j[2] = it.next();
			
			for(int i=0 ; i<3 ; i++) {
				if(!j[i].equals(this)) {
					System.out.println(j[i].getNumJoueur() + " : " + j[i].afficherPropsAuxAutresJoueurs());
					
				}
			}
			System.out.println("Quel joueur?");
			int numAdversaire;
			choix = menu5.nextLine();
			int numAdversaireP = Integer.parseInt(choix);
			
			//Pour s'assurer que le numero de joueur n'est le numero de lui meme
			if(numAdversaireP == this.getNumJoueur())
				numAdversaire = 10;
			else
				numAdversaire =numAdversaireP;
			
			while(!(numAdversaire>=0 && numAdversaire<3)) {
				System.out.println("erreur de choix, entrez la valeur des joueurs affichés :");
				choix = menu5.nextLine();
				numAdversaireP = Integer.parseInt(choix);
				
				if(numAdversaireP == this.getNumJoueur())
					numAdversaire = 10;
				else
					numAdversaire =numAdversaireP;
			}
			
			System.out.println("Quel prop?");
			choix = menu5.nextLine();
			int numPropAdversaire = Integer.parseInt(choix);
			
			while(!(numPropAdversaire>0 && numPropAdversaire<3)) {
				System.out.println("erreur de choix, entrez la valeur 1 ou 2 :");
				choix = menu5.nextLine();
				numPropAdversaire = Integer.parseInt(choix);
			}
			
			Props propAdversaire = joueurs.get(numAdversaire).getUnProp(numPropAdversaire-1);
			Props propJoueurEnCours = this.getUnProp(numPropJouer-1);
			
			joueurs.get(numAdversaire).echangeCarte(numPropAdversaire-1, propJoueurEnCours);
			this.echangeCarte(numPropJouer-1, propAdversaire);
			
			//Prop propAdversaire = 
		}
	}

        /**
        *Apres avoir réalisé une trick, le joueur doit chiosir deux parmis le trois cartes(ses cartes + 7ième carte)
        * choisir un prop d'autre joueur pour echange avec le prop du joueur courant
        * @param septiemeProp contient le 7ième prop
        */
	public Props choisiDeuxParmiTroisProp(Props septiemeProp) {
		System.out.println("Prenez le septieme prop, vous avez");
		this.prendreProp(septiemeProp);
		System.out.println(this.afficherProps());
		System.out.println("Choisissez deux parmi trois cartes. Choisissex un prop que vous ne voulez pas");
		menu3 = new Scanner(System.in);
		String choix = menu3.nextLine();
		int numPropChoisi = Integer.parseInt(choix);
		while(!(numPropChoisi>0 && numPropChoisi<4)) {
			System.out.println("erreur de choix, entrez la valeur des joueurs affichés :");
			choix = menu3.nextLine();
			numPropChoisi = Integer.parseInt(choix);
		}
		numPropChoisi = numPropChoisi-1;
		Props newSeptiemeProp = main.get(numPropChoisi); main.remove(numPropChoisi);
		return newSeptiemeProp;

	}
	
}
