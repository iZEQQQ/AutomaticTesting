package edu.pjatk.jgorny;

public interface IDrink {
    void buy(int number) throws NotEnoughMojito;

    int getQuantity();

    boolean outOfStock();
}
