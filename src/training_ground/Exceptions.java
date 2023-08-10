package training_ground;

import java.util.Scanner;

public class Exceptions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Enter two numbers  ");
            int b = input.nextInt();
            int a = input.nextInt();
            int result = a / b;
            System.out.println(result);
        } catch (Exception exception){
            System.out.println("Not valid!!! ");
        }

        finally {
            System.out.println("You are great! ");
        }

    }
}
