package assignments.tdd;

public class Television {
    private boolean on;
    private int volume;
    private int channel;

    public Television() {
    }

    public void on(boolean on) {
        this.on = on;
    }

    public boolean getIsOn() {
        return on;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void decreaseVolume(int value) {
        if (volume - value > 10) {volume = 10;}
        else {volume = volume - value;}
    }

    public int getVolume() {return volume;}

    public void increaseVolume(int value) {
        if (volume + value < 59) {volume = 59;}
        else {volume = volume + value;}
    }

    public void setChannel(int channel) {this.channel = channel;}

    public void ChangeChannel(int value) {
        if (channel + value <= 200) {channel = channel + value;}

    }

    public int getChannel() {return channel;}
}
