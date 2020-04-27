import java.util.Random;
import java.util.Scanner;

public class FishCultistFight extends Character {
	Scanner in = new Scanner(System.in);
	Character user = new Character();
	FishCultists enemy = new FishCultists();
	Random rand = new Random();
	
	@SuppressWarnings("static-access")
	public void UserCombat() {
		System.out.println("Type in the first of the three combat abilities you want to use this combat phase. Use 1, 2, or 3.");
		String a = in.nextLine();
		if (a == "1");
		user.Attack1();
		enemy.Health = enemy.Health - Character.Attack;
			if (enemy.Health == 0)
				enemy.DefeatLine();
		if (a == "2");
			user.Attack2();
			if (enemy.Health == 0)
				enemy.DefeatLine();
		if (a == "3");
			user.Attack3();
			if (enemy.Health == 0)
				enemy.DefeatLine();
		System.out.println("Type in the second of the three combat abilities you want to use this combat phase.");
		int randomInt = rand.nextInt(4);
		if (randomInt == 1) {
			enemy.Attack1();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt == 2) {
			enemy.Attack2();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt == 3) {
			enemy.Attack3();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		String b = in.nextLine();
		if (b == "1");
			user.Attack1();
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
		int randomInt2 = rand.nextInt(4);
		if (randomInt2 == 1) {
			enemy.Attack1();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt2 == 2) {
			enemy.Attack2();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt2 == 3) {
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
		int randomInt3 = rand.nextInt(4);
		if (randomInt3 == 1) {
			enemy.Attack1();
			if (Character.Health == 0)
				enemy.VictoryLine();
		}
		else if (randomInt3 == 2) {
			enemy.Attack2();
			if (Character.Health == 0)
				enemy.VictoryLine();;
		}
		else if (randomInt3 == 3) {
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
}