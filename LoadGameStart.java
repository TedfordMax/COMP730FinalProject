import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LoadGameStart {

    public static void LoadGame() {

        String csvFile = "/Users/nicholasnoboa/savegame.txt";
        String line = "";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] savedData = line.split(",");

                String n = savedData[0];
                int h = Integer.parseInt(savedData[1]);
                int a = Integer.parseInt(savedData[2]);
                int s = Integer.parseInt(savedData[3]);

                Hero savedHero = new Hero(n, h, a, s);

                System.out.println("Successfully loaded game.");
                System.out.println("Your character: ");
                Hero.ReadStats();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}