package com.OneDimensionalArray;

import static java.lang.System.*;

public class Main {

    public static void main(String[] args) {
        int[] array;
        array = new int[]{12, 3, 5, 7, 13, -1, -5};
       int min;
        min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (min > Math.abs(array[i]))
                min = (array[i]);
            System.out.print(array[i]+" ");

    }
        System. out.println(" ");
        System.out.println("Найменьше значення массиву, найблише до 0:  "+min);

    }
}
