package Modele.joueur;

import Modele.cartes.Tricks;
import Modele.jeu.PartieDeCartes;
import Modele.strategie.DifficileStrategie;
import Modele.strategie.FacileStrategie;
import Modele.strategie.Strategie;
/**
 *
 * @author nurizzatibintiabdharis_nadwahazizahbintimohdkamalazhari
 */
public class Bot extends Joueur{
	public static int nbBOT = 1;
	
	public Bot(String nom) {
		super(nom+nbBOT++);
		
	}

	public static int getNbBOT() {
		return nbBOT;
	}

	public static void setNbBOT(int nbBOT) {
		Bot.nbBOT = nbBOT;
	}
	
	//methode independante de l'objet de la classe
        /**
        *Ce sont les méthodes pour implementer le strategie
        */
	public static void jouer(Strategie strategiemethode,Tricks trick1, Tricks trick2, PartieDeCartes pdc){
		strategiemethode.jouer(trick1, trick2,pdc);
	}
	
	public static void JouerFacile(Bot bot, Tricks trick1, Tricks trick2,PartieDeCartes pdc) {
		jouer(new FacileStrategie(bot),trick1, trick2,pdc);
	}

	public static void JouerDifficile(Bot bot, Tricks trick1, Tricks trick2,PartieDeCartes pdc) {
		jouer(new DifficileStrategie(bot),trick1, trick2,pdc);
	}
	
}