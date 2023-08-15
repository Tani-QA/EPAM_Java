package com.epam.rd.autotasks;
//Для заданных коэффициентов квадратного уравнения (ax² + bx + c = 0), верните один или два корня уравнения, если они существуют в области действительных чисел.
//        Входное значение задается через System.in. Выходное значение должно быть напечатано в System.out.
//        Формат вывода:
//        "x₁ x₂" (два корня в любом порядке, разделенные пробелом), если есть два корня
//        "x" (просто значение корня), если есть единственный корень
//        "no roots" (просто строковое значение "без корней"), если корня нет.
//        Параметр a гарантированно не равен нулю.
//        В помощь: Квадратное уравнение
import java.util.Locale; //позволяет учесть особенности региональных представлений алфавита, символов, чисел и дат.
import java.util.Scanner;

//import static java.lang.Math.sqrt;
import java.lang.Math;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double D = b*b - 4*a*c; //вычисление дискриминанта

        if (D<0) { //корней нет
            System.out.println("no roots");
        }
        else if (D==0) { //1 корень
            double x = -b/2*a;
            System.out.println(x);
        } else //2 корня
        {
            double x1 = (-b+(Math.sqrt(D)))/(2*a);  //корень 1
            double x2 = (-b-(Math.sqrt(D)))/(2*a);  //корень 2
            System.out.println(x1 +" " + x2);
        }
    }
}