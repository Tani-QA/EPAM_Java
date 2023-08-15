package com.epam.rd.autotasks.matrices;
import java.util.Arrays;
//Перейдите в класс TransposeMatrix и реализуйте метод multiply.
//Метод принимает в качестве параметра прямоугольный целочисленный массив (матрицу) и возвращает его транспонированным.
//Рассмотрим целочисленную матрицу, представленную в виде прямоугольного массива. Задача состоит в том, чтобы транспонировать ее по главной диагонали.
//Результат транспонирования матрицы – это перевернутая по главной дагонали версия исходной матрицы.
public class TransposeMatrix {
    public static void main(String[] args) {
//        System.out.println("Test your code here!\n");
        // Get a result of your code
        int[][] matrix = {
                {1, 2},   // 1 7
                {7, -13} };  // 2 -13

//        int[][] matrix ={
//                {0, 1, 2},
//                {3, 4, 5},
//                {6, 7, 8}
//        };

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
    public static int[][] transpose(int[][] matrix) {
        //Put your code here
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[][] trasposedMatrix = new int[columns][rows];
        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                trasposedMatrix[j][i]=matrix[i][j];
            }
        }
        return trasposedMatrix;
//        return null;
    }
}
