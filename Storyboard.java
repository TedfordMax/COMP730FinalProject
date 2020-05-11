import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Storyboard extends CharacterCreator {
    public static void main(String[] args) {
        CharacterSelection();
    }

    public static void Chapter1(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 1\nSEARCHING FOR FOOD\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println(character + ": There's no food left here...");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Ever since the Black Water appeared nearby, The Waterloon Reef has so many new sealife!");
        Crossroads(character, 1);
    }
    public static void Crossroads(String character, int chapter) {
        Scanner sc = new Scanner(System.in);
        switch(chapter) {
            case 1:
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("\n\n");
                // crossroads chapter 1
                System.out.println(character + ": Should I swim down to find food, or swim to another reef?");
                //try { TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
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
                    case 3:
                        GrubShop.Menu(character);
                        break;
                }
                break;
            case 2:
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                Chapter2A(character);
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
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("(1) Investigate the Anemone.");
        System.out.println("(2) Swim around and hang out for a bit.");
        System.out.println("(3) Swim further down.");
        int meter100 = sc.nextInt();
        switch (meter100) {
            case 1:
                System.out.println(character + ": I see three Sea Anemones, which one should I investigate?");
                System.out.println("(4) Sea Anemone");
                System.out.println("(5) Sea Anemone");
                System.out.println("(6) Sea Anemone");
                System.out.print("Choice: ");
                int anemone = sc.nextInt();
                switch (anemone) {
                    case 4:
                        System.out.println(character + ": I found 100 gold!");
                        Character.getGold(100);
                        Chapter2B(character);
                        break;
                    case 5:
                        System.out.println(character + ": Nothing in here.");
                        Chapter2B(character);
                        break;
                    case 6:
                        System.out.println(character + ": I found a Seaweed Sword! It gives 2 attack and 1 sentience.");
                        Character.WeaponItem("Seaweed Sword", "1H-P", 2, 1);
                        Chapter2B(character);
                        break;
                    default:
                        System.out.println("Try selecting one of the options.\n");
                        break;
                }
                break;
            case 2:
                System.out.println(character + ": Just chillin...");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                Chapter2B(character);
            case 3:
                System.out.println(character + ": AAAAH!");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": A SWORDFISH?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Swordfish: You have trespassed through my territory, young " + character + " prepare to die.");
                Swordfish.setStats();
                Combat.UserCombat();
                Chapter2B(character);
        }
    }

    public static void Chapter1B(String character) {
    	Scanner sc = new Scanner(System.in);
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": There's some big and tough fish down here.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": I wonder how they got their cool shining armor.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": There's a little cave here that could have food!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("1) Swim down to find food\n2) Swim to another reef");
        int input = sc.nextInt();
        switch(input) {
            case 1:
                System.out.println(character + ": Trying to find food...");
                try { TimeUnit.SECONDS.sleep(3);} catch (InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": Trying to find food, la la la...");
                try { TimeUnit.SECONDS.sleep(3);} catch (InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": Trying to find food, do do dodoooo...");
                try { TimeUnit.SECONDS.sleep(3);} catch (InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": The more I swim down, the more these waters give me the creeps...");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("(1) Continue to swim down\n(2) Search the cave on the right");
                int option = sc.nextInt();
                switch(option) {
                    case 1:
                        System.out.println(character + ": Alright, let's swim down and search for some food.");
                        Chapter2A(character);
                        break;
                    case 2:
                        System.out.println(character + ": Hopefully there's something in this cave that can help!");
                        Chapter2C(character);
                        break;
                }
                break;
            case 2:
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": I don't like this reef, I'm going to try to find another one.");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": OW!");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": I was stung by a passing Jellyfish.");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Health decreased by 1.");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": I'm going to stop so I can recover a bit...");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Health returns to normal.");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                switch(character) {
                    case "Archer Squid":
                        // change health
                        break;
                    case "Warrior Crab":
                        // change health
                        break;
                    case "Assassin Starfish":
                        // change health
                        break;
                }
                Chapter2B(character);
                break; 
            }
    }
 
    public static void Chapter2A(String character) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 2\nSWORDFISH\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println(character + ": Wow what were those creatures!! They've been everywhere since the black water appeared, maybe they caused it?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": I can't stay in this part of the water I need to dive down to get away from those creatures.");
        try{TimeUnit.SECONDS.sleep(1);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": AAAAH!");
        try{TimeUnit.SECONDS.sleep(2);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": A SWORDFISH?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Swordfish: You have trespassed through my territory, young " + character + " prepare to die.");
    }

    public static void Chapter2B(String character) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 2\nPIRANHA\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println(character + ": I'm still bleeding a little but I should just keep swimming");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": It's getting dark really fast, I didn't think I was was going that fast");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("As you look up you notice a dark cloud coming at you");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Piranha: Hey that fish is where the bloods coming from, get him!");
        Piranhas.setStats();
        Combat.UserCombat();
        Chapter3A(character);
    }
    public static void Chapter2C(String character) {	
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 2\nSCARY CREATURES\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println(character + ": Hopefully there's something in this cave that can help!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Even if it just works as a hiding spot.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": You've found a diving suit, you can swim below the Abyssopelagic Zone now!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Well I feel a lot better now, I might be able to dive enough to be safe");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Let's dive down!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("(1) Investigate the Anemone.");
        System.out.println("(2) Swim further down.");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                System.out.println(character + ": I see two Sea Anemones, which one should I investigate?");
                System.out.println("(3) Sea Anemone");
                System.out.println("(4) Sea Anemone");
                int anemone = sc.nextInt();
                switch (anemone) {
                    case 3:
                        System.out.println(character + ": I found Kelp!");
                        break;
                    case 4:
                        System.out.println(character + ": I found a Sea Cucumber!");
                        break;
                    default:
                        System.out.println("Try selecting one of the options.\n");
                        break;
                }
                break;
            case 2: 
                System.out.println(character + ": Huh it's getting a lot darker here than I thought it would");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + "*Looks up* : It's not getting darker, there's something above me!");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Piranha: Mmm.. there is he boys, the injured fish, lets get 'em!");
                Chapter3B(character);
                break;
        }
        
    }
    public static void Chapter3A(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 3\nJIMBO\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println(character + ": Wow that was a close call, what is a swordfish even doing this deep?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Jimbo the " + character + ": Hey you, " + character + "I just saw you fight off the swordfish!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Jimbo the " + character + ": That was really impressive, I've never seen a " + character + "fight a swordfish and win!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Jimbo the " + character + ": I've never seen a swordfish even attack one of our kind");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Jimbo the " + character + ": This black water really does have everyone riled up in the ocean!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Jimbo the " + character + ": *lowers voice* listen closely now...  I heard a rumour");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Jimbo the " + character + ": Apparently if you swim far down enough the deepest trench");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Jimbo the " + character + ": You can find a giant fish that can stop all this nonsense and save us.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Well I would do it but I can't swim down that far, it starts to hurt after awhile and I can't breath");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Jimbo the " + character + ": Well I was going to use this diving suit to wake it myself but you’re a lot stronger than me, you take it!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + " receieved a diving suit, you can now further down!");
        System.out.println("(1) Investigate the Anemone.");
        System.out.println("(2) Swim further down.");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                System.out.println(character + ": I see two Sea Anemones, which one should I investigate?");
                System.out.println("(3) Sea Anemone");
                System.out.println("(4) Sea Anemone");
                int anemone = sc.nextInt();
                switch (anemone) {
                    case 3:
                        System.out.println(character + ": Nothing in here.");
                        break;
                    case 4:
                        System.out.println(character + ": Nothing in here.");
                        break;
                    default:
                        System.out.println("Try selecting one of the options.\n");
                        break;
                }
                break;
            case 2: 
                Chapter3B(character);
                break;
            }
    }
     public static void Chapter3B(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 3\nDARK TRENCH\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println(character + ": Now that I can breathe this deep it's time go down into the trench");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Wow it's really dark down in this trench, I can't see anything, how will I find a sleeping fish like this?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Oh look it's a light, maybe they'll lend me there light if I explain what I'm doing?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Oh crap it's an anglerfish! It's going to try and eat me!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + " receieved a flashlight, you can now see in the dark!");
        System.out.println("(1) Investigate the Anemone.");
        System.out.println("(2) Swim further down.");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                System.out.println(character + ": I see two Sea Anemones, which one should I investigate?");
                System.out.println("(3) Sea Anemone");
                System.out.println("(4) Sea Anemone");
                int anemone = sc.nextInt();
                switch (anemone) {
                    case 3:
                        System.out.println(character + ": I found SeaWeed! BOOYEAH");
                        break;
                    case 4:
                        System.out.println(character + ": I found a jar of pickles!");
                        break;
                    default:
                        System.out.println("Try selecting one of the options.\n");
                        break;
                }
                break;
            case 2: 
                Chapter4(character);
                break;
        }
    }
    public static void Chapter4(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 4\nATLANTIS? WHAT?\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println(character + ": Wow it sure is dark down here, if it wasn't for my flashlight I couldn't see a thing!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("(1) Investigate the Anemone.");
        System.out.println("(2) Swim further down.");
        int choice1 = sc.nextInt();
        switch (choice1) {
            case 1:
                System.out.println(character + ": I see two Sea Anemones, which one should I investigate?");
                System.out.println("(3) Sea Anemone");
                System.out.println("(4) Sea Anemone");
                int anemone = sc.nextInt();
                switch (anemone) {
                    case 3:
                        System.out.println(character + ": I found a Sea Cucumber");
                        break;
                    case 4:
                        System.out.println(character + ": I found a baby Octopus!");
                        break;
                    default:
                        System.out.println("Try selecting one of the options.\n");
                        break;
                }
                break;
            case 2: 
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": Not that there's anything to see in the depths of a trench...");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("The outline of a building appears, it seems to be carved into the Earth around you");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + "Wow I guess there is something down here... wooow... there's an entire city in this trench");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println(character + ": I wonder what city this is? Should I keep exploring it or just dive down more?");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("(A) Keep swimming down and ignore the city.");
                System.out.println("(B) Enter and search the city.");
                String input = sc.nextLine();
                if(input.equalsIgnoreCase("A")) {
                    Chapter4A(character);
                } if(input.equalsIgnoreCase("B")) {
                    Chapter4B(character);
                } else {
                    System.out.println("Please select A or B, game will not continue until one is picked.");
                }
                break;
        }
    }
    public static void Chapter4A(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 4\nVOICES, FIGURES, AND THE UNKNOWN...\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println(character + ": Alright with this flashlight I should be able to find that sleeping fish down here somewhere!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Hmm there seems to be a shadow following me, maybe it's just the light playing tricks on me?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": No, the shadow isn't just coming closer, it's getting bigger!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Unknown voice: You with the light turn it off NOW! You're putting everyone at danger.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Danger? Everyone? Who are you?! Sorry I didn't know I couldn't have a flashlight on in the dark");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("As the shadow gets closer you can make out it is a small school of fish, all wearing black robes");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Robed figure: How did you even make it this far little " + character + " past the angler fish and all the sealife guarding our city?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Is this your city?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: This is no one's city, but we protect it");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Why are you protecting this city, especially if it’s so dangerous I can't have my light on?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: We are not protecting the city, we protect all beings from what slumbers below the city.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Well that's cryptic and vague, what slumbers below?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("The fish closest to you, now very close pulls back his hood revealing that he is a fish, but with grotesque tentacles coming from his face, forming a beard.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: You're mind cannot handle what lies beneath us, it's part of our job to protect you from that information.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Okay, but the world above this city is crazy now, the ocean is too hot and polluted, fish are dying off all over and there isn’t enough food left for everyone, the few places you can find food are being invaded and turned into fish battlegrounds .I can’t go back up there. I'll be a goner for sure.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: We do not swim above this city, but if the world is truly as crazy and bad as you say it is, it might be time for this city to rise again.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Well that sounds bad too, is there a…");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: “You must decide if the world is ready to be saved, come with us little fish, if you can pass our trial then it is time.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("The fish all take off their hoods, all of them are mutated beyond belief.  'Come now,' one of the says and they all swim down.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("You follow the fish deep below the city, you can’t see anything and can only follow but the \r\n" + 
            "sounds of hooded fishes movements ahead of you. When they finally come to a stop you’ve went far enough that only pitch blackness surrounds you, no trace of a city or a trail anywhere.");
            try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: We believe you were chosen to make it this far if you are here, now prove yourself.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("All of the hooded figures peel back there hoods revealing a mishmash of fish, all deformed with tentacles and ancient looking in appearence.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: RELEASE THE KRAKEN!"); 
        //KrakenFight(character);
	}
    public static void Chapter4B(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 4\nFISH CULTISTS\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println("You keep searching, as you do you notice a dark shadow floating about you, never coming close enough for you to be certain it’s a real solid thing or just the shadows playing tricks in the dim lights.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("As you keep swimming you come across a massive building, much bigger than the rest.  You swim inside and find it’s made up of many small rooms that are deserted and empty.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Just as you start thinking the place is empty you come across a great room with a raised ceiling so high you cannot see it.  As you swim through it you find an item, a glimmer silver 'weapon'");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("As you pick it up you notice that the dark shadow that was following you outside is still following you, and is now getting closer.  As it comes closer the water around you gets colder and you freeze in place, waiting for the shadow to descend upon you."); 
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: HALT! WHO GOES THERE?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": What are you, and I can’t move anyways, I think I'm frozen in place.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("As the shadow gets closer you can make out that it’s not one thing but a school of fish, all wearing black robes.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: What are you doing in our city and why are you taking our sacred weapon?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Well coming down here I was attacked a lot so I thought grabbing the only weapon in a pitch black ancient city under the sea might be helpful.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: That sword is our only weapon that can destroy what lurks below us, if you take it then the world could end without ever being able to defend itself.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Something comes over you as they threaten to take the sword away from you, you need this sword and it's yours, they can't have it.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Well, it’s mine now, I need this sword and you can’t have it back.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: 'You can’t leave here alive with it.' Says one of the fish, as it pulls back its hood.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("When the hood is off you see the fish is completely mutated and has tentacles all over it’s old looking body.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("As he pulls off his hood, the rest of the fish do and they all look similar with mutations.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Hooded figure: Then prove it.");
        //FishCultistFight(character);
    }       
    public static void Chapter5A(String character) {
    	Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 5\nCHTULU\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println("Fish Cultist: You've defeated our final test, for that we reward you with our greatest weapon.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("You receieved the Kraken Sword, it has the ability to defeat injure and kill mythical monsters!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: Small fish, you have proven yourself very strong and the fact that these events are transpiring are proof enough to us to lead you to our great sunken god.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": GOD?!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: Hundreds of thousands of years ago, our God, Chtulu destroyed the last bastion of humans, the city that lays above us, R’lyeh.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: Chtulu let mankind do what it wanted but after it threatened the planet Chtulu struck down the city, the last of mankind, and all of its people.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: Since then he has slumbered, waiting to return to the surface only when needed.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: We have protected not just him, but all others from awakening him, as his awakening means the end of all life for a great time.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: It was prophesied that one being would reclaim the special weapon and reawake Chtulu when the time was necessary, that must be you.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + ": Okay so I just need to wake him up? Dang my phones dead down here so I don’t have an alarm clock, do any of you?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: No sound can wake Chtulu, the only way to do so is to fight his bodyguard, do you want to reawaken Chtulu?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("(A) Fight the bodyguard of Chtulu to try and wake him.");
        System.out.println("(B) Turn away and don't fight.");
        String input = sc.nextLine();
        if(input.equalsIgnoreCase("A")) {
            try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
            System.out.println("Fine, then keep swimming down, a giant shark, bigger than the city itself lies at the bottom of the trench.  If you defeat it, you will have access to Chtulu.");
            //EndFight(character);
        } if(input.equalsIgnoreCase("B")) {
            try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
            System.out.println(character + ": I can't do it, I don't want to destroy all life I just want to live!");
            try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
            System.out.println("Fish Cultist: Well, we can’t let you live with what you know, Chtulu's bodyguard will destroy you either way.");
            //EndFight(character);
        } else {
            System.out.println("Please select A or B, game will not continue until one is picked.");
        }
    }        	  
    public static void Chapter5B(String character) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n____________________\nCHAPTER 5\nCHTULU\n");
        try{TimeUnit.SECONDS.sleep(6);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Would you like to visit the GrubShop?\n(1) Yes\n(2) No");
        int grub = sc.nextInt();
        switch(grub) {
            case 1:
                GrubShop.Menu(character);
                break;
        }
        System.out.println("Fish Cultist: Small fish, you have proven yourself very strong and the fact that these events are transpiring are proof enough to us to lead you to our great sunken god.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + "GOD?!");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: Hundreds of thousands of years ago, our God, Chtulu destroyed the last bastion of humans, the city that lays above us, R’lyeh.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: Chtulu let mankind do what it wanted but after it threatened the planet Chtulu struck down the city, the last of mankind, and all of its people.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: Since then he has slumbered, waiting to return to the surface only when needed.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: We have protected not just him, but all others from awakening him, as his awakening means the end of all life for a great time.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: It was prophesied that one being would reclaim the special weapon and reawake Chtulu when the time was necessary, that must be you.");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println(character + "Okay so I just need to wake him up? Dang my phones dead down here so I don’t have an alarm clock, do any of you?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("Fish Cultist: No sound can wake Chtulu, the only way to do so is to fight his bodyguard, do you want to reawaken Chtulu?");
        try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
        System.out.println("(A) Fight the bodyguard of Chtulu to try and wake him.");
        System.out.println("(B) Turn away and don't fight");
        String input = sc.nextLine();
        switch(input) {
            case "A":
                System.out.println("Fish Cultist: Fine, then keep swimming down, a giant shark, bigger than the city itself lies at the bottom of the trench.  If you defeat it, you will have access to Chtulu.");
                    //EndFight(character);
                break;
            case "B":     	 		
                System.out.println(character + "I can't do it, I don't want to destroy all life I just want to live!");
                try{TimeUnit.SECONDS.sleep(3);}catch(InterruptedException e){e.printStackTrace();}
                System.out.println("Fish Cultist: Well, we can’t let you live with what you know, Chtulu's bodyguard will destroy you either way.");
                //EndFight(character);
                break;
        }
        // else {
        // 	System.out.println("Please select A or B, game will not continue until one is picked.");
        // }
    }
}
