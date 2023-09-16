package Diary;

import java.time.LocalDateTime;

public class Entry {
    private int id;
    private String title;
    private String body;
    private LocalDateTime dateCreated;


    public Entry(String title, String body) {
        this.title = title;
        this.body = body;

    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }


    public String getBody() {
        return body;
    }


    public int getId() {
        return id;
    }

    public void setDateCreated(LocalDateTime dateCreated) {
        this.dateCreated = dateCreated;
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
