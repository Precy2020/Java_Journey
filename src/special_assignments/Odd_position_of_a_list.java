package special_assignments;

import java.util.Arrays;

public class Odd_position_of_a_list {
    public static void main(String[] args) {
        int[] number = {30, 49, 46, 68, 29};
        System.out.println(Arrays.toString(oddIndex(number)));
    }



    public static int[] oddIndex(int [] number) {
        int odd = 0;
        for (int count = 1; count <= number.length; count++) {
            if (count % 2 == 0) {
                odd = number[count];
            }
        }
        return new int[]{odd};
    }



}

