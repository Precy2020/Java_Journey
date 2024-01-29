package assignments.tdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PhoneTest {
    Phone nokia = new Phone ();
    @Test
    public void TestThatANokiaPhoneExistsAndIsOn() {
        nokia.power(true);
        assertTrue(nokia.power());
    }
    @Test
    public void TestThatThereIsAPhonebookInThePhone(){
        nokia.power(true);
        assertTrue(nokia.power());
        nokia.setPhonebook("1. Search", "2. Service Nos", "3. Add name", "4. Erase", "5. Edit", "6. Assign tone", "7. Send b/card", "8. Options", "1. Type of view", "2. Memory status", "9. Speed dials", "10.Voice tags");
        assertTrue(nokia.getPhonebook());
    }

    @Test
    public void TestThatMessageIsInTheMenu(){
        nokia.power(true);
        assertTrue(nokia.power());
        nokia.setMessages("1. Write messages", "2. Inbox", "3. Outbox", "4. Picture messages", "5. Templates", "6. Smileys", "7. Message settings", "1. Sets 1", "1. Message centre number", "2. Message sent as", "3. Message validity", "2. Common", "1. Delivery reports", "2. Reply via same centre", "3. Character support", "8. Info service"," 9. Voice mailbox number", "10. Service command editor");
        assertTrue(nokia.getMessages());
    }

    @Test
    public void TestThatChatIsInTheMenu(){
        nokia.power(true);
        assertTrue(nokia.power());
        nokia.setChat();
        assertTrue(nokia.getChat());

    }

    @Test
    public void TestThatThereIsACallRegister(){
        nokia.power(true);
        assertTrue(nokia.power());
        nokia.setCallRegister("1. Missed calls", "2. Received calls", "3. Dialled numbers", "4. Erase recent call lists", "5. Show call duration", "1. Last call duration", "2. All calls’ duration", "3. Received calls’ duration", "4. Dialled calls’ duration", "5. Clear timers", "6. Show call costs", "1. Last call cost", "2. All calls’ cost", "3. Clear counters", "7. Call cost settings", "1. Call cost limit", "2. Show costs in", "8. Prepaid credit");
        assertTrue(nokia.getCallRegister());
    }

   @Test
    public void TestThatThatThereIsTone(){
        nokia.power(true);
        assertTrue(nokia.power());
        nokia.setTone("1. Ringing tone", "2. Ringing volume", "3. Incoming call alert", "4. Composer", "5. Message alert tone", "6. Keypad tones", "7. Warning and game tones", "8. Vibrating alert", "9. Screen saver");
        assertTrue(nokia.getTone());
    }

  @Test
  public void SettingsTest(){
       nokia.power(true);
       assertTrue(nokia.power());
       nokia.setSettings("1. Call settings", "1. Automatic redial", "2. Speed dialling", "3. Call waiting options", "4. Own number sending", "5. Phone line in use", "6. Automatic answer 1", "2. Phone settings", "1. Language", "2. Cell info display", "3. Welcome note", "4. Network selection", "5. Lights2", "6. Confirm SIM service actions", "3. Security settings", "1. PIN code request", "2. Call barring service", "3. Fixed dialling", "4. Closed user group", "5. Phone security", "6. Change access codes", "4. Restore factory settings");
       assertTrue(nokia.getSettings());
   }

   @Test
    public void CallDivertTest(){
       nokia.power(true);
       assertTrue(nokia.power());
       nokia.setCallDivert();
       assertTrue(nokia.getCallDivert());
   }

   @Test
    public void TestThatGamesIsOnThePhone(){
       nokia.power(true);
       assertTrue(nokia.power());
       nokia.setGames();
       assertTrue(nokia.getGames());
   }

   @Test
    public void TestThatThereIsCalculatorOnThePhone(){
       nokia.power(true);
       assertTrue(nokia.power());
       nokia.setCalculator();
       assertTrue(nokia.getCalculator());
   }

   @Test
    public void TestThatThereIsReminders(){
       nokia.power(true);
       assertTrue(nokia.power());
       nokia.setReminder();
       assertTrue(nokia.getReminder());
   }
   @Test
    public void TestThatThereIsClock(){
       nokia.power(true);
       assertTrue(nokia.power());
       nokia.setClock("1. Alarm clock", "2. Clock settings", "3. Date setting", "4. Stopwatch", "5. Countdown timer", "6. Auto update of date and time");
       assertTrue(nokia.getClock());
   }

   @Test
    public void TestThatThereAreProfilesInThePhone(){
       nokia.power(true);
       assertTrue(nokia.power());
       nokia.setProfiles();
       assertTrue(nokia.getProfiles());
   }

   @Test
    public void TestThatThePhoneHasSimServices(){
       nokia.power(true);
       assertTrue(nokia.power());
       nokia.setSimServices();
       assertTrue(nokia.getSimServices());
   }




}


