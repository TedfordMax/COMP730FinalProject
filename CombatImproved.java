import java.util.Scanner;
import java.util.Random;

public class CombatImproved {
	private static Scanner in = new Scanner(System.in);
	//private static Hero user = new Hero();
	private static Swordfish enemy = new Swordfish();
	private static Random rand = new Random();
	
	//@SuppressWarnings("static-access")
	public static void UserCombat(Hero h) { // also input enemy type, not sure if interface type will work

        for (int i = 0; i < 3; i++) {

            // Start user turn.
            System.out.println("Type in which of the three combat abilities you want to use this combat phase. Use 1, 2, or 3.");
            String a = in.nextLine();
            if (a == "1") { h.Attack1(); }
            else if (a == "2") { h.Attack2(); }
            else if (a == "2") { h.Attack3(); }

            // Calculate enemy damage.
            enemy.takeDamage(h);
            //enemy.checkHealth();
            if (enemy.returnHealth() <= 0) { enemy.DefeatLine(); }

            // Start enemy turn.
            System.out.println("Enemy's turn.");
            int randomInt = rand.nextInt(3);
            if (randomInt == 0) { enemy.Attack1(); }
            else if (randomInt == 1) { enemy.Attack2(); }
            else if (randomInt == 2) { enemy.Attack3(); }
            
            // Determine if enemy wins.
            if (h.returnHealth() <= 0) { enemy.VictoryLine(); }
        }
    }
}