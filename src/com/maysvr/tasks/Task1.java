package com.maysvr.tasks;

public class Task1 {
    /**
     * Создайте массив из всех чётных чисел от 2 до 20
     * и выведите элементы массива на экран сначала в строку,
     * отделяя один элемент от другого пробелом,
     * а затем в столбик (отделяя один элемент от другого началом новой строки).
     * Перед созданием массива подумайте, какого он будет размера.
     */
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {
        int n = 20;
        int step = 2;
        int counter = 0;
        for (int i = step; i <= n; i += step) {
            counter ++;
        } // определяем длинну массива

        int[] array = new int[counter];

        for (int i = 0; i < array.length; i++) {
            array[i] = step;
            step += 2;
            System.out.print(array[i] + " ");
            // заполнили и вывели массив в строку
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


}

