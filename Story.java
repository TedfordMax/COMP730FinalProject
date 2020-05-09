import java.util.Scanner;
import sun.net.www.content.text.plain;

public class Story {

    public static int StoryTracker = 1;

    public static void StoryManager(Hero h) {
        switch (StoryTracker) {
            case 1:
                Chapter1(h);
                break;
            case 2:
                Chapter2(h);
                break;
            case 3:
                Chapter3(h);
                break;
        }    
    }

    public static void Save(Hero h) {
        SaveGame.Saving(StoryTracker);
        System.out.println(StoryTracker);
    }

    public static void Chapter1(Hero player) {
        System.out.println("Debug mode - In Story.java, Chapter 1.");
        System.out.println(player.returnName());
        StoryTracker = 2;
    }

    public static void Chapter2(Hero player) {
        System.out.println("Debug mode - In Story.java, Chapter 2.");
        Enemy Swordfish = new Enemy("Swordfish", 10, 1, 1);
        CombatImproved.UserCombat(player, Swordfish);
        StoryTracker = 3;
    }

    public static void Chapter3(Hero player) {
        System.out.println("Debug mode - In Story.java, Chapter 3.");
        //StoryTracker = 3;
    }
}