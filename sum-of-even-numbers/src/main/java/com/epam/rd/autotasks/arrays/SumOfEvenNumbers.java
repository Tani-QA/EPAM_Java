package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int[]vals = new int[]{-2,10,0,5};
//        int[]vals = new int[]{};
        int summ=sum(vals);         // Вызов метода max () для получения максимального значения
        System.out.println(sum(vals));
    }
    public static int sum(int[] array) {
//        throw new UnsupportedOperationException("Invalid operation for sorted list."); //выдает ошибку(); "java: unreachable statement"
//        throw new UnsupportedOperationException(); //выдает ошибку "java: unreachable statement"
        int summ = 0;
        if (array == null || array.length ==0) {
            return 0;
        } else
            for (int values_iz_massiv : array) {
                if (values_iz_massiv % 2 == 0) {
                    summ = summ + values_iz_massiv;
                }
            }
        return summ; //возвращаемое макс.значение
//        throw new UnsupportedOperationException("Invalid operation for change array" +array); //выдает ошибку "java: unreachable statement"
//        throw new UnsupportedOperationException("Invalid operation for change array");
//        throw new UnsupportedOperationException();
    }
}


//исходный код
/*
package com.epam.rd.autotasks.arrays;

public class SumOfEvenNumbers {

    public static void main(String[] args) {
        int[] array = new int[]{1, 3, 2, 8, 15, 199};

        System.out.println(sum(array));
    }

    public static int sum(int[] array){
        //put your code here
        System.out.println("привет");


        throw new UnsupportedOperationException();
    }
}
 */