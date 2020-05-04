import java.util.Scanner;

public class MainMenu {

    private static Hero theHero = new Hero("THE Hero", 3, 3, 3);
    public static void main(String[] args) {

        //System.out.println("New Game or Load?");
        System.out.println("Debug mode - Enter 'NEW'.");

        Scanner in = new Scanner(System.in);
        while (true) {
            String userResponse = in.nextLine();

            if (userResponse.equalsIgnoreCase("QUIT")) {
                System.out.println("Quitting.");
                break;
            }

            else if (userResponse.equalsIgnoreCase("NEW")) {
                NewGameStart.IntroText();
            }

            else if (userResponse.equalsIgnoreCase("LOAD")) {
                LoadGameStart.LoadGame();
            }

            else if (userResponse.equalsIgnoreCase("MENU")) {
                MenuOptions.ListMenu();
            }

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
}