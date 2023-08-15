package com.epam.rd.autotasks.max;
import java.util.Arrays;
//public class MaxMethod {
//
//    public static int max(int[] values) {
//        throw new UnsupportedOperationException();
//    }
//}


public class MaxMethod {
    public static void main(String[] args) {
        int[] vals = new int[]{ -2, 0, 10, 5 };
        // Вызов метода max () для получения максимального значения
        int max=max(vals);
        System.out.println(max);
    }
    //здесь находим максимум
    public static int max(int[] values) {
        int maxValue = values[0];
//        for(int i=1;i < values.length;i++) {
//            if (values[i] > maxValue) {
//                maxValue = values[i];
//            }
//        }

//        or

        for (int values_iz_massiv : values) {
            if (maxValue < values_iz_massiv) {
                maxValue = values_iz_massiv;
           }
        }

        return maxValue; //возвращаемое макс.значение
    }

}