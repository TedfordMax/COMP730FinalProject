import java.util.Scanner;

public abstract class CharacterController {

    public static void main(String[] args) {
        CharacterSelection();
    }

    public static String CharacterSelection() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Please select a character.\n");
            System.out.println("(1) Archer Squid: \n    Health: 2\n    Attack: 3 (+1)\n    Speed: 2");
            System.out.println("(2) Warrior Crab: \n    Health: 3 (+1)\n    Attack: 2\n    Speed: 2");
            System.out.println("(3) Assassin Starfish: \n    Health: 2\n    Attack: 2\n    Speed: 3 (+1)");
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    System.out.println("You have selected Archer Squid");
                    String squid = scanner.nextLine();
                    return squid;
                case 2:
                    System.out.println("You have selected Warrior Crab");
                    String crab = scanner.nextLine();
                    return crab;
                case 3:
                    System.out.println("You have selected Assassin Starfish");
                    String starfish = scanner.nextLine();
                    return starfish;
            }
        } finally {
            if (scanner != null)
                scanner.close();
        }
        return null;
    }
    // public static String startingStats() {
    //     int Health = 2;
    //     int Attack = 2;
    //     int Speed = 2;
    //     System.out.println("Your starting stats are: \n Health: " + Health + "\nAttack: " + Attack + "\nSpeed: " + Speed);
    //     String stats = input.nextLine();
    //     return stats;
    // }
    
    public String Squid() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            System.out.println("Squid Archer");
            String squid = scanner.nextLine();
            return squid;
        } finally {
            if (scanner != null)
                scanner.close();
        }
        
    }
    // public String Crab() {
    //     System.out.println("You selected the Crab class");
    //     String crab = input.nextLine();
    //     return crab;
    // }
    // public String Starfish() {
    //     System.out.println("You selected the Starfish class");
    //     String starfish = input.nextLine();
    //     return starfish;
    // }
}