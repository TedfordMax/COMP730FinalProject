public class Swordfish extends Character {
    	static int Attack = 3;
    	static int Sentience = 4;
    	static int Health = 4;
    	static String VictorySpeech = "Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.";
    	static String Defeatpeech = "Swordfish: Please understand, I hold you in the highest respect.";
    	
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
    
    public void Attack1() {
    	System.out.println("The swordfish attacks you, dealing " + Attack + " damage.  Your health = " + Health + ".");
    }	
    
    public void Attack2() {
    	Attack = Attack + 2 + Sentience/2;
    	System.out.println("The swordfish rubs salt onto his sword, increasing his attack by 2. Swordfish attack = " + Attack);
    }

    public void Attack3() {
    	Health = Health + 2;
    	System.out.println("The swordfish gets in a defensive stance, his health in increased by 2");
    }
    public String VictoryLine() {
		return VictorySpeech;
	}
	public String DefeatLine() {
		return DefeatSpeech;
	}
	public void takeDamage() {
		Health = Health - Character.Attack;

	}
	public void checkHealth() {
		System.out.println(Health + "Attaced for : " + Character.Attack);
	}
  }
    