public class Hero implements Character {

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

    public void getStats() {
        System.out.println(name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Speed: " + speed);
    }

    public int returnHealth() {
        return health;
    }

    public int returnAttack() {
        return attack;
    }

    public void Attack1() {
        System.out.println("Debug mode - Attack 1, enemy user attack, does 3 damage.");
    }	
    
    public void Attack2() {
        System.out.println("Debug mode - Attack 2, user attack +2.");
    	attack = attack + 2;
    }

    public void Attack3() {
        System.out.println("Debug mode - Attack 3, user health +2.");
    	health = health + 2;
    }

    public void VictoryLine() {
        System.out.println("Debug mode - User win.");
    }
    public void DefeatLine() {
        System.out.println("Debug mode - User lose.");
    }
}