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

    public static void ReadName() {
        System.out.print(name + ": ");
    }

    public static String returnName() {
        String myname = name;
        return myname;
    }

    public static int returnHealth() {
        int myhealth = health;
        return myhealth;
    }

    public static int returnAttack() {
        int myattack = attack;
        return myattack;
    }

    public static int returnSpeed() {
        int myspeed = speed;
        return myspeed;
    }
}