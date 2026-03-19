package opgave2;

import java.util.ArrayList;

public class Drink {
    private double price;

    //sætter prisen, men kaster en fejl hvis den er negativ
    public void setPrice(double price) {
        if (price < 0) { throw new IllegalArgumentException(price + " kr. \n- Prisen må ikke være negativ");
        }
        this.price = price;
    }

    //returnerer prisen
    public double getPrice() {
        return price;
    }

    //henter et element fra listen baseret på index
    public String getItem(ArrayList<String> items, int index) {
        if (index < 0 || index >= items.size()) {
            //kaster en fejl, hvis index er uden for range
            throw new IllegalArgumentException("\n- Indeks " + index + " er uden for range 0-" + (items.size() - 1));
        }
        //returnerer besked med det valgte element
        return "Gyldigt indeks!" + "\n- Indeks " + index + " har valgt " + items.get(index);
    }
}