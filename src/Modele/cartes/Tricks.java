package Modele.cartes;

import java.util.HashSet;

public class Tricks extends Cartes {

	private int point;
	private int pointPerte;
	public HashSet<String> premiereProps;
	public HashSet<String> secondProps;
		
	public Tricks(String nom, int point, int pointPerte, HashSet<String> premiereProps, HashSet<String> secondProps) {
		super(nom);
		this.point=point;
		this.pointPerte = pointPerte;
		this.premiereProps = premiereProps;
		this.secondProps = secondProps;
	}
	
	public int getPoint()
	{
		return this.point;
	}
	
	public int getPointPerte()
	{
		return this.pointPerte;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(super.toString()+" (");
		sb.append(this.point + ")");
		sb.append("\n Props 1 : ");
		sb.append(this.premiereProps);
		sb.append("\n Props 2 : ");
		sb.append(this.secondProps);
		sb.append("\n");
		return sb.toString();
	}

}
