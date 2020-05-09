import java.util.Scanner;

public class MainMenu {

    private static String n = "THE Hero";
    private static int h = 3;
    private static int a = 3;
    private static int s = 3; 
    
    public static void main(String[] args) {

        System.out.println("Please select a character.");
        System.out.println("1) Archer Squid (Favoring Attack)");
        System.out.println("2) Warrior Crab (Favoring Health)");
        System.out.println("Assassin Starfish (Favoring Speed)");

        Scanner z = new Scanner(System.in);
        String character = z.nextLine();

        switch (character) {
            case "1":
                n = "Archer Squid";
                h = 2;
                a = 2;
                s = 2;
                break;
            case "2":
                n = "Warrior Crab";
                h = 2;
                a = 2;
                s = 2;
                break;
            case "3":
                n = "Assassin Starfish";
                h = 2;
                a = 2;
                s = 2;
                break;
        }

        Hero theHero = new Hero(n, h, a, s);

        System.out.println("MENU - View Menu");
        System.out.println("QUIT - Quit Game");
        System.out.println("STORY - Continue Story");
        System.out.println("STATS - View Character Stats");

        Scanner in = new Scanner(System.in);
        while (true) {
            String userResponse = in.nextLine();

            if (userResponse.equalsIgnoreCase("QUIT")) {
                System.out.println("Quitting.");
                break;
            }

            else if (userResponse.equalsIgnoreCase("MENU")) {
                PrintMenu();
            }

            else if (userResponse.equalsIgnoreCase("STORY")) {
                Story.StoryManager(theHero);
            }

            else if (userResponse.equalsIgnoreCase("STATS")) {
                ListStats(theHero);
            }

            else { System.out.println("Invalid command."); }
        }        
    }

    public static void ListStats(Hero player) {
        player.getStats();
    }

    public static void PrintMenu() {
        System.out.println("MENU - View Menu");
        System.out.println("QUIT - Quit Game");
        System.out.println("STORY - Continue Story");
        System.out.println("STATS - View Character Stats");
    }
}