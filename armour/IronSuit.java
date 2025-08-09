package armour;

public class IronSuit extends Armour {
    private int defencePoints = 50;
    private int dexCost = 20;

    public IronSuit (){
        super("Iron Suit");
        super.setDefencePoints(defencePoints);
        super.setDexCost(dexCost);
        
    } // constructor
    
} // class IronSuit