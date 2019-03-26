package Modele.jeu;

import Modele.cartes.JeuDeCartes;
import Modele.cartes.Tricks;
import Modele.cartes.Props;
import Modele.joueur.Joueur;
import java.util.*;
        /**
        *
        * @author nurizzatibintiabdharis_nadwahazizahbintimohdkamalazhari
        */

public class PartieDeCartes {
	
	public ArrayList<Joueur> joueurs;
	public JeuDeCartes cartes;
	public boolean partieEnCours;
	
	public PartieDeCartes() {
		joueurs = new ArrayList<Joueur>();
		cartes = new JeuDeCartes();
		cartes.melangerTricks();
		partieEnCours = false;
	}
	
        /**
        *Pour trier des joueurs par tour. Le joueur le plus jeune a le premier tour
        */
	public void trierJoueur() {

		if(joueurs.get(2).getDateNaissance().getTotalJour()>joueurs.get(1).getDateNaissance().getTotalJour()) {
			Collections.swap(joueurs, 2, 1);
		}
		if(joueurs.get(2).getDateNaissance().getTotalJour()>joueurs.get(0).getDateNaissance().getTotalJour()) {
			Collections.swap(joueurs, 2, 0);
		}
		if(joueurs.get(1).getDateNaissance().getTotalJour()>joueurs.get(0).getDateNaissance().getTotalJour())
		{
			Collections.swap(joueurs, 1, 0);
		}
		if(joueurs.get(2).getDateNaissance().getTotalJour()>joueurs.get(1).getDateNaissance().getTotalJour()) {
			Collections.swap(joueurs, 2, 1);
		}	
		this.setNumJoueurEgaleIndex();
	}
	
        /**
        *Ajouter un joueur dans la liste du joueur du jeu
        * @param joueur le joueur ajouté 
        */
	public void ajouterJoueur(Joueur joueur){
		if(partieEnCours == false){
			joueurs.add(joueur);
		}
	}
	
        /**
        *Pour décider qui gagne à la fin du jeu
        * @return le joueur gagne qui a le point le plus grand
        */
	public Joueur quiGagne() {
            Joueur joueurGagne = null;
            Iterator<Joueur> it = joueurs.iterator();
            ArrayList<Integer> pointJoueur = new ArrayList<Integer>();
            
            while(it.hasNext()){
                pointJoueur.add(it.next().getPoint());
            }
            
            System.out.println(pointJoueur);
            int maxPoint = Collections.max(pointJoueur);
            System.out.println(maxPoint);

            Iterator<Joueur> i = joueurs.iterator();
            while(i.hasNext()){
                if(i.next().getPoint() == maxPoint){
                    joueurGagne=i.next();
                }
            }

            return joueurGagne;
	}
	
        /**
        * Les méthodes getter
        */
	public LinkedList<Props> getProps() {
		return this.cartes.tasDeProps;
	}
	public LinkedList<Tricks> getTicks() {
		return this.cartes.tasDeTricks;
	}	
	public Props getSeptiemeProp() {
		return this.cartes.tasDeProps.pop();
	}

        /**
        * Enlever le joueur dans la liste du Joueur
        * @param joueur le joueur que nous voulons enlever
        */
	public void retirerJoueur(Joueur joueur) {
		joueurs.remove(joueur);
	}
	
        /**
        * Distribuer les props au debut du jeu
        */
	public void distribuerCartes() {
		this.partieEnCours = true;
		while(cartes.propRestUn() == false) {
			Iterator<Joueur> itj = joueurs.iterator();
			while (itj.hasNext()) {
				Joueur j =(Joueur) itj.next();
				j.prendreProp(cartes.tirerUnProp());
			}
		}			
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		//sb.append(this.cartes);
		sb.append(this.joueurs);
		
		return sb.toString();
		//return joueurs.toString();
	}
	
        /**
        * On met le nom des joueurs égale à index des joueurs dans listes 
        * afin de simplifier les rangement des tours
        */
	public void setNumJoueurEgaleIndex() {
		Iterator <Joueur> it = joueurs.iterator();
		Joueur[] j = new Joueur[3];
		while(it.hasNext()){
			j[0] = it.next();
			j[1] = it.next();
			j[2] = it.next();
		}
		
		j[0].setnumJoueur(0);
		j[1].setnumJoueur(1);
		j[2].setnumJoueur(2);
			
	}
	
        /**
        * Indiquer si le jeu est terminé
        * @return oui ou non
        */
	public boolean estTerminee() {
		boolean estTermine=false;
		if(cartes.tricksEmpty())
			estTermine=true;
		return estTermine;
	}
	
        /**
        * Set estRevele du prop à false après avoir réalisé le trick
        * @param main la liste des props du joueur
        */
	public void closePropApresRealise(ArrayList<Props> main) {
		main.get(0).setEstRevele(false);
		main.get(1).setEstRevele(false);
	}
	
}
