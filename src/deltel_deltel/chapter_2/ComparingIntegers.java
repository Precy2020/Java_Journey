package deltel_deltel.chapter_2;
import java.util.Scanner;
public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int number = input.nextInt();
        int sumOfNumberAndSquare = number + (number * number);
        System.out.println("Sum of Number And Square is: " + sumOfNumberAndSquare);

        if(sumOfNumberAndSquare > 100) {
            System.out.println("The number is Greater than 100");
        }

        if(sumOfNumberAndSquare == 100) {
            System.out.println("The number is equal to than 100");
        }

        if(sumOfNumberAndSquare != 100) {
            System.out.println("The number is not equal to 100");
        }

        if(sumOfNumberAndSquare < 100) {
            System.out.println("The number is less than 100");
        }
    }
}
