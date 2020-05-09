import java.util.Scanner;
import java.util.Random;

public class CombatImproved {
	private static Scanner in = new Scanner(System.in);
	private static Random rand = new Random();
	
	//@SuppressWarnings("static-access")
	public static void UserCombat(Hero player, Enemy enemy) { // also input enemy type, not sure if interface type will work

        for (int i = 0; i < 3; i++) {

            // Start user turn.
            System.out.println("Type in which of the three combat abilities you want to use this combat phase. Use 1, 2, or 3.");
            String a = in.nextLine();
            if (a == "1") { player.Attack1(); }
            else if (a == "2") { player.Attack2(); }
            else if (a == "2") { player.Attack3(); }

            // Calculate enemy damage.
            enemy.takeDamage(player);       // this means enemy is always damaged, logic error
            //enemy.checkHealth();
            if (enemy.returnHealth() <= 0) { enemy.DefeatLine(); }

            // Start enemy turn.
            System.out.println("Enemy's turn.");
            int randomInt = rand.nextInt(3);
            if (randomInt == 0) { enemy.Attack1(); }
            else if (randomInt == 1) { enemy.Attack2(); }
            else if (randomInt == 2) { enemy.Attack3(); }
            
            // Determine if enemy wins.
            if (player.returnHealth() <= 0) { enemy.VictoryLine(); }
        }
        if (player.returnHealth() >= 0) { player.VictoryLine(); }
    }
}