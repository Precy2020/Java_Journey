package training_ground;

import java.util.Arrays;

public class Array_Task {
    public static void main(String[] args) {

        Character[] peace = new Character[10];

        peace[9] = 'E';
        System.out.println(Arrays.toString(peace));

        for (int joy = 0; joy < peace.length; joy++){
            if (joy % 2 != 0){
                peace[joy] = 'A';
            }
        }
        System.out.println(Arrays.toString(peace));

        for (int joy = 0; joy < peace.length; joy++){
            if (joy % 2 == 0){
                peace[joy] = 'L';
            }
        }

        peace[2] = 'F';
        System.out.println(Arrays.toString(peace));

        for (int joy = 0; joy < peace.length; joy++){
            peace[joy] = '5';
        }
        System.out.println(Arrays.toString(peace));
    }
}
