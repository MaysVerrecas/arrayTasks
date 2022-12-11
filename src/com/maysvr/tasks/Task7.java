package com.maysvr.tasks;

public class Task7 {
    /**
     *
     * Создайте массив из 4 случайных целых чисел из отрезка [10;99],
     * выведите его на экран в строку. Определить и вывести на экран сообщение о том,
     * является ли массив строго возрастающей последовательностью.
     * xn ≤ xn+1 - строго возврастающая прогрессия
     */
    public static void main(String[] args) {
        int[] array = {2,3,1,6};
        if (task7(array) == true) {
            System.out.println("Последовательность строго возрастающая");
        } else {
            System.out.println("Последовательность не возрастающая");
        }

    }

    private static boolean task7(int[] array) {
        boolean flag = true;
        int temp = Integer.MIN_VALUE;

        for(int i = 0; i < array.length; i++) {
            if (array[i] < temp) {
                flag = false;
            }
            temp = array[i];
        }
        return flag;
    }
}
