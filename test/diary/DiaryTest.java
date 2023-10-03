package diary;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {

    @Test
    public void testThatDiary_IsLocked(){
        Diary diary = new Diary("username", "password");
        assertTrue(diary.locked());
    }

    @Test
    public void testThatDiaryCanBe_Unlocked(){
        Diary diary = new Diary("username", "password");
        assertTrue(diary.locked());
        diary.unlockDiary("password");
        assertFalse(diary.locked());
    }

    @Test
    public void testThatTheSetPasswordCanBeGotten(){
        Diary diary = new Diary("username", "password");
        assertEquals("password", diary.getPassword());

    }

    @Test
    public void testThatUsernameCanBeGotten(){
        Diary diary = new Diary("username", "password");
        assertEquals("username", diary.getUsername());
    }

   @Test
    public void testThatUserCan_CreateEntry(){
       Diary diary = new Diary("username", "password");
       diary.createEntry("Life of a Believer", "Jesus is the only way");

   }



}
