import java.util.Scanner;

public class MenuOptions {

    public static void ListMenu() {
        System.out.println("Menu Options:");
        System.out.println("View Stats (STATS)");

        Scanner in = new Scanner(System.in);
        while (true) {
            String userResponse = in.nextLine();

            if (userResponse.equalsIgnoreCase("QUIT")) {
                System.out.println("Quitting.");
                break;
            }

            else if (userResponse.equalsIgnoreCase("STATS")) {
                ListStats();
            }

            else { System.out.println("Invalid command."); }
        }
    }

    public static void ListStats() {
        Hero.ReadStats();
    }
}