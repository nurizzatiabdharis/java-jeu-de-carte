package Modele.cartes;

public enum PointTricks {
	TRICKS_1(1), 
	TRICKS_2(2), 
	TRICKS_3(3), 
	TRICKS_4(4), 
	TRICKS_5(5), 
	TRICKS_6(2),
	TRICKS_7(3),
	TRICKS_8(4),
	TRICKS_9(5),
	TRICKS_10(6);
	
    private final int value;

    private PointTricks(int value) {
        this.value = value;
    }
    
    public int getValue() {  
        return  this.value ;  
    }
	
}
