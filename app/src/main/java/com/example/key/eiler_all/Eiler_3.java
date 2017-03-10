package com.example.key.eiler_all;

/**
 * Created by Key on 10.03.2017.
 * Який найбільший дільник числа 600851475143, який є простим числом?
 *
 */

public class Eiler_3 {
    public static void main(String[] args){
        long q = 0; //змінна яка рахуватиме прості числа (лічильник)
        long n = 600851475143L;
        long k;
// цикл який буде перелічувати всі можливі дільники (натуральні і цілі)
        for (k = 2; k < n; k++) {
            long t = n / k;
            if (n % k == 0) {
                q = q + 1;
// цикл буде перебирати дількики числа у верхньому циклі від 2 до n-1 щоб дізнатися чи число є простим чи ні
                for (long i = 2; i < t; i++) {
                    if (t % i == 0) { //якщо хочаб одне число ділиться на n то це число не просте
                        q = q - 1;
                        break;
                    }
                }
            }
            if (q == 1) {// якщо в лічильнику є хоть одне число то воно просте
                System.out.println(q + "=" + t);// Відповідь 6857
                break;

            }
        }


    }
}
