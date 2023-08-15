package com.epam.rd.autotasks.arrays;
//Перейдите в класс LocalMaximaRemove и реализуйте метод removeLocalMaxima.
//        Правильная реализация должна получить массив значений типа int и вернуть копию данного массива со всеми удаленными локальными максимумами. Исходный массив изменять нельзя.
//        Локальный максимум — это элемент, который больше любого из его соседних элементов. Вам необходимо удалить элементы, которые являются локальными максимумами в исходном массиве.
//        Подробности:
//        Размер данного массива гарантированно больше 1.
//        Данный массив гарантированно не равен null.
//        Если у массива нет локальных максимумов, то вы должны вернуть его копию без изменений.
//        Вы можете использовать методы java.util.Arrays.*.
import java.util.Arrays;
public class LocalMaximaRemove {
    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};
        System.out.println(Arrays.toString(removeLocalMaxima(array))); //выводит в виде строки
    }
    public static int[] removeLocalMaxima(int[] array){
        int CountLocalMax=0; // кол-во локальных максимумов
        int[] arrayInt = new int[array.length]; // объявили ссылку и выделили память под промежуточный массив
        int j=-1;
        for (int i=0;i<array.length;i++) { //от 0 до 6
            if ((i == 0 && array[i]>array[i + 1]) ||
                    (i == array.length - 1 && array[i]>array[i - 1])  ||
                    (i >0 && i<array.length - 1 && array[i]>array[i - 1]  && array[i]>array[i+1] )) {
                CountLocalMax++;
            } else {
                j=j+1;
                arrayInt[j] = array[i];
            }
        }
        if (CountLocalMax==0) {
            int[] array2 = Arrays.copyOf(array, array.length);
            return array2;
        } else {
            int[] array2 = Arrays.copyOf(arrayInt, (array.length - CountLocalMax));
            return array2;
        }
//        throw new UnsupportedOperationException();
    }
}
