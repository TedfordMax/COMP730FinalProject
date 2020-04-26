import java.util.Scanner;
import java.util.Random;

public class Combat extends Character {
	Scanner in = new Scanner(System.in);
	Character user = new Character();
	Swordfish enemy = new Swordfish();
	Random rand = new Random();
	
	public void UserCombat() {
		System.out.println("Type in the first of the three combat abilities you want to use this combat phase. Use 1, 2, or 3.");
		String a = in.nextLine();
		if (a == "1");
		user.Attack1();
		enemy.Health = enemy.Health - user.Attack;
			if (enemy.Health == 0)
				System.out.println("Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.");
		if (a == "2");
			user.Attack2();
			if (enemy.Health == 0)
				System.out.println("Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.");
		if (a == "3");
			user.Attack3();
			if (enemy.Health == 0)
				System.out.println("Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.");
		System.out.println("Type in the second of the three combat abilities you want to use this combat phase.");
		int randomInt = rand.nextInt(4);
		if (randomInt == 1) {
			enemy.Attack1();
			if (user.Health == 0)
				System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
		}
		else if (randomInt == 2) {
			enemy.Attack2();
			if (user.Health == 0)
				System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
		}
		else if (randomInt == 3) {
			enemy.Attack3();
			if (user.Health == 0)
				System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
		}
		String b = in.nextLine();
		if (b == "1");
			user.Attack1();
			if (enemy.Health == 0)
				System.out.println("Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.");
		if (b == "2");
			user.Attack2();
			if (enemy.Health == 0)
				System.out.println("Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.");
		if (b == "3");
			user.Attack3();
			if (enemy.Health == 0)
				System.out.println("Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.");
		System.out.println("Type in the third of the three combat abilities you want to use this combat phase.");
		int randomInt2 = rand.nextInt(4);
		if (randomInt2 == 1) {
			enemy.Attack1();
			if (user.Health == 0)
				System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
		}
		else if (randomInt2 == 2) {
			enemy.Attack2();
			if (user.Health == 0)
				System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
		}
		else if (randomInt2 == 3) {
			enemy.Attack3();
			if (user.Health == 0)
				System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
		}
		String c = in.nextLine();
		if (c == "1");
		user.Attack1();
		if (enemy.Health == 0)
			System.out.println("Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.");
		if (c == "2");
			user.Attack2();
			if (enemy.Health == 0)
				System.out.println("Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.");
		if (c == "3");
			user.Attack3();
			if (enemy.Health == 0)
				System.out.println("Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.");
		int randomInt3 = rand.nextInt(4);
		if (randomInt3 == 1) {
			enemy.Attack1();
			if (user.Health == 0)
				System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
		}
		else if (randomInt3 == 2) {
			enemy.Attack2();
			if (user.Health == 0)
				System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
		}
		else if (randomInt3 == 3) {
			enemy.Attack3();
			if (user.Health == 0)
				System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
		}
		if (user.Health >= enemy.Health) {
			System.out.println("Swordfish: Oooh, you've respectfully defeated me, allow me to sink to my end in peace.");
		}
		if (user.Health < enemy.Health) {
			System.out.println("Swordfish: Please understand, I hold you in the highest respect.");
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
 	