package opgave2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //opretter et nyt Drink-objekt
        Drink drink = new Drink();

        //forsøger at sætte prisen på drinken
        try {
            drink.setPrice(-99.99); //hvis prisen er negativ -> vil kaste exception
            System.out.println("Gyldig pris: " + drink.getPrice() + " kr. \n- Prisen er sat korrekt");
        } catch (IllegalArgumentException e) {
            //håndtere fejlen, hvis prisen er under 0 (negativ)
            System.out.println("Ugyldig pris: " + e.getMessage());
        }

        System.out.println("---------------------------------");

        //opretter en liste af drikkevarer
        ArrayList<String> items = new ArrayList<>(List.of(
                "Vand", "juice", "Cola", "Sprite", "Fanta"
        ));

        //forsøger at hente et element fra listen
        try {
            System.out.println(drink.getItem(items, 5)); //hvis index ikke eksisterer → vil kaste exception
        } catch (IllegalArgumentException e) {
            //håndtere fejlen, hvis indekset er uden for listen
            System.out.println("Ugyldigt indeks!" + e.getMessage());
        }
    }
}
