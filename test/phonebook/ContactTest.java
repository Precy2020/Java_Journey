package phonebook;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ContactTest {
    Contact contacts = new Contact("Favour", "312, Herbelt Marcauley Way", "09037095727", "ochonogor84@gmail.com");
    @Test
    public void TestThatNames_CanBeStoredInContact(){
        assertEquals("Favour", contacts.getName());
    }

    @Test
    public void TestThatAddress_CanBeStoredInContact(){
        assertEquals("312, Herbelt Marcauley Way", contacts.getAddress());
    }

    @Test
    public void TestThatNumber_CanBeStoredInContact(){
        assertEquals("09037095727", contacts.getTelephone());
    }

    @Test
    public void TestThatEmail_CanBeStoredInContact(){
        assertEquals("ochonogor84@gmail.com", contacts.getEmail());
    }

    @Test
    public void TestThatContactCan_BeUpdated(){
       contacts.updateContact("favor", "2/4, Wemobod Tower, Mosley Road", "07032688434", "favour2001@gmail.com");
       assertEquals("favor", contacts.getName());
       assertEquals("2/4, Wemobod Tower, Mosley Road", contacts.getAddress());
       assertEquals("07032688434", contacts.getTelephone());
       assertEquals("favour2001@gmail.com", contacts.getEmail());
    }


}