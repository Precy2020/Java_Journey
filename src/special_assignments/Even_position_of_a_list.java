package special_assignments;

import java.util.Arrays;

public class Even_position_of_a_list {
    public static void main(String[] args) {
        int[] number = {30, 49, 46, 68, 29};
        System.out.println(Arrays.toString(oddIndex(number)));

    }

    public static int[] oddIndex(int [] number) {
        int count = 0;
        for (; count <= number.length;  count++) {
            if (count % 2 == 0) {

            }
        }
        return new int[]{count};
    }
}
