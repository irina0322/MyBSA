package com.epam.training.student_iryna_filatava;

import java.util.Scanner;

public class BSA {
    public static void main(String[] args) {
        //ввод имени
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan1.nextLine();
        //ввод роста
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter your hight: ");
        int hight = scan2.nextInt();
        //ввод веса
        Scanner scan3 = new Scanner(System.in);
        System.out.print("Enter your weight: ");
        int weight = scan3.nextInt();
        //Рассчет BSA
        int bsa = (hight + weight - 60);
        int x = bsa/100;
        int y = bsa%100;
        //вывод итог
        System.out.print("Hello, " + name + ", your BSA is " + x + "." + y + " m2. Have a nice day!");

    }
}
