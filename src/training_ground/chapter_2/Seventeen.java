package training_ground.chapter_2;
import java.util.Scanner;

public class Seventeen {
    public static void main(String[] args) {
        Scanner sweet = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int firstNumber = sweet.nextInt();
        System.out.print("Enter a number: ");
        int secondNumber = sweet.nextInt();
        System.out.print("Enter a number: ");
        int thirdNumber = sweet.nextInt();

        int sum = firstNumber + secondNumber + thirdNumber;
        System.out.println("Sum: " + sum );
        int average = firstNumber / secondNumber / thirdNumber;
        System.out.println("Average: " + average);
        int product = firstNumber * secondNumber * thirdNumber;
        System.out.println("Product: " + product);

        
    }
}
