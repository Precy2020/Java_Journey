package special_assignments;

import java.util.Arrays;

public class Element_occur_in_a_list {
    public static void main(String[] args) {
        int[] number = {30, 49, 46, 68, 29};
        System.out.println(Arrays.toString(element(number)));
    }

    public static int[] element(int [] number){
        int[] done = new int[]{0};
        for (int count = number.length; count <= 1; count++) {
            if (number[4] == 29){
                done = number;
        }

        }
     return done;

    }

    }
