package Diary;

public class Diary {
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
}
