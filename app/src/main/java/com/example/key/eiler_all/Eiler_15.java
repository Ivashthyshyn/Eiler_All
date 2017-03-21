package com.example.key.eiler_all;

import java.math.BigInteger;

/**
 * Created by Key on 15.03.2017.
 * Задача 15.
 * Потрібно знайти кількість відмінних шляхів на шаховій дощі якщо пересуватись можна тільки праворуч і донизу.
 * кількість клітинок 20*20
 * Тут потріно використовувати трикутник Паскаля.
 */

public class Eiler_15 {

    public static void main(String[] args){
        int height = 21;// розмір таблиці по висоті
        int width = 21;// розмір таблиці по ширині

        /** Створюємо двомірний масив для зберігання для зберігання кількості шляхів
         * використовуємо клас BigInteger тому що не відомо яке за велике число получиться
          */
        BigInteger [][] field =new BigInteger[height][width];
        for (int i = 1; i < height; i++){
            field[0][0] = BigInteger.valueOf(0); //початкове положення немає шодів
            field[i][0] = BigInteger.valueOf(1); // будь який хід вниз чи в право від початкового рівний 1
            for (int k = 1; k < width; k++){
               // будь який хід вниз чи в право від початкового рівний 1
                field[0][k]=BigInteger.valueOf(1);
                /** кількість шляхів дорівнює сумі шляхів клітки зверху і зліва від заданої клітки*/

                field[i][k] = field[i-1][k].add(field[i][k-1]);

            }

        }
        System.out.println(field[width-1][height-1].toString());//Відповідь 137846528820

    }

}
