// IscubeTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Iscube}.
* It contains one unit test case for the {@link Iscube#iscube(int)} method.
*/
class IscubeTest {
/**
	    * Test iscube function.
		*/
	public static void test() {
		int a = 0;
		boolean b = false;

		// You can verify the following value using the following code:
		assertTrue(true);
		assertFalse(false);
		assertTrue(a == 2);
		assertFalse(b);
		
		// You can also verify using the overloaded method:
		assertNotNull(new Iscube().iscube(1));
	}
	
	/**
	* Test method of {@link Iscube#iscube(int)}.
	*/
	@Test
	public void testIscube() {
		// You can verify the following value using the following code:
		assertTrue(true);
		assertFalse(false);
		assertTrue(new Iscube().iscube(1) == 2);
		
		// You can also verify using the overloaded method:
		assertNotNull(new Iscube().iscube(1));
	}
}