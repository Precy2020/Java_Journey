package period_tracker;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MenstrualAppTest {
    MenstrualApp menstrualApp = new MenstrualApp();

    @Test
    public void TestThatMenstrualApp_CanPredictNextPeriodDate(){
    String nextPeriod = String.valueOf(menstrualApp.checkNextFlowDate("2023-09-20", 28));
    assertEquals("2023-10-18", nextPeriod);
    }

   @Test
    public void TestThatMenstrualApp_CanPredictTheNextOvulationDate(){
        String nextOvulation = String.valueOf(menstrualApp.ovulationDate("2023-09-20", 28));
        assertEquals("2023-10-04", nextOvulation);
   }

   @Test
    public void testThatMenstrualApp_CanPredictTheNextSafeDate(){
     String nextSafeDate = String.valueOf(menstrualApp.nextSafeDate("2023-09-20", 28));
     assertEquals("2023-10-11", nextSafeDate);
   }


}
