package edu.pjatk.jgorny;

public class NotEnoughMojito extends Exception {

    public NotEnoughMojito() {
        super("Out of stock");
    }
}
