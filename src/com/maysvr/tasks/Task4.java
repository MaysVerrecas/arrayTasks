package com.maysvr.tasks;
import java.util.Arrays;

public class Task4 {
    /**
     * Создайте массив из 8 случайных целых чисел из отрезка [1;10].
     * Выведите массив на экран в строку.
     * Замените каждый элемент с нечётным индексом на ноль.
     * Снова выведете массив на экран на отдельной строке.
     */
    public static void main(String[] args) {
        task4();
    }

    private static void task4() {
        int[] array = {1,5,7,10,2,4,2,3};
        String str = Arrays.toString(array); //выводим массив
        System.out.println(str);

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                array[i] = 0;
            }
        } // заменяем значения нечетных индексов

        String str2 = Arrays.toString(array);
        System.out.println(str2);
    }
}
