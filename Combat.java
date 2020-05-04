import java.util.Scanner;
import java.util.Random;

public class Combat {
	static Scanner in = new Scanner(System.in);
	static Swordfish enemy = new Swordfish();
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
				
			System.out.println("You use" + Character.Attack1 + " dealing " + (Character.Attack + Character.WeaponStats) + " damage.");
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
		}
		if (Character.Health >= enemy.Health) {
			enemy.VictoryLine();
			System.out.println("You've defeated the Swordfish, you gained 5XP!");
			Character.XP = Character.XP + 5;
			Character.levelUp();
			if (Character.XP == 10) {
				System.out.println("You leveled up! Your attack and sentience has been increased by 2 and you gained 5 health!");
			}
			int randomIntW = rand.nextInt(2);
			if (randomIntW == 0) {				
				System.out.println("You found Sword of Barnacles! It gives you 1 attack.");
				System.out.println("You may only have one weapon at a time.  Would you like to keep Sword of Barnacles or keep your current weapon?");
				System.out.println("Press 1 to keep Sword of Barnacles, press 2 to remain with current weapon.");
				String d = in.nextLine();
				if (d.equals("1")) {
				Character.WeaponItem("Sword of Barnacles", 1, 1);	
					}
				}
			if (randomIntW == 1) {
				System.out.println("You have found Shoal Armor! It gives you 2 health.");
				System.out.println("You may only have one armor at a time.  Would you like to keep Shoal Armor or keep your current armor?");
				System.out.println("Press 1 to keep Shoal Armor, press 2 to remain with current armor.");
				String e = in.nextLine();
				if (e.equals("1")) {
				Character.ArmorItem("Shoal Armor", 2, 0);	
					}	
				}
			
				b1 = "False";
				
				Storyboard.Chapter2A(CharacterCreator.character);
				}
			
			}
			b1 = "False";
		}
	  }
  

	
