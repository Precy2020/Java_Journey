package liang.chapter_2;

import java.util.Scanner;

public class ConvertPoundsToKilograms {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number in pounds: ");
        double pounds = scanner.nextDouble();
        double kilograms = pounds * 0.454;
        System.out.println(pounds + " " + "is" + " " + kilograms + " " + "kilograms");

    }
}

