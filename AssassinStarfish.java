
public class AssassinStarfish extends Character {
	
	static public int Attack = 2;
	static public int Sentience = 3;
	static public int Health = 2;
	static public String Attack1 = "Pinhead Slam";
	static public String Attack2 = "The Real Dirty Dan";
	static public String Attack3 = "Toxic Release";
  
    public static void getStats() {
    	System.out.println("Attack = " + Attack);
    	System.out.println("Sentience = " + Sentience);
    	System.out.println("Health = " + Health);
    }
    public static void getOffense() {
    	System.out.println("Attack 1 = " + Attack1);
    	System.out.println("Attack 2 = " + Attack2);
    	System.out.println("Attack 3 = " + Attack3);
    }
    public static void Attack1() {
    }
    public static void Attack2() {
    	Attack = Attack + 3;
    	
	}
	public static void Attack3() {
		Attack = Attack*2;
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
