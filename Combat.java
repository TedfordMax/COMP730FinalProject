import java.util.Scanner;
import java.util.Random;

public class Combat {
	static Scanner in = new Scanner(System.in);
	static Character user = new Character();
	static Swordfish enemy = new Swordfish();
	static Random rand = new Random();
	static String b1 = "True";
	
	

	@SuppressWarnings("static-access")
	public static void UserCombat() {
		while (b1 == "True") {
		System.out.println("Type in the first of the three combat abilities you want to use this combat phase. Use 1, 2, or 3.");
		String a = in.nextLine();
		if (a.equals("1")) {
			
		System.out.println("You use" + Character.Attack1 + " dealing " + Character.Attack + " damage.");
		enemy.Health = enemy.Health - Character.Attack;
		}
		
		if (a.equals("2")) {
			
		Character.Attack2();
		}
		if (a.equals("3"))  {
			
			Character.Attack3();
		}
		int randomInt = rand.nextInt(3);
		if (randomInt == 0) {
			enemy.Attack1();
			Character.Health = Character.Health - enemy.Attack;
		}
		else if (randomInt == 1) {
			enemy.Attack2();
		}
		else if (randomInt == 2) {
			enemy.Attack3();
		}
		System.out.println("Your health = " + Character.Health);
		System.out.println("enemy health = " + enemy.Health);
		
		System.out.println("Type in the second of the three combat abilities you want to use this combat phase.");
		String b = in.nextLine();
		if (b.equals("1")) {
				
			System.out.println("You use" + Character.Attack1 + " dealing " + Character.Attack + " damage.");
			enemy.Health = enemy.Health - Character.Attack;	
		}
		if (b.equals("2")) {
			
			Character.Attack2();
		}	
		if (b.equals("3")) {
			
			Character.Attack3();
		}	
		int randomInt2 = rand.nextInt(3);
		if (randomInt2 == 0) {
			enemy.Attack1();
			Character.Health = Character.Health - enemy.Attack;
		}
		else if (randomInt2 == 1) {
			enemy.Attack2();
		}
		else if (randomInt2 == 2) {
			enemy.Attack3();
		}
		System.out.println("Your health = " + Character.Health);
		System.out.println("enemy health = " + enemy.Health);
		
		System.out.println("Type in the third of the three combat abilities you want to use this combat phase.");
		String c = in.nextLine();
		if (c.equals("1"))  {
			System.out.println("You use" + Character.Attack1 + " dealing " + Character.Attack + " damage.");
		enemy.Health = enemy.Health - Character.Attack;
		}
		
		if (c.equals("2")) {
			Character.Attack2();
		}
		if (c.equals("3")) {
			Character.Attack3();
		}
		int randomInt3 = rand.nextInt(3);
		if (randomInt3 == 0) {
			enemy.Attack1();
			Character.Health = Character.Health - enemy.Attack;
		}
		else if (randomInt3 == 1) {
			enemy.Attack2();
		}
		else if (randomInt3 == 2) {
			enemy.Attack3();
		}
		System.out.println("Combat round over.");
		System.out.println("Your health = " + Character.Health);
		System.out.println("enemy health = " + enemy.Health);
		if (Character.Health < enemy.Health) {
			enemy.DefeatLine();
			System.out.println("You've been defeated, please start again or load from last save.");
			b1 = "False";
			//Storyboard.Chapter2(b);
		}
		if (Character.Health >= enemy.Health) {
			enemy.VictoryLine();
			System.out.println("You've defeated the Swordfish!");
			b1 = "False";
		}
	  }
	}
  }

	
