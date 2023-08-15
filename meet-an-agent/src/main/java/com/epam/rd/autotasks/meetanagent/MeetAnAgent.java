package com.epam.rd.autotasks.meetanagent;

//Перейдите в класс MeetAnAgent и напишите программу, которая:
//
//запрашивает на вход число-пароль
//если оно равно секретному числу, программа выводит: "Hello, Agent"
//в противном случае печатает: "Access denied".
//Секретный пароль хранится в final static int password.

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type

    public static void main(String[] args) {
        //ввод целого числа и вывод целого числа
        Scanner scan = new Scanner(System.in);
        //System.out.println("Введите пароль:");
        int number = scan.nextInt();  //ввод только целого числа для корретной работы метода

        if (number == PASSWORD)
        {
            System.out.println("Hello, Agent");
        } else {
            System.out.println("Access denied");
        }
    }
}
