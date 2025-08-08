
package warrior;

public class Thor extends Warrior {
    private int minHealth = 220;
    private int bonusHealth = 90;
    private int minStrength = 120;
    private int bonusStrength = 70;
    private int minDexterity = 20;
    private int bonusDexterity = 10;

    public Thor() {
        super("Thor");
        super.setHealth(super.randNum.nextInt(bonusHealth) + minHealth);
        super.setStrength(super.randNum.nextInt(bonusStrength) + minStrength);
        super.setDexterity(super.randNum.nextInt(bonusDexterity) + minDexterity);


    } // constructor

    
}
