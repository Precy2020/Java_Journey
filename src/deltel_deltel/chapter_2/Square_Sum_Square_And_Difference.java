package deltel_deltel.chapter_2;
import java.util.Scanner;

public class Square_Sum_Square_And_Difference {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter first Integer: ");
        int firstInteger = input.nextInt();

        System.out.print("Enter second Integer: ");
        int secondInteger = input.nextInt();

        int squares = firstInteger * firstInteger;
        System.out.println("The Square of the first number is: " + squares);

        int square =  secondInteger * secondInteger;
        System.out.println("The Square of the second number is: " + square);

        int sumOfSquares = squares + square;
        System.out.println("The of the square for integer one and two is: " + sumOfSquares);

        int difference = (firstInteger * firstInteger) - (secondInteger * secondInteger);
        System.out.println("The difference of the squares is: " + difference);

    }
}
