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
static final DateTimeFormat dateFormat = new SimpleDateFormat(BinaryCalculate.DATE_FORMAT);

		String expected = "8E4E6F6F700000000";
		String actual = BinaryCalculate.subBinary(expected, actual);
		String expectedString = dateFormat.print(new Date());
		assertEquals(expectedString, actual);
}



