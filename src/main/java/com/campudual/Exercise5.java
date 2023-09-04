package com.campudual;

public class Exercise5 {
    public static void main(String[] args) {

        int n1 = 2;
        int n2 = 5;
        //Comprobar que un numero es par o impar
        if (n1 % 2 == 0) {
            System.out.println("Is pair");
        } else {
            System.out.println("Not is pair");
        }

        //Comprobar que un numero es positivo o negativo
        if (n1 < 0) {
            System.out.println("Is positive");
        } else {
            System.out.println("Is negative");
        }
        //Comprobar si un numero es multiplo de otro
        if (n1 % n2 == 0) {
            System.out.println("Is positive");
        } else {
            System.out.println("Is positive");
        }
        //Comprobar que un numero es menor que otro
        if (n2 < n1) {
            System.out.println(n1 + " is smaller than " + n2);
        } else {
            System.out.println(n1 + " is big than " + n2);
        }
    }
}
