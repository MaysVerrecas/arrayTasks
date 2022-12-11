package com.maysvr.tasks;

public class Task8 {
    /**
     *Создайте массив из 12 случайных целых чисел из отрезка [-15;15].
     *Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
     */
    public static void main(String[] args) {
        int[] array = {2,3,-4,-12,0,4,7,9,12,1,-11,10,2,3,6};
        getMaxValue(array);

    }

    private static void getMaxValue(int[]array) {
        int maxValue = Integer.MIN_VALUE;
        int maxValueIndex = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maxValue) {
                maxValue = array[i];
                maxValueIndex = i;
            }
        }
        System.out.println("Максимальное значение в массиве : " + maxValue);
        System.out.println("Индекс максимального значения(последний вход) : " + maxValueIndex);
    }
}
