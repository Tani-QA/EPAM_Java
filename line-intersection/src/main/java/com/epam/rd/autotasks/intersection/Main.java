package com.epam.rd.autotasks.intersection;

import java.util.Scanner;

public class Main { //класс
    public static void main(String[] args) { //1ый
        Scanner scanner = new Scanner(System.in);
        int k1 = scanner.nextInt();
        int b1 = scanner.nextInt();
        int k2 = scanner.nextInt();
        int b2 = scanner.nextInt();

        Line line1 = new Line(k1,b1); //(1,1)
        Line line2 = new Line(k2,b2); //(-1,3)
        System.out.println("result is " + line1.intersection(line2)); // (1;2)

    }

}