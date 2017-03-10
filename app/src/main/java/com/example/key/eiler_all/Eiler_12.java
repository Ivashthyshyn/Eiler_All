package com.example.key.eiler_all;

/**
 * Created by Key on 07.03.2017.
 */

public class Eiler_12 {
    public static void main(String[] args) {
        long a; // починаємо з -1 тому що починаючи цикл з нуля приведе до похибки починаєм з 1
        long b;
        long c = 0;

        for (a = 1; a < 200000000000L; a++) {
            c = c + a;
            b=0;

            for (long i = 1; i < c; i++) {
                if (c % i == 0) {
                    b=b+1;

                }

            }
            if (b>500){
                System.out.println( "NNNN" + c );
                break;
            }

        }

    }
}
