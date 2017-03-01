package com.example.key.eiler_all;

/**
 * Created by Key on 01.03.2017.
 */

public class Eiler_9 {

    public static void main(String[] args) {
        int a;
        int b;
        int c;
        // розвязання задачі грунтується на переборі циклів чисел а і б які підносяться до квадрату  та порівняння їх суми
        //з числом яке утворюється із перебору циклу числа с якщо вони співпадають і їх сума дорівнює 1000 це потрібний результат
        for (a = 1; a < 1000; a++) {
            for (b = 1; b < 1000; b++) {
                    int sum1 = a * a;
                    int sum2 = b * b;
                    int sum = sum1 + sum2;
                    for (c = 1; c < 1000; c++) {
                        int sum3 = c * c;
                        if (sum == sum3 && a + b + c == 1000 ) {
                            System.out.println(a + " and " + b + " and " + c + " sum " + a * b * c);
                            break;
                        }
                    }
                }

            }
        }
    }
