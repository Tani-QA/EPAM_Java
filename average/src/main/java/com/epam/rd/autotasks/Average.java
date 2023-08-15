package com.epam.rd.autotasks;
//Перейдите в класс Average и напишите программу, которая считывает последовательность целочисленных значений из стандартного ввода и находит среднее значение.
//        Подробности:
//        Вы должны считывать значения последовательности, пока следующее не станет 0. Нулевое значение означает конец входной последовательности и не является ее частью.
//        Последовательность гарантированно содержит хотя бы одно значение.
//        Среднее значение также является целым числом. Используйте целочисленные операции.
import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int currValue = scanner.nextInt();
        int sumVallue=0;
        int count=0;
        sumVallue=sumVallue+currValue;
        while (true) // условие входа в цикл (бесконечный цикл, пока не выполнится условия выхода)
        {
            count++;
            currValue = scanner.nextInt();
            if(currValue==0) break;  //условие выхода из цикла
            sumVallue=sumVallue+currValue;
        }
//        System.out.println("sumVallue "+sumVallue);
//        System.out.println("count "+ count);
        int avgValue=sumVallue/count;
//        System.out.println("avgValue "+avgValue);
        System.out.println(avgValue);
    }
}