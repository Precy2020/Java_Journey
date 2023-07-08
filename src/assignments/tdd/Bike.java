package assignments.tdd;

public class Bike {


    private boolean isOn;
    private int gear;

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;

    }

    public boolean getOn() {
        return isOn;
    }


    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getGear() {
        return gear;
    }

    public void accelerateGear(int value) {
        if (gear + value == 16) {
            gear = 16;
        } else {
            gear = gear + value;
        }
    }

    public void decelerateGear(int value) {
        if (gear - value == 14) {
            gear = 14;
        } else {
            gear = gear - value;
        }
    }
}