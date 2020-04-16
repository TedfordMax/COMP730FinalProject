public class Hero {

    private String name = "None";
    private int health = 0;
    private int attack = 0;
    private int speed = 0;

    public Hero(String n, int h, int a, int s) {
        this.name = n;
        this.health = h;
        this.attack = a;
        this.speed = s;

        System.out.println(n);
        System.out.println(name);
    }

    public static void ReadStats() {
        System.out.println("I don't work. Beep boop.");
        //System.out.println(name);
        //System.out.println("Health: " + health);
        //System.out.println("Attack: " + attack);
        //System.out.println("Speed: " + speed);
    }
}
