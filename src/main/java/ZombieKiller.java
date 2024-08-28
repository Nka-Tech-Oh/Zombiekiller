import java.util.Random;
import java.util.Scanner;

public class ZombieKiller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to our zombie killer game!!!");

        String backpack[] = {"Shotgun", "Rifle", "Sniper"};
        String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};

        int playerHealth = 100;
        int zombieHealth = 50;
        boolean gameRunning = true;

        while (gameRunning) {
            System.out.println("\nA zombie is attacking!");
            int zombieType = random.nextInt(zombies.length);
            System.out.println("It's a " + zombies[zombieType] + " with " + zombieHealth + " HP!");

            System.out.println("\nChoose your weapon:");
            for (int i = 0; i < backpack.length; i++) {
                System.out.println((i + 1) + ". " + backpack[i]);
            }

            int weaponChoice = scanner.nextInt() - 1;

            if (weaponChoice < 0 || weaponChoice >= backpack.length) {
                System.out.println("Invalid choice! The zombie attacks you.");
                playerHealth -= 10;
            } else if (weaponChoice == zombieType) {
                System.out.println("You used " + backpack[weaponChoice] + " to kill the " + zombies[zombieType] + "!");
                zombieHealth -= 25;
                if (zombieHealth <= 0) {
                    System.out.println("The zombie is dead!");
                    zombieHealth = 50; // Reset zombie health for the next round
                }
            } else {
                System.out.println("The " + backpack[weaponChoice] + " isn't effective against the " + zombies[zombieType] + "!");
                playerHealth -= 10;
            }

            System.out.println("Your health: " + playerHealth);

            if (playerHealth <= 0) {
                System.out.println("You died! Game over.");
                gameRunning = false;
            } else {
                System.out.println("Do you want to continue? (yes/no)");
                String continueGame = scanner.next();
                if (continueGame.equalsIgnoreCase("no")) {
                    gameRunning = false;
                }
            }
        }

        System.out.println("Thank you for playing Zombie Killer!");
        scanner.close();
    }
}
