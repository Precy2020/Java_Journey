    package assignments.tdd;

    import org.junit.jupiter.api.Test;

    import static org.junit.jupiter.api.Assertions.assertEquals;

    public class AccountTest {

        @Test
        public void canDepositIntoAccountTest(){
          Account preciousAccount = new Account (1234);
          int currentBalance = preciousAccount.getBalance();
          assertEquals( 0, currentBalance);
            preciousAccount.deposit(4000, 1234 );
           currentBalance = preciousAccount.getBalance();
            assertEquals( 4000, currentBalance);


    }

        @Test
        public void canDepositTwice() {
            Account preciousAccount = new Account (1234);
            preciousAccount.deposit(4000, 1234);
            int currentBalance = preciousAccount.getBalance();
            assertEquals( 4000, currentBalance);
            preciousAccount.deposit(1000, 1234);
           int newBalance = preciousAccount.getBalance();
            assertEquals( 4000, newBalance);


        }


        @Test
        public void canNotDepositNegativeNumber() {
            Account preciousAccount = new Account(1234);
            preciousAccount.deposit(1000, 1234);
            int currentBalance = preciousAccount.getBalance();
            assertEquals(1000, currentBalance);
            preciousAccount.deposit(-2000, 1234);
            int newBalance = preciousAccount.getBalance();
            assertEquals(1000, newBalance);
        }

        @Test
        public void canWithdraw() {
            Account preciousAccount = new Account(1234);
            preciousAccount.deposit(8000, 1234);
            int currentBalance = preciousAccount.getBalance();
            assertEquals(8000, currentBalance);
            preciousAccount.withdraw(2000);
            int newBalance = preciousAccount.getBalance();
            assertEquals(6000, newBalance);

        }



    }




