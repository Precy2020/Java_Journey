package phonebook;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhonebookTest{

    @Test
    public void TestThatPhonebookCan_AddContact(){
        Phonebook phonebook = new Phonebook();
        phonebook.add("favor", "4/5, Mosley Road", "09037095727", "ochonogor84@gmail.com");

    }
}
