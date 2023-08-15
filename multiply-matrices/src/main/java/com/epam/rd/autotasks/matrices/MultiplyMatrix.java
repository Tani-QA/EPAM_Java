package com.epam.rd.autotasks.matrices;
import java.util.Arrays;
public class MultiplyMatrix {
    public static void main(String[] args) {
        System.out.println("Test your code here!\n");
        // Get a result of your code
//        int[][] a = {
//                {0, 12345},
//                {4509, 0},
//                {3, 567} };
//
//        int[][] b = {
//                {653, 0, 25353},
//                {0, 61, 6} };

        int[][] a = {{1, 2, 3},
                {4, 5, 6} };

        int[][] b = {{7 , 8},
                {9 , 10},
                {11, 12}};

        int[][] result = multiply(a, b);
//        Arrays.deepToString() - преобразует ссылки на элемента 2х мерного массива на его значения
//         .replace("],", "]\n") - выводит 2х мерный массив по строкам, как матрицу
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
//c11 = a11 · b11 + a12 · b21 + a13 · b31 = 1 · 7 + 2 · 9 + 3 · 11 = 7 + 18 + 33 = 58
//c12 = a11 · b12 + a12 · b22 + a13 · b32 = 1 · 8 + 2 · 10 + 3 · 12 = 8 + 20 + 36 = 64
//c21 = a21 · b11 + a22 · b21 + a23 · b31 = 4 · 7 + 5 · 9 + 6 · 11 = 28 + 45 + 66 = 139
//c22 = a21 · b12 + a22 · b22 + a23 · b32 = 4 · 8 + 5 · 10 + 6 · 12 = 32 + 50 + 72 = 154
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int rows2 = matrix2.length;
        int cols2 = matrix2[0].length;

        if (cols1 != rows2) {
            throw new IllegalArgumentException("Number of columns in A should be equal to number of rows in B");
        }

        int[][] result = new int[rows1][cols2];

        for (int i=0; i< rows1; i++) { //проход по строкам матрицы1
            for (int j=0; j< cols2; j++) { //проход по столбцам матрицы2
                for(int k=0; k<cols1; k++) { //проход по столбцам матрицы1 и строкам матрицы2
                    result[i][j] += matrix1[i][k]*matrix2[k][j]; //на каждой итерации - умножение элементов матрицы1 и матрицы2 и прибавление результата к матрице result
                }
            }
        }
        return result;
//        return null;
    }
}