package deltel_deltel.chapter_3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarApplicationTest {

    @Test
    public void TestThatTheCarHaveAModel(){
        Car car = new Car(70, 5);
        Car cars = new Car(30, 7);
        assertEquals(70, car.getPrice(7.142857143));
        assertEquals(30, cars.getPrice(23.333333333));

    }
}