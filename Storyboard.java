import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.Random;

public class Storyboard extends CharacterCreator {
    public static void main(String[] args) {
        CharacterSelection();
    }

    public static void Story(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 1\nSEARCHING FOR FOOD\n");
        try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": There's no food left here...");
        try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Ever since the Black Water appeared nearby, The Waterloon Reef has so many new sealife!");
        Crossroads(character, 1);
        System.out.println("Chapter 2");
    }

    public static void Crossroads(String character, int chapter) {
        Scanner sc = new Scanner(System.in);
        switch(chapter) {
            case 1: // crossroads chapter 1
                try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": Should I swim down to find food, or swim to another reef?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("(1) If you swim down, you have to fight a swordfish.\n(2) If you swim to a nearby reef, you have to fight humans who are cleaning up an oil spill.");
                int option = sc.nextInt();
                switch(option) {
                    case 1:
                        System.out.println(character + ": Alright, let's swim down and find some delicious food.");
                        Chapter1A(character);
                        break;
                    case 2:
                        System.out.println(character + ": Luckily the nearest reef won't take long to reach there..");
                        Chapter1B(character);
                        break;
                }
                break;
            case 2:
                break;       
        }
    }

    public static void Chapter1A(String character) {
        Scanner sc = new Scanner(System.in);
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": These creatures are invading from all around.");
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": It seems all the reefs are infested with them.");
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": The only way to avoid them is to swim further down...");
        //try{TimeUnit.SECONDS.sleep(2);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": AAAAH!");
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Swordfish: YOU HAVE TRESPASSED UPON MY WATERS, YOUNG " + character.toUpperCase() + ".");
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Swordfish: PREPARE TO DIE.");
        //try{TimeUnit.SECONDS.sleep(2);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("\n*Swordfish initiates a charging maneuver, effectively stabbing " + character + "'s upper right region.*");        
        //try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
        Hero.changeStats(character, "h", -1);
        Hero.healthMonitor("Swordfish", 0);
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        Hero.getAbilities(character);
        System.out.println("Decide your move.");
        int option = sc.nextInt();
        switch(option) {
            case 1:
                System.out.println(character + ": You know who ya talkin' to?");
                switch(character) {
                    case "Archer Squid":
                        System.out.println("*Hundreds of INK DARTS are thrown by the " + character + " and injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Crab Warrior": 
                        System.out.println("*A powerful DOUBLE-CLAW PINCH is initiated by " + character + " and injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Assassin Starfish": 
                        System.out.println("*A strong and smelly STICKY SPRAY is ejected by " + character + " and injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                }
                break;
            case 2:
                System.out.println(character + ": Take this, slimy scum!");
                switch(character) {
                    case "Archer Squid":
                        System.out.println("*An INK-TIPPED TOPEDO is launched by the " + character + " and injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Crab Warrior": 
                        System.out.println("*A forceful CRAB STAB by " + character + " injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Assassin Starfish": 
                        System.out.println("*" + character + " performs the STARFISH SLAM which effectively injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                }
                break;
            case 3:
                System.out.println(character + ": We'll see about that, Mr. Stupidfish...");
                switch(character) {
                    case "Archer Squid":
                        System.out.println("*An INK CLOUD by " + character + " chokes Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Crab Warrior": 
                        System.out.println("*A powerful RANGOON CONFUSION by " + character + " disorients Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Assassin Starfish": 
                        System.out.println("*" + character + " activates CAMOUFLAGE, sneaks up on Swordfish, then suddenly slabs Swordfish out of oblivion.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                }
                break;
        }
        System.out.println("*Swordfish initiates a charging move*");
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        Random rnd = new Random();
        int evadeThis = 100000 + rnd.nextInt(900000);
        System.out.println("QUICK: TYPE " + evadeThis + " TO EVADE SWORDFISH");
        int evade = sc.nextInt();
        if(evadeThis == evade) {
            System.out.println("*" + character + " evades Swordfish*");
        } else {
                Hero.healthMonitor(character, 0);
                System.out.println(character + " has died.");
        }
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        Hero.healthMonitor(character, 0);
        Hero.healthMonitor("Swordfish", 0);
        Hero.getAbilities(character);
        System.out.println("Decide your move.");
        int option2 = sc.nextInt();
        switch(option) {
            case 1:
                System.out.println(character + ": You know who ya talkin' to?");
                switch(character) {
                    case "Archer Squid":
                        System.out.println("*Hundreds of INK DARTS are thrown by the " + character + " and injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Crab Warrior": 
                        System.out.println("*A powerful DOUBLE-CLAW PINCH is initiated by " + character + " and injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Assassin Starfish": 
                        System.out.println("*A strong and smelly STICKY SPRAY is ejected by " + character + " and injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                }
                break;
            case 2:
                System.out.println(character + ": Take this, slimy scum!");
                switch(character) {
                    case "Archer Squid":
                        System.out.println("*An INK-TIPPED TOPEDO is launched by the " + character + " and injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Crab Warrior": 
                        System.out.println("*A forceful CRAB STAB by " + character + " injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Assassin Starfish": 
                        System.out.println("*" + character + " performs the STARFISH SLAM which effectively injures Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                }
                break;
            case 3:
                System.out.println(character + ": We'll see about that, Mr. Stupidfish...");
                switch(character) {
                    case "Archer Squid":
                        System.out.println("*An INK CLOUD by " + character + " chokes Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -2);
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Crab Warrior": 
                        System.out.println("*A powerful RANGOON CONFUSION by " + character + " disorients Swordfish.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -2);
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Assassin Starfish": 
                        System.out.println("*" + character + " activates CAMOUFLAGE, sneaks up on Swordfish, then suddenly slabs Swordfish out of oblivion.*");
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -2);
                        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                }
                break;
        }
        System.out.println("Swordfish: YOU WON'T GET VERY FAR...");
        System.out.println("*Swordfish perishes*");
    }
    public static void Chapter1B(String character) {
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": There's some big and tough fish down here.");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": Should I keep going down?");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": Are the fish going to get bigger as I go down?");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": There's a little cave here that could have food!");
    }
}