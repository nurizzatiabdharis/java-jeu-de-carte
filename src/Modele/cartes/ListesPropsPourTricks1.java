package Modele.cartes;

public enum ListesPropsPourTricks1 {

		TRICKS_1("The Lettuce","Carrots"),
		TRICKS_2("Carrots"),
		TRICKS_3("The Lettuce"),
		TRICKS_4("The Lettuce"),
		TRICKS_5("The other rabbit"),
		TRICKS_6("The Lettuce","Carrots"),
		TRICKS_7("Carrots"),
		TRICKS_8("The rabbit","The other rabbit"),
		TRICKS_9("The rabbit"),
		TRICKS_10("The other rabbit");
		
	    private String nom ; 
	    private String nom2;
	     
	    private ListesPropsPourTricks1(String nom, String nom2) {  
	        this.nom = nom ;  
	        this.nom2 = nom2;
	    }
	    
	    private ListesPropsPourTricks1(String nom) {  
	        this.nom = nom ;
	        this.nom2 = "";
	    }
	    
	    public String getProp1() {  
	        return  this.nom; 
	    }
	    
	    public String getProp2() {  
	        return  this.nom2; 
	    }

 
	    
}
