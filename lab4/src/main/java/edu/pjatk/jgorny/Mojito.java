package edu.pjatk.jgorny;

public class Mojito implements IDrink {


    private int initial;


    public Mojito(int initial) {
        this.initial = initial;
    }

    public void buy(int number) throws NotEnoughMojito {
        if (initial - number < 0) {
            initial = 0;
            throw new NotEnoughMojito();
        } initial -= number;
    }

    public int getQuantity() {
        return initial;
    }

    public boolean outOfStock() {
        return initial == 0;
    }
}
