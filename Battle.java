import utility.*;
import warrior.*;
import weapon.*;

import java.util.Scanner;
import java.util.Random;



public class Battle {
    // objects
    private static Ink ink = new Ink();
    private static Scanner input = new Scanner(System.in);
    private static Random randNum = new Random();
    private static Warrior player;
    private static Weapon pWeapon; // Player's weapon
    private static Warrior enemy;   
    private static Weapon eWeapon; // Enemy's weapon 

    //variables
    private static boolean isPlayerTurn = true;
    private static boolean isGameOver = false;
    private static int damageAmount;

    public static void main(String[] args) {
        ink.welcome();

        //////////////////////////// Game Setup /////////////////
        // Player Warrior setup
        ink.warriorMenu();
        int warPick = input.nextInt();
        createWarrior("Player", warPick);

        //////////////////////////// Game Setup /////////////////
        // Player Weapon setup
        ink.weaponMenu();
        int wepPick = input.nextInt();
        createWeapon("Player", wepPick);

         //////////////////////////// Game Setup /////////////////
        // Enemy Warrior setup
        
        warPick = randNum.nextInt(3) + 1; // Randomly select enemy warrior
        createWarrior("Enemy", warPick);

        //////////////////////////// Game Setup /////////////////
        // enemy Weapon setup
        
        wepPick = randNum.nextInt(3) + 1; // Randomly select enemy weapon
        createWeapon("Enemy", wepPick);


        // print all teh stats
        ink.printStats("Player", player);
        ink.printStats("Enemy", enemy);

        ///////////////////////////////////////////////////////
        // main game loop
        while (!isGameOver) {
            if (isPlayerTurn) { // Player's turn logic
                // ask attack choice
                ink.attackMenu();
                int attackChoice = input.nextInt();


                // strike the enemy
                damageAmount = pWeapon.strike(attackChoice, player.getStrength(), player.getDexterity());
                System.out.println("You dealt " + damageAmount + " damage to the enemy!");
                
                
                // apply damage
                if (damageAmount > 0) { //hit the enemy
                    // remove health from enemy
                    enemy.reduceHealth(damageAmount);
                    // check if enemy is defeated
                    if (enemy.getHealth() <= 0) {
                        System.out.println("You have defeated the enemy!");
                        isGameOver = true; // end the game
                    }
                     // if yes you win
                     // set isGameOver to true
                     // else end turn
                    
                }
                // check if wen enemy is defeated
                // End the game if the enemy is defeated
            }
            else { // Enemy's turn logic
                // Here you would implement the enemy's attack logic
            }isPlayerTurn = !isPlayerTurn; // Toggle turn
             // print all teh stats
             ink.printStats("Player", player);
             ink.printStats("Enemy", enemy);
        } // while


        ink.goodbye();
        
    } //main

    // Helper method to create a warrior based on user input
    private static void createWarrior(String who, int choice) {
        switch (choice) {
            case 1:
             if (who.equals("Player")) 
                player = new BlackPanther();
            else
                enemy = new BlackPanther();    
                break;
            case 2:
             if (who.equals("Player"))
                player = new Thor();
             else
                enemy = new Thor();   
                break;
            case 3:
                if (who.equals("Player"))
                  player = new IronMan();
                else
                  enemy = new IronMan();
                break;
            default:
                System.out.println("Invalid choice. Please select a valid warrior type.");
                return; // Exit the method if the choice is invalid
        } // switch

    } // createWarrior method

     private static void createWeapon(String who, int choice) {
        switch (choice) {
            case 1: // Claws
             if (who.equals("Player"))
                pWeapon = new Claws();
             else
                eWeapon = new Claws();
                System.out.println("You have chosen Claws as your weapon.");   
                break;
            case 2: // Hammer
                if (who.equals("Player"))
                    pWeapon = new Hammer();
                else
                    eWeapon = new Hammer();
                    System.out.println("You have chosen Hammer as your weapon.");
                break;
            case 3: // Repulsor
                if (who.equals("Player"))
                    pWeapon = new Repulsor();
                else
                    eWeapon = new Repulsor();
                    System.out.println("You have chosen Repulsor as your weapon.");
                break;
            
            default:
                System.out.println("Invalid choice. Please select a valid weapon type.");
                return; // Exit the method if the choice is invalid
        } // switch

    } // createWeapon method
    
    
} //Battle class