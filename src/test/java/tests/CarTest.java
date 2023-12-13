package tests;

import dto.Car;
import lombok.extern.log4j.Log4j;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Log4j
public class CarTest {

    @Test
    public void bfgbfgb() {
     //   log.fatal("error");
        Car car1 = new Car("BMW");
        Car car2 = new Car("BMW");
        assertEquals(car1,car2);

    }
}
