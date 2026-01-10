package Controller;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operation Test")
class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Test addition of Two Numbers")
    public void addTest(){
        int actualResult  = calculator.add(10,20);
        assertEquals(30,actualResult);
    }

    @Test
    @DisplayName("Test Subtraction")
    void subtractTest(){
        int subtraction = calculator.subtract(30,20);
        assertEquals(10,subtraction);
    }


    @Test
    void multipleTest(){
        int multiplication = calculator.multiply(30,20);
        assertEquals(600,multiplication);
    }

}