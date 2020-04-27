
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
    public void Attack1() {
    }
    public void Attack2() {
	}
	public void Attack3() {
	}
	public String VictoryLine() {
		return VictorySpeech;
	}
	public String DefeatLine() {
		return DefeatSpeech;
	}
}
