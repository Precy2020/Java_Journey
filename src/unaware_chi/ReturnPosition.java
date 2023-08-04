package unaware_chi;

import java.util.Arrays;

public class ReturnPosition {
    public static void main(String[] args) {
        ReturnPosition ReturnPosition = new ReturnPosition();
        ReturnPosition.setPosition();

    }


    public void setPosition() {
        int[] number = {5, 18, 32, 3, 4};
        int[] numberPosition = new int[5];

        for (int index = 0; index < number.length; index++) {
            for (int index2 = 0; index2 < numberPosition.length; index2++) {
                if (index > index2) {
                for (int index3 = 1; index3 < 5; index3++) {
                        numberPosition[index2] = index3;
                    }
                }
            }
        }

        System.out.print(Arrays.toString(numberPosition));
    }

}







