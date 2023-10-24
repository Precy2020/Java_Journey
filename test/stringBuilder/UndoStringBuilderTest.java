package stringBuilder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UndoStringBuilderTest {


    @Test
    public void testThatStringBuilder_CanAppend(){
        UndoStringBuilder undoStringBuilder = new UndoStringBuilder();
        undoStringBuilder.append("to be or not to be");
        undoStringBuilder.replace(3, 5, "eat");
        undoStringBuilder.undo();
        System.out.println(undoStringBuilder);
        assertEquals("to be or not to beto be or not to be", undoStringBuilder.append(undoStringBuilder.toString()));

    }


}