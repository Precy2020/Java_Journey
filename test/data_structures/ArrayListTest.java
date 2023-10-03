//package Data_Structures;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//public class ArrayListTest {
//
//    private ArrayList List;
//    @Test
//    public void TestThatArrayListExist(){
//        List = new ArrayList();
//        assertNotNull(List);
//    }
//
//    @Test
//
//    public void TestWhetherArrayListIsEmpty(){
//        List = new ArrayList();
//        List.isEmpty();
//        assertTrue(List.isEmpty());
//    }
//    @Test
//    public void TestIfTheListContainsNumbers(){
//        List = new ArrayList();
//        assertTrue(List.isEmpty());
//        List.add(5);
//        assertFalse(List.isEmpty());
//    }
//    @Test
//    public void TestIfNumberAddedIsRecognised(){
//        List = new ArrayList(3);
//        List.add(12);
//        List.add(1);
//        assertEquals(12, List.get(0));
//        assertEquals(1, List.get(1));
//    }
//    @Test
//    public void TestThatLIstCanExpand(){
//        List = new ArrayList(3);
//        List.add(4);
//        List.add(45);
//        List.add(74);
//        assertEquals(4, List.get(0));
//        assertEquals(45, List.get(1));
//        assertEquals(74, List.get(2));
//        List.add(32);
//        List.add(57);
//        assertEquals(32,List.get(3));
//        assertEquals(6, List.getCapacity());
//
//    }
//
//
//
//
//}
