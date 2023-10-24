package hacker_rank;

import java.util.Scanner;

public class LengthBreadth {
    public static void main(String[] args) {
      lengthAndBreadth();
    }

    private static void lengthAndBreadth(){
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int breadth = scanner.nextInt();
        if(length < 0){
            System.out.println(breadth);
        }
        else if(breadth <  0){
            System.out.println(breadth);
        }
        else{
            System.out.println("Breadth and height must be positive");
        }

    }
}
