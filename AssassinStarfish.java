
public class AssassinStarfish {
    public int health = 4;
    public int strength = 2;
    public int sentience = 3;
    public int attack = 1;
    public int spell = 3;
    public int xp = 0;
    public void getStats() {
        System.out.println("Health:    4\n");
        System.out.println("Strength:  2\n");
        System.out.println("Sentience: 3");
    }
    public void getOffense() {
        System.out.println("(1) Attack: (-1) Starfish Slam");
        System.out.println("(2)  Spell: (-3) The Dirty Dan");
        System.out.println("(3) Defend:  (0) Camouflage");
    }
    public int Attacking(int option) {
        switch (option) {
            case 1:
                return -1;
            case 2:
                return -3;
            case 3:
                return 0;
            default:
                int error = 0;
                return error;
        }
    }
    public String AttackingString(int option) {
        switch (option) {
            case 1:
                String attack = "Crab Stab";
                return attack;
            case 2:
                String spell = "Rangoon Confusion";
                return spell;
            case 3:
                String defend = "Shell";
                return defend;
            default:
                String error = "error";
                return error;
        }
    }
    public int Health(int change) {
        health += change;
        return health;
    }
    public int Strength(int change) {
        strength += change;
        return strength;
    }
    public int Attack(int change) {
        attack += change;
        return attack;
    }
    public int Spell(int change) {
        spell += change;
        return spell;
    }
    public int Sentience(int change) {
        sentience += change;
        return sentience;
    }
}