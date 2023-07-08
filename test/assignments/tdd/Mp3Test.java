package assignments.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class Mp3Test {

    @Test
    public void TestIHaveAnMp3 () {
        Mp3 amaya = new Mp3 ();
        amaya.ignite(true);
        assertTrue(amaya.igniteIt(true));
    }

//    @Test
//    public void TestThatIHave

    
}
