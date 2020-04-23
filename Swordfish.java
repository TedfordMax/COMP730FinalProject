import java.util.Random;
public class Swordfish {
    static int health = 6;

    public static void SwordfishStats() {
        System.out.println("Health: 5HP");
        System.out.println("Attack: 3");
        System.out.println("Speed:  4");
    }

    public static void getOffense() {
        System.out.println("(1) Attack: (+3) Upward Dive charge");
        System.out.println("(2)  Spell: (+2) Saline Slash");
        System.out.println("(3) Defend:  (0) Circle Swim");
    }

    public static int Attacking() {
        Random rnd = new Random();
        int AttackOp = rnd.nextInt(3)+1;
        switch (AttackOp) {
            case 1:
                return -2;
            case 2:
                return -1;
            case 3:
                return 0;
            default:
                int error = 0;
                return error;
        }
    }

    public static String AttackingString() {
        Random rnd = new Random();
        int AttackOp = rnd.nextInt(3)+1;
        //System.out.println(AttackOp);
        switch (AttackOp) {
            case 1:
                String offense1 = "Upward Dive charge";
                return offense1;
            case 2:
                String offense2 = "Sword Magic";
                return offense2;
            case 3:
                String offense3 = "Circle Swim";
                return offense3;
            default:
                String error = "error";
                return error;
        }
    }

    public static int Attack(int change) {
        int attack = 3 + change;
        return attack;
    }

    public static int Spell(int change) {
        int spell = 2 + change;
        return spell;
    }

    public static int Defend(int change) {
        int defend = 1;
        defend =+ change;
        return defend;
    }

    public static int Health(int change) {
        health = health + change;
        return health;
    }
    public static int Speed(int change) {
        int speed = 4 + change;
        return speed;
    }
}