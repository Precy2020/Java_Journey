package assignments.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    AirCondition sony = new AirCondition();
    @Test
    public void ifAirConditionerIsOnTest () {
        sony.setIsOn(true);
        assertTrue(sony.getIsOn());

    }

    @Test
   public void ACIsAt16WhenIsOnTest () {
       sony.setIsOn(true);
      sony.setTemperature(16);
      assertEquals(16, sony.getTemperature());

    }

    @Test
    public void WhenIIncreaseTemperatureTest () {
        sony.setIsOn(true);
        sony.setTemperature(16);
        sony.increaseTemperature(5);
        assertEquals(21, sony.getTemperature());
    }

  @Test
  public void WhenIDecreaseTemperatureTest () {
        sony.setIsOn(true);
        sony.setTemperature(30);
        sony.decreaseTemperature(15);
        assertEquals(16, sony.getTemperature());
    }
   @Test
    public void WhenTemperatureIsAbove30AndBelow16Test (){
        sony.setIsOn(true);
        sony.setTemperature(30);
        sony.increaseTemperature(1);
        assertEquals(30, sony.getTemperature());
    }


}
