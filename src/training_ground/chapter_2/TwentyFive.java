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
