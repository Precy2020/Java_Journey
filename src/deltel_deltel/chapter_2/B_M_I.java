package deltel_deltel.chapter_2;

import java.util.Scanner;

public class B_M_I {
    public static void main(String[] args) {

        Scanner heart = new Scanner(System.in);
        System.out.println("Enter your weight: ");
        double weight = (int)heart.nextDouble();
        System.out.println("Enter your height: ");
        double height = (int)heart.nextDouble();

       double bmi = (int)(weight * 703) / (height * height);
        System.out.println("BMI: " + bmi);

    }
}


