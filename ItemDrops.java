import java.util.Random;
import java.util.Scanner;

public class ItemDrops {
	
	static Random rand = new Random();
	static Scanner in = new Scanner(System.in);
	
	public static void getItems() {
	if (Enemy.Name == "Swordfish") {
		int randomIntW = rand.nextInt(2);	
		if (randomIntW == 0) {				
			System.out.println("You found Sword of Barnacles! It gives you 1 attack.");
			System.out.println("You may only have one weapon at a time.  Would you like to keep Sword of Barnacles or keep your current weapon?");
			System.out.println("Press 1 to keep Sword of Barnacles, press 2 to remain with current weapon.");
			String d = in.nextLine();
			if (d.equals("1")) {
			Character.WeaponItem("Sword of Barnacles", "Single", 1, 1);	
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
		Character.getGold(200);
		System.out.println("You found 200 gold on the " + Enemy.Name + " you'll be taking that for yourself! You now have " + Character.Gold + " gold.");		
	}
	if (Enemy.Name == "Piranhas") {
		int randomIntX = rand.nextInt(2);
		if (randomIntX == 0) {
		System.out.println("You found Fishing Rod! It gives you 3 attack and 2 sentience, it requires two hands.");
		System.out.println("You may only have one weapon at a time.  Would you like to keep Fishing Rod or keep your current weapon?");
		System.out.println("Press 1 to keep Fishing Rod, press 2 to remain with current weapon.");
		String d = in.nextLine();
		if (d.equals("1")) {
		Character.WeaponItem("Fishing Rod", "Two Handed", 3, 2);	
	}
		}
	if (randomIntX == 1) {
		System.out.println("You have found Lobster Trap! Armor that gives you 8 health but lowers sentience by 2.");
		System.out.println("You may only have one armor at a time.  Would you like to keep Lobster Trap or keep your current armor?");
		System.out.println("Press 1 to keep Lobster Trap, press 2 to remain with current armor.");
		String e = in.nextLine();
		if (e.equals("1")) {
		Character.ArmorItem("Shoal Armor", 7, -2);	
	}
  }
}
	if (Enemy.Name == "Fish Cultists") {
		int randomIntW = rand.nextInt(2);	
		if (randomIntW == 0) {				
			System.out.println("You found the Tusk of the Greater Narwhal! It gives you 12 attack and takes both hands to use.");
			System.out.println("You may only have one two handed weapon at a time.  Would you like to keep Tusk of the Greater Narwhal or keep your current weapon?");
			System.out.println("Press 1 to keep Tusk of the Greater Narwhal, press 2 to remain with current weapon.");
			String d = in.nextLine();
			if (d.equals("1")) {
			Character.WeaponItem("Tusk of the Greater Narwhal", "Two Handed", 12, 0);	
		}
			}
		if (randomIntW == 1) {
			System.out.println("You have found Cultist Hood! It gives you 3 health and 5 sentience.");
			System.out.println("You may only have one armor at a time.  Would you like to keep Cultist Hood or keep your current armor?");
			System.out.println("Press 1 to keep Cultist Hood, press 2 to remain with current armor.");
			String e = in.nextLine();
			if (e.equals("1")) {
			Character.ArmorItem("Cultist Hood", 3, 5);	
			}
		}
	}
	if (Enemy.Name == "Angler Fish") {
		int randomIntW = rand.nextInt(2);	
		if (randomIntW == 0) {				
			System.out.println("You found the Tusk of the Mace of Windy Dew! It gives you 10 attack, 6 sentience, and takes both hands to use.");
			System.out.println("You may only have one two handed weapon at a time.  Would you like to keep Mace of Windy Dew or keep your current weapon?");
			System.out.println("Press 1 to keep Mace of Windy Dew, press 2 to remain with current weapon.");
			String d = in.nextLine();
			if (d.equals("1")) {
			Character.WeaponItem("Mace of Windy Dew", "Two Handed", 10, 6);	
		}
			}
		if (randomIntW == 1) {
			System.out.println("You have found The Ocean's Lantern! Armor that gives you 8 health and 6 sentience.");
			System.out.println("You may only have one armor at a time.  Would you like to keep The Ocean's Lantern or keep your current armor?");
			System.out.println("Press 1 to keep The Ocean's Lantern, press 2 to remain with current armor.");
			String e = in.nextLine();
			if (e.equals("1")) {
			Character.ArmorItem("The Ocean's Lantern", 8, 6);	
			}
		}
	}
	if (Enemy.Name == "Alaskan Bull Worm") {
		int randomIntW = rand.nextInt(2);	
		if (randomIntW == 0) {				
			System.out.println("You found the Sparring Gloves! It gives you 2 attack, 10 sentience, and takes both hands to use.");
			System.out.println("You may only have one two handed weapon at a time.  Would you like to keep Mace of Windy Dew or keep your current weapon?");
			System.out.println("Press 1 to keep Sparring Gloves, press 2 to remain with current weapon.");
			String d = in.nextLine();
			if (d.equals("1")) {
			Character.WeaponItem("Sparring Gloves", "Single", 2, 10);	
		}
			}
		if (randomIntW == 1) {
			System.out.println("You have found Wurm Plating! Armor that gives you 14 health and 2 sentience.");
			System.out.println("You may only have one armor at a time.  Would you like to keep Wurm Plating or keep your current armor?");
			System.out.println("Press 1 to keep Wurm Plating, press 2 to remain with current armor.");
			String e = in.nextLine();
			if (e.equals("1")) {
			Character.ArmorItem("Wurm Plating", 14, 2);	
			}
		}
	}
 }
}
	