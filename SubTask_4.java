package com.company;

import java.util.Scanner;

public class SubTask_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите количество аргументов:");
        int num = in.nextInt();
        int i;
        int[] array = new int[num];

        for(i = 0; i < array.length; ++i) {
            System.out.print("Введите целые числа:");
            array[i] = in.nextInt();
        }
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            sum += array[i];

        }
        System.out.print(sum);
    }
}
