package Diary;

import java.util.ArrayList;
import java.util.Objects;

public class Diaries {
    private static ArrayList<Diary> diaries = new ArrayList<>();

    public void add(String username, String password){
        Diary diary = new Diary(username, password);
        diaries.add(diary);

    }
    public Diary findByUsername(String username){
        for (Diary search: diaries) {
            if (search.getUserName().equals(username)){
                return search;
            }
        }
        return null;
    }
}
