package opgave1;

public class Main {
    public static void main(String[] args) {
        //opretter et nyt TextUI-objekt, som man bruger til at håndtere input/output
        TextUI ui = new TextUI();

        //kalder promptNumber-metoden på ui.objektet
        //hvis brugeren skriver noget, der ikke er et tal, spørger den igen
        int input = ui.promptNumber("Giv mig et tal"); //viser beskeden og venter på input

        //printer det tal, brugeren har indtastet
        System.out.println(input);
    }
}