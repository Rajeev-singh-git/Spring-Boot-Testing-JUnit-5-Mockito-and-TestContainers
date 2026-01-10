package Controller;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedCalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setup(){
        calculator = new Calculator();
    }

    @Nested
    class AdditionTest{

        @Test
        public void test_PositiveNumberAddition(){
            assertEquals(7,calculator.add(4,3));
        }

        @Test
        public void test_PositiveAndNegativeNumberAddition(){
            assertEquals(1,calculator.add(4,-3));
        }

    }

    @Nested
    class SubtractionTest{

        @Test
        public void test_PositiveNumberSubtraction(){
            assertEquals(1,calculator.subtract(4,3));
        }

        @Test
        public void test_PositiveAndNegativeNumberSubtraction(){
            assertEquals(10053,calculator.add(-4,10057));
        }

    }

}
