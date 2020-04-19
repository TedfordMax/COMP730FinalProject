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
        Chapter1("Archer Squid");
    }

    public static void Chapter1(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("CHAPTER 1\nSEARCHING FOR FOOD\n");
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
                System.out.println("\n\n");
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
            // sleep
            try { TimeUnit.SECONDS.sleep(3); 
            } catch (InterruptedException e) {e.printStackTrace();}
            break;       
        }
    }
    public static void Chapter1A(String character) {
        Scanner sc = new Scanner(System.in);
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": These creatures are invading from all around.");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": It seems all the reefs are infested with them.");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": The only way to avoid them is to swim further down...");
        try { TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": AAAAH!");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": A SWORDFISH?");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println("Swordfish: You have trespassed through my territory, young " + character + " prepare to die.");
        // this still needs work
        // How can we make this be able to call any character?
        // i don't think it's good to hard-code a character name
        // - scott
        // PRINT ABILITIES
        // ABILITIES SELECTION HERE
        // PLAYER CHOOSES ABILITY
    }

    public static void Chapter1B(String character) {
    	Scanner sc = new Scanner(System.in);
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
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println("To keep swimming down enter: A");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println("Or");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println("To search the cave enter: B");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("A")) {
        	Chapter2C(character);
        }
        else {
        	Chapter2B(character);
        }
    }
    public static void Chapter2A(String character) {
    	Scanner sc = new Scanner(system.in);
    	try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + "Wow what were those creatures!! They've been everywhere since the black water appeared, maybe they caused it?");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + "I can't stay in this part of the water I need to dive down to get away from those creatures.");
        try { TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": AAAAH!");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println(character + ": A SWORDFISH?");
        try { TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();}
        System.out.println("Swordfish: You have trespassed through my territory, young " + character + " prepare to die.");
    }

    public static void Chapter2B(String character) {
    	Scanner sc = new Scanner(System.in);
    	try {TimeUnit.SECONDS.sleep(3);;
    	} catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println(character + "I'm still bleeding a little but I should just keep swimming");
        try {TimeUnit.SECONDS.sleep(3);;
    	} catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println(character + "It's getting dark really fast, I didn't think I was was going that fast");
        try {TimeUnit.SECONDS.sleep(3);;
    	} catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println("As you look up you notice a dark cloud coming at you");
        try {TimeUnit.SECONDS.sleep(3);;
    	} catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println("Piranha: Hey that fish is where the bloods coming from, get him!");
            
    }
    public static void Chapter2C(String character) {	
        	Scanner sc = new Scanner(System.in);
        	try { TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println(character + "Hopefully there's something in this cave that can help!");
            try { TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println(character + "Even if it just works as a hiding spot.");
            try { TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println(character + "You've found a diving suit, you can swim below the Abyssopelagic Zone now!");
            try { TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println(character + "Well I feel a lot better now, I might be able to dive enough to be safe");
            try { TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println(character + "Let's dive down!");
            try { TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println(character + "Huh it's getting a lot darker here than I thought it would");
            try { TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println(character + "*Looks up* It's not getting darker, there's something above me!");
            try { TimeUnit.SECONDS.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();}
            System.out.println("Piranha: Mmm.. there is he boys, the injured fish, lets get 'em!");
            Chapter3B(character);
    }
     public static void Chapter3A(String character) {
    	 Scanner sc = new Scanner(System.in);
    	 try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println(character + "Wow that was a close call, what is a swordfish even doing this deep?");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println("Jimbo the " + character + ": Hey you, " + character + "I just saw you fight off the swordfish!");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println("Jimbo the " + character + ": That was really impressive, I've never seen a " + character + "fight a swordfish and win!");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println("Jimbo the " + character + ": I've never seen a swordfish even attack one of our kind");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println("Jimbo the " + character + ": This black water really does have everyone riled up in the ocean!");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println("Jimbo the " + character + ": *lowers voice* listen closely now...  I heard a rumour");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println("Jimbo the " + character + ": Apparently if you swim far down enough the deepest trench");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println("Jimbo the " + character + ": You can find a giant fish that can stop all this nonsense and save us.");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println(character + "Well I would do it but I can't swim down that far, it starts to hurt after awhile and I can't breath");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println("Jimbo the " + character + ": Well I was going to use this diving suit to wake it myself but you’re a lot stronger than me, you take it!");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println(character + "Receieved a diving suit, you can now further down!");
         Chapter3B(character);
        }
     public static void Chapter3B(String character) {
    	 Scanner sc = new Scanner(System.in);
    	 try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println(character + "Now that I can breathe this deep it's time go down into the trench");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println(character + "Wow it's really dark down in this trench, I can't see anything, how will I find a sleeping fish like this?");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println(character + "Oh look it's a light, maybe they'll lend me there light if I explain what I'm doing?");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println(character + "Oh crap it's an anglerfish! It's going to try and eat me!");
         try { TimeUnit.SECONDS.sleep(3);
         } catch (InterruptedException e) {
             e.printStackTrace();}
         System.out.println(character + "Receieved a flashlight, you can now see in the dark!");
         
    	 
    }
}