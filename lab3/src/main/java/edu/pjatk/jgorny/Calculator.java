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

    public String addingStrings(String one, String two) {
        return one + two;
    }

    public boolean isEven(int number) {
        return (number % 2) != 1;
    }

    public int timesThree(int number) {
        return number * 3;
    }

    public int times10(int number) {
        return number * 10;
    }

    public double sqrt(double number){
        return Math.sqrt(number);
    }

    public int timesNumber(int number) {
        return number * number * number;
    }


}
