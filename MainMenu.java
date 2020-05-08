import java.util.Scanner;

public class MainMenu {

    private String n = "THE Hero";
    private int h = 3;
    private int a = 3;
    private int s = 3;

    /**
    Scanner in = new Scanner(System.in);
    String userResponse = in.nextLine();

    if (userResponse.equalsIgnoreCase("LOAD")) {
        System.out.println("Loading...");
    } */
    
    private static Hero theHero = new Hero("THE Hero", 3, 3, 3);
    public static void main(String[] args) {

        //System.out.println("New Game or Load?");
        System.out.println("Debug mode - Enter 'NEW'.");
        System.out.println("MENU - View Menu");
        System.out.println("QUIT - Quit Game");
        System.out.println("NEW - New Game");
        System.out.println("SAVE - Save Game");
        //System.out.println("LOAD - Load Game");
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

            else if (userResponse.equalsIgnoreCase("NEW")) {
                NewGameStart.IntroText();
            }

            else if (userResponse.equalsIgnoreCase("SAVE")) {
                Story.Save(theHero);
            }

            //else if (userResponse.equalsIgnoreCase("LOAD")) {
              //  LoadGame.Loading(theHero);
            //}                                 Not working.

            else if (userResponse.equalsIgnoreCase("STORY")) {
                Story.StoryManager(theHero);
            }

            else if (userResponse.equalsIgnoreCase("STATS")) {
                ListStats();
            }

            else { System.out.println("Invalid command."); }
        }        
    }

    public static void ListStats() {
        theHero.getStats();
    }

    public static void PrintMenu() {
        System.out.println("MENU - View Menu");
        System.out.println("QUIT - Quit Game");
        System.out.println("NEW - New Game");
        System.out.println("SAVE - Save Game");
        //System.out.println("LOAD - Load Game");
        System.out.println("STORY - Continue Story");
        System.out.println("STATS - View Character Stats");
    }
}