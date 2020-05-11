
public class Plankton extends Enemy {
		static String Name = "The Final Boss";
    	static int Attack = 10;
    	static int Sentience = 8;
    	static int Health = 30;	
    	static String VictorySpeech = "The Final Boss: Goodbye everyone, I'll remember you all in therapy.";
    	static String DefeatSpeech = "The Final Boss: That's it Mister! You just lost your brain privileges!";
    	
    public static void getStats() {
    	System.out.println("The Final Boss has " + Attack + "attack.");
    	System.out.println("The Final Boss has " + Sentience + "sentience.");
    	System.out.println("The Final Boss has " + Health + "health.");
    }
    
    public static void getOffense() {
        System.out.println("(1) Attack: Deals " + Attack + " damage");
        System.out.println("(2)  Spell: Chummy Delight- Increases Plankton's attack by " + Sentience/2);
        System.out.println("(3) Defend: Reflect- Increases health by " + (Sentience/2));
    }
    
    public static void setStats() {
    	Enemy.Name = Name;
    	Enemy.Attack = Attack;
    	Enemy.Sentience = Sentience;
    	Enemy.Health = Health;
    	Enemy.VictorySpeech = VictorySpeech;
    	Enemy.DefeatSpeech = DefeatSpeech;
    }
    public static void Attack1() {
    	System.out.println("The Final Boss attacks you, dealing " + Attack + " damage.");
    }	
    
    public static void Attack2() {
    	Character.Attack = Character.Attack - Enemy.Sentience;
    	System.out.println("The Final Boss shoots freakin laser beams out of it's eyes, decreasing your attack by " + Enemy.Sentience);
    }

    public static void Attack3() {
    	Health = Health + Sentience/2;
    	System.out.println("The Final Boss adds to his robotic suite, increasing his defense by  " + (Sentience/2));
    }
    public static void VictoryLine() {
		System.out.println(VictorySpeech);
	}
	public static void DefeatLine() {
		if (Character.ArmorName == "Warrior Krab") {
			System.out.println("You'll pay for this, Krabs!");
		}
		else System.out.println(DefeatSpeech);
	}
}

