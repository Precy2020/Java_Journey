package training_ground;

import java.util.Arrays;

public class Float_Array {

    public static void main(String[] args) {
        double[] joy = new double [8];

        for (int praise = 0; praise < joy.length; praise++) {

            joy[praise] = 7;
        }
        System.out.println(Arrays.toString(joy));


        double sum = 0;
        for (int praise = 0; praise < joy.length; praise++) {

            if(praise % 2 != 0){
                joy[praise] = (7 - 1.5);

            }
        }
        System.out.println(Arrays.toString(joy));

        for (int praise = 0; praise < joy.length; praise++) {
            if (praise % 2 == 0) joy[praise] += 2.3;
            if (praise == 0) joy[praise] -= 4.7;
            if (praise == joy.length - 1 ) joy[praise] -= 4.7;

        }
        System.out.println(Arrays.toString(joy));
    }
}