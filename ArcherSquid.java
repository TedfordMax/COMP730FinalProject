
public class ArcherSquid extends Character {
	static public int Attack = 3;
	static public int Sentience = 2;
	static public int Health = 3;
	static public String Attack1 = "Ink-tipped Torpedo";
	public static String Attack2 = "Ink Squirt";
	static public String Attack3 = "Tentacle Block";
  
    public static void getStats() {
    	System.out.println("Attack = " + Attack);
    	System.out.println("Sentience = " + Sentience);
    	System.out.println("Health = " + Health);
    }
    public static void getOffense() {
    	System.out.println("Attack 1 = " + Attack1 + " does damage based on attack.");
    	System.out.println("Attack 2 = " + Attack2 + " increases health by current attack plus sentience");
    	System.out.println("Attack 3 = " + Attack3 + " increases health by current health by sentience x 2");
    }
    public static void Attack1() {
    	
    }
    public static void Attack2() {
    	Attack = Attack + Sentience;
	}
	public static void Attack3() {
		Health = Health + Sentience*2;
	}
	public void takeDamage() {
	}
	public static void setVariables() {
		Character.Attack = Attack;
		Character.Sentience = Sentience;
		Character.Health = Health;
		Character.Attack1 = Attack1;
		Character.Attack2 = Attack2;
		Character.Attack3 = Attack3;
		
	}
}
