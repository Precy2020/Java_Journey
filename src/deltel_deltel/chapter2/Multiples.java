package deltel_deltel.chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two number ");
        int firstNumber = input.nextInt();
        int secondNumber = input.nextInt();
        int firstNumberTripled = firstNumber * 3;
        int secondNumberDoubled = secondNumber * 2;
        if (firstNumberTripled % secondNumberDoubled == 0){
            System.out.println(firstNumberTripled + " is the multiple of " + secondNumberDoubled);
        }
        else{
            System.out.println(firstNumberTripled + " is not the multiple of " + secondNumberDoubled);
        }
    }
}
