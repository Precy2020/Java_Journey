package training_ground.chapter_2;

import java.util.Scanner;

public class ThirtyTwo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter five number: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();


        int positive = 0;
        int negative = 0;
        int zeros = 0;

        if(num1 < 0){
            negative = negative +1;
        } else if (num2 < 0) {
            negative = negative + 1;
        } else if (num3 < 0) {
            negative = negative + 1;
        } else if (num4 < 0) {
            negative = negative + 1;
        } else if (num5 < 0) {
            negative = negative + 1;
        }

        if(num1 > 0){
            positive = positive + 1;
        } else if (num2 > 0) {
            positive = positive + 1;
        } else if (num3 > 0) {
            positive = positive + 1;
        } else if (num4 > 0) {
            positive = positive + 1;
        } else if (num5 > 0) {
            positive = positive + 1;
        }

        if(num1 == 0){
            zeros = zeros + 1;
        } else if (num2 == 0) {
            zeros = zeros + 1;
        } else if (num3 == 0) {
            zeros = zeros + 1;
        } else if (num4 == 0) {
            zeros = zeros + 1;
        } else if (num5 == 0) {
            zeros = zeros + 1;
        }

        System.out.println("Negative number is: " + negative);
        System.out.println("Positive number is:" + positive);
        System.out.println("Zeros are: " + zeros);
    }
}
