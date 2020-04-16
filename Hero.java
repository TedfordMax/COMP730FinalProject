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
}