package unaware_chi;

import java.util.Scanner;

public class Add_Sum_and_Average_of_Score {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int sum = 0;
        for (int joy = 1; joy != -1; joy++){
            System.out.print(">>> ");
            int score = key.nextInt();
            if (score < 0){
                continue;
            }
            if (joy == 10){
            sum = score + sum;
            break;
            }

        }
        System.out.println("Sum: "+" "+sum);
    }
}


