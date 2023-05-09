package com.integersquare;

public class IntegerSquare {

    public static void main(String[] args) {
        System.out.println(squareOfInt(5));
    }
    // Method which accept an integer as parameter and returns the square of it
    public static double squareOfInt(int number){
        return Math.pow(number, 2);
    }
}
