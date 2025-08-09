import utility.*;
import warrior.*;
import weapon.*;
import armour.*;


import java.util.Random;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;




public class Battle {
    // objects
    private static Ink ink = new Ink();
    private static Validator validator = new Validator();
    public static MusicPlayer musicPlayer = new MusicPlayer();

    private static Random randNum = new Random();
    private static Warrior player;
    private static Weapon pWeapon; // Player's weapon
    private static Armour pArmour; // Player's armour
    private static Warrior enemy;   
    private static Weapon eWeapon; // Enemy's weapon
    private static Armour eArmour; // Enemy's armour
    

    //variables
    private static boolean isPlayerTurn = true;
    private static boolean isGameOver = false;
    private static int damageAmount;
    private static int maxWarriors = 3;
    private static int maxWeapons = 3;
    private static int maxArmours = 3;
    private static int maxAttackOptions = 2;

    public static void main(String[] args) {
        ink.welcome();

        // Play background music
        String musicFilePath = "epic.wav"; // Update with your music file path

        Thread musicThread = new Thread(() -> musicPlayer.play(musicFilePath));
        musicThread.start();

        //////////////////////////// Game Setup /////////////////
        // Player Warrior setup
        ink.warriorMenu();
        int warPick = validator.validatePick(maxWarriors);
        createWarrior("Player", warPick);

        //////////////////////////// Game Setup /////////////////
        // Player Weapon setup
        ink.weaponMenu();
        int wepPick = validator.validatePick(maxWeapons);
        createWeapon("Player", wepPick);

         //////////////////////////// Game Setup /////////////////
        // Player Armour setup
        ink.armourMenu();
        int armPick = validator.validatePick(maxArmours);
        createArmour("Player", armPick);

         //////////////////////////// Game Setup /////////////////
        // Enemy Warrior setup
        
        warPick = randNum.nextInt(3) + 1; // Randomly select enemy warrior
        createWarrior("Enemy", warPick);

        //////////////////////////// Game Setup /////////////////
        // enemy Weapon setup
        
        wepPick = randNum.nextInt(3) + 1; // Randomly select enemy weapon
        createWeapon("Enemy", wepPick);

        //////////////////////////// Game Setup /////////////////
        // enemy Armour setup
        
        armPick = randNum.nextInt(3) + 1; // Randomly select enemy Armour
        createArmour("Enemy", armPick);


        
        

        ///////////////////////////////////////////////////////
        // main game loop
        while (!isGameOver) {
            if (isPlayerTurn) { // Player's turn logic
                // ask attack choice
                ink.attackMenu();
                int attackChoice = validator.validateAttackPick(maxAttackOptions);


                // strike the enemy
                System.out.println();
                System.out.println();
                damageAmount = pWeapon.strike(attackChoice, player.getStrength(), player.getDexterity());
                System.out.println("You dealt " + damageAmount + " damage to the enemy!");
                
                
                // apply damage
                if (damageAmount > 0) { //hit the enemy
                    // remove health from enemy
                    enemy.reduceHealth(damageAmount - eArmour.getDefencePoints());
                    // check if enemy is defeated
                    if (enemy.getHealth() <= 0) {
                        System.out.println();
                        System.out.println("You have defeated the enemy!");
                        isGameOver = true; // end the game
                    }
                     // if yes you win
                     // set isGameOver to true
                     // else end turn
                     
                }
                // print all teh stats
                ink.printResults("player", damageAmount, player, enemy);
                damageAmount = 0; // Reset damage amount for next turn
            }
            else { // Enemy's turn logic
                // Here you would implement the enemy's attack logic


              // ask attack choice
                ink.attackMenu();
                int attackChoice = randNum.nextInt(3) + 1; // 


                // strike the enemy
                damageAmount = eWeapon.strike(attackChoice, enemy.getStrength(), enemy.getDexterity());
                System.out.println("You dealt " + damageAmount + " damage to the player!");
                
                
                // apply damage
                if (damageAmount > 0) { //hit the enemy
                    // remove health from player
                    player.reduceHealth(damageAmount - pArmour.getDefencePoints());
                    // check if enemy is defeated
                    if (player.getHealth() <= 0) {
                        System.out.println("enemy wins!");
                        isGameOver = true; // end the game
                    }
                     // if yes you win
                     // set isGameOver to true
                     // else end turn
                    
                }
                // print enemy turn results
                ink.printResults( "enemy", damageAmount, player, enemy);
                damageAmount = 0; 



            }            isPlayerTurn = !isPlayerTurn; // switch turns

            isPlayerTurn = !isPlayerTurn; // switch turns

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

    private static void createArmour(String who, int choice) {
        switch (choice) {
            case 1: // Asguardian Suit
                if (who.equals("Player"))
                    pArmour = new AsguardianSuit();
                else
                    eArmour = new AsguardianSuit();
                    System.out.println("You have chosen Asguardian Suit as your armour.");
                break;
            case 2: // Vibranium Suit
                if (who.equals("Player"))
                    pArmour = new VibraniumSuit();
                else
                    eArmour = new VibraniumSuit();
                    System.out.println("You have chosen Vibranium Suit as your armour.");
                break;
            
            case 3: // Iron Suit
                if (who.equals("Player"))
                    pArmour = new IronSuit();
                else
                    eArmour = new IronSuit();
                    System.out.println("You have chosen Iron Suit as your armour.");
                break;
            
            default:
                System.out.println("Invalid choice. Please select a valid weapon type.");
                return; // Exit the method if the choice is invalid
        } // switch

    } // createArmour method
    
    
} //Battle class