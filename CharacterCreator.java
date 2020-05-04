import java.util.Scanner;

public class CharacterCreator {

    public static String n;
    public static int h;
    public static int a;
    public static int s;

    public static void CharacterSelection() {

        /**
        System.out.println("Please select a character.\n");
        System.out.println("(1) Archer Squid: \n    Health: 2\n    Attack: 3 (+1)\n    Speed: 2");
        System.out.println("(2) Warrior Crab: \n    Health: 3 (+1)\n    Attack: 2\n    Speed: 2");
        System.out.println("(3) Assassin Starfish: \n    Health: 2\n    Attack: 2\n    Speed: 3 (+1)");
        */

        System.out.println("Debug mode - Enter '1'.");

        Scanner in = new Scanner(System.in);
        String userResponse = in.nextLine();

        switch (userResponse) {
            case "1":
                //System.out.println("You have selected Archer Squid");
                n = "Archer Squid";
                h = 2;
                a = 3;
                s = 2;
                //Hero Squid = new Hero("Archer Squid", 2, 3, 2);
                break;
            case "2":
                //System.out.println("You have selected Warrior Crab");
                n = "Warrior Crab";
                h = 3;
                a = 2;
                s = 2;
                //Hero Crab = new Hero("Warrior Crab", 3, 2, 2);
                break;
            case "3":
                //System.out.println("You have selected Assassin Starfish");
                n = "Assassin Starfish";
                h = 2;
                a = 2;
                s = 3;
                //Hero Starfish = new Hero("Assassin Starfish", 2, 2, 3);
                break;
        }              

        Hero myHero = new Hero(n, h, a, s);
        System.out.println("Debug mode - Created Hero object. Returning to MainMenu.java.");
    }
} 