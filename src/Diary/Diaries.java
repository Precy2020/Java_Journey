package Diary;

import java.util.ArrayList;

public class Diaries {
    private static ArrayList<Diary> diaries = new ArrayList<>();

    public void add(String username, String password){
        Diary diary = new Diary(username, password);
        diaries.add(diary);

    }
    public Diary findByUsername(String username){
        for (Diary search: diaries) {
            if (search.getUsername().equals(username)){
                return search;
            }
        }
        return null;
    }

     public void deleteDiary(String username, String password){
         diaries.removeIf(collections -> collections.getUsername().equals(username) && collections.getPassword().equals(password));
     }
}
