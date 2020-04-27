import java.util.Scanner;
import java.util.Random;

public class CombatImproved extends Character {
	static Scanner in = new Scanner(System.in);
	static Character user = new Character();
	static Swordfish enemy = new Swordfish();
	static Random rand = new Random();
	
	@SuppressWarnings("static-access")
	public static void UserCombat() {

        for (int i = 0; i < 3; i++) {

            // Start user turn.
            System.out.println("Type in which of the three combat abilities you want to use this combat phase. Use 1, 2, or 3.");
            String a = in.nextLine();
            if (a == "1") { user.Attack1(); }
            else if (a == "2") { user.Attack2(); }
            else if (a == "2") { user.Attack3(); }

            // Calculate enemy damage.
            enemy.takeDamage();
            enemy.checkHealth();
            if (enemy.Health <= 0) { enemy.DefeatLine(); }

            // Start enemy turn.
            System.out.println("Enemy's turn.");
            int randomInt = rand.nextInt(3);
            if (randomInt == 0) { enemy.Attack1(); }
            else if (randomInt == 1) { enemy.Attack2(); }
            else if (randomInt == 2) { enemy.Attack3(); }
            
            // Determine if enemy wins.
            if (Character.Health <= 0) { enemy.VictoryLine(); }
        }
    }
}