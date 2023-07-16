package special_assignments;

import java.util.Arrays;

public class Reverse_A_List {
    public static void main(String[] args) {
        int [] list = {30, 49, 46, 28, 29};
     System.out.println(Arrays.toString(turn(list)));
    }

    public  static char[] turn (int [] list){

        String peace = " ";
        for (int counter = list.length - 1; counter >= 0; counter--){
            peace = String.valueOf(list[counter]);
        }
        return peace.toCharArray();
        }
    }



