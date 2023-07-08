package assignments.tdd;

public class AirCondition {


    private boolean isOn;
    private int temperature;

    public AirCondition() {
    }

    public boolean getIsOn() {
        return isOn;
    }


    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }


    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature(int value) {
        if (temperature + value > 30) {
            temperature = 30;
        } else {
            temperature = temperature + value;}
    }

    public void decreaseTemperature(int value) {
        if (temperature - value < 16) {
            temperature = 16;
        } else {
            temperature = temperature - value;
        }
    }
}

