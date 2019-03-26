package Modele.cartes;

public enum NomProps {
	PROPS_1("The Lettuce"),
	PROPS_2("Carrots"),
	PROPS_3("Carrots"),
	PROPS_4("Carrots"),
	PROPS_5("The hat"),
	PROPS_6("The rabbit"),
	PROPS_7("The other rabbit");
	
    private String nom ;  
    
    private NomProps(String nom) {  
        this.nom = nom ;  
    }  
   
    public String getNomProps() {  
        return  this.nom ;  
    } 
    

}
