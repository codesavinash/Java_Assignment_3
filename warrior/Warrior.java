
package warrior;

import java.util.Random;

public abstract class Warrior {
    private String type;
    private int health; // how much health the warrior has
    private int strength; // how much damage the warrior can deal
    private int dexterity; // how much damage the warrior can block

    protected Random randNum = new Random();

    public Warrior(String type){
        this.type = type;
    } //Warrior constructor

    // getters
    public String getType() {
        return this.type;
    }
    public int getHealth() {
        return this.health;
    }
    public int getStrength() {
        return this.strength;
    }
    public int getDexterity() {
        return this.dexterity;
    }
    // setters
    public String setType(){
        return this.type = type;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }
    // take damage method
    public void reduceHealth(int damageAmount) {
        this.health -= damageAmount;
    }    
} //Warrior class