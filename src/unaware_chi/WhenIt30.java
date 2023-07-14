package unaware_chi;

import java.util.Scanner;

public class WhenIt30 {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int sum = 0;
        for (int joy = 1; joy <= 10; ){
            System.out.print(">>> ");
            int score = key.nextInt();

            if (score == 30) {
                System.out.println("next");
            }
            else{
                sum = score + sum;
                joy++;
            }

        }
        System.out.println("Sum: "+" "+sum);
    }
}


