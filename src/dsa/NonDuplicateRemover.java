package dsa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NonDuplicateRemover {
    public static void main(String[] args) {
        removeIfNotDuplicate();
    }


    public static void removeIfNotDuplicate(){
        String challenge = "abcd.135\tuvqz.7\ttzik.999\n";
        Pattern pattern = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s ");
        Matcher matcher = pattern.matcher(challenge);
        while (matcher.find()){
            System.out.println(matcher.group(1));
            }
        }

}


