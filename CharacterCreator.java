import java.util.Scanner;

public class CharacterCreator {

    public static void CharacterSelection() {

        System.out.println("Please select a character.\n");
        System.out.println("(1) Archer Squid: \n    Health: 2\n    Attack: 3 (+1)\n    Speed: 2");
        System.out.println("(2) Warrior Crab: \n    Health: 3 (+1)\n    Attack: 2\n    Speed: 2");
        System.out.println("(3) Assassin Starfish: \n    Health: 2\n    Attack: 2\n    Speed: 3 (+1)");

        Scanner in = new Scanner(System.in);
        String character = in.nextLine();

        switch (character) {
            case "1":
                character = "Archer Squid";
                System.out.println("You have selected " + character);
                Hero Squid = new Hero(character, 2, 3, 2);
                System.out.println(Squid);
                Hero.getAbilities(character);
                break;
            case "2":
                character = "Warrior Crab";
                System.out.println("You have selected " + character);
                Hero Crab = new Hero(character, 3, 2, 2);
                System.out.println(Crab);
                Hero.getAbilities(character);
                break;
            case "3":
                character = "Assassin Starfish";
                System.out.println("You have selected " + character);
                Hero Starfish = new Hero(character, 2, 2, 3);
                System.out.println(Starfish);
                Hero.getAbilities(character);
                break;
        }               
    }
}