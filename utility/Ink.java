package utility;

import warrior.*;

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

    public void printStats(String who, Warrior warrior) {
        System.out.println("////////////////////////////////////////////");
        System.out.printf("//// %s stats:%n", who, warrior.getType());
        System.out.println("//// 1) Health:     " + warrior.getHealth());
        System.out.println("//// 2) Strength:   " + warrior.getStrength());
        System.out.println("//// 3) Dexterity:  " + warrior.getDexterity());
        System.out.println("////////////////////////////////////////////\n");

    } // try to add colors to menu later

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
        System.out.println("//// 2) hammer");
        System.out.println("//// 3) Repulsor");
        System.out.println("////////////////////////////////////////////\n");
    } // weaponMenu method

} // Ink class
