package training_ground.chapter_2;

import java.util.Scanner;

public class Making_A_Diff_Two {
    public static void main(String[] args) {

        Scanner heart = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        int weight = heart.nextInt();
        System.out.println("Enter your height: ");
        int height = heart.nextInt();

       float bmi = (float) (weight * 703) / (height * height);
        System.out.println("BMI: " + bmi);

    }
}
