//package Unexpected;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertArrayEquals;
//
//public class SwapTest {
//    NumberSwapper numberSwapper = new NumberSwapper();
//
//    @Test
//    public void TestOddIndexCanBeSwapped() {
//        assertArrayEquals(new int[]{1, 3, 6, 7, 8, 9}, numberSwapper.swapNumber1(new int[]{3, 1, 7, 6, 9, 8}));
//        assertArrayEquals(new int[]{1, 7, 6, 7, 11}, numberSwapper.swapNumber1(new int[]{7, 1, 7, 6, 11}));
//        assertArrayEquals(new int[]{1, 8, 9}, numberSwapper.swapNumber1(new int[]{8, 1, 9}));
//    }
//
//    @Test
//    public void TestThatTwoOddNumbersInAnArrayCanBeSwapped() {
//        assertArrayEquals(new int[]{1, 3, 6, 7, 8, 9}, numberSwapper.swapNumber2(new int[]{3, 1, 6, 7, 8, 9}));
//        assertArrayEquals(new int[]{1, 8, 9}, numberSwapper.swapNumber2(new int[]{1, 8, 9}));
//    }
//
//}