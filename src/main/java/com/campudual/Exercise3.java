package com.campudual;

public class Exercise3 {
    static int value=5;

    public static void sum() {
        Exercise3.value+=1;
        if (Math.random()*100%2==0){
            return;
        }
    }

/*Procedimiento. No devuelve un valor*/
    public static String Hello() {

        return "Hello, World!";
    }

    public static void main(String[] args) {
        String hello= Exercise3.Hello();
        Exercise3.sum();
        System.out.println(hello);
    }

}
