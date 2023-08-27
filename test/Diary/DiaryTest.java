package Diary;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertNotNull;

public class DiaryTest {
    Diary diary = new Diary("username", "password");

    @Test
    public void TestThatDiaryExist(){
        assertNotNull(diary);
    }

    @Test
    public void TestThatTheDiaryIsNotLocked(){
        diary.unlockDiary("password");
    }
}
