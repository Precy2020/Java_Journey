package liang;

import liang.chapter_3.Exchange;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Current_Exchange_Test {
    Exchange currency = new Exchange();

    @Test
    public void Test_Current_Exchange_Rate(){
        currency.setExchange_rate();
        assertEquals(6.81, currency.getExchange_rate());
    }

//    @Test
//    public void Test_USD_To_RMD(){
//        currency.setExchange_rate();
//        assertEquals(6.81, currency.getExchange_rate());
//        currency.setRmb();
//    }












}
