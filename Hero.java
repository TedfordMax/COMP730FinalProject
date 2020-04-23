import java.util.concurrent.TimeUnit;

public class Hero {
    private static String name = "None";
    private static int health = 0;
    private static int attack = 0;
    private static int speed = 0;

    public Hero(String n, int h, int a, int s) {
        name = n;
        health = h;
        attack = a;
        speed = s;
    }

    // public static void changeStats(String character, String stat, int amount) {
    //     switch(stat) {
    //         case "h":
    //             System.out.println(character + "'s health changed by " + amount + ".");
    //             switch (character) {
    //                 case "Archer Squid":
    //                     healthMonitor(character, amount);
    //                     break;
    //                 case "Warrior Crab":
    //                     healthMonitor(character, amount);
    //                     break;
    //                 case "Assassin Starfish":
    //                     healthMonitor(character, amount);
    //                     break;
    //                 case "Swordfish":
    //                     healthMonitor(character, amount);
    //                     break;
    //             }
    //             break;
    //         case "a":
    //             System.out.println("Attack changed by " + amount);
    //             break;
    //         case "s":
    //             System.out.println("Speed changed by " + amount);
    //             break;
    //     }
    //  }

    public static void ReadStats(String character) {
        System.out.println("Health: " + health);
        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Attack: " + attack);
        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Speed: " + speed);
        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
    }

    public static void getAbilities(String character) {
        switch(name) {
            case "Archer Squid":
                System.out.println("(1) Attack: (-2) Ink-Tipped Torpedo");
                System.out.println("(2)  Spell: (-3) Ink Cloud");
                System.out.println("(3) Defend: (+1) Tentacle Block");
                break;
            case "Warrior Crab":
                System.out.println("(1) Attack: (-2) Crab Stab");
                System.out.println("(2)  Spell: (-1) Rangoon Confusion");
                System.out.println("(3) Defend: (+3) Shell");
                break;
            case "Assassin Starfish":
                System.out.println("(1) Attack: (-1) Starfish Slam");
                System.out.println("(2)  Spell: (-3) The Dirty Dan");
                System.out.println("(3) Defend: (+2) Camouflage");
                break;
        }
    }

    public static void healthMonitor(String character, int amount) {
        int totalHealth = health + amount;
        switch(character) {
            case "Archer Squid":
                System.out.println(character + ": " + totalHealth + "HP");
                break;
            case "Warrior Crab":
                System.out.println(character + ": " + totalHealth + "HP");
                break;
            case "Assassin Starfish":
                System.out.println(character + ": " + totalHealth + "HP");
                break;
            case "Swordfish":
                System.out.println(character + ": " + totalHealth + "HP");
                break;
        }

    }
}