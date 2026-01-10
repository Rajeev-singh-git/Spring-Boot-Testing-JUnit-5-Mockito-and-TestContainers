package Controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Calculator Operation Test")
class CalculatorTest {

    @Test
    @DisplayName("Test addition of Two Numbers")
    public void addTest(){

        Calculator calculator = new Calculator();
        int actualResult  = calculator.add(10,20);

        assertEquals(30,actualResult);
    }

    @Test
    @DisplayName("Test Subtraction")
    void subtractTest(){
        Calculator calculator = new Calculator();
        int subtraction = calculator.subtract(30,20);

        assertEquals(10,subtraction);
    }

}