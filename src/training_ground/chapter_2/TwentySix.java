//2.26 (Multiples) Write an application that reads two integers, determines whether the first
//        number tripled is a multiple of the second number doubled, and prints the result. [Hint: Use the
//        remainder operator.]

package training_ground.chapter_2;

import java.util.Scanner;

public class TwentySix {
    public static void main(String[] args) {

        Scanner create = new Scanner(System.in);
        System.out.println("Hi! welcome dear :) you can input your first digit: ");
        int number_1 = create.nextInt();
        System.out.println("Hi! welcome dear :) you can input your second digit: ");
        int number_2 = create.nextInt();

        int tripled = number_1 * 3;
        int doubled = number_2 * 2;

        if (tripled % doubled == 0){
            System.out.println(tripled + " is divisible by " + doubled);
        }
        else {
            System.out.println("Jesus loves you but sha try again lera");
        }



    }
}
