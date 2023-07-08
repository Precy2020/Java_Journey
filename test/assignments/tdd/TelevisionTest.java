package assignments.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TelevisionTest {
    Television samsung = new Television();
    @Test
    public void IHavaATvAndIWantToOnIt (){
        samsung.on(true);
        assertTrue(samsung.getIsOn());
    }

    @Test
    public void WhenIWantToTurnOnMyTv () {
        samsung.on(false);
        assertFalse(samsung.getIsOn());
    }

    @Test
    public void WhenIDecreaseVolumeTest (){
        samsung.on(true);
        samsung.setVolume(10);
        samsung.decreaseVolume(2);
        assertEquals(8, samsung.getVolume());
    }

    @Test
    public void WhenIIncreaseVolumeTest (){
        samsung.on(true);
        samsung.setVolume(59);
        samsung.increaseVolume(6);
        assertEquals(65, samsung.getVolume());
    }

   @Test
    public void WhenIChangeChannelTest () {
     samsung.on(true);
       samsung.setChannel(23);
       samsung.ChangeChannel(8);
       assertEquals(31, samsung.getChannel());

    }
}