package bank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTest {

    Bank lamourBank = new Bank();
    @Test
    public void TestThatBank_CanRegisterCustomer(){
        lamourBank.register("Favour", "Ochonogor", "1234");
        assertEquals(new Account("1", "Favour Ochonogor", "1234").getAccount(), lamourBank.findAccount("1").getAccount());
        lamourBank.register("Funsho", "Olowo", "4321");
        assertEquals(new Account("2", "Funsho Olowo", "4321").getAccount(), lamourBank.findAccount("2").getAccount());
    }

    @Test
    public void TestThatBank_CanDeposit(){
        lamourBank.register("Favour", "Ochonogor", "1234");
        assertEquals(new Account("1", "Favour Ochonogor", "1234").getAccount(), lamourBank.findAccount("1").getAccount());
        lamourBank.canDeposit("1", 3000);
        assertEquals(3000, lamourBank.getBalance("1"));
    }

    @Test
    public void TestThatBank_CanWithdraw(){
        lamourBank.register("Favour", "Ochonogor", "1234");
        assertEquals(new Account("1", "Favour Ochonogor", "1234").getAccount(), lamourBank.findAccount("1").getAccount());
        lamourBank.canDeposit("1", 5000);
        lamourBank.canWithdraw("1", 2500, "1234");
        assertEquals(2500, lamourBank.getBalance("1"));
    }

    @Test
    public void TestThatBank_CanTransfer(){
        String sourceAccount = lamourBank.register("Favour", "Ochonogor", "1234");
        assertEquals(new Account("1", "Favour Ochonogor", "1234").getAccount(), lamourBank.findAccount("1").getAccount());
        lamourBank.canDeposit("1", 5000);
        String destinationAccount = lamourBank.register("Funsho", "Olowo", "4321");
        assertEquals(new Account("2", "Funsho Olowo", "4321").getAccount(), lamourBank.findAccount("2").getAccount());
        lamourBank.bankCanTransfer(sourceAccount, destinationAccount, 3000, "1234");
        assertEquals(2000, lamourBank.getBalance("1"));
        assertEquals(3000, lamourBank.getBalance("2"));
    }




}