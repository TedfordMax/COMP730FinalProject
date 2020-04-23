
public class WarriorCrab {
    static int health = 3;
    public static void CrabStats() {
        System.out.println("Health: 3HP");
        System.out.println("Attack: 2");
        System.out.println("Speed:  1");
    }
    public static void getOffense() {
        System.out.println("(1) Attack: (-2) Crab Stab");
        System.out.println("(2)  Spell: (-1) Rangoon Confusion");
        System.out.println("(3) Defend: (+3) Shell");
    }
    public int Attack(int change) {
        int attack = 2 + change;
        return attack;
    }
    public int Spell(int change) {
        int spell = 3 + change;
        return spell;
    }
    public int Defend(int change) {
        int defend = 1 + change;
        return defend;
    }
    public int Health(int change) {
        health = health + change;
        return health;
    }
    public int Speed(int change) {
        int speed = 2 + change;
        return speed;
    }
}