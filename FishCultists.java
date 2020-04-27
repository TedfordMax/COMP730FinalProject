public class FishCultists extends Character {
    	static int Attack = 3;
    	static int Sentience = 6;
    	static int Health = 8;	
    
    
    public static void getStats() {
    	System.out.println("The Fish Cultists has " + Attack + "attack.");
    	System.out.println("The Fish Cultists has " + Sentience + "sentience.");
    	System.out.println("The Fish Cultists has " + Health + "health.");
    }
    
    public static void getOffense() {
        System.out.println("(1) Attack: Deals " + Attack + " damage");
        System.out.println("(2)  Spell: Aquatic Prayer- Increases attack by 5");
        System.out.println("(3) Defend: Recruitment- Increases health by " + (Sentience/2));
    }
    
    public void Attack1() {
    	System.out.println("The cultists attacks you, dealing " + Attack + " damage.");
    }	
    
    public void Attack2() {
    	Attack = Attack + 5;
    	System.out.println("The cultists began chanting, bubbles shoot up around them and their attack is increased by " + 5);
    }

    public void Attack3() {
    	Sentience = Sentience + 1;
    	Health = Health + Sentience/2;
    	System.out.println("The cultists begin shouting for aid, as more cultists heed their call, their sentience is increased by 1 and their health is increased by " + (Health + Sentience/2));
    	
    }
}