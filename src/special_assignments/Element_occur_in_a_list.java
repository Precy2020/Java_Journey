package special_assignments;

import java.util.Arrays;

public class Element_occur_in_a_list {
    public static void main(String[] args) {
        int[] number = {30, 49, 46, 68, 29};
        System.out.println(Arrays.toString(element(number)));
    }

    public static String[] element(int [] number){
       String done = String.valueOf(4);
        for (int count = number.length; count <= 1; count++) {
                done = Arrays.toString(number);
        }


       return new String[]{done};

    }

    }
