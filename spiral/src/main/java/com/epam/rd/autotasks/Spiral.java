package com.epam.rd.autotasks;
class Spiral {
    public static void main(String[] args) {
        int[][] spiral = Spiral.spiral(3, 4);
        for (int i = 0; i < spiral.length; i++) {
            for (int j = 0; j < spiral[i].length; j++) {
                System.out.print(String.format("%4s", spiral[i][j]));
            }
            System.out.println();
        }
    }
    //Возвращает двумерный массив в виде таблицы, содержащий числа от 1 до rows * columns. Размер таблицы будет определяться заданными параметрами.
//Числа заполняют "таблицу" по часовой стрелке от верхнего угла по спирали.
    static int[][] spiral ( int rows, int columns){
        int[][] arr = new int[rows][columns];

        int num = 1;
        int max = rows * columns;

        int rmin = 0, rmax = rows - 1;
        int cmin = 0, cmax = columns - 1;

        while (num <= max) {
            // проход влево по верхней строке, инкремент столбцов
            for (int i = cmin; num <= max && i <= cmax; i++) {
                arr[rmin][i] = num++;
            }
            rmin++;
            // проход вниз по правому краю, инкремент строк
            for (int i = rmin; num <= max && i <= rmax; i++) {
                arr[i][cmax] = num++;
            }
            cmax--;
            // проход вправо по нижней строке, декремент столбцов
            for (int i = cmax; num <= max && i >= cmin; i--) {
                arr[rmax][i] = num++;
            }
            rmax--;
            // проход вверх по левому краю, декремент строк
            for (int i = rmax; num <= max && i >= rmin; i--) {
                arr[i][cmin] = num++;
            }
            cmin++;
        }
        return arr;
//            return null;
    }


}