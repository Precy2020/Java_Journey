package training_ground;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreditLimitCalculatorTest {
    @Test
    public void create_account_test (){
        Account account = new Account();
        int answer = account.creditCalculator(1234567,5000, 470, 1000, 3400);
        assertEquals(5000-470+1000, answer);
    }
//    @Test
//
//    public void set_balance_test(){
//        account.setBalance(50_000);
//        assertEquals(50_000, account.getBalance());
//    }
//
//    @Test
//    public void set_total_of_item_charged(){
//        account.setTotal(20_000);
//        assertEquals(20_000, account.getTotal());
//    }
//
//    @Test
//    public void overall_credit_limit(){
//        account.setOverall();
//    }
}