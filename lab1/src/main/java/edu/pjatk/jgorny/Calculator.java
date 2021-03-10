package edu.pjatk.jgorny;

public class Calculator {

    public double add(double x, double y) {
        return x + y;
    }

    public double sub(double x, double y) {
        return x - y;
    }

    public double mult(double x, double y) {
        return x * y;
    }

    public double div(double x, double y) {
        if (y == 0) {
            throw new IllegalArgumentException("Division by 0");
        }
        return x / y;
    }

    public boolean isPositive(double x) {
        if (x > 0) {
            return true;
        } else {
            return false;
        }
    }


}
