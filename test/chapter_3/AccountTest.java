package chapter_3;

import org.junit.jupiter.api.Test;
import deltel_deltel.chapter_2.chapter_3.Account;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {

    Account account = new Account("Favour Precious", 50.00);
    @Test
    public void TestAccountExist (){
        account.setName();
        assertNotNull(account.getName());
    }

    @Test
    public void TestThatMyAccountHaveABalance(){
        account.setBalance();
        assertEquals(50.0, account.getBalance());
    }

    @Test
    public void WithdrawalTest(){
        account.setWithdrawal();

    }
}
