import java.util.Scanner;

public class UserInterface {
    public static void main(String[] args) {
        System.out.println("New Game or Load?");

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

            else if (userResponse.equalsIgnoreCase("SAVE")) {
                SaveGame.Saving();
            }

            else if (userResponse.equalsIgnoreCase("LOAD")) {
                LoadGameStart.LoadGame();
            }

            else if (userResponse.equalsIgnoreCase("MENU")) {
                MenuOptions.ListMenu();
            }

            else if (userResponse.equalsIgnoreCase("STORY")) {
                Storyboard.Story();
            }

            else { System.out.println("Invalid command."); }
        }        
    }
}