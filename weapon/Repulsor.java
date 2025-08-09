
package weapon;

public class Repulsor extends Weapon {

    private int damage = 125;     // how much damage the Repulsor can deal
    private int dexCost = 50;    // how much dexterity the Repulsor cost to use
    private int hitChance = 90; // chance to hit the enemy
    public Repulsor() {
        super("Repulsor");
        super.setDamage(damage);
        super.setDexCost(dexCost);
    } // Repulsor constructor

    
     // strike method implementation
    public int strike(int attackChoice, int strength, int dexterity) {
        // Simple damage formula
        int strikeDamage = strength + getDamage() - (dexterity / 2);

        int roll = super.randNum.nextInt(100) + 1; // Roll a number between 1 and 100
        roll -= attackChoice * 5;
        roll += dexterity / 10; // Adjust roll based on attack choice and dexterity

        if (roll <= this.hitChance) { // successful hit
            strikeDamage = this.damage + (strength / 2) - (dexterity / 4);

        }

        // Make sure damage doesn’t go negative
        if (strikeDamage < 0) {
            strikeDamage = 0;
        }
        return strikeDamage;
    } // Repulsor strike method
} // Repulsor class
