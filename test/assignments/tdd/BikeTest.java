package assignments.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {

    Bike jincheng = new Bike();
    @Test
    public void If_I_Have_A_Bike_And_It_Is_On_Test() {

       jincheng.setIsOn(true);
       assertTrue(jincheng.getOn());
    }

    @Test
    public void When_I_Turn_My_Bike_Off_Test() {
        jincheng.setIsOn(false);
        assertFalse(jincheng.getOn());

    }

    @Test
    public void When_The_Bike_Is_On_Gear_One_Test() {
        jincheng.setIsOn(true);
        jincheng.setGear(15);
        jincheng.accelerateGear(1);
        assertEquals(16, jincheng.getGear());
    }

   @Test
    public void WhenTheBikeIsOnGearTwoTest () {
       jincheng.setIsOn(true);
       jincheng.setGear(24);
       jincheng.accelerateGear(2);
       assertEquals(26, jincheng.getGear());
   }

   @Test
    public void WhenTheBikeIsOnGearThreeTest() {
       jincheng.setIsOn(true);
       jincheng.setGear(35);
       jincheng.accelerateGear(3);
       assertEquals(38, jincheng.getGear());
   }

   @Test
    public void WhenTheBikeIsOnGearFourTest() {
        jincheng.setIsOn(true);
        jincheng.setGear(44);
        jincheng.accelerateGear(4);
        assertEquals(48, jincheng.getGear());
   }

   @Test
    public void WhenTheBikeIsDeceleratedGearOneTest() {
        jincheng.setIsOn(true);
        jincheng.setGear(15);
        jincheng.decelerateGear(1);
        assertEquals(14, jincheng.getGear());
   }

    @Test
    public void WhenTheBikeIsDeceleratedGearTwoTest() {
        jincheng.setIsOn(true);
        jincheng.setGear(24);
        jincheng.decelerateGear(2);
        assertEquals(22, jincheng.getGear());
    }

    @Test
    public void WhenTheBikeIsDeceleratedAtGearThreeTest() {
        jincheng.setIsOn(true);
        jincheng.setGear(35);
        jincheng.decelerateGear(3);
        assertEquals(32, jincheng.getGear());
    }

    @Test
    public void When_The_Bike_Is_Decelerated_At_Gear_Four_Test() {
        jincheng.setIsOn(true);
        jincheng.setGear(44);
        jincheng.decelerateGear(4);
        assertEquals(40, jincheng.getGear());

    }

}
