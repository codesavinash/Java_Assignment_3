package warrior;

public class IronMan extends Warrior {
    
    private int minHealth = 150;
    private int bonusHealth = 50;
    private int minStrength = 30;
    private int bonusStrength = 15;
    private int minDexterity = 20;
    private int bonusDexterity = 8;

    public IronMan() {
        super("IronMan");

        super.setHealth(super.randNum.nextInt(bonusHealth + 1) + minHealth);
        super.setStrength(super.randNum.nextInt(bonusStrength + 1) + minStrength);
        super.setDexterity(super.randNum.nextInt(bonusDexterity + 1) + minDexterity);
    } // constructor

} // IronMan class