import java.io.FileWriter;
import java.io.*;            // I don't know what works so I imported them all.
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LoadGame {

    public static void Loading(Hero player) {

        String n = "";
        int h = 0;
        int a = 0;
        int s = 0;

        //read CSV here, split, use index to assign values, set below

        /**
        Scanner scanner = new Scanner(new File("/Users/nicholasnoboa/Desktop/project_fixed/savedgame.txt/"));
        scanner.useDelimiter(",");
        while(scanner.hasNext()){
            System.out.print(scanner.next()+"|");
        }
        scanner.close();
        */
        
        //BufferedReader csvReader = new BufferedReader(new FileReader("/Users/nicholasnoboa/Desktop/project_fixed/savedgame.txt"));
        //while ((row = csvReader.readLine()) != null) {
          //  String[] data = row.split(",");
        //}

        /**
        ArrayList<String> data = new ArrayList<String>();
        String[] test;

        for (int i = 0; i < 1; i++) {
            test = csvReader.readLine().split(",");
        } */

        /**
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("savedgame.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }   
        } */

        /**
        for (int i = 0; i < 4; i++) {
            if (i == 0) { n = data; }
            else if (i == 1) { h = data; }
            else if (i == 2) { a = data; }
            else if (i == 3) { s = data; }
        } */

        /**
        for(int i = 0; i < 4; i++)
        {
            System.out.println(data.get(i));
        }

        for(List<String> name : data)
        {
            System.out.println(name);
        } */

        /**
        player.setName(n);
        player.setHealth(h);
        player.setAttack(a);
        player.setSpeed(s);
        */
        //how to set story bookmark?
    }
}