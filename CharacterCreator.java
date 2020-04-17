import java.util.Scanner;

public class CharacterCreator {

    public static void CharacterSelection() {

        System.out.println("Please select a character.\n");
        System.out.println("(1) Archer Squid: \n    Health: 2\n    Attack: 3 (+1)\n    Speed: 2");
        System.out.println("(2) Warrior Crab: \n    Health: 3 (+1)\n    Attack: 2\n    Speed: 2");
        System.out.println("(3) Assassin Starfish: \n    Health: 2\n    Attack: 2\n    Speed: 3 (+1)");

        Scanner in = new Scanner(System.in);
        String userResponse = in.nextLine();

        switch (userResponse) {
            case "1":
                System.out.println("You have selected Archer Squid");
                Hero Squid = new Hero("Archer Squid", 2, 3, 2);
                Chapter1("Archer Squid");
                break;
            case "2":
                System.out.println("You have selected Warrior Crab");
                Hero Crab = new Hero("Warrior Crab", 3, 2, 2);
                break;
            case "3":
                System.out.println("You have selected Assassin Starfish");
                Hero Starfish = new Hero("Assassin Starfish", 2, 2, 3);
                break;
        }               
    }
}