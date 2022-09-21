package com.company;

import javax.xml.transform.Result;
import java.awt.*;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Massive3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите колличество чисел");

        int count = in.nextInt();
        int[] array = new int[count];
        for (int i = 0; i < count; i++) {
            System.out.println("Введите число номер " + i);
            array[i] = in.nextInt();
        }
        printResult(array);
    }
    private static void printResult(int[] array) {

        for (int index = 0; index < array.length; index++) {
            if (array[index] % 3 == 0)
                System.out.println(array[index]);
        }
    }
}
