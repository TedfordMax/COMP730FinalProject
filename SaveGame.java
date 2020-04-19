import java.io.FileWriter;
import java.io.*;            // I don't know what works so I imported them all.
import java.io.File;
import java.io.IOException;

public class SaveGame {

    public static void Saving() {

        String name = Hero.returnName();
        String health = Integer.toString(Hero.returnHealth());
        String attack = Integer.toString(Hero.returnAttack());
        String speed = Integer.toString(Hero.returnSpeed());

        try {
            FileWriter myWriter = new FileWriter("savegame.txt");
            myWriter.write(name);
            myWriter.write(",");
            myWriter.write(health);
            myWriter.write(",");
            myWriter.write(attack);
            myWriter.write(",");
            myWriter.write(speed);
            myWriter.write(",");
            myWriter.write("story placeholder");
            myWriter.write(",");
            myWriter.close();
            System.out.println("Successfully saved game.");
        } catch (IOException e) {
            System.out.println("An error occurred during saving.");
            e.printStackTrace();
        }
    }
}


