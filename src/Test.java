import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        String[] studentList = {"male","female","male","female","male","male","male","female","female","male","male","male"};
        String[][] result = new String[2][2];
        int maleTotal = (0);
        int femaleTotal = (0);
        for (int i = 0; i < studentList.length; i++) {
            if (studentList[i].equalsIgnoreCase("male")){
                result[0][0] = "male";
                maleTotal++;
                result[0][1] = maleTotal+" ";
            }
            if (studentList[i].equalsIgnoreCase("female")){
                result[1][0] = "female";
                femaleTotal++;
                result[1][1] = femaleTotal+" ";
            }
        }
        System.out.println(Arrays.deepToString(result));
    }
}
