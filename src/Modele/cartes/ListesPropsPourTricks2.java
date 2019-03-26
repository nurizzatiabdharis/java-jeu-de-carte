package Modele.cartes;

public enum ListesPropsPourTricks2 {

		TRICKS_1("The rabbit","The other rabbit"),
		TRICKS_2("Carrots"),
		TRICKS_3("Carrots"),
		TRICKS_4("The rabbit","The other rabbit"),
		TRICKS_5("The rabbit"),
		TRICKS_6("The hat"),
		TRICKS_7("The hat"),
		TRICKS_8("The hat"),
		TRICKS_9("The hat"),
		TRICKS_10("The hat");
		
	    private String nom ; 
	    private String nom2;
	     
	    private ListesPropsPourTricks2(String nom, String nom2) {  
	        this.nom = nom ;  
	        this.nom2 = nom2;
	    }
	    
	    private ListesPropsPourTricks2(String nom) {  
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
