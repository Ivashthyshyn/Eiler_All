package com.example.key.eiler_all;



/**
 * Created by Key on 12.03.2017.
 * Задача № 14.
 * Потрібно знайти найбільше число (менше міліона) яке формуватиме найбільшу послідовність
 * Колацца
 */

public class Eiler_14 {
    public static void main(String[] args) {
        long INITIAL_CONDITION = 999999;//константа за умовою задачі
        long maxNumberSequence = 0;
        long maxNumericSequence = 0;
        long mostBigA = 0;
        long mostBigI = 0;
        for (long i = INITIAL_CONDITION; i > 1; i--) {
            long sequenceVariable;
            sequenceVariable = i;
            long n;
            int counter;
            for (counter = 1; sequenceVariable > 1; counter++) {
                /** Визначає парність непарність кожного числа з послідовності*/
                if (sequenceVariable % 2 == 0) {
                    n = sequenceVariable / 2;
                    sequenceVariable = n;

                } else {
                    n = (3 * sequenceVariable) + 1;
                    sequenceVariable = n;
                }
                /** Визначає і записує як результат початкове число послідовності і кількість членів послідовності*/
                if (n == 1){

                    mostBigA = counter;
                    mostBigI = i;
                    break;
                }

            }
            /** Порівнює найбільші значення кількості членів послідовності і записує результат*/
            if (maxNumberSequence <= mostBigA){
                maxNumberSequence = mostBigA;
                maxNumericSequence = mostBigI;
                System.out.println(maxNumberSequence + "|" + maxNumericSequence);
            }


            }

        }

    }

