package hacker_rank;

import java.util.ArrayList;

public class BackSpace {
    private static ArrayList <String> myList = new ArrayList<>();
    
    private static void backspace(String s, String t) {
        StringBuilder myString = new StringBuilder(" ");
        StringBuilder myString2 = new StringBuilder(" ");
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < t.length(); j++) {
                myString.append(i);
                myString2.append(j);}            
        }

        if (myString.equals("#")) {

        }
    }
      
    }

