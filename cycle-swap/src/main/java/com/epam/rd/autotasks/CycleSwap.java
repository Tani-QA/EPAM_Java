package com.epam.rd.autotasks;
import java.util.Arrays;
class CycleSwap {
    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 7, 4};
        CycleSwap.cycleSwap(array);
        System.out.println(Arrays.toString(array));
        CycleSwap.cycleSwap(array, 5);
        System.out.println(Arrays.toString(array));
    }
    //Сдвигает все элементы в данном массиве вправо на 1 позицию.
//В этом случае последний элемент массива становится первым.
//Например, 1 3 2 7 4 становится 4 1 3 2 7.
    static void cycleSwap(int[] array){
//        if (array.length>0){  //работает с циклом
//            int lastValue= array[array.length-1];
//            for (int i = array.length-1; i>0; i--){
//                array[i] = array[i-1];
//             }
//            array[0]=lastValue;
//        }

        if (array.length>0){  //работает без цикла
            int lastValue= array[array.length-1];
            System.arraycopy(array, 0, array, 1, array.length - 1); // 1 1 3 2 7
            array[0]=lastValue; // 4 1 3 2 7
        }
//         cycleSwap(array, 1); //вызов функции с шагом, когда реализация алгоритма там, а здесь нет
    }

    //Сдвигает все элементы в заданном массиве вправо на shift позиций.
//Гарантируется, что значение сдвига неотрицательное и не больше длины массива.
//Например, 1 3 2 7 4 со сдвигом 3 становится 2 7 4 1 3.
    static void cycleSwap(int[] array, int shift) {
//        if(array.length > 0){ //работает с циклом
//            for(int i = 0; i < shift; i++){
//                int lastElement = array[array.length-1];
//                for(int j = array.length-1;j>0;j--){
//                    array[j] = array[j-1];
//                }
//                array[0] = lastElement;
//            }
//        }
        for (int i = 0; i < shift; i++) {
            cycleSwap(array); //вызов функции без шага, когда реализация алгоритма там, а здесь нет
        }
    }
}
