package classwork;

public class Time {


    private int minutes;
    private long year;
    private int seconds;


    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        if (minutes > 0) {seconds = 0;}
        return seconds;
    }

    public int getYear() {
        if (year < 525600) {year = 0;}
        return (int) year;
    }



    public int getDay() {
        if (minutes > 40){minutes = 0;}
        return minutes;
    }
}
