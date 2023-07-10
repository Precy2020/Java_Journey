package liang.chapter_3;

import java.util.Scanner;

public class Quadratic_Equations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Number for a, b, c: ");
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double third = scanner.nextDouble();
        double discriminant = (second * second) - (4 * first * third);
        double r1 = (-second + (Math.pow(discriminant, 0.5)) / (2 * first));
        double r2 = (-second - (Math.pow(discriminant, 0.5)) / (2 * first));


        if (discriminant > 0 ){
            System.out.println("The equation has two roots "+ r1 + " "+ "and"+ " " + r2);
        }
        else if (discriminant == 0){
            System.out.println("The equation has one root" + r1);
        }
        else{
            System.out.println("This equation has no real root");
        }


    }
}
