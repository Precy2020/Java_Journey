package Bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    Account account;
    @BeforeEach
        public void startWithThis(){
            account = new Account("accountNumber","account name","pin");
    }
    @Test
    public void AccountCanDepositTest(){
        assertEquals(0,account.getBalance());
        account.deposit(5000);
        assertEquals(5000,account.getBalance());

    }
    @Test
    public void AccountCannotDepositLessThanOneTest(){
        assertEquals(0,account.getBalance());
        account.deposit(0);
        assertEquals(0,account.getBalance());

    }
    @Test
    public void AccountCanWithdrawTest() {
        assertEquals(0, account.getBalance());
        account.deposit(5000);
        assertEquals(5000,account.getBalance());
        account.withdraw( 2000, "pin");
        assertEquals(3000, account.getBalance());

    }

    @Test
    public void TestThatCustomerCannotDepositNegativeNumber(){
        assertEquals(0,account.getBalance());
        account.deposit(-5000);
        assertEquals(0,account.getBalance());
    }
    @Test
    public void TestThatPinCanBeUpdated() {
        account.updatePin("pin", "newPin");
        account.deposit(20000);
        assertEquals(20000, account.getBalance());
        account.withdraw(5000, "newPin");
        assertEquals(15000, account.getBalance());
    }
}
