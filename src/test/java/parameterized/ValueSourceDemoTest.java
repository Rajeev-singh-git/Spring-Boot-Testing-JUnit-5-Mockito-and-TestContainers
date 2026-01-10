package parameterized;

import Controller.MathUtils;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValueSourceDemoTest {

    @ParameterizedTest
    @ValueSource(ints= {2,4,6,810})
    void isEvenTest(int number){
        MathUtils mathUtils = new MathUtils();
        assertTrue(mathUtils.isEven(number));
    }

}
