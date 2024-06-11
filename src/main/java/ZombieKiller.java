
public class ZombieKiller {
    public static void main(String[] args){
        System.out.println("Welcome to our zombie killer program!!!");

        String backpack[] = {"Shotgun", "Rifle","Sniper"};
        String zombies[] = {"Close-range zombie", "Mid-range zombie", "Long-range zombie"};

        System.out.println("Backpack items:");
        System.out.println(backpack[0]);
        System.out.println(backpack[1]);
        System.out.println(backpack[2]);
        System.out.println("Zombies attacking:");
        System.out.println(zombies[0]);
        System.out.println(zombies[1]);
        System.out.println(zombies[2]);
        System.out.println("Use " + backpack[0]+ " to kill "+ zombies[0]+".");
        System.out.println("Use " + backpack[1]+ " to kill "+ zombies[1]+".");
        System.out.println("Use " + backpack[2]+ " to kill "+ zombies[2]+".");


    }
}
