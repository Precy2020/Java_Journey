package liang.chapter_3;


import java.util.Scanner;

public class UsingOperators {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        double number = key.nextDouble();

            System.out.println("Is 10 divisible by 5 and 6?"+" "+(number % 5 == 0 && number % 6 == 0));
            System.out.println("Is 10 divisible by 5 or 6?"+" "+(number % 5 == 0 || number % 6 == 0));
            System.out.println("Is 10 divisible by 5 or 6? but not both"+" "+((number % 5 == 0) ^ (number % 6 == 0)));

        }

    }
