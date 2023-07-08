//2.17 (Arithmetic, Smallest and Largest) Write an application that inputs three integers from the
//        user and displays the sum, average, product, smallest and largest of the numbers. Use the techniques
//        shown in Fig. 2.15. [Note: The calculation of the average in this exercise should result in an integer
//        representation of the average. So, if the sum of the values is 7, the average should be 2, not
//        2.333
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
