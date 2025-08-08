
package warrior;

public class BlackPanther extends Warrior {
    private int minHealth = 100;
    private int bonusHealth = 40;
    private int minStrength = 80;
    private int bonusStrength = 30;
    private int minDexterity = 50;
    private int bonusDexterity = 50;

    public BlackPanther() {
        super("BlackPanther");
        super.setHealth(super.randNum.nextInt(bonusHealth) + minHealth);
        super.setStrength(super.randNum.nextInt(bonusStrength) + minStrength);
        super.setDexterity(super.randNum.nextInt(bonusDexterity) + minDexterity);


    } // constructor

    
}