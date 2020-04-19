import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Storyboard extends CharacterCreator {

    public static void Story() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 1\nSEARCHING FOR FOOD\n");
        try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
        Hero.ReadName();
        System.out.println("There's no food left here...");
        try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
        Hero.ReadName();
        System.out.println("Ever since the Black Water appeared nearby, The Waterloon Reef has so much new sealife!");
        Crossroads(1);
        
    }
    public static void Crossroads(int chapter) {
        Scanner sc = new Scanner(System.in);
        switch(chapter) {
            case 1:
                // sleep
                try { TimeUnit.SECONDS.sleep(3);} catch (InterruptedException e){e.printStackTrace();}
                // crossroads chapter 1
                Hero.ReadName();
                System.out.println("Should I swim down to find food, or swim to another reef?");
                try { TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
                System.out.println("(1) If you swim down, you have to fight a swordfish.\n(2) If you swim to a nearby reef, you have to fight humans who are cleaning up an oil spill.");
                int option = sc.nextInt();
                switch(option) {
                    case 1:
                        Hero.ReadName();
                        System.out.println("Alright, let's swim down and find some delicious food.");
                        Chapter1A();
                        break;
                    case 2:
                        Hero.ReadName();
                        System.out.println("Luckily the nearest reef won't take long to reach there..");
                        Chapter1B();
                        break;
                }
                break;
            case 2:
                break;       
        }
    }
    public static void Chapter1A() {
        Scanner sc = new Scanner(System.in);
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        Hero.ReadName();
        System.out.println("These creatures are invading from all around.");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        Hero.ReadName();
        System.out.println("It seems all the reefs are infested with them.");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        Hero.ReadName();
        System.out.println("The only way to avoid them is to swim further down...");
        try { TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        Hero.ReadName();
        System.out.println("AAAAH!");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        Hero.ReadName();
        System.out.println("A SWORDFISH?");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println("Swordfish: You have trespassed through my territory, young one.");
        // this still needs work
        // How can we make this be able to call any character?
        // i don't think it's good to hard-code a character name
        // - scott
        // PRINT ABILITIES
        // ABILITIES SELECTION HERE
        // PLAYER CHOOSES ABILITY
    }
    public static void Chapter1B() {
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        Hero.ReadName();
        System.out.println("There's some big and tough fish down here.");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        Hero.ReadName();
        System.out.println("Should I keep going down?");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        Hero.ReadName();
        System.out.println("Are the fish going to get bigger as I go down?");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        Hero.ReadName();
        System.out.println("There's a little cave here that could have food!");
    }
}