public class Swordfish {
    	static int Attack = 3;
    	static int Sentience = 4;
    	static int Health = 4;
    	static String VictorySpeech = "Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.";
    	static String DefeatSpeech = "Swordfish: Please understand, I hold you in the highest respect.";
    	
    public static void getStats() {
    	System.out.println("The swordfish has " + Attack + "attack.");
    	System.out.println("The swordfish has " + Sentience + "sentience.");
    	System.out.println("The swordfish has " + Health + "health.");
    }
    
    public static void getOffense() {
        System.out.println("(1) Attack: Hash-slinging slash- Deals 3 damage");
        System.out.println("(2)  Spell: Saline Slash- Increases attack by 2");
        System.out.println("(3) Defend: Parry- Increases health by 2");
    }
    
    public static void Attack1() {
    	
    	System.out.println("The swordfish attacks you, dealing " + Attack + " damage.");
    }	
    
    public static void Attack2() {
    	Attack = Attack + Sentience/2;
    	System.out.println("The swordfish rubs salt onto his sword, increasing his attack by 2. Swordfish attack = " + Attack);
    }

    public static void Attack3() {
    	Health = Health + 2;
    	System.out.println("The swordfish gets in a defensive stance, his health in increased by 2");
    }
    public static void VictoryLine() {
		System.out.println(VictorySpeech);
	}
	public static void DefeatLine() {
		System.out.println(DefeatSpeech);
	}
  }
    
