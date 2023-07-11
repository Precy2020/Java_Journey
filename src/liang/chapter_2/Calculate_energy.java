package liang.chapter_2;

import java.util.Scanner;

public class Calculate_energy {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount of water in kilogram: ");


        double kilogram = input.nextDouble();
        System.out.print("Enter the initial temperature: ");
        double initial_temperature = input.nextDouble();
        System.out.print("Enter the final temperature: ");
        double final_temperature = input.nextDouble();

        double energy = kilogram * (final_temperature - initial_temperature) * 4184;
        System.out.printf("The energy needed is %.1f", energy);




    }
}
