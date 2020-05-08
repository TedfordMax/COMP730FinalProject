import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CharacterCreator {
    public static String character;
	public static void CharacterSelection() {
        System.out.println("Please select a character.\n1) Archer Squid (Favoring Attack)\n2) Warrior Crab (Favoring Health)\n3) Assassin Starfish (Favoring Speed)");
        Scanner in = new Scanner(System.in);
        String character = in.nextLine();
        switch (character) {
            case "1":
                character = "Archer Squid";
                System.out.println("You will play as " + character);
                //try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
                Character Squid = new Character();
                Storyboard.Chapter1(character);
                break;
            case "2":
                character = "Warrior Crab";
                System.out.println("You will play as " + character);
                try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
                Character Crab = new Character();
                Storyboard.Chapter1(character);
                break;
            case "3":
                character = "Assassin Starfish";
                try{TimeUnit.SECONDS.sleep(1);}catch (InterruptedException e){e.printStackTrace();}
                System.out.println("You will play as " + character);
                try{TimeUnit.SECONDS.sleep(3);}catch (InterruptedException e){e.printStackTrace();}
                Character Starfish = new Character();
                Storyboard.Chapter1(character);
                break;
        }               
    }
}