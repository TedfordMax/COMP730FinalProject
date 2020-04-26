public class Swordfish extends Character {
    	int Attack = 3;
    	int Sentience = 4;
    	int Health = 4;	
    
    
    public void getStats() {
    	System.out.println("The swordfish has " + Attack + "attack.");
    	System.out.println("The swordfish has " + Sentience + "sentience.");
    	System.out.println("The swordfish has " + Health + "health.");
    }
    
    public void getOffense() {
        System.out.println("(1) Attack: Hash-slinging slash- Deals 3 damage");
        System.out.println("(2)  Spell: Saline Slash- Increases attack by 2");
        System.out.println("(3) Defend: Parry- Increases health by 2");
    }
    
    public void Attack1() {
    	System.out.println("The swordfish attacks you, dealing " + Attack + " damage.");
    }	
    
    public void Attack2() {
    	Attack = Attack + 2 + Sentience/2;
    	System.out.println("The swordfish rubs salt onto his sword, increasing his attack by 2");
    }

    public void Attack3() {
    	Health = Health + 2;
    	System.out.println("The swordfish gets in a defensive stance, his health in increased by 2");
    }
}
    