package deltel_deltel.chapter2;

import java.util.Scanner;

public class SmallestAndLargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.println("Sum is " + sum);
        int average = sum / 3;
        System.out.println("Average is " + average);
        int product = number1 * number2 * number3;
        System.out.println("Product is " + product);

        if (number1 > number2 && number1 > number3){
            System.out.println(number1 + " is the Largest number");
        }
        if (number2 > number1 && number2 > number3){
            System.out.println(number2 + " is the Largest number");
        }
        if (number3 > number1 && number3 > number2){
            System.out.println(number3 + " is the Largest number");
        }
        if (number1 < number2 && number1 < number3){
            System.out.println(number1 + " is the Smallest number");
        }
        if (number2 < number1 && number2 < number3){
            System.out.println(number2 + " is the Smallest number");
        }
        if (number3 < number1 && number3 < number2){
            System.out.println(number3 + " is the Smallest number");
        }
        

    }
}
