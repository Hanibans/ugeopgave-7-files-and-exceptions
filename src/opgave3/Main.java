package opgave3;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import static opgave3.TextUI.readLines;

public class Main {
    public static void main(String[] args) {
        try {
            //forsøger at læse alle linjer fra filen "data/opgave3test.csv"
            ArrayList<String> lines = readLines("data/opgave3test.csv");

            //printer hver linje i filen
            for (String line : lines) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            //hvis filen ikke findes, fanges exception og der printes dette
            System.out.println("Filen blev ikke fundet");
        }
    }
}

