package assignments.tdd;

import java.util.Scanner;

public class Testing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String list = input.next();
        var newList = 0;
        for (int l = 0; l < list.length(); l++){
           newList = Integer.parseInt(String.valueOf(list.charAt(l)));
            for (int i = 0; i < newList - 1; i--) {
                System.out.println(i);
            }
        }

    }
}
