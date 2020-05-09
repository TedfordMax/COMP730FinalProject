public class Enemy {

    private static String name = "None";
    private static int health = 0;
    private static int attack = 0;
    private static int speed = 0;

    public Enemy(String n, int h, int a, int s) {
        name = n;
        health = h;
        attack = a;
        speed = s;
    }

    public String returnName() {
        return name;
    }

    public int returnHealth() {
        return health;
    }

    public int returnAttack() {
        return attack;
    }

    public int returnSpeed() {
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

    public void takeDamage(Hero player) {
        health = health - player.returnAttack();
    }

    public void Attack1() {            // use switch cases with 'name' variable as the case to determine attacks based on enemy
        System.out.println("Debug mode - Attack 1, enemy attack, does (attack) damage.");
    }	
    
    public void Attack2() {
        System.out.println("Debug mode - Attack 2, enemy attack +2.");
    	attack = attack + 2;
    }

    public void Attack3() {
        System.out.println("Debug mode - Attack 3, enemy health +2.");
    	health = health + 2;
    }

    public void VictoryLine() {
        System.out.println("Debug mode - User win.");
    }
    public void DefeatLine() {      // ditto about switch cases, lots of code but more efficient in long run
        System.out.println("Debug mode - User lose.");
    }
}