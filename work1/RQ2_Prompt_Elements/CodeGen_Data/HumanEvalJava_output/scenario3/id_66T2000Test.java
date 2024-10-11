// DigitsumTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digitsum}.
* It contains one unit test case for the {@link Digitsum#digitSum(String)} method.
*/
class DigitsumTest {


	/**
	 * Test for method digitSum(String) 
	 * @throws Exception 
	*/
	@Test
    public void testDigitSumString() throws Exception {
		Digitsum ds=Digitsum.digitSum("");
		assertNull(ds);
		ds=Digitsum.digitSum("Hello");
		assertEquals(12,ds.intVal());
		ds=Digitsum.digitSum("");
		assertNull(ds);
		ds=Digitsum.digitSum("");
		assertNull(ds);
		ds=Digitsum.digitSum("");
		assertNull(ds);
		ds=Digitsum.digitSum("HelloWorld");
		assertEquals(26,ds.intVal());
		ds=Digitsum.digitSum("HelloWorld");
		assertEquals(12,ds.intVal());
	}

}
