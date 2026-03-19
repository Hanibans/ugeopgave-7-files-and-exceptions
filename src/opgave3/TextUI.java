package opgave3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//TextUI-klassen har en statisk metode til at læse filer
public class TextUI {
    public static ArrayList<String> readLines(String path) throws FileNotFoundException {
        ArrayList<String> lines = new ArrayList<>();

        //scanner læser filen fra stien 'path'
        Scanner scan = new Scanner(new File(path));

        //læser alle linjer fra filen og tilføjer dem til listen
        while (scan.hasNextLine()) {
            lines.add(scan.nextLine());
        }
        //lukker scanner-objektet for at frigive ressourcer
        scan.close();

        //returnerer listen med linjer
        return lines;
    }
}
