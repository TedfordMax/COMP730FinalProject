import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CharacterCreator {
    public static String character;
	public static void CharacterSelection() {
        System.out.println("\nWELCOME TO FISH QUEST");
        System.out.println("Please select a character.\n");
        System.out.println("(1) Archer Squid (Favoring Attack): \n    Health: 2\n    Strength: 2 (+1)\n    Sentience: 2\n");
        ArcherSquid.getOffense();
        System.out.println("(2) Warrior Crab (Favoring Health): \n    Health: 3 (+1)\n    Strength: 1\n    Sentience: 2");
        WarriorCrab.getOffense();
        System.out.println("\n(3) Assassin Starfish (Favoring Speed): \n    Health: 2\n    Strength: 1\n    Sentience: 3 (+1)");
        AssassinStarfish.getOffense();

        Scanner in = new Scanner(System.in);
        String character = in.nextLine();

        switch (character) {
            case "1":
                character = "Archer Squid";
                System.out.println("You will play as " + character);
                //try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
                Storyboard.Story(character);
                break;
            case "2":
                character = "Warrior Crab";
                System.out.println("You will play as " + character);
                try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
                Storyboard.Story(character);
                break;
            case "3":
                character = "Assassin Starfish";
                System.out.println("You will play as " + character);
                try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
                Storyboard.Story(character);
                break;
        }               
    }
}