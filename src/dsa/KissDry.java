package dsa;

import java.util.Scanner;

public class KissDry{

    public static void main(String[] args) {
        String initialString = "chukwuwike";
        int[] index = {9, 8, 5, 6, 4};
        display(checkStringIndex(initialString, index));

    }


    private static void display(String message) {
        System.out.println(message);
    }



    public static String checkStringIndex(String initialString, int[] index){

        StringBuilder output = new StringBuilder(" ");
        for (int indexes : index) {
            if (indexes >= 0 && indexes < initialString.length()){
                output.append(initialString.charAt(indexes));
            }
        }
            
        return output.toString();
    }




    
}