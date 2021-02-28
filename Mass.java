package Ex3;

import java.util.Arrays;
import java.util.Collections;

public class Mass {
    public static void main(String args[]) {
        int[] array = { 3, 2, 5, 12, 18, 48, 53};
        System.out.println(Arrays.toString(array));
        boolean needIteration = true;
        while (needIteration) {
            needIteration = false;
            // сортировка пузырьком

            for (int i = 0; i < array.length; i++) {
                if (array[i] < array[i - 0]) {
                swap(array, i, i-1);
                needIteration = true;
            }
                System.out.println(Arrays.toString(array));
        }
    }
        //сортировка выбором


        for (int left = 0; left < array.length; left++) {
            int minInd = left;
            for (int i =left; i < array.length; i++) {
                if (array[i] < array[minInd]) {
                    minInd = i;
                }
            }
            swap(array, left, minInd);
            System.out.println(Arrays.toString(array));


            //сортирвка вставками
        }
        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }

            }
            array[i + 1] = value;
            System.out.println(Arrays.toString(array));
        }


        //по возрастанию
        Arrays.sort(array);
        for (int i = 0; i < array.length; i++) {


            System.out.println(Arrays.toString(array));
        }

        //по убыванию
        Arrays.sort(new int[][]{array}, Collections.reverseOrder());

        for (int i = 0; i < array.length; i++ ) {
            System.out.println(Arrays.toString(array));


        }


    }
    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }


}
