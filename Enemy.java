
public class Enemy {
	static String Name = "";
	static int Attack = 0;
	static int Sentience = 0;
	static int Health = 0;
	static String VictorySpeech = "";
	static String DefeatSpeech = "";

	public static void getStats() {
		System.out.println("The " + Name + " has " + Attack + "attack.");
		System.out.println("The " + Name + " has " + Sentience + "sentience.");
		System.out.println("The " + Name + " has " + Health + "health.");
	}
	
	public static void Attack1() {
		
		System.out.println("The " + Name + " attacks you, dealing " + Attack + " damage.");
	}	
	
	public static void Attack2() {
		if (Name == "Swordfish") {
		Attack = Attack + Sentience/2;
		System.out.println("The " + Name + " rubs salt onto his sword, increasing his attack by 2. Swordfish attack = " + Attack);
		}
		if (Name == "Piranhas") {
		Attack = Attack + 3;
		System.out.println("The piranhas smell blood in the water, increasing it's attack by 3");
		}
		if (Name == "Angler Fish") {
		Character.Attack = Character.Attack - 2;
	    System.out.println("The Angler Fish increases the brightness of it's photophore, making it hard to see and decreasing your attack by " + 2);
		}
		if (Name == "Alaskan Bull Worm") {
		Attack = Attack + Sentience/2;
	    System.out.println("The Bull Worm charges towards you, slowly, as it's a worm, but becoming stronger with every slither, increasing it's attack by " + Sentience/2);
		}
	}
	
	public static void Attack3() {
		if (Name == "Swordfish") {
		Health = Health + 2;
		System.out.println("The " + Name + " gets in a defensive stance, his health in increased by 2");
		}
		if (Name == "Piranhas") {
		System.out.println("The piranhas swim menacingly around you, it does nothing");
		}
		if (Name == "Angler Fish") {
		Character.Attack = Character.Attack - 3;
    	System.out.println("The Angler Fish's skin becomes reflective, making it hard to hit, your attack is reduced by " + (Sentience/2));
		}
		if (Name == "Alaskan Bull Worm") {
		Health = Health + Sentience/2;
	    System.out.println("The Bull Worm decides to rest, it's health is increased by " + (Health + Sentience/2));
		}
	}
	public static void VictoryLine() {
		System.out.println(VictorySpeech);
	}
	public static void DefeatLine() {
		System.out.println(DefeatSpeech);
	}
}