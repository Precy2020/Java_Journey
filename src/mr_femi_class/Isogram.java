package mr_femi_class;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Isogram {
    private static String REGEX = "^[a-zA-Z]$";
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(isogram(input.next()));
        input.close();
    }


    public static boolean isogram(String string){
        boolean feedback = false;
        Pattern pattern = Pattern.compile(REGEX);
        for (int strings = 0; strings < string.length(); strings++) {
            if (REGEX.matches(String.valueOf(strings))) {
                feedback = true;
                break;
            }
        }
        return feedback;
    }



}
