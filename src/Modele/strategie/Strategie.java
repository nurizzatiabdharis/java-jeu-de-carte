package Modele.strategie;

import java.util.ArrayList;

import Modele.cartes.Tricks;
import Modele.jeu.PartieDeCartes;
import Modele.joueur.Joueur;

public interface Strategie {
	int intAle(int range);
	String preparerProp(ArrayList<Joueur> joueurs);
	void jouer(Tricks trick1, Tricks trick2, PartieDeCartes pdc);
	
}