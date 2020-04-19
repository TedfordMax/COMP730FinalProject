import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Storyboard extends CharacterCreator {
    public static void main(String[] args) {
        CharacterSelection();
        // based on line 6, line 8 needs to have the variable that stores the character String.
        // However, when I do 
        // Chapter1(character), i get a "cannot find symbol" error.
        // we need to remove any hardcoded character names
        // -scott
        
        //when not in debug, use... 
        //Storyboard.Story(Hero.returnName());
    }

    public static void Story(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 1\nSEARCHING FOR FOOD\n");
        try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": There's no food left here...");
        try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Ever since the Black Water appeared nearby, The Waterloon Reef has so many new sealife!");
        Crossroads(character, 1);
        
    }
    public static void Crossroads(String character, int chapter) {
        Scanner sc = new Scanner(System.in);
        switch(chapter) {
            case 1:
                // sleep
                try { TimeUnit.SECONDS.sleep(3);} catch (InterruptedException e){e.printStackTrace();}
                // crossroads chapter 1
                System.out.println(character + ": Should I swim down to find food, or swim to another reef?");
                try { TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
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
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": These creatures are invading from all around.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": It seems all the reefs are infested with them.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": The only way to avoid them is to swim further down...");
        try{TimeUnit.SECONDS.sleep(2);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": AAAAH!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Swordfish: YOU HAVE TRESPASSED UPON MY WATERS, YOUNG " + character.toUpperCase() + ".");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Swordfish: PREPARE TO DIE.");
        try{TimeUnit.SECONDS.sleep(2);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("\n*Swordfish initiates a charging maneuver, effectively stabbing " + character + "'s upper right region.*");        
        try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
        Hero.changeStats(character, "h", -1);
        Hero.getAbilities(character);
        System.out.println("Decide your move.");
        int option = sc.nextInt();
        switch(option) {
            case 1:
                System.out.println(character + ": You know who ya talkin' to?");
                switch(character) {
                    case "Archer Squid":
                        System.out.println("*Hundreds of INK DARTS are thrown by the " + character + " and injures Swordfish.*");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Crab Warrior": 
                        System.out.println("*A powerful DOUBLE-CLAW PINCH is initiated by " + character + " and injures Swordfish.*");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Assassin Starfish": 
                        System.out.println("*A strong and smelly STICKY SPRAY is ejected by " + character + " and injures Swordfish.*");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                }
                break;
            case 2:
                System.out.println(character + ": Take this, slimy scum!");
                switch(character) {
                    case "Archer Squid":
                        System.out.println("*An INK-TIPPED TOPEDO is launched by the " + character + " and injures Swordfish.*");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Crab Warrior": 
                        System.out.println("*A forceful CRAB STAB by " + character + " injures Swordfish.*");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Assassin Starfish": 
                        System.out.println("*" + character + " performs the STARFISH SLAM which effectively injures Swordfish.*");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                }
                break;
            case 3:
                System.out.println(character + ": We'll see about that, Mr. Stupidfish...");
                switch(character) {
                    case "Archer Squid":
                        System.out.println("*An INK CLOUD by " + character + " Swordfish.*");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Crab Warrior": 
                        System.out.println("*A forceful CRAB STAB by " + character + " injures Swordfish.*");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                    case "Assassin Starfish": 
                        System.out.println("*" + character + " performs the STARFISH SLAM which effectively injures Swordfish.*");
                        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                        Hero.changeStats("Swordfish", "h", -1);
                        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                        System.out.println("Swordfish: YOU'LL HAVE TO BETTER THAN THAT TO DEFEAT ME, " + character.toUpperCase() + " SCUM.");
                        break;
                }
                break;
            Hero.getAbilities(character);
            System.out.println("Decide your move.");
            int option2 = sc.nextInt();
            switch(option2) {

        }
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
