package warrior;

public class IronMan extends Warrior {
    
private int minHealth = 120;
    private int bonusHealth = 50;
    private int minStrength = 70;
    private int bonusStrength = 20;
    private int minDexterity = 150;
    private int bonusDexterity = 75;

    public IronMan() {
        super("IronMan");

        super.setHealth(super.randNum.nextInt(bonusHealth) + minHealth);
        super.setStrength(super.randNum.nextInt(bonusStrength) + minStrength);
        super.setDexterity(super.randNum.nextInt(bonusDexterity) + minDexterity);
    } // constructor

} // IronMan class