//2.25 (Divisible by 3) Write an application that reads an integer and determines and prints
//        whether it’s divisible by 3 or not. [Hint: Use the remainder operator. A number is divisible by 3 if
//        it’s divided by 3 with a remainder of 0.]


package training_ground.chapter_2;

import java.util.Scanner;

public class TwentyFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a digit: ");
        int number = input.nextInt();

        if (number %3 == 0){
            System.out.print("It is divisible by 3");
        }
        else {
            System.out.println("It is not jaare!");
        }

    }
}
