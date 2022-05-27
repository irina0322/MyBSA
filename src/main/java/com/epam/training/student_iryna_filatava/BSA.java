package com.epam.training.student_iryna_filatava;

import java.util.Scanner;

public class BSA {
    public static void main(String[] args) {
        //ввод имени
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name1 = scan1.nextLine();
        //ввод роста
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter your hight: ");
        int hight1 = scan2.nextInt();
        //ввод веса
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        int weight1 = scan3.nextInt();
        //Рассчет ППТ
        int bsa = (hight1 + weight1 - 60);
        int x = bsa/100;
        int y = bsa%100;
        //вывод итог
        System.out.print("Hello, " + name1 + ", your BSA is " + x + "." + y + " m2. Have a nice day!");

    }
}
