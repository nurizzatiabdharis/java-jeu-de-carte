package Modele.cartes;

public enum NomTricks {
	TRICK_1("The Hungry Rabbit"),
	TRICK_2("The Bunch of Carrots"),
	TRICK_3("The Vegetable Patch"),
	TRICK_4("The Rabbit That Didn't Like Carrots"),
	TRICK_5("The Pair of Rabbits"),
	TRICK_6("The Vegetable Hat Trick"),
	TRICK_7("The Carrot Hat Trick"),
	TRICK_8("The Slightly Easier Hat Trick"),
	TRICK_9("The Hat Trick"),
	TRICK_10("The Other Hat Trick");
	
    private String nom ;  
     
    private NomTricks(String nom) {  
        this.nom = nom ;  
    }  
   
    public String getNomCarte() {  
        return  this.nom ;  
    } 
    
}
