import java.util.Scanner;
import java.util.Random;

public class PiranhaFight {
	static Scanner in = new Scanner(System.in);
	static Piranhas enemy = new Piranhas();
	static Random rand = new Random();
	static String b1 = "True";
	
	

	@SuppressWarnings("static-access")
	public static void UserCombat() {
		Character.getItemStats();
		while (b1 == "True") {
		System.out.println("Type in the first of the three combat abilities you want to use this combat phase. Use 1, 2, or 3.");
		String a = in.nextLine();
		if (a.equals("1")) {
			
		System.out.println("You use " + Character.Attack1 + " dealing " + Character.Attack + " damage.");
		enemy.Health = Character.Attack - enemy.Health;
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
				
			System.out.println("You use" + Character.Attack1 + " dealing " + (Character.Attack + Character.WeaponStats) + " damage.");
			enemy.Health = Character.Attack - enemy.Health;	
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
			enemy.Health = Character.Attack - enemy.Health;
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
			enemy.VictoryLine();
			System.out.println("You've been defeated, please start again or load from last save.");
		}
		if (Character.Health >= enemy.Health) {
			enemy.DefeatLine();
			System.out.println("You've defeated the Piranhas!");
			int randomIntW = rand.nextInt(2);
			if (randomIntW == 0) {				
				System.out.println("You found Razor Saw! It gives you 3 attack.");
				System.out.println("You may only have one weapon at a time.  Would you like to keep Razor Saw or keep your current weapon?");
				System.out.println("Press 1 to keep Razor Saw, press 2 to remain with current weapon.");
				String d = in.nextLine();
				if (d.equals("1")) {
				Character.WeaponItem("Razor Saw", 3, 0);	
					}
				}
			if (randomIntW == 1) {
				System.out.println("You have found Bone Armor! It gives you 5 health.");
				System.out.println("You may only have one armor at a time.  Would you like to keep Bone Armor or keep your current armor?");
				System.out.println("Press 1 to keep Bone Armor, press 2 to remain with current armor.");
				String e = in.nextLine();
				if (e.equals("1")) {
				Character.ArmorItem("Bone Armor", 5, 0);	
					}	
				}
			
				b1 = "False";
				//Storyboard.Chapter2(b);
				}
			
			}
			b1 = "False";
		}
	  }
  

	
