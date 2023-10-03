package diary;

import java.util.ArrayList;


public class Diary {
    private ArrayList<Entry> entries = new ArrayList<>();
    private String username;
    private String password;
    private boolean isLocked;


    public Diary(String userName, String password) {
        this.username = userName;
        this.password = password;
        this.isLocked = true;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }



    public boolean unlockDiary(String password) {
        validate(password);
           return isLocked;
    }

    private void validate(String password) {
        if (this.password.equals(password))
            isLocked = false;
    }


    public boolean locked(){
        return isLocked;
    }

    public void createEntry(String title, String body){
        Entry entry = new Entry(title, body);
        entries.add(entry);

    }

    public void deleteEntry(int id){
        if(findEntryById(id) != null)
            entries.remove(id);
        else
            throw new NullPointerException("there's nothing here");
    }

    public Entry findEntryById(int id){
        for (Entry entry: entries) {
            if(entry.findEntryById(id) == id)
                return entry;
        }
        throw new NullPointerException("there's nothing here!");
    }





    public void updateEntry(int id, String title, String body){
        for (Entry entry: entries) {
            entry.updateEntry(id, title, body);
        }
     }




}



