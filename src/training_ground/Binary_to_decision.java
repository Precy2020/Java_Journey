package training_ground;

import java.util.Scanner;

public class Binary_to_decision {
    private static Scanner key = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(converter());

    }
    public static int converter(){
        int enter = key.nextInt();
        int [] input = new int [enter];
        int index = 2;
        for (; index <= input.length; index++) {
            input[index] = (int) Math.pow(input[index], index);
        }
        return input[index];
    }



}
