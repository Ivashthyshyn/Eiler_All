package com.example.key.eiler_all;

/**
 * Created by Key on 02.03.2017.
 */

public class Eiler_10 {


    public static void main(String[] args) {
        long q = 2L; // починаємо з -1 тому що починаючи цикл з нуля приведе до похибки починаєм з 1
        long n;
        boolean c;
// цикл який буде перелічувати всі можливі цифри (натуральні і цілі)
        for (n = 3; n < 2000000; n++) {
            c = true;

// цикл буде перебирати дількики числа у верхньому циклі від 2 до n-1 щоб дізнатися чи число є простим чи ні
            for (long i = 2; i < n; i++) {
                if (n % i == 0) { //якщо хочаб одне число ділиться на n то це число не просте
                    c = false;
                    break;
                }
            }
          if (c==true){
              q = q + n;
          }

        }
        System.out.println("number " + q);
    }
}