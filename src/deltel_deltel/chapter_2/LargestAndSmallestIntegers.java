package deltel_deltel.chapter_2;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {

        Scanner divisible = new Scanner(System.in);
        System.out.println("Input a num1: ");
        int num1 = divisible.nextInt();
        System.out.println("Input a num2: ");
        int num2 = divisible.nextInt();
        System.out.println("Input a num3: ");
        int num3 = divisible.nextInt();
        System.out.println("Input a num4: ");
        int num4 = divisible.nextInt();
        System.out.println("Input a num5: ");
        int num5 = divisible.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
            System.out.println("Num 1 is the largest!!!");
        }
        if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
            System.out.println("Num 2 is the largest!!!");
        }
        if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5){
            System.out.println("Num 3 is the largest!!!");
        }
        if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
            System.out.println("Num 4 is the largest!!!");
        }
        if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
            System.out.println("Num 5 is the largest!!!");
        }

        if (num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5){
            System.out.println("Num 1 is the smallest!!!");
        }
        if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
            System.out.println("Num 2 is the smallest!!!");
        }
        if (num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5){
            System.out.println("Num 3 is the smallest!!!");
        }
        if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
            System.out.println("Num 4 is the smallest!!!");
        }
        if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
            System.out.println("Num 5 is the smallest!!!");
        }
    }
}
