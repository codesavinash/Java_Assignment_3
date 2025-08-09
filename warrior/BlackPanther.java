
package warrior;

public class BlackPanther extends Warrior {
    private int minHealth = 140;
    private int bonusHealth = 20;
    private int minStrength = 18;
    private int bonusStrength = 5;
    private int minDexterity = 15;
    private int bonusDexterity = 4;

    public BlackPanther() {
        super("BlackPanther");
        super.setHealth(super.randNum.nextInt(bonusHealth + 1) + minHealth);
        super.setStrength(super.randNum.nextInt(bonusStrength + 1) + minStrength);
        super.setDexterity(super.randNum.nextInt(bonusDexterity + 1) + minDexterity);


    } // constructor

    
}