package Bank;

import org.junit.jupiter.api.Test;


public class BankTest {
    @Test
    public void TestThatTheBank_CanRegister(){
        Bank lamourBank = new Bank();
        lamourBank.register("first name","last name","pin");
        }

    @Test
    public void TestThatBankCan_FindAccount(){
        Bank lamourBank = new Bank();
        lamourBank.findAccount();

    }
}
