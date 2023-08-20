package deltel_deltel.chapter2;

import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int square = (int) Math.pow(firstNumber, 2);
        int square2 = (int) Math.pow(secondNumber, 2);
        System.out.println("The square of number one and two is " + square + ", " + square2);
        int sum = square + square2;
        System.out.println("The sum of the both squares is " + sum);
        int difference = square - square2;
        System.out.println("The difference of the both squares is " + difference);


    }
}
