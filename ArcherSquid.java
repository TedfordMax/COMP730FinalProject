
public class ArcherSquid {
    static int health = 2;
    public static String SquidStats() {
        String Stats = "Health: 2\nAttack: 3\nSpeed:  1";
        return Stats;
    }
    public static void getOffense() {
        System.out.println("(1) Attack: (-2) Ink-Tipped Torpedo");
        System.out.println("(2)  Spell: (-3) Ink Cloud");
        System.out.println("(3) Defend: (+1) Tentacle Block");
    }
    public static int Attacking(int option) {
        switch (option) {
            case 1:
                return -2;
            case 2:
                return -3;
            case 3:
                return 1;
        }
        int error = 0;
        return error;
    }
    public static String AttackingString(int option) {
        switch (option) {
            case 1:
                String offense1 = "Ink-Tipped Torpedo";
                return offense1;
            case 2:
                String offense2 = "Ink Cloud";
                return offense2;
            case 3:
                String offense3 = "Tentacle Block";
                return offense3;
        }
        String error = "error";
        return error;
    }

    public static int Attack(int change) {
        int attack = 2;
        attack =+ change;
        return attack;
    }
    public static int Spell(int change) {
        int spell = 3;
        spell =+ change;
        return spell;
    }
    public static int Defend(int change) {
        int defend = -1;
        defend =+ change;
        return defend;
    }
    public static int Health(int change) {
        health = health + change;
        return health;
    }
    public static int Speed(int change) {
        int speed = 1;
        speed =+ change;
        return speed;
    }
}