package Diary;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private List<Entry> entries = new ArrayList<>();
    private String userName;
    private String password;
    private boolean isLocked;

    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public void unlockDiary(String password) {
        if(this.password.equals(password))
           this.password = password;
    }

    public void lockDiary(){
        diaryIsLocked();
    }
    private boolean diaryIsLocked(){
        boolean  lock = this.isLocked();
        return true;
    }

    public boolean isLocked(){
        return isLocked;
    }

    public void createEntry(String title, String body){

    }
    public void deleteEntry(){

    }

//    public Entry findEntryById(int id){
//        for (Entry entry: entries) {
//            entry.findEntryById(id);
//        }
//
//    }

}
