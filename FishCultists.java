public class FishCultists extends Enemy {
	static String Name = "Fish Cultists";
    	static int Attack = 3;
    	static int Sentience = 6;
    	static int Health = 8;
    	static String VictorySpeech = "Fish Cultists: You have proven yourself worthy";
    	static String DefeatSpeech = "Fish Cultists: Another soul to add";
    
    
    public static void getStats() {
    	System.out.println("The Fish Cultists has " + Attack + "attack.");
    	System.out.println("The Fish Cultists has " + Sentience + "sentience.");
    	System.out.println("The Fish Cultists has " + Health + "health.");
    }
    public static void setStats() {
    	Enemy.Name = Name;
    	Enemy.Attack = Attack;
    	Enemy.Sentience = Sentience;
    	Enemy.Health = Health;
    	Enemy.VictorySpeech = VictorySpeech;
    	Enemy.DefeatSpeech = DefeatSpeech;
    }
    
    public static void getOffense() {
        System.out.println("(1) Attack: Deals " + Attack + " damage");
        System.out.println("(2)  Spell: Aquatic Prayer- Increases attack by 5");
        System.out.println("(3) Defend: Recruitment- Increases health by " + (Sentience/2));
    }
    
    public static void Attack1() {
    	System.out.println("The cultists attacks you, dealing " + Attack + " damage.");
    }	
    
    public static void Attack2() {
    	Attack = Attack + 5;
    	System.out.println("The cultists began chanting, bubbles shoot up around them and their attack is increased by " + 5);
    }

    public static void Attack3() {
    	Sentience = Sentience + 1;
    	Health = Health + Sentience/2;
    	System.out.println("The cultists begin shouting for aid, as more cultists heed their call, their sentience is increased by 1 and their health is increased by " + (Health + Sentience/2));
    	}
    public static void VictoryLine() {
		System.out.println(VictorySpeech);
	}
    public static void DefeatLine() {
		System.out.println(DefeatSpeech);
	}
}
