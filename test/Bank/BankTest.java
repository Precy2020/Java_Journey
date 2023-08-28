package Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class BankTest {
    Bank lamourBank = new Bank();
    @BeforeEach
    public void startWithThis(){
        lamourBank.register("first name","last name","pin");
    }
    @Test
    public void TestThatTheBank_CanRegister(){
        Bank lamourBank = new Bank();
        lamourBank.register("first name","last name","pin");
        }

    @Test
    public void TestThatBankCan_FindAccount(){
        assertNotNull(lamourBank.findAccount("1"));
    }


    @Test
    public void TestThatBank_CanDeposit(){
        lamourBank.canDeposit("1", 5000);
        assertEquals(5000, lamourBank.getBalance("1"));
    }

    @Test
    public void TestThatBank_CanWithdraw(){
        lamourBank.canDeposit("1", 5000);
        lamourBank.canWithdraw("1", 5000, "pin");
        assertEquals(0, lamourBank.getBalance("1"));
    }

    
}
