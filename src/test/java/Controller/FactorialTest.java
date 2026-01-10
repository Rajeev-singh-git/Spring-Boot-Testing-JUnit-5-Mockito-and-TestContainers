package Controller;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @RepeatedTest(5)
    public void testFactorialSuccess(){
        Factorial factorial = new Factorial();
        int result = factorial.factorial(3);

        assertEquals(6,result);
    }

}