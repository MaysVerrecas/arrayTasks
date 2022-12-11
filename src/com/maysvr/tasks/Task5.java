package com.maysvr.tasks;


public class Task5 {
    /**
     * Создайте 2 массива из 5 случайных целых чисел из отрезка [0;5] каждый,
     * выведите массивы на экран в двух отдельных строках.
     * Посчитайте среднее арифметическое элементов каждого массива и сообщите,
     * для какого из массивов это значение оказалось больше (либо сообщите, что их средние арифметические равны).
     */
    public static void main(String[] args) {
        task5();
    }

    private static void task5() {
        int[] array1 = {2,4,3,3,2};
        int[] array2 = {2,3,4,0,3};

        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < array1.length; i++) {
            sum1 += array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            sum2 += array2[i];
        }

        double midle1 = sum1*1./array1.length;
        double midle2 = sum2*1./ array2.length;

        System.out.println(midle1 + " " + midle2);

        if (midle1 > midle2) {
            System.out.println("Среднее арифметическое первого массива больше");
        } else if (midle1 == midle2) {
            System.out.println("Средние арифметические массивов равны");
        } else {
            System.out.println("Среднее арифметическое второго массива больше");
        }
    }
}
