// BinaryCalculate_1Test.java
package ipac;

import java.text.*;
import java.util.*;
import java.math.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BinaryCalculate}.
* It contains one unit test case for the {@link BinaryCalculate#subBinary(String, String)} method.
*/
class BinaryCalculate_1Test {

	@Test
    public void allNumbers1() {
        String num1 = "0";
        String subNum = "1";
        String result = BinaryCalculate.subBinary(num1, subNum);
        assertEquals(result, "3" );
    }

}