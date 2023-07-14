package unaware_chi;

import java.util.Scanner;

public class ValidInputSum {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int sum = 0;
        for (int joy = 1; joy <= 10; ){
        System.out.print(">>> ");
        int score = key.nextInt();

        if (score >= 0 && score <= 100 ) {
            sum = score + sum;
            joy++;
        }
        else{
            System.out.println("Invalid input");
        }

        }
        System.out.println("Sum: "+" "+sum);
}
}


