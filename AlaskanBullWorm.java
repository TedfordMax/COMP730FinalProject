
public class AlaskanBullWorm extends Enemy {
		static String Name = "Alaskan Bull Worm";
    	static int Attack = 8;
    	static int Sentience = 2;
    	static int Health = 12;	
    	static String VictorySpeech = "Alaskan Bull Worm: *Sad Alaskan Bull Worm noises*";
    	static String DefeatSpeech = "Alaskan Bull Worm: Angry Alaskan Bull Worm noises*";
    
    public static void getStats() {
    	System.out.println("The Alaskan Bull Worm has " + Attack + "attack.");
    	System.out.println("The Alaskan Bull Worm has " + Sentience + "sentience.");
    	System.out.println("The Alaskan Bull Worm has " + Health + "health.");
    }
    
    public void getOffense() {
        System.out.println("(1) Attack: Deals " + Attack + " damage");
        System.out.println("(2)  Spell: Unstoppable Charge- Increases attack by 2");
        System.out.println("(3) Defend: Hibernate- Increases health by " + (Sentience/2));
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
    	System.out.println("The Alaskan Bull Worm attacks you, dealing " + Attack + " damage.");
    }	
    
    public static void Attack2() {
    	Attack = Attack + Sentience/2;
    	System.out.println("The Bull Worm charges towards you, slowly, as it's a worm, but becoming stronger with every slither, increasing it's attack by " + Sentience/2);
    }

    public static void Attack3() {
    	Health = Health + Sentience/2;
    	System.out.println("The Bull Worm decides to rest, it's health is increased by " + (Health + Sentience/2));
    }
}

