public class Hero {
    private static String name = "None";
    private static int health = 0;
    private static int attack = 0;
    private static int speed = 0;

    public Hero(String n, int h, int a, int s) {
        name = n;
        health = h;
        attack = a;
        speed = s;
    }

    public static void ReadStats() {
        System.out.println(name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Speed: " + speed);
    }

    public static void getAbilities(String name) {
        switch(name) {
            case "Archer Squid":
                System.out.println("Squid Attack 1: Ink Darts");
                System.out.println("Squid Attack 2: Ink-Tipped Torpedo");
                System.out.println("Squid Spell: Ink Cloud");
            case "Warrior Crab":
                System.out.println("Crab Attack 1: Double Claw Pinch");
                System.out.println("Crab Attack 2: Crab Stab");
                System.out.println("Crab Spell: Rangoon Confusion");
            case "Assassin Starfish":
                System.out.println("Starfish Attack 1: Sticky Spray");
                System.out.println("Starfish Attack 2: Starfish Slam");
                System.out.println("Starfish Spell: Camoflage");

        }
    }
}