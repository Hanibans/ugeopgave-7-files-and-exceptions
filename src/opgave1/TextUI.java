package opgave1;

import java.util.Scanner;

public class TextUI {
    //scanner bruges til at læse fra brugeren via konsollen
    Scanner scan = new Scanner(System.in);

    //metoden viser en besked til brugeren og venter på et tal
    public int promptNumber(String msg) {
        System.out.println(msg); //viser beskeden
        try {
            //læser en linje fra brugeren og forsøger at konvertere den til et heltal
            return Integer.parseInt(scan.nextLine());
        } catch (NumberFormatException e) {
            //hvis input ikke kan konverteres til et tal, fanges fejlen her
            System.out.println("Skriv venligst et tal");

            //kalder metoden igen for at give brugeren en ny chance
            return promptNumber(msg);
        }
    }
}
