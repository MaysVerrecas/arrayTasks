package com.maysvr.tasks;

import java.util.Arrays;

public class Task6 {
    /**
     * Создайте массив из 20-ти первых чисел Фибоначчи и выведите его на экран.
     * Напоминаем, что первый и второй члены последовательности равны единицам,
     * а каждый следующий — сумме двух предыдущих.
     */
    public static void main(String[] args) {
        task6();
    }

    private static void task6() {
        int[] array = new int[20];
        int firstValue = 1;
        int temp = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = firstValue;
            firstValue += temp;
            temp = array[i];
        }

        System.out.println(Arrays.toString(array));
    }
}
