package bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {
    Account account;
    @BeforeEach
        public void startWithThis(){
            account = new Account("accountNumber","account name","1234");
    }

    @Test
    public void Test_That_Account_CanDeposit(){
        account.deposit(2000);
        assertEquals(2000, account.getBalance());
    }

    @Test
    public void Test_That_Account_CanWithdraw(){
        account.deposit(5000);
        account.withdraw(2000, "1234");
        assertEquals(3000, account.getBalance());
    }

    @Test
    public void Test_That_Account_CanSetNewPin(){
        account.updatePin("1234", "4321");
        account.deposit(3000);
        account.withdraw(1000, "4321");
        assertEquals(2000, account.getBalance());
    }


}
