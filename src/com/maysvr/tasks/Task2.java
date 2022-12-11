package com.maysvr.tasks;

public class Task2 {
    /**
     * Создайте массив из всех нечётных чисел от 1 до 99,
     * выведите его на экран в строку,
     * а затем этот же массив выведите на экран тоже в строку,
     * но в обратном порядке (99 97 95 93 … 7 5 3 1).
     */
    public static void main(String[] args) {
        task2();
    }

    private static void task2() {
        int n = 99;
        int step = 2;
        int counter = 1;
        int first = 1;

        for (int i = 1; i < n; i += step) {
            counter++;
        } // размер массива

        int[] array = new int[counter];

        for (int i = 0; i < array.length; i++) {
            array[i] = first;
            first += step;
        } //заполнили массив

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }
}
