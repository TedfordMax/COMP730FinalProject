import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Character {
	
	static public Integer Level;
	static public int Attack;
	static public int Sentience;
	static public int Health;
	public static String Attack1;
	public static String Attack2;
	public static String Attack3;
	public static String VictorySpeech;
	public static String DefeatSpeech;
	public static Integer XP;
	public static String WeaponName;
	public static Integer WeaponStats;
	public static Integer WeaponSentience;
	public static String SecondaryWeaponName;
	public static Integer SecondaryWeaponStats;
	public static Integer SecondaryWeaponSentience;
	public static Integer SecondaryWeaponHealth;
	public static String ArmorName;
	public static Integer ArmorStats;
	public static Integer ArmorSentience;
	public static String WeaponType;
	public static String SecondaryWeaponType;
	    
    public static void getStats() {
    	System.out.println("Attack = " + Attack);
    	System.out.println("Sentience = " + Sentience);
    	System.out.println("Toughness = " + Health);
	}
	public static void getOffense() {
    	System.out.println("Attack 1 = " + Attack1);
    	System.out.println("Attack 2 = " + Attack2);
    	System.out.println("Attack 3 = " + Attack3);
    }
    public static void Attack1() {
    	System.out.println("You attack for" + Attack + " damage!");
    }
    public static void Attack2() {
    	if (Attack2 == "Ink Squirt") {
    		Attack = Attack + Sentience;
    		System.out.println("You used Ink Squirt, your attack increased to = " + Attack);
    	}
    	if (Attack2 == "Crabtivating Wind-Up") {
    		Attack = Attack*Sentience;
    		System.out.println("You used Crabtivating Wind-Up, your attack increased to = " + Attack);
    }
    	if (Attack2 == "The Real Dirty Dan") {
    		Attack = Attack + 3;
    		System.out.println("You used The Real Dirty Dan, your attack increased to = " + Attack);
    	}
	}
	public static void Attack3() {
		if (Attack3 == "Tentacle Block") {
			Health = Health + Sentience*2;
			System.out.println("You used Tentacle Block, your health increased to = " + Health);
			}
		if (Attack3 == "Toxic Release") {
			Attack = Attack*2;
			System.out.println("You used Toxic Release, your attack increased to = " + Attack);
		}
		if (Attack3 == "Krusty Exterior") {
			Health = Health*Sentience;
			System.out.println("You used Krusty Exterior, your health increased to = " + Health);
		}
	}
	public void VictoryLine() {
		System.out.println(VictorySpeech);
	}
	public void DefeatLine() {
		System.out.println(DefeatSpeech);
	}
	public static void WeaponItem(String newWeaponName, String newWeaponType, Integer newWeaponStats, Integer newWeaponSentience) {
		WeaponName = newWeaponName;
		WeaponStats = newWeaponStats;
		WeaponSentience = newWeaponSentience;
		WeaponType = newWeaponType;
		//WeaponInventory.add(WeaponName);
	}
	public static void SecondaryWeaponItem(String newSecondaryWeaponName, String newSecondaryWeaponType, Integer newSecondaryWeaponStats, Integer newSecondaryWeaponSentience, Integer newSecondaryWeaponHealth) {
		SecondaryWeaponName = newSecondaryWeaponName;
		SecondaryWeaponType = newSecondaryWeaponType;
		SecondaryWeaponStats = newSecondaryWeaponStats;
		SecondaryWeaponSentience = newSecondaryWeaponSentience;
		SecondaryWeaponHealth = newSecondaryWeaponHealth;
	}
	public static void ArmorItem(String newArmorName, Integer newArmorStats, Integer newArmorSentience ){
		ArmorName = newArmorName;
		ArmorStats = newArmorStats;
		ArmorSentience = newArmorSentience;
	}
	//private static List<String> WeaponInventory(String WeaponName) {
		//return WeaponInventory;
		
	//}
	public static void getItemStats() {
		Attack = Attack + WeaponStats + SecondaryWeaponStats;
		Health = Health + ArmorStats + SecondaryWeaponHealth;
		Sentience = Sentience + WeaponSentience + ArmorSentience;
	}
	public static void levelUp() {
		if (XP == 10) {
		Attack = Attack + 2;
		Health = Health + 5;
		Sentience = Sentience + 2;
		Level = Level + 1;
		if (XP >= 10) {
			XP = XP - 10;
		}
		System.out.println("You leveled up! Attack and Sentience increased by 2 and Health increased by 5!");
		}
	}
	public static void checkLevel() {
		System.out.println("You are level " + Level);
	}
	public static void checkItems() {
		System.out.println("Weapon: " + WeaponName + " Increases Attack by: " + WeaponStats);
		System.out.println("Armor: " + ArmorName + " Increses Health by: " + ArmorStats);
	}
}
