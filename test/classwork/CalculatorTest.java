package classwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public int Test_Calculator_Without_Multiplication_Operator(int count){
        Calculator casio = new Calculator();
        int multiple = 0;
        casio.setNumber(2, 16);
        for (; count <= 16; count++) {

            multiple += count;
            assertEquals(multiple, casio.getNumber());
                   }
        System.out.println(multiple);
        return multiple;
    }


    @Test
    public void Test_Calculator_Without_Power_Operator(){
        Calculator casio = new Calculator();
        int power = 0;
        casio.setNumber(2, 16);
        for (int count = 2; count <= 16; count++) {

            power = Test_Calculator_Without_Multiplication_Operator(count);
            assertEquals(power, casio.getNumber());
        }
        System.out.println(power);
    }


}

