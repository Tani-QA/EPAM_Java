package com.epam.rd.autotasks.sequence;
import java.util.Scanner;
//Перейдите в класс FindMaxInSeq и напишите программу, которая считывает последовательность целочисленных значений из стандартного вывода и находит максимальное из них. Вы должны поместить свое решение в метод max, чтобы пройти тесты.
//        Подробности:
//        Вы должны считывать значения последовательности, пока следующее не станет 0. Нулевое значение означает конец входной последовательности и не является ее элементом.
//        Последовательность гарантированно содержит хотя бы одно значение.
public class FindMaxInSeq {
    public static int max() {
        // Put your code here
        Scanner scan = new Scanner(System.in);
        int currValue = scan.nextInt();
        int maxVallue=currValue;
        while (true) // условие входа в цикл (бесконечный цикл, пока не выполнится условия выхода)
        {
            currValue = scan.nextInt();
            if(currValue==0) break;  //условие выхода из цикла
            if (currValue >= maxVallue ) {
                maxVallue = currValue;
            }
        }

        return maxVallue; //возвращаемое значение
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");
        // Get a result of your code
        FindMaxInSeq fm = new FindMaxInSeq();  //Вызов метода из другого класса
        System.out.println(max());  //печать возвращаемого значения

    }
}
