package Modele.cartes;

public class Props extends Cartes{
	private boolean estRevele;

	public Props(String nom) {
		super(nom);
		this.estRevele =false;
	}
	
	public boolean getEstRevele() {return this.estRevele;}
	public void setEstRevele(boolean status) {this.estRevele = status;}

}
