package com.epam.rd.autotasks.godutch;
//Дано следующее условие: компания друзей посещает ресторан. Они решили разделить счет поровну и добавить 10 процентов от общей суммы счета в качестве чаевых. Далее друзья равными частями покрывают общую сумму платежа.
//
//        Перейдите в класс GoDutch и напишите программу, которая считывает общую сумму счета и количество друзей, а затем выводит размер части оплаты.
//
//        Рассмотрим некоторые детали:
//
//        Программа должна читать данные из System.in
//        Общая сумма счета не может быть отрицательной. Если введенное значение отрицательное, программа останавливается и печатает: Bill total amount cannot be negative
//        Количество друзей не может быть отрицательным или нулевым. Если такое происходит, то программа останавливается и выводит: Number of friends cannot be negative or zero
//        Общая сумма счета, количество друзей и часть к оплате являются целыми числами.
import java.util.Scanner;

    public class GoDutch {
        public static void main(String[] args) {
            //Write code here
            Scanner scan = new Scanner(System.in);
 //           System.out.println("Введите сумму счета");
            int summ_schet = scan.nextInt();

            if (summ_schet<0) {
                System.out.println("Bill total amount cannot be negative");
                return;
            } else
            {
//                System.out.println("Введите кол-во друзей");
                int count_friend = scan.nextInt();
                if (count_friend <= 0)
                {
                    System.out.println("Number of friends cannot be negative or zero");
                    return;
                } else {
                    //               int summ_friend =  (int)((summ_schet / count_friend)+(summ_schet / count_friend)*10/100);
                    int summ_friend =  (int)((summ_schet +(summ_schet*0.1))/count_friend);

//                    System.out.println("Сумма для оплаты с каждого друга: "+summ_friend);
                        System.out.println(summ_friend);

                }
            }
        }
    }
