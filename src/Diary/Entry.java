package Diary;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;

    public Entry( String title, String body) {
        this.title = title;
        this.body = body;

    }

    public void createEntry(String title, String body){

    }

    public void deleteEntry(int id){

    }
    public int findEntryById(int id){
        if(this.id == id)
          return id;
        else
            throw new IllegalArgumentException("Invalid");
        }
    public void updateEntry(int id, String title, String body){

    }


}
