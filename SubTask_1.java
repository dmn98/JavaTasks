package com.company;
import java.util.Scanner;

public class SubTask_1 {
    public Main() {
    }

    public static void main(String[] args) {
        System.out.println("Как Вас зовут? ");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Здравствуйте, " + name);
    }
}