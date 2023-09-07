package Diary;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
    }

    private String body;
    private LocalDateTime dateCreated;

    public Entry( String title, String body) {
        this.title = title;
        this.body = body;

    }

    public int findEntryById(int id){
        if(this.id == id)
          return id;
        else
            throw new IllegalArgumentException("Invalid");
        }
    public void updateEntry(int id, String title, String body){
            this.id = id;
            this.title = title;
            this.body = body;
    }


}
