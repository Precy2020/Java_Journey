package hacker_rank;

import java.util.Arrays;

public class FindZeros {
    public static void main(String[] args) {

        why(new int[]{4, 3, 0, 2, 0, 4, 10, 12});
    }



        public static void why(int[] arr) {
            int zeroIndex = -1;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 0) {
                    zeroIndex = i;
                    break;
                }
            }

            if (zeroIndex != -1) {
                for (int i = zeroIndex; i < arr.length - 1; i++) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            int secondZeroIndex = -1;
            for (int i = zeroIndex + 1; i < arr.length; i++) {
                if (arr[i] == 0) {
                    secondZeroIndex = i;
                    break;
                }
            }

            if (secondZeroIndex != -1) {
                for (int i = secondZeroIndex; i < arr.length - 1; i++) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }


    private static void spotZeros(int[] array){
        int temp;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                temp = array[i];
                array[i] = temp;
            }
        }
        System.out.println(Arrays.toString(array));
    }


}
