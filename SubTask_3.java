package com.company;

import java.util.Scanner;

public class SubTask_3 {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество элементов массива: ");
        int num = in.nextInt();
        int[] array = new int[num];
        System.out.print("Элементы массива в одну строку: ");

        int i;
        for(i = 0; i < array.length; ++i) {
            array[i] = (int)Math.round(Math.random() * 10.0D);
            System.out.print(array[i] + " ");
        }

        System.out.println("\nЭлементы в столбик:");

        for(i = 0; i < array.length; ++i) {
            System.out.println(array[i]);
        }

    }
}