
public class WarriorCrab extends Character {
	
	static public int Attack = 2;
	static public int Sentience = 3;
	static public int Health = 2;
	static public String Attack1 = "Penny Pinch";
	static public String Attack2 = "Crabtivating Wind-Up";
	static public String Attack3 = "Krusty Exterior";
  
    public static void getStats() {
    	System.out.println("Attack = " + Attack);
    	System.out.println("Sentience = " + Sentience);
    	System.out.println("Health = " + Health);
    }
    public static void getOffense() {
    	System.out.println("Attack 1 = " + Attack1 + " does damage based on attack.");
    	System.out.println("Attack 2 = " + Attack2 + " attack is increased by your attack stat multiplied by your sentience.");
    	System.out.println("Attack 3 = " + Attack3 + " health is increased by your health stat multiplied by your sentience.");
    }
    public static void Attack1() {
    	
    }
    public static void Attack2() {
    	Attack = Attack*Sentience;
	}
	public static void Attack3() {
		Health = Health*Sentience;
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
