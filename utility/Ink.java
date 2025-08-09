package utility;

import warrior.*;
import weapon.*;
import armour.*;

public class Ink {

    public Ink() {} // zero arg constructor  
    
    public void welcome() {
        System.out.println("////////////////////////////////////////////");
        System.out.println("Welcome to the Battle of the Avengers!");
        System.out.println("////////////////////////////////////////////\n");
    } // welcome method
    
    public void goodbye() {
        System.out.println("////////////////////////////////////////////");
        System.out.println("////////// Thank you for playing! //////////");
        System.out.println("////////////////////////////////////////////\n");
    } // goodbye method

    public void printStats(Warrior player, Weapon pWeapon, Armour pArmour, 
                           Warrior enemy, Weapon eWeapon, Armour eArmour) {
        System.out.println("////////////////////////////////////////////");
        System.out.printf("//// Player (%s) stats:%n", player.getType());
        System.out.println("//// 1) Health:     " + player.getHealth());
        System.out.println("//// 2) Strength:   " + player.getStrength());
        System.out.println("//// 3) Dexterity:  " + player.getDexterity());
        System.out.println("//// 4) Weapon:     " + pWeapon.getType());
        System.out.println("//// 5) Armour:     " + pArmour.getType());
        System.out.println("////////////////////////////////////////////\n");

        System.out.println("////////////////////////////////////////////");
        System.out.printf("//// Enemy (%s) stats:%n", enemy.getType());
        System.out.println("//// 1) Health:     " + enemy.getHealth());
        System.out.println("//// 2) Strength:   " + enemy.getStrength());
        System.out.println("//// 3) Dexterity:  " + enemy.getDexterity());
        System.out.println("//// 4) Weapon:     " + eWeapon.getType());
        System.out.println("//// 5) Armour:     " + eArmour.getType());
        System.out.println("////////////////////////////////////////////\n");
    } // printStats method

    public void printResults(String who, int damage, Warrior player, Warrior enemy) {
        System.out.println("////////////////////////////////////////////");
        if (who.equalsIgnoreCase("player")) {
            System.out.printf("//// Player deals %d points of damage.%n", damage);
            System.out.printf("//// Enemy's health is now %d.%n", enemy.getHealth());
        } else {
            System.out.printf("//// Enemy deals %d points of damage.%n", damage);
            System.out.printf("//// Player's health is now %d.%n", player.getHealth());
        }
        System.out.println("////////////////////////////////////////////\n");
    } // printResults method

    public void warriorMenu() {
        System.out.println("////////////////////////////////////////////");
        System.out.println("//// Please choose your warrior type: //");
        System.out.println("//// 1) Black Panther");
        System.out.println("//// 2) Thor");
        System.out.println("//// 3) Ironman");
        System.out.println("////////////////////////////////////////////\n");
    } // warriorMenu method   

    public void attackMenu() {
        System.out.println("////////////////////////////////////////////");
        System.out.println("//// Select your attack type: /////");
        System.out.println("//// 1) Normal Attack");
        System.out.println("//// 2) Heavy Attack");
        System.out.println("//// 3) Special Attack");
        System.out.println("////////////////////////////////////////////\n");
    } // attackMenu method   
    
    public void weaponMenu() {
        System.out.println("////////////////////////////////////////////");
        System.out.println("//// Please choose your weapon: //");
        System.out.println("//// 1) Claws");
        System.out.println("//// 2) Hammer");
        System.out.println("//// 3) Repulsor");
        System.out.println("////////////////////////////////////////////\n");
    } // weaponMenu method

    public void armourMenu() {
        System.out.println("////////////////////////////////////////////");
        System.out.println("//// Please choose your armour: //");
        System.out.println("//// 1) Asguardian Suit");
        System.out.println("//// 2) Vibranium Suit");
        System.out.println("//// 3) Iron Suit");
        System.out.println("////////////////////////////////////////////\n");
    } // armourMenu method

} // Ink class