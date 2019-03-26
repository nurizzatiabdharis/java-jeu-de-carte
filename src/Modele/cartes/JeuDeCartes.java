package Modele.cartes;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

public class JeuDeCartes {
	
	public final static int NOMBRE_DE_TRICKS = 10;
	public final static int NOMBRE_DE_PROPS = 7;
	
	public LinkedList<Tricks> tasDeTricks;
	public LinkedList<Props> tasDeProps;
	
	public JeuDeCartes() {
		//creation des tricks
		tasDeTricks = new LinkedList<Tricks>();
		for (NomTricks c: NomTricks.values()){
			int value = 0; 
			int pointPerte = 0;
			HashSet<String> premiereProps = new HashSet<String>();
			HashSet<String> deuxiemeProps = new HashSet<String>();
			
		      switch(c) {
		      	case TRICK_1: 
		      		value = PointTricks.TRICKS_1.getValue();
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_1.getProp1());
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_1.getProp2());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_1.getProp1());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_1.getProp2());	
		      		break;
		      	case TRICK_2: 
		      		value = PointTricks.TRICKS_2.getValue(); 
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_2.getProp1());
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_2.getProp2());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_2.getProp1());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_2.getProp2());	
		      		break;
		      	case TRICK_3: 
		      		value = PointTricks.TRICKS_3.getValue(); 
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_3.getProp1());
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_3.getProp2());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_3.getProp1());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_3.getProp2());
		      		break;
		      	case TRICK_4: 
		      		value = PointTricks.TRICKS_4.getValue();
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_4.getProp1());
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_4.getProp2());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_4.getProp1());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_4.getProp2());		      		 
		      		break;
		      	case TRICK_5: 
		      		value = PointTricks.TRICKS_5.getValue(); 
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_5.getProp1());
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_5.getProp2());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_5.getProp1());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_5.getProp2());
		      		break;
		      	case TRICK_6: 
		      		value = PointTricks.TRICKS_6.getValue(); 
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_6.getProp1());
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_6.getProp2());		      		
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_6.getProp1());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_6.getProp2());
		      		break;
			    case TRICK_7: 
			    	value = PointTricks.TRICKS_7.getValue(); 
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_7.getProp1());
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_7.getProp2());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_7.getProp1());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_7.getProp2());
		      		break;
			    case TRICK_8: value = PointTricks.TRICKS_8.getValue();
			      	premiereProps.add(ListesPropsPourTricks1.TRICKS_8.getProp1());
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_8.getProp2());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_8.getProp1());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_8.getProp2());
		      		break;
		      	case TRICK_9: 
		      		value = PointTricks.TRICKS_9.getValue(); 			      	
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_9.getProp1());
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_9.getProp2());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_9.getProp1());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_9.getProp2());
		      		break;
		      	case TRICK_10: value = PointTricks.TRICKS_10.getValue(); 
		      		pointPerte = -3;
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_10.getProp1());
		      		premiereProps.add(ListesPropsPourTricks1.TRICKS_10.getProp2());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_10.getProp1());
		      		deuxiemeProps.add(ListesPropsPourTricks2.TRICKS_10.getProp2());
		      		break;
		      }
			Tricks tricks = new Tricks(c.getNomCarte(),value,pointPerte, premiereProps,deuxiemeProps);
			tasDeTricks.add(tricks);
		}
		
		//creation des props
		tasDeProps = new LinkedList<Props>();
		for (NomProps c: NomProps.values()){
			Props carte = new Props(c.getNomProps());
			tasDeProps.add(carte);
		}
	}
	
	public void melangerTricks() {
		//melanger les tricks pour un jeu
		for (int i = 0; i < JeuDeCartes.NOMBRE_DE_TRICKS-2; i++) {
			int position = (int) Math.round((JeuDeCartes.NOMBRE_DE_TRICKS-2) * Math.random());
			Tricks tricks = tasDeTricks.pop();
			if(tricks != tasDeTricks.getLast()) { //except the other hatricks//	
				tasDeTricks.add(position, tricks);
			}
		}
	}
	
	public boolean propRestUn() {
		if(tasDeProps.size() == 1)
			return true;
		else
			return false;
	}
	
	public Props tirerUnProp() {
		Collections.shuffle(tasDeProps);
		return tasDeProps.pop();
	}
	
	public boolean tricksEmpty() {
		if(this.tasDeTricks.isEmpty())
			return true;
		else
			return false;
	}
	
	public String toString() {
		StringBuffer sb = new StringBuffer();
		Iterator<Props> itp = tasDeProps.iterator();
		Iterator<Tricks> it = tasDeTricks.iterator();
		
		sb.append("Tricks"+JeuDeCartes.NOMBRE_DE_TRICKS+ " tricks :\n");
		while(it.hasNext())
			sb.append(it.next().toString()+"\n");

		sb.append("On a "+JeuDeCartes.NOMBRE_DE_PROPS+ " props :\n");
		while(itp.hasNext())
			sb.append(itp.next().toString()+"\n");
		
		return sb.toString();
	}
	
	public static void main(String[] args) {
		JeuDeCartes jeu1 = new JeuDeCartes();
		jeu1.melangerTricks();
		System.out.print(jeu1.toString());
		
	}
}
