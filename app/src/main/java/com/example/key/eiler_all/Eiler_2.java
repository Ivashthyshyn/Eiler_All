package com.example.key.eiler_all;

/**
 * Created by Key on 10.03.2017.
 * Визначаємо суму всіх парних елементів ряду Фібоначчі, які не перевищують 4 міліона.
 */

public class Eiler_2 {
    public static void main(String[] args){
        int thausend = 4000000;
        int a = 1;
        int b = 0;
        int sum = 0;
// Визначаємо за допомогою цикла всі числа ряду Фібоначчі до 4 міліонів

        for (int i = 0; a < thausend; i++) {
            a = a + b;
            b = a - b;
            // Відбираємо парні члени і додаєм їх між собою
            if (a % 2 == 0) {
                sum = sum + a;
            }
        }
        System.out.println(sum); // Відповідь 4613732
    }

}
