
public class Character {
	
	static public int Attack;
	static public int Sentience;
	static public int Health;
	public static String Attack1;
	public static String Attack2;
	public static String Attack3;
	public static String VictorySpeech;
	public static String DefeatSpeech;
	
	    
    public static void getStats() {
    	System.out.println("Attack = " + Attack);
    	System.out.println("Sentience = " + Sentience);
    	System.out.println("Toughness = " + Health);
    }
    public static void getOffense() {
    	System.out.println("Attack 1 = " + Attack1);
    	System.out.println("Attack 2 = " + Attack2);
    	System.out.println("Attack 3 = " + Attack3);
    }
    public static void Attack1() {
    	System.out.println("You attack for" + Attack + " damage!");
    }
    public static void Attack2() {
    	if (Attack2 == "Ink Squirt") {
    		Attack = Attack + Sentience;
    		System.out.println("You used Ink Squirt, your attack increased to = " + Attack);
    	}
    	if (Attack2 == "Crabtivating Wind-Up") {
    		Attack = Attack*Sentience;
    		System.out.println("You used Crabtivating Wind-Up, your attack increased to = " + Attack);
    }
    	if (Attack2 == "The Real Dirty Dan") {
    		Attack = Attack + 3;
    		System.out.println("You used The Real Dirty Dan, your attack increased to = " + Attack);
    	}
	}
	public static void Attack3() {
		if (Attack3 == "Tentacle Block") {
			Health = Health + Sentience*2;
			System.out.println("You used Tentacle Block, your health increased to = " + Health);
			}
		if (Attack3 == "Toxic Release") {
			Attack = Attack*2;
			System.out.println("You used Toxic Release, your attack increased to = " + Attack);
		}
		if (Attack3 == "Krusty Exterior") {
			Health = Health*Sentience;
			System.out.println("You used Krusty Exterior, your health increased to = " + Health);
		}
	}
	public void VictoryLine() {
		System.out.println(VictorySpeech);
	}
	public void DefeatLine() {
		System.out.println(DefeatSpeech);
	}
	public void takeDamage() {
	}
}
