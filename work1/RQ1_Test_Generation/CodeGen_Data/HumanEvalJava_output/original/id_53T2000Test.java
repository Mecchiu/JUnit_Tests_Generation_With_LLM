// AddTest.java
package original;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Add}.
* It contains one unit test case for the {@link Add#add(int, int)} method.
*/
class AddTest {
int a,b,c,d;
	boolean check;

		/**
		* Test static initialization.
		*/
		public static void testInitialization() {
			a = 654;
			b = 1052;
			c = 42;
			d = 42;
			check = true;
		}

		/**
		 * Test whether the static initialization of new test data was correct.
		*/
		public void check() {
			assertEquals("0 5 8 5", "0 5 8", "5 8 5", "0 5 4 8", "4 5 0 8", "5 8 0 8", "0 5 5", "0 5 4", "4 5 5", "5 8 5");
			assertEquals("3 7 3", "3 7", "3", "3", "3", "3", "7", "3");
			assertFalse(check);
		}

		/**
		 * Test instance-variable initialization.
		*/
		public void instantiate() {
			assertTrue("false", CheckUtils.isInstanceOf(Add.class, false));
			assertTrue("true", CheckUtils.isInstanceOf(Add.class, true));
			a = 654;
			b = 1052;
			c = 42;
			d = 42;
			check = true;
		}

		/**