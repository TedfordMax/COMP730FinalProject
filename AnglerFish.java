
public class AnglerFish extends Character {
    	static int Attack = 4;
    	static int Sentience = 6;
    	static int Health = 8;	
    	Character user = new Character();
    
    public void getStats() {
    	System.out.println("The Angler Fish has " + Attack + "attack.");
    	System.out.println("The Angler Fish has " + Sentience + "sentience.");
    	System.out.println("The Angler Fish has " + Health + "health.");
    }
    
    public void getOffense() {
        System.out.println("(1) Attack: Deals " + Attack + " damage");
        System.out.println("(2)  Spell: Blinding Light- Decreases your attack by 2");
        System.out.println("(3) Defend: Reflect- Increases health by " + (Sentience/2));
    }
    
    public void Attack1() {
    	System.out.println("The Angler Fish attacks you, dealing " + Attack + " damage.");
    }	
    
    public void Attack2() {
    	Character.Attack = Character.Attack - 2;
    	System.out.println("The Angler Fish increases the brightness of it's photophore, making it hard to see and decreasing your attack by " + 2);
    }

    public void Attack3() {
    	Character.Attack = Character.Attack - 3;
    	System.out.println("The Angler Fish's skin becomes reflective, making it hard to hit, your attack is reduced by " + (Sentience/2));
    }
}

