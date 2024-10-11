// DigitsTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains one unit test case for the {@link Digits#digits(int)} method.
*/
class DigitsTest {

  /**
   * Test of digits(int) method, of class Digits.
   */
	@Test
  public void testDigits() {
  	int input=0;
    try {
      input = Integer.valueOf("> test");
    } catch(Exception ex) {
      fail(ex.toString());
    }
    assertEquals("1", new Digits().digits(input));
 		
		int input1=0;
		int input2=0;
 		int input3=0;
		int input4=0;
		
		try {
			input1 = Integer.valueOf("1");
			assertEquals("1", new Digits().digits(input1));
			input2 = Integer.valueOf("25");
			assertEquals("25", new Digits().digits(input2));
			input3 = Integer.valueOf("9");
			assertEquals("9", new Digits().digits(input3));
			input4 = Integer.valueOf("123");
			assertEquals("123", new Digits().digits(input4));
		}
		catch(Exception e) {
			fail(e.toString());
		}
		
		
		try {
			input1 = Integer.valueOf("1");
			input2 = Integer.valueOf("25");
			input3 = Integer.valueOf("999");
			input4 = Integer.valueOf("123");
			assertEquals("123", new Digits().digits(input1,input2,input3,input4));
		}
		catch(Exception e) {
			fail(e.toString());
		}
		}

}
