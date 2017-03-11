package com.example.key.eiler_all;

/**
 * Created by Key on 07.03.2017.
 * Задача № 12
 * Потрібно знайти трикутне число яке має більше 500 дільників.
 */

public class Eiler_12 {
    public static void main(String[] args) {
        long a; // змінна яка міститеме прості числла
        long b; // змінна яка лічитиме дільники
        long c = 0; // змінна яка міститеме трикутні числа
// створюємо цикл який буде створювати трикутні числа за формулою Тn=(n(n+1))/2
        for (a = 100; a < 1000000000L; a++) {
            long k = a + 1;
            c = (a*k)/2;
           b=0;
        boolean q = false; // змінну  q я ввів щоб вийти  з першого циклу в потрібний  момент
            for (long i = 1; i < c; i++) {// даний цикл визначає дільники і рахує їх
                if (c % i == 0) {
                    b=b+1;
                    System.out.println(b);

                }
                if (b==500){ // якщо дільників стало 500 виходим з другого циклу
                    System.out.println( "NNNN" + c + " s " + a );
                    q = true;
                    break;
                }
            }

            if (q==true){
                System.out.println( "NNNN" + c );
               break;
            }
        }

    }
}
