// CircularShiftTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CircularShift}.
* It contains one unit test case for the {@link CircularShift#circularShift(int, int)} method.
*/
class CircularShiftTest {
 
   	public enum Type {
		CIRCULAR_SHIFT
    }
   	private Type type;

   	/**
    * Constructor of the class.
    */
   	public CircularShiftTest() {
   		this.type = Type.CIRCULAR_SHIFT;
   	}

   	 /**
        * Returns the test.
        * @return the test.
    */
   	@Test
   	public  void testRun() {
   	   System.out.println("\n\n\n\n----------\n");
   		int x = 3;
   		int y = x;
   		int a = 3;
   		System.out.println(type.toString() + " test run\n\n\n\n\n" + x + "  " + a + "\n" + a + y);
   		String expected = "1;3";
   		assertEquals(expected, Type.CIRCULAR_SHIFT.toString());
   	}
   	
}

