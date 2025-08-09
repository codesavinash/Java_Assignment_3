
package warrior;

public class Thor extends Warrior {
    private int minHealth = 200;
    private int bonusHealth = 80;
    private int minStrength = 60;
    private int bonusStrength = 25;
    private int minDexterity = 18;
    private int bonusDexterity = 8;

    public Thor() {
        super("Thor");
        super.setHealth(super.randNum.nextInt(bonusHealth + 1) + minHealth);
        super.setStrength(super.randNum.nextInt(bonusStrength + 1) + minStrength);
        super.setDexterity(super.randNum.nextInt(bonusDexterity + 1) + minDexterity);


    } // constructor

    
}
