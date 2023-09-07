package RegEx;

import java.util.regex.Pattern;

public class RegularExpression {

    public static void main(String[] args) {
        Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$");
    }
}
