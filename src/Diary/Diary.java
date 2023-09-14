package Diary;

import java.util.ArrayList;


public class Diary {
    private ArrayList<Entry> entries = new ArrayList<>();
    private String userName;
    private String password;
    private boolean isLocked;


    public Diary(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void unlockDiary(String password) {
        if (this.password.equals(password)){
            isLocked = false;
        }
    }

    public void locked(){
    }




    public void createEntry(String title, String body){
        Entry entry = new Entry(title, body);
        entries.add(entry);

    }
    public void deleteEntry(int id){
        if(findEntryById(id) != null)
            entries.remove(id);
    }

    public Entry findEntryById(int id){
        for (Entry entry: entries) {
            if(entry.findEntryById(id) == id)
                return entry;
        }
             return null;
    }

    public void updateEntry(int id, String title, String body){
        findEntryById(id).setId(id);
        findEntryById(id).setTitle(title);
        findEntryById(id).setBody(body);

    }


}
