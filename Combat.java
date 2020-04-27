import java.util.Scanner;
import java.util.Random;

public class Combat extends Character {
	static Scanner in = new Scanner(System.in);
	static Character user = new Character();
	static Swordfish enemy = new Swordfish();
	static Random rand = new Random();
	
	@SuppressWarnings("static-access")
	public static void UserCombat() {
		System.out.println("Type in the first of the three combat abilities you want to use this combat phase. Use 1, 2, or 3.");
		String a = in.nextLine();
		if (a == "1");
		enemy.takeDamage();
		enemy.checkHealth();

		if (a == "2");
			user.Attack2();
			if (enemy.Health == 0)
				enemy.DefeatLine();
		if (a == "3");
			user.Attack3();
			if (enemy.Health == 0)
				enemy.DefeatLine();
		System.out.println("Type in the second of the three combat abilities you want to use this combat phase.");
		int randomInt = rand.nextInt(3);
		if (randomInt == 0) {
			enemy.Attack1();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt == 1) {
			enemy.Attack2();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt == 2) {
			enemy.Attack3();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		String b = in.nextLine();
		if (b == "1");
			user.Attack1();
			System.out.println("Enemy health = " + enemy.Health);
			if (enemy.Health == 0)
				enemy.DefeatLine();
		if (b == "2");
			user.Attack2();
			if (enemy.Health == 0)
				enemy.DefeatLine();
		if (b == "3");
			user.Attack3();
			if (enemy.Health == 0)
				enemy.DefeatLine();
		System.out.println("Type in the third of the three combat abilities you want to use this combat phase.");
		int randomInt2 = rand.nextInt(3);
		if (randomInt2 == 0) {
			enemy.Attack1();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt2 == 1) {
			enemy.Attack2();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt2 == 2) {
			enemy.Attack3();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		String c = in.nextLine();
		if (c == "1");
		user.Attack1();
		if (enemy.Health == 0)
			enemy.DefeatLine();
		if (c == "2");
			user.Attack2();
			if (enemy.Health == 0)
				enemy.DefeatLine();
		if (c == "3");
			user.Attack3();
			if (enemy.Health == 0)
				enemy.DefeatLine();
		int randomInt3 = rand.nextInt(3);
		if (randomInt3 == 0) {
			enemy.Attack1();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt3 == 1) {
			enemy.Attack2();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt3 == 2) {
			enemy.Attack3();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		if (Character.Health >= enemy.Health) {
			enemy.DefeatLine();
		}
		if (Character.Health < enemy.Health) {
			enemy.VictoryLine();
		}
	}
//		public void EnemyCombat() {
//			int randomInt = (int)(3 * Math.random());
//			if (randomInt == 1) {
//				enemy.Attack1();
//				if (user.health == 0)
//					System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
//			}
//			else if (randomInt == 2) {
//				enemy.Attack2();
//				if (user.health == 0)
//					System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
//			}
//			else if (randomInt == 3) {
//				enemy.Attack3();
//				if (user.health == 0)
//					System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
//			}
//			int randomInt2 = (int)(3 * Math.random());
//			if (randomInt2 == 1) {
//				enemy.Attack1();
//				if (user.health == 0)
//					System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
//			}
//			else if (randomInt2 == 2) {
//				enemy.Attack2();
//				if (user.health == 0)
//					System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
//			}
//			else if (randomInt2 == 3) {
//				enemy.Attack3();
//				if (user.health == 0)
//					System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
//			}
//			int randomInt3 = (int)(3 * Math.random());
//			if (randomInt3 == 1) {
//				enemy.Attack1();
//				if (user.health == 0)
//					System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
//			}
//			else if (randomInt3 == 2) {
//				enemy.Attack2();
//				if (user.health == 0)
//					System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
//			}
//			else if (randomInt3 == 3) {
//				enemy.Attack3();
//				if (user.health == 0)
//					System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
//			}
//	}	
	
}
 	