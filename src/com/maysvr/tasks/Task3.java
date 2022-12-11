package com.maysvr.tasks;

public class Task3 {
    /**
     *Создайте массив из 15 случайных целых чисел из отрезка [0;9].
     *  Выведите массив на экран. Подсчитайте сколько в массиве чётных элементов
     *  и выведете это количество на экран на отдельной строке
     */
    public static void main(String[] args) {
        task3();
    }

    private static void task3() {
        int[] array = {3,2,1,0,3,4,6,9,6,3,4,6,7,8};

        int counter = 0; // для счета четных чисел
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " "); // выводим массив
            if ( array[i] % 2 == 0) {
                counter++;
            }
        }
        System.out.println();
        System.out.println("Колличество четных элементов(включая 0) : " + counter);
    }
}
