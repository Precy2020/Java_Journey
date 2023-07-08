//write a method that takes input, number of minutes and return the number of second from the inputs.
package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class TimeTest {

    Time clock = new Time();

    @Test
    public void TimeExists() {

        assertNotNull(clock);
    }

    @Test
    public void MinutesToSeconds() {
        clock.setMinutes(-70);
        assertEquals(0,clock.getSeconds());
    }


     @Test
    public void MinuteToYear() {
        clock.setMinutes(1000000000);
        assertEquals(0, clock.getYear());
    }

    @Test
    public void MinutesToDay() {
        clock.setMinutes(50);
        assertEquals(0, clock.getDay());
    }


}