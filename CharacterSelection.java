import java.util.Scanner;

public interface CharacterSelection {
    public static void CharSelection() {
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
                    Chapter1("Archer Squid");
                    break;
                case 2:
                    System.out.println("You have selected Warrior Crab");

                    //Chapter1();
                    break;
                case 3:
                    System.out.println("You have selected Assassin Starfish");
                    //Chapter1();
                    break;
            }
        } finally {
            if (scanner != null)
                scanner.close();
        }
    }    
    public static void Attacks(String name) {
        switch(name) {
            case "Archer Squid":
                System.out.println(name + " abilities include:\n");
                String AS1 = "Ink-Tipped Arrow";
                String AS2 = "Ink-Tipped Torpedo";
                String AS3 = "Ink Trap";
                System.out.println("Ability 1: " + AS1 + "\nAbility 2: " + AS2 + "\nSpell: " + AS3);
            case "Warrior Crab":
                String WC1 = "Claw pinch";
                String WC2 = "Crab Stab";
                String WC3 = "Rangoon Confusion";
                System.out.println("Ability 1: " + WC1 + "\nAbility 2: " + WC2 + "\nSpell: " + WC3);
            case "Assassin Starfish":
                String SF1 = "Sticky Spray";
                String SF2 = "Living Under a Rock";
                String SF3 = "Camoflauge";
                System.out.println("Ability 1: " + SF1 + "\nAbility 2: " + SF2 + "\nSpell: " + SF3);
        }
    }
    
    public static void SquidStats(String name) {
        int health = 2;
        int attack = 3;
        int speed = 2;
        System.out.println(name + " stats:\nHealth: " + health + "\nAttack: " + attack + "\nSpeed: " + speed);
    }

    public static String Crab() {
        String name = "Warrior Crab";
        return name;
    }
    
    public static void CrabAttacks() {
        
    }

    public static void CrabStats() {
        int health = 3;
        int attack = 2;
        int speed = 2;
        System.out.println("Warrior Crab stats:\nHealth: " + health + "\nAttack: " + attack + "\nSpeed: " + speed);
    }

    public static String Starfish() {
        String name = "Starfish";
        return name;
    }
    
    public static void StarfishAttacks() {
        
    }

    public static void StarfishStats() {
        int health = 2;
        int attack = 2;
        int speed = 3;
        System.out.println("Assassin Starfish stats:\nHealth: " + health + "\nAttack: " + attack + "\nSpeed: " + speed);
    }
}