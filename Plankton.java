
public class Plankton extends Character {
    	static int Attack = 4;
    	static int Sentience = 16;
    	static int Health = 16;	
    	Character user = new Character();
    
    public void getStats() {
    	System.out.println("The Plankton has " + Attack + "attack.");
    	System.out.println("The Plankton has " + Sentience + "sentience.");
    	System.out.println("The Plankton has " + Health + "health.");
    }
    
    public void getOffense() {
        System.out.println("(1) Attack: Deals " + Attack + " damage");
        System.out.println("(2)  Spell: Chummy Delight- Increases Plankton's attack by " + Sentience/2);
        System.out.println("(3) Defend: Reflect- Increases health by " + (Sentience/2));
    }
    
    public void Attack1() {
    	System.out.println("The Angler Fish attacks you, dealing " + Attack + " damage.");
    }	
    
    public void Attack2() {
    	Character.Attack = Character.Attack - 4;
    	System.out.println("The Angler Fish increases the brightness of it's photophore, making it hard to see and decreasing your attack by " + 4);
    }

    public void Attack3() {
    	Health = Health + Sentience/2;
    	System.out.println("Plankton adds to his robotic suite, increasing his defense by  " + (Sentience/2));
    }
}

