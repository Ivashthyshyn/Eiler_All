package com.example.key.eiler_all;

/**
 * Created by Key on 10.03.2017.
 * Задача №1.
 * Потрібно знайти суму всіх чисел менше 1000, які кратні 3 і 5
 */

public class Eiler_1 {
    public static void main(String[] args){
        int thausend = 1000;
        int c = 0; // Змінна яка міститеме суму чисел що діляться на 3 і 5.

// Визначаємо за допомогою цикла всі числа кратні 3 або 5  проте не перевищують 1000
// Також додаєм їх між собою
        for (int i = 999; i > 0; i--) {
           if (i % 3 == 0 | i % 5 == 0)// перевіряємо умову якщо числа діляться без остатку то це наші числа
                c=c+i;

        }
        System.out.println(c+","); // Відповідь 233168
    }
}