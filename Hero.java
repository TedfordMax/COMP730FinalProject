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

    public void getStats() {
        System.out.println(name);
        System.out.println("Health: " + health);
        System.out.println("Attack: " + attack);
        System.out.println("Speed: " + speed);
    }

    public static String returnName() {
        return name;
    }

    public static int returnHealth() {
        return health;
    }

    public static int returnAttack() {
        return attack;
    }

    public static int returnSpeed() {
        return speed;
    }

    public static void setName(String n) {
        name = n;
    }

    public static void setHealth(int h) {
        health = h;
    }

    public static void setAttack(int a) {
        attack = a;
    }

    public static void setSpeed(int s) {
        speed = s;
    }

    public void Attack1() {
        System.out.println("Debug mode - Attack 1, user attack, does (attack) damage.");
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