package Modele.joueur;
        /**
        *
        * @author nurizzatibintiabdharis_nadwahazizahbintimohdkamalazhari
        */
public class Date {
	private int annee;
	private int mois;
	private int jour;
	
	public Date(int annee, int mois, int jour) {
		this.annee=annee;
		this.mois=mois;
		this.jour=jour;
	}
	
        /**
        *getTotalJour calcul les jours que les joueurs vivent
        * @return le nombre du jour en int
        */
	public int getTotalJour() {
		int jours = (this.annee-1)*360 + this.mois*30 + jour;
		
		return jours;
	}
        
	/**
        *
        * Ce sont les méthode getter
        */
	public int getAnnee(){return this.annee;}
	public int getMois() {return this.mois;}
	public int getJour() {return this.jour;}

}
