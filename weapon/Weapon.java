package weapon;

import java.util.Random;

public abstract class Weapon {
    private String type;
    private int damage; // how much damage the weapon can deal
    private int dexCost; // how much dexterity the weapon costs to use
    protected Random randNum = new Random();

    public Weapon(String type) {
        this.type = type;
    } // Weapon constructor

    // getter
    public String getType() {
        return this.type;
    }

    public int getDamage() {
        return this.damage;
    }

    public int getDexCost() {
        return this.dexCost;
    }
    // polymorphic method
    public abstract int strike(int attackChoice, int strength, int dexterity); // abstract method for strike


    // setter
    public void setType(String type) {
        this.type = type;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setDexCost(int dexCost) {
        this.dexCost = dexCost;
    }

    


} // Weapon class