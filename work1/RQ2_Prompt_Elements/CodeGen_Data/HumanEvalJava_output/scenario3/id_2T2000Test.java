// TruncateNumberTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TruncateNumber}.
* It contains one unit test case for the {@link TruncateNumber#truncateNumber(Double)} method.
*/
class TruncateNumberTest {
/**
		* Test method for {@link TruncateNumber#truncateNumber(Double)}.
		* <ul>
		*   <li>Given a positive floating point number, it can be
		*    <ul>
		*      <li>Compute the decimal part of the number</li>
		*      <li>Call <code>truncateNumber(Double)</code> with
		*        <i>result1</i> to produce zero;</li>
		*      <li>Assertion should fail with the expected outcome.</li>
		*    </ul>
		*   </li>
		* </ul>
		*/
		@Test
		void testConstructor() {
				assertEquals(new Double(-1, 1), TruncateNumber.truncateNumber(new Double(0.0)));
				assertEquals(new Double(-1, 1), TruncateNumber.truncateNumber(new Double(-0.0)));
				assertEquals(new Double(-1, 15), TruncateNumber.truncateNumber(new Double(6.0)));
				assertEquals(new Double(1, 5), TruncateNumber.truncateNumber(new Double(1.5)));
				assertEquals(new Double(1, 5), TruncateNumber.truncateNumber(new Double(-1.5)));
				assertEquals(new Double(1, 5), TruncateNumber.truncateNumber(new Double(0.5)));
				assertEquals(new Double(1.0, -1.0), TruncateNumber.truncateNumber(new Double(1.0)));
				assertEquals(new Double(1.0, -1.0), TruncateNumber.truncateNumber(new Double(0.0)));
		}
}


// end of TruncateNumberTest.java
