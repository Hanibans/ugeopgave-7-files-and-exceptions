package opgave5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //opretter en liste med drikkevarer som tekstdata
        ArrayList<String> data = new ArrayList<>();

        //tilføjer drikkevarer med format: navn, beskrivelse, pris
        data.add("Espresso, En kraftfuld og koncentreret kaffe, 25.0");
        data.add("Latte, Espresso med dampet mælk, 45.0");
        data.add("Cola, Kold og brusende, 30.0");
        data.add("Vand, Stille kildevand, gratis"); //pris er ikke et tal

        double total = 0; //variabel til at summere alle pris

        //looper igennem alle elementer i data-listen
        for (String d : data) {

            //splitter hver streng i tre dele baseret på komma
            String[] values = d.split(",");

            //henter og "trimmer" hvert felt for at fjerne ekstra mellemrum
            String name = values[0].trim(); //navnet på drikken
            String description = values[1].trim(); //beskrivelsen

            try {
                //forsøger at konvertere pris til double
                double price = Double.parseDouble(values[2].trim());
                total += price; //lægger pris til total

                //printer dataen i et pænere format
                System.out.println(name + " - " + description + " (" + price + " kr)");

            } catch (NumberFormatException e) {
                //håndterer tilfælde hvos pris ikke er et tal (fx "gratis")
                System.out.println(name + " - " + description + " (kunne ikke læse pris: " + values[2].trim() + ")");
            }
        }
        //printer samlet pris af alle drikkevarer med talpriser
        System.out.println("\nSamlet pris: " + total + " kr");
    }
}
