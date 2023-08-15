package com.epam.rd.autotasks.meetstrangers;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
 //   public static void main(String[] args) throws IOException {
        public static void main(String[] args)  {
        //Write a program, asks for a number - amount of strangers to meet.
        //Then reads stranger names line by line and prints line by line "Hello, ...".
        Scanner scan = new Scanner(System.in);         //считывание ввода  Это сообщает компилятору java, что ввод будет осуществляться через стандартный ввод (клавиатура).
//        System.out.println("Введите количество незнакомцев, с которыми нужно встретиться:");
        int number = scan.nextInt();  //ввод только целого числа для корретной работы метода
        scan.nextLine();
        if (number == 0 )        {
            System.out.println("Oh, it looks like there is no one here");
        } else if (number < 0 )        {
            System.out.println("Seriously? Why so negative?");
        } else        {
            for (int i=0;i<number;i++)
            {
                String name = scan.nextLine(); //считывание до пробела (конца строки \n)
                System.out.println("Hello, " +name);
            }
        }

    }
}