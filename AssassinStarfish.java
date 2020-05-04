
public class AssassinStarfish extends Character {
	
	static public int Attack = 2; 
	static public int Sentience = 2;
	static public int Health = 3;
	static public String Attack1 = "Ink-tipped Torpedo";
	static public String Attack2 = "The Real Dirty Dan";
	public static String Attack3 = "Toxic Release";
	public static String VictorySpeech = "I win";
	public static String DefeatSpeech = "I lose";
	public static Integer XP = 0;
	public static String WeaponName = "";
	public static Integer WeaponStats = 0;
	public static Integer WeaponSentience = 0;
	public static String ArmorName = "";
	public static Integer ArmorStats = 0;
	public static Integer ArmorSentience = 0;
  
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
		Character.VictorySpeech = "I win";
		Character.DefeatSpeech = "I lose";
		Character.XP = 0;
		Character.WeaponName = "";
		Character.WeaponStats = 0;
		Character.WeaponSentience = 0;
		Character.ArmorName = "";
		Character.ArmorStats = 0;
		Character.ArmorSentience = 0;
	}
}
