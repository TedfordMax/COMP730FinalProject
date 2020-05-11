import java.util.Scanner;
import java.util.Random;

public class Combat  {
	static Scanner in = new Scanner(System.in);
	static Random rand = new Random();
	
	

	@SuppressWarnings("static-access")
	public static void UserCombat() {
		String character = Storyboard.character;
		Character.getItemStats();
		System.out.println("Type in the first of the three combat abilities you want to use this combat phase. Use 1, 2, or 3.");
		String a = in.nextLine();
		if (a.equals("1")) {System.out.println("You use " + Character.Attack1 + " dealing " + Character.Attack + " damage.");
		Enemy.Health = Enemy.Health - Character.Attack;	}		
		if (a.equals("2")) {Character.Attack2();}
		if (a.equals("3"))  {Character.Attack3();}
		int randomInt = rand.nextInt(3);
		if (randomInt == 0) {Enemy.Attack1();
			Character.Health = Character.Health - Enemy.Attack;}
		else if (randomInt == 1) {Enemy.Attack2();}
		else if (randomInt == 2) {Enemy.Attack3();}
		System.out.println("Your health = " + Character.Health);
		System.out.println("Enemy health = " + Enemy.Health);
		
		System.out.println("Type in the second of the three combat abilities you want to use this combat phase.");
		String b = in.nextLine();
		if (b.equals("1")) {System.out.println("You use" + Character.Attack1 + " dealing " + (Character.Attack + Character.WeaponStats) + " damage.");
			Enemy.Health = Enemy.Health - Character.Attack;}
		if (b.equals("2")) {Character.Attack2();}	
		if (b.equals("3")) {Character.Attack3();}	
		int randomInt2 = rand.nextInt(3);
		if (randomInt2 == 0) {Enemy.Attack1();
			Character.Health = Character.Health - Enemy.Attack;}
		else if (randomInt2 == 1) {Enemy.Attack2();}
		else if (randomInt2 == 2) {Enemy.Attack3();}
		System.out.println("Your health = " + Character.Health);
		System.out.println("Enemy health = " + Enemy.Health);

		System.out.println("Type in the third of the three combat abilities you want to use this combat phase.");
		String c = in.nextLine();
		if (c.equals("1"))  {System.out.println("You use" + Character.Attack1 + " dealing " + Character.Attack + " damage.");
			Enemy.Health = Enemy.Health - Character.Attack;}
		if (c.equals("2")) {Character.Attack2();}
		if (c.equals("3")) {Character.Attack3();}
		int randomInt3 = rand.nextInt(3);
		if (randomInt3 == 0) {Enemy.Attack1();
			Character.Health = Character.Health - Enemy.Attack;}
		else if (randomInt3 == 1) {Enemy.Attack2();}
		else if (randomInt3 == 2) {Enemy.Attack3();}
		System.out.println("Combat round over.");
		System.out.println("Your health = " + Character.Health);
		System.out.println("Enemy health = " + Enemy.Health);
		if (Character.Health < Enemy.Health) {Enemy.DefeatLine();
			System.out.println("You've been defeated, please start again or load from last save.");}
		if (Character.Health >= Enemy.Health) {
			Enemy.VictoryLine();
			System.out.println("You've defeated the " + Enemy.Name + ", you gained 5XP!");
			Character.XP = Character.XP + 5;
			Character.levelUp();
			if (Character.XP == 10) {
				System.out.println("You leveled up! Your attack and sentience has been increased by 2 and you gained 5 health!");
			}
			ItemDrops.getItems();
			  }	
		}		
	}
  

	
