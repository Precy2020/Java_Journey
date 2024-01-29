package set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

    public static void main(String[] args) {
        String[] words = {"a", "g", "a", "g", "l"};

        Set<String> word = new HashSet<>(Arrays.asList(words));
        System.out.println(word);
    }
}
