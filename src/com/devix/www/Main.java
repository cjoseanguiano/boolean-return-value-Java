package com.devix.www;

public class Main {

    public static void main(String[] args) {

        if (isValid("blue", 50)) {
            System.out.println("A");
        }
        /*if (isValid("blue", 200)) {
            System.out.println("B");
        }*/

        if (isValid("blue", 200)) {
            System.out.println("B");
        }
    }

    private static boolean isValid(String color, int size) {
        return color.length() >= 1 && size >= 1 && size <= 100;
    }
}
