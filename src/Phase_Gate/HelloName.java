package Phase_Gate;

import java.util.Scanner;

public class HelloName {
    public static void main(String[] args) {
       HelloName hello = new HelloName();
       hello.helloName();
    }

    public void helloName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String userName = input.next();
        
        System.out.println("Hello " + userName);
    }

}
