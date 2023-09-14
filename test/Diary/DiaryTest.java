package Diary;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary diary = new Diary("Precy", "1234");



    @Test
    public void testThatUsernameCanBeSet(){
        diary.setUserName("Precy");
        assertEquals("Precy", diary.getUserName());
    }

    @Test
    public void testThatDiaryCanBeUnlocked(){


    }


}
