package com.example.key.eiler_all;

/**
 * Created by Key on 10.03.2017.
 * Задача №4
 * Знайдіть найбільший паліндром, отриманий множенням двох тризначних чисел.
 */

public class Eiler_4 {

    public static void main(String[] args) {
        int q = 0;
        int a;
        int b = 100;//найменше трьохзначне число
        int c = 0;
        // Створюємо цик який буде перебирати всі можливі множники чисел а і b від 100 до 1000
        for (a = 100; b < 1000; a++) {
            // перебираєм множники числа а як тільки а дійде до 1000  число b + 1 і знову перебираєм всі варіанти
            if (a < 1000) {
                c = a * b;
                String data = Integer.toString(c);// перетворюємо число с в рядок
                int[] der = new int[data.length()]; // створюємо числовий масив  масив який міститиме всі числа числа с
                String[] dataString = new String[data.length()];//створюємо String масив який міститиме всі  числа с в формі String
                char[] dataChar = data.toCharArray();// витягуємо всі елементи строки в char масив
                if (data.length() == 6) { // відсіюємо ті числа які матимуть менше значення
                    for (int i = 0; i < data.length(); i++) {
                        dataString[i] = Character.toString(dataChar[i]); // перетворюєм елементи масиву char в String
                        der[i] = Integer.parseInt(dataString[i]); // перетворюємо елементи масиву String в int
                    }// визначаємо чи число поліндром
                    if (der[0] == der[5] && der[1] == der[4] && der[2] == der[3]) {
                        int palindrom = c;
                        // визначаєм найбільший поліндром
                        if (q < palindrom) {
                            q = palindrom;
                        }

                    }
                }

            } else {
                b++;
                a = 100;
            }

        }
        System.out.println(q);//Відповідь 906609
    }
}



