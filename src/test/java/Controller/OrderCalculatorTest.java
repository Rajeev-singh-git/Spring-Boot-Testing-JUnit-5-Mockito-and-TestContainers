package Controller;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderCalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @Order(1)
    @Test
    public void addTest(){
        int actualResult  = calculator.add(10,20);
        assertEquals(30,actualResult);
    }

    @Order(2)
    @Test
    void subtractTest(){
        int subtraction = calculator.subtract(30,20);
        assertEquals(10,subtraction);
    }

    @Order(3)
    @Test
    void multipleTest(){
        int multiplication = calculator.multiply(30,20);
        assertEquals(600,multiplication);
    }

    @Test
    void divisionTest(){
        int multiplication = calculator.divide(30,10);
        assertEquals(3,multiplication);
    }
}
