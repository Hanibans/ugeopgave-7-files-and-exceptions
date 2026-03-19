package opgave4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //opretter en ArrayList til at gemme tekstdata
        ArrayList<String> data = new ArrayList<>();

        //tilføjer drikkevarer med format: navn, beskrivelse, pris
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");

        //looper igennem alle elementer i data-listen
        for (String d : data) {

            //splitter hver streng i tre dele baseret på komma
            String[] values = d.split(",");

            //henter og "trimmer" hvert felt for at fjerne ekstra mellemrum
            String name = values[0].trim(); //navnet på drikken
            String description = values[1].trim(); //beskrivelsen
            String price = values[2].trim(); //prisen

            //printer dataen i et pænere format
            System.out.println(name + " - " + description + " (" + price + " kr)");
        }
    }
}
