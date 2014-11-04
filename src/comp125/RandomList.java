package comp125;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by reuben on 10/31/14.
 */
public class RandomList {

    public static void main(String[] args) {
        try {
            ArrayList<String> list = new ArrayList<String>();
            Scanner input = new Scanner(new FileReader("input.txt"));
            while (input.hasNext())
                list.add(input.nextLine());
            Random random = new Random();
            int rand = random.nextInt(list.size());
            System.out.println("Options were: " + list);
            System.out.println(list.get(rand) + " was randomly selected.");

        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    }
}