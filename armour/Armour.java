
package armour;

public abstract class Armour {
    private String type;

    private int defencePoints;
    private int dexCost;
    public Armour(String type) {
        this.type = type;
    }

    // getters
    public String getType() {
        return type;
    }

    public int getDefencePoints() {
        return defencePoints;
    }

    public int getDexCost() {
        return dexCost;
    }

    // setters
    public void setType(String type) {
        this.type = type;
    }

    public void setDefencePoints(int defencePoints) {
        this.defencePoints = defencePoints;
    }

    public void setDexCost(int dexCost) {
        this.dexCost = dexCost;
    }
    //setters
    
}