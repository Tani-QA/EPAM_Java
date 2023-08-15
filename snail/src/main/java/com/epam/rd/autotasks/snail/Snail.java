package com.epam.rd.autotasks.snail;

import java.util.Scanner;

public class Snail
{
    public static void main(String[] args)
    {
        //Write a program that reads a,b and h (line by lyne in this order) and prints
        //the number of days for which the snail reach the top of the tree.
        //a - feet that snail travels up each day, b - feet that slides down each night, h - height of the tree
        // 1 + (h-a) / (a-b)
        Scanner scan = new Scanner(System.in);         //считывание ввода  Это сообщает компилятору java, что ввод будет осуществляться через стандартный ввод (клавиатура).
    //    System.out.println("Введите кол-во фунтов, на которые улитка поднимается по дереву");
        int h_up = scan.nextInt();  //ввод только целого числа для корретной работы метода
     //   System.out.println("Введите кол-во фунтов, на которые улитка сползает по дереву");
        int h_down = scan.nextInt();  //ввод только целого числа для корретной работы метода
     //   System.out.println("Введите высоту дерева");
        int h_tree = scan.nextInt();  //ввод только целого числа для корретной работы метода

        int Count_day;

        if (h_tree<=h_up){
            Count_day=1;
//            System.out.println("Количества дней, которые потребуются улитке, чтобы добраться до вершины дерева: " +Count_day);
            System.out.println(Count_day);
        } else if ((h_up-h_down)<=0){
            System.out.println("Impossible");  //деление на 0
        } else {
            Count_day = 1 + (h_tree-h_up)/(h_up-h_down);
//            System.out.println("Количества дней, которые потребуются улитке, чтобы добраться до вершины дерева: " +Count_day);
            System.out.println(Count_day);
        }



    }
}