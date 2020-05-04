public class Swordfish implements Character {

    private static int Attack = 3;
    private static int Sentience = 4;
    private static int Health = 4;	
    
    
    public void getStats() {
    	System.out.println("The swordfish has " + Attack + "attack.");
    	System.out.println("The swordfish has " + Sentience + "sentience.");
    	System.out.println("The swordfish has " + Health + "health.");
    }
    
    public void getOffense() {
        //System.out.println("(1) Attack: Hash-slinging slash- Deals 3 damage");
        //System.out.println("(2)  Spell: Saline Slash- Increases attack by 2");
        //System.out.println("(3) Defend: Parry- Increases health by 2");
    }
    
    public void Attack1() {
        System.out.println("Debug mode - Attack 1, enemy basic attack, does 3 damage.");
    	//System.out.println("The swordfish attacks you, dealing " + Attack + " damage.");
    }	
    
    public void Attack2() {
        System.out.println("Debug mode - Attack 2, enemy attack +2.");
    	Attack = Attack + 2 + Sentience/2;
    	//System.out.println("The swordfish rubs salt onto his sword, increasing his attack by 2");
    }

    public void Attack3() {
        System.out.println("Debug mode - Attack 3, enemy health +2.");
    	Health = Health + 2;
    	//System.out.println("The swordfish gets in a defensive stance, his health in increased by 2");
    }

    public void takeDamage(Hero h) {
        Health = Health - h.returnAttack();
    }

    public int returnHealth() {
        return Health;
    }

    public void VictoryLine() {
        System.out.println("victory");
    }

    public void DefeatLine() {
        System.out.println("defeat");
    }
}