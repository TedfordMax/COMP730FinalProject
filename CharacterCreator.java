import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CharacterCreator {
    public static String character;
	public static void CharacterSelection() {
        System.out.println("Please select a character.\n");
        System.out.println("(1) Archer Squid (Favoring Attack): \n    Health: 2\n    Attack: 3 (+1)\n    Speed: 2" );
        System.out.println("Special Attack 2: Ink Squirt: Increases your attack by your sentience.  Special Attack 3: Tentacle Block: Great increases health  ");
        System.out.println("(2) Warrior Crab (Favoring Health): \n    Health: 3 (+1)\n    Attack: 2\n    Speed: 2");
        System.out.println("Special Attack 2: Crabtivating Punch: Increases attack great after mutliple uses.  Special Attack 3: Krusty Exterior: Great increases health by your sentience. ");
        System.out.println("(3) Assassin Starfish (Favoring Speed): \n    Health: 2\n    Attack: 2\n    Speed: 3 (+1)");

        Scanner in = new Scanner(System.in);
        String character = in.nextLine();

        switch (character) {
            case "1":
                character = "Archer Squid";
                System.out.println("You will play as " + character);
                //try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
                Character Squid = new Character();
                ArcherSquid.setVariables();
                //try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
                System.out.println(character + " abilities: ");
                ArcherSquid.getOffense();
                //try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
                Storyboard.Story(character);
                break;
            case "2":
                character = "Warrior Crab";
                System.out.println("You will play as " + character);
                try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
                Character Crab = new Character();
                WarriorCrab.setVariables();
                try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
                System.out.println(character + " abilities: ");
                WarriorCrab.getOffense();
                try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
                Storyboard.Story(character);
                break;
            case "3":
                character = "Assassin Starfish";
                try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
                System.out.println("You will play as " + character);
                try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
                Character Starfish = new Character();
                AssassinStarfish.setVariables();
                try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
                System.out.println(character + " abilities: ");
                Character.getOffense();
                try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
                Storyboard.Story(character);
                break;
        }               
    }
}
