package utility;

import warrior.*;
import weapon.*;
import armour.*;

public class Ink {

    // ANSI escape codes for colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    public static final String BLACK = "\u001B[30m";

    public static final String BOLD = "\u001B[1m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";

    public void attackResults(String who, int damage, Warrior player, Warrior enemy) {
        if (damage > 0) {
            System.out.println(GREEN + "//// " + who + " deals " + damage + " points of damage." + RESET);
            System.out.println(GREEN + "//// " + (who.equals("player") ? "Enemy's" : "Player's") + " health is now " +
                    (who.equals("player") ? enemy.getHealth() : player.getHealth()) + "." + RESET);
            System.out.println("////////////////////////////////////////////\n");
        } else {
            // You can add any message here for zero or negative damage if needed
            System.out.println(YELLOW + "//// " + who + " missed or dealt no damage." + RESET);
            System.out.println("////////////////////////////////////////////\n");
        }
    }

    public Ink() {} // zero arg constructor  

    public void welcome() {
        System.out.println("////////////////////////////////////////////");
        System.out.println(BLACK + BG_GREEN + BOLD +"Welcome to the Battle of the Avengers!" + RESET);
        System.out.println("////////////////////////////////////////////\n");
    } // welcome method

    public void goodbye() {
        System.out.println("////////////////////////////////////////////");
        System.out.println(RED + BG_WHITE +"////////// Thank you for playing! //////////" + RESET);
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
        System.out.println(CYAN +"////////////////////////////////////////////" + RESET);
        System.out.println(GREEN +"//// Select your attack type: /////" + RESET);
        System.out.println(BLUE +"//// 1) Normal Attack" + RESET);
        System.out.println(BLUE +"//// 2) Heavy Attack" + RESET);
        System.out.println(BLUE +"//// 3) Special Attack" + RESET);
        System.out.println(CYAN +"////////////////////////////////////////////\n" + RESET);
    } // attackMenu method   

    public void weaponMenu() {
        System.out.println(CYAN + "////////////////////////////////////////////" + RESET);
        System.out.println(GREEN + "//// Please choose your weapon: //" + RESET);
        System.out.println(RED + "//// 1) Claws" + RESET);
        System.out.println(RED + "//// 2) Hammer" + RESET);
        System.out.println(RED +"//// 3) Repulsor" + RESET);
        System.out.println(CYAN + "////////////////////////////////////////////\n" + RESET);
    } // weaponMenu method

    public void armourMenu() {
        System.out.println(CYAN + "////////////////////////////////////////////" + RESET);
        System.out.println(GREEN +"//// Please choose your armour: //" + RESET);
        System.out.println(YELLOW +"//// 1) Asguardian Suit" + RESET);
        System.out.println(YELLOW + "//// 2) Vibranium Suit" + RESET);
        System.out.println(YELLOW +"//// 3) Iron Suit" + RESET);
        System.out.println(CYAN +"////////////////////////////////////////////\n" + RESET);
    } // armourMenu method

} // Ink class