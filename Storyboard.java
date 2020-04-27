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
        //try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": There's no food left here...");
        //try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Ever since the Black Water appeared nearby, The Waterloon Reef has so many new sealife!");
        Crossroads(character, 1);
        System.out.println("Chapter 2");
    }

    public static void Crossroads(String character, int chapter) {
        Scanner sc = new Scanner(System.in);
        switch(chapter) {
            case 1: // crossroads chapter 1
                //try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": Should I swim down to find food, or swim to another reef?");
                //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
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
    @SuppressWarnings("static-access")
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
        System.out.println("*Swordfish has entered the waters*");
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Swordfish: YOU HAVE TRESPASSED UPON MY WATERS, YOUNG " + character.toUpperCase() + ".");
        //try{TimeUnit.SECONDS.sleep(2);}catch(InterruptedException e){e.printStackTrace();}
        // Hero.healthMonitor("Swordfish", 0);
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("\n____________________\nSHOWDOWN I: " + character.toUpperCase() + " VS. SWORDFISH");
        // System.out.println(character + ": You know who ya talkin' to?");
        // System.out.println(character + ": You can't handle my spell!");
        // System.out.println(character + ": We'll see about that, Mr. Stupidfish...");\
        Combat.UserCombat();
        System.out.println("Adding EXP!");
        // System.out.println("*Swordfish initiates a charging move*");
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        // Random rnd = new Random();
        // int evadeThis = 100000 + rnd.nextInt(900000);
        // System.out.println("QUICK: TYPE " + evadeThis + " TO EVADE SWORDFISH");
        // int evade = sc.nextInt();
        // if(evadeThis == evade) {
        //     System.out.println("*" + character + " evades Swordfish*");
        // } else {
        //         Hero.healthMonitor(character, 0);
        //         System.out.println(character + " has died.");
        // }
        //try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        // Hero.healthMonitor(character, 0);
        // Hero.healthMonitor("Swordfish", 0);
        // Hero.getAbilities(character);
        // System.out.println("Decide your move.");
        // int option2 = sc.nextInt();
        // System.out.println("*Swordfish perishes*");
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
    public static void Chapter2(String character) {
    	System.out.println("Chapter 2...");
    }
    
    
}
