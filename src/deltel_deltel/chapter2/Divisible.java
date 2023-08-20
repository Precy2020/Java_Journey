package deltel_deltel.chapter2;

import java.util.Scanner;

public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();
        if (number % 3 == 0){
            System.out.println("Congrats dear the Number you inputted is divisible by 3");
        }
        else{
            System.out.println("Ops sorry not divisible by 3");
        }
    }
}
