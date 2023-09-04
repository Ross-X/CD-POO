package com.campudual;

public class Exercise4 {
    /*
    * Suma de los 5 primeros números
    * suma de los 20 primeros números pares
    * */
    public static void main(String[] args) {
        System.out.println(1+2+3+4+5);

        int n = 20; // Cantidad de números pares a sumar
        int sumPair = n * (n + 1);
        System.out.println("The sum of the first " + n + " even numbers is: " + sumPair);

        }
}
