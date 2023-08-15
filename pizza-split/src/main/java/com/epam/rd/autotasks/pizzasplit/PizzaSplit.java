package com.epam.rd.autotasks.pizzasplit;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner = new Scanner(System.in);
        // Use Scanner methods to read input
        int countPeople = scanner.nextInt();
        int countPiece = scanner.nextInt();
        int countPieceNeed=countPiece;
        int countPizza=1;
        while (countPieceNeed % countPeople != 0) // условие входа в цикл (бесконечный цикл, пока не выполнится условия выхода)
        {
            countPizza++;
            countPieceNeed=countPieceNeed+countPiece;
        }
        System.out.println(countPizza);
    }
}
