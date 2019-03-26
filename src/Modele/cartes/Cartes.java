package Modele.cartes;

public class Cartes {
	
	private String nom;

	Cartes(String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(this.nom);
		return sb.toString();
	}
}