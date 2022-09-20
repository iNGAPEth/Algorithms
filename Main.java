package com.company;

import java.awt.*;
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите ваше имя");

        String name = in.next();

        if(Objects.equals(name, "Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        } else {
            System.out.println("Нет такого имени");
        }
    }
}