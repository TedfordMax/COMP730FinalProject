public class Piranhas extends Character {
    	int Attack = 6;
    	int Sentience = 0;
    	int Health = 3;	
    	static String VictorySpeech = "Now it's time to feed!";
    	static String DefeatSpeech = "Piranas: I knew we shouldn't have swam this far from home!.";
    
    public void getStats() {
    	System.out.println("The swordfish has " + Attack + "attack.");
    	System.out.println("The swordfish has " + Sentience + "sentience.");
    	System.out.println("The swordfish has " + Health + "health.");
    }
    
    public void getOffense() {
        System.out.println("(1) Attack: Deals 6 damage");
        System.out.println("(2)  Spell: Blood Frenzy- Increases attack by 3");
        System.out.println("(3) Defend: Intimidate- Increases health by 0");
    }
    
    public void Attack1() {
    	System.out.println("The piranhas attacks you, dealing " + Attack + " damage.");
    }	
    
    public void Attack2() {
    	Attack = Attack + 3;
    	System.out.println("The piranhas smell blood in the water, increasing it's attck by 3");
    }

    public void Attack3() {
    	System.out.println("The piranhas swim menacingly around you, it does nothing");
    }
    public String VictoryLine() {
    	return VictorySpeech;
    }
    public String DefeatLine() {
    	return DefeatSpeech;
    }
    
}
