package Modele.strategie;

import java.util.ArrayList;
import java.util.Collections;

import Modele.cartes.Props;
import Modele.cartes.Tricks;
import Modele.jeu.Partie;
import Modele.jeu.PartieDeCartes;
import Modele.joueur.Bot;
import Modele.joueur.Joueur;
        /**
        *
        * @author nurizzatibintiabdharis_nadwahazizahbintimohdkamalazhari
        */

public class FacileStrategie implements Strategie {
	Bot bot;
	public FacileStrategie(Bot bot) {
		this.bot = bot;
	}
        /**
        *La methode pour choisir un numéro aléatoire
        * @param range la limit pour le numéro aléatoire
        */
	@Override
	public int intAle(int range) {
		// TODO Auto-generated method stub
		return 0;
	}

        /**
        *La methode contient des etapes à jouer par bots pour préparer Props.
        * @param joueurs liste des joueurs
        */
	@Override
	public String preparerProp(ArrayList<Joueur> joueurs) {
		// TODO Auto-generated method stub
		int indexProp =this.intAle(1);
		Props propAchange = this.bot.getUnProp(indexProp);
		int indexJoueur =0;
		
		Joueur joueurAdversaire = joueurs.get(indexJoueur);
		int indexPropAdversaire=this.intAle(1);
		Props propAdversaire = joueurAdversaire.getUnProp(indexPropAdversaire);
		System.out.println("Le joueur a changé le prop avec "+joueurAdversaire.getNomJoueur());
		
		joueurAdversaire.echangeCarte(indexPropAdversaire, propAchange);
		bot.echangeCarte(indexProp, propAdversaire);
                
                System.out.println(propAdversaire.getNom()+"<->"+propAchange.getNom()+" de "+joueurAdversaire.getNomJoueur());
                return joueurAdversaire.getNomJoueur();
	}
	/**
        *La methode realiserTrick contient des etapes à jouer par bots pour réaliser Tricks.
        * @param pdc l'objet de la classe de PartieDeCarte qui contient la liste des joueurs
        * @param trick contient le Trick à réaliser
        * @return le résultat de la réalisation du Trick est retourné en chaine du caractère
        */
	public String realiserTricks(Tricks trick, PartieDeCartes pdc, boolean ceTrick) {
		boolean premierePropVerifie;
		boolean secondPropVerifie;
		if(!"The Bunch of Carrots".equals(trick.getNom())) {
			if(trick.premiereProps.contains(bot.getUnProp(0).getNom()) || trick.premiereProps.contains(bot.getUnProp(1).getNom())) {
				premierePropVerifie = true;
			}else {
				premierePropVerifie = false;
			}
			
			if(trick.secondProps.contains(bot.getUnProp(0).getNom()) || trick.secondProps.contains(bot.getUnProp(1).getNom())) {
				secondPropVerifie = true;
			}else {
				secondPropVerifie = false;
			}
		}else {
			if("Carrots".equals(bot.getUnProp(0).getNom()) && "Carrots".equals(bot.getUnProp(1).getNom())){
				premierePropVerifie = true;
				secondPropVerifie = true;
			}else {
				premierePropVerifie =false;
				secondPropVerifie = false;
			}
		}
		String result="";
		if(premierePropVerifie == true && secondPropVerifie == true) {
			System.out.println("Le joueur a realise le trick ->" + trick.getNom());
			pdc.closePropApresRealise(bot.getMain());
			bot.getMain().add(pdc.cartes.tasDeProps.pop());
			int index = this.intAle(2);
			Props septiemeProp = bot.getUnProp(index);
			if(ceTrick) {Partie.botARealiseTrick1=true;}else {Partie.botARealiseTrick2=true;}
			bot.getMain().remove(septiemeProp);
			pdc.cartes.tasDeProps.add(septiemeProp);
			bot.addPoint(trick.getPoint());
			System.out.println(bot.getPoint());
                        result = "il a realise le trick ->" + trick.getNom();
		}else {
			System.out.println("Le joueur n'a pas realise ce trick ");
			if(bot.getMain().get(0).getEstRevele()==true) {
				bot.getMain().get(1).setEstRevele(true);
			}else {
				if(bot.getMain().get(1).getEstRevele()==true) {
					bot.getMain().get(0).setEstRevele(true);
				}else {
					bot.getMain().get(this.intAle(1)).setEstRevele(true);
				}
			}
			if(ceTrick) {Partie.botARealiseTrick1=false;}else {Partie.botARealiseTrick2=false;}
			//System.out.println(bot);
			//System.out.println(pdc.cartes.tasDeProps);
                        result = "il n'a pas realise ce trick ";
		}
                return result;
	}
/**
        *La methode jouer contient des etapes à jouer par bots.
        * @param pdc l'objet de la classe de PartieDeCarte qui contient la liste des joueurs
        */
	@Override
	public void jouer(Tricks trick1, Tricks trick2, PartieDeCartes pdc) {
		// TODO Auto-generated method stub
		System.out.println("methode jouer strategie facile");
		
		ArrayList<Integer> integer = new ArrayList<Integer>(); 
		ArrayList<Integer> numJoueur = new ArrayList<Integer>();
		
		integer.add(1);integer.add(2);
		numJoueur.add(0);numJoueur.add(1);numJoueur.add(2);
		
		Collections.shuffle(integer);
		int integer1 = integer.get(0);
		
		if (integer1==1) {
			System.out.println("Le joueur a choisi de realiser ce Trick");
			System.out.println("_________________________________________");
			System.out.println("Tricks en cours : "+ trick1);
			System.out.println("_________________________________________");
			this.preparerProp(pdc.joueurs);
			System.out.println(pdc.joueurs.toString());
			this.realiserTricks(trick1, pdc,true);
		} else {
			System.out.println("Le joueur a choisi de realiser le prochain Trick");
			System.out.println("_________________________________________");
			System.out.println("Tricks en cours : "+ trick2);
			System.out.println("_________________________________________");
			this.preparerProp(pdc.joueurs);
			this.realiserTricks(trick2, pdc,false);
		}
	}


}