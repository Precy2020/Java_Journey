package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    Diary diary = new Diary("Precy", "1234");

    @Test
    public void testThatDiaryExists(){
        assertNotNull(diary);
    }

    @Test
    public void testThatUsernameCanBeSet(){
        diary.setUserName("Precy");
        assertEquals("Precy", diary.getUserName());
    }

    @Test
    public void testThatDiaryCanBeUnlocked(){

    }


}
