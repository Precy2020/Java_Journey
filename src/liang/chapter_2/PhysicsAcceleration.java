package liang.chapter_2;

import java.util.Scanner;

public class PhysicsAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter v0, v1 and t: ");

        double velocity0 = input.nextDouble();
        double velocity1 = input.nextDouble();
        double time = input.nextDouble();

        double acceleration = (velocity1 - velocity0) / time;
        System.out.printf("The average acceleration is %.4f", acceleration);




    }
}
