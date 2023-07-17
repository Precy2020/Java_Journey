package special_assignments;

import java.util.Arrays;

public class Reverse_A_List {
    public static void main(String[] args) {
        int [] list = {30, 49, 46, 28, 29};
        System.out.println(Arrays.toString(reversedArray(list)));

    }


    public static int [] reversedArray(int [] array){

        int [] reversedArray = new int[array.length];
        int n =0;

        for (int i = array.length-1; i >=0 ; i--) {
            reversedArray[n] = array[i];
            n++;
        }
        return reversedArray;
    }


    }



