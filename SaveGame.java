import java.io.FileWriter;
import java.io.*;            // I don't know what works so I imported them all.
import java.io.File;
import java.io.IOException;

public class SaveGame {

    public static void Saving(int Bookmark) {

        String name = Hero.returnName();
        String health = Integer.toString(Hero.returnHealth());
        String attack = Integer.toString(Hero.returnAttack());
        String speed = Integer.toString(Hero.returnSpeed());
        String story = Integer.toString(Bookmark);

        try {
            FileWriter myWriter = new FileWriter("savedgame.txt");
            myWriter.write(name);
            myWriter.write(",");
            myWriter.write(health);
            myWriter.write(",");
            myWriter.write(attack);
            myWriter.write(",");
            myWriter.write(speed);
            myWriter.write(",");
            myWriter.write(story);
            myWriter.write(",");
            myWriter.close();
            System.out.println("Successfully saved game.");
            System.out.println(Bookmark);
            System.out.println(story);
        } catch (IOException e) {
            System.out.println("An error occurred during saving.");
            e.printStackTrace();
        }
    }
}