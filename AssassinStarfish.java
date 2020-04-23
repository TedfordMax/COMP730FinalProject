
public class AssassinStarfish {
    static int health = 2;
    public static void CrabStats() {
        System.out.println("Health: 2HP");
        System.out.println("Attack: 1");
        System.out.println("Speed:  3");
    }
    public static void getOffense() {
        System.out.println("(1) Attack: (-1) Starfish Slam");
        System.out.println("(2)  Spell: (-3) The Dirty Dan");
        System.out.println("(3) Defend: (+2) Camouflage");
    }
    public static int Attack(int change) {
        int attack = 1 + change;
        return attack;
    }
    public static int Spell(int change) {
        int spell = 3 + change;
        return spell;
    }
    public static int Defend(int change) {
        int defend = 2 + change;
        return defend;
    }
    public static int Health(int change) {
        health = health + change;
        return health;
    }
    public static int Speed(int change) {
        int speed = 3 + change;
        return speed;
    }
}