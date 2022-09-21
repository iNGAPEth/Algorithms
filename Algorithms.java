package com.company;

import java.util.Scanner;

public class Algorithms {

    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int number = in.nextInt();

        if (number > 7) {
            System.out.println("Привет");
        }
        else if (number <= 7) {
            System.out.println("Досвидания");
        }
    }
}
