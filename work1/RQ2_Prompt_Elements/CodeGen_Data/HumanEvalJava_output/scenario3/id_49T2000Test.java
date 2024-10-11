// ModpTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Modp}.
* It contains one unit test case for the {@link Modp#modp(int, int)} method.
*/
class ModpTest {
private int n = 20;
		private int p = 0;

		/*
		 * Test method for {@link Modp#modp(int, int)}.
		 */
		@Test
		 public void testModp() {
				int res = Modp.modp(n, p);
				assertEquals(1, res);
				assertTrue(1 == p);
				p = 2;
				res = Modp.modp(n, p);
				assertEquals(2, res);
				assertFalse(1 == p);
				p = 3;
				res = Modp.modp(n, p);
				assertEquals(3, res);
				assertFalse(1 == p);
		 }


		/**
		 * Test method for {@link Modp#Modp(int)}.
		 */
		@Test
		public void testModp_int() {
				Modp m = new Modp(0), m1 = new Modp(1), m2 = new Modp(2);
				assertEquals(1, m.modp(0, 1));
				assertEquals(1, m1.modp(0, 1));
				assertEquals(1, m2.modp(0, 1));
		 }

		/**
		 * Test method for {@link Modp#Modp(int)}.
		 */
		@Test
		public void testModp_float() {
				Modp m = new Modp(0.0f), m1 = new Modp(1.0f), m2 = new Modp(2.0f);
				assertEquals(1.0f, m.modp(0.0f, 1.0f));
				assertEquals(1.0f, m1.modp(0.0f, 1.0f));
				assertEquals(1.0f, m2.modp(0.0f, 1.0f));
		 }

		/**
		 * Test method for {@link Modp#Modp(int)}.
		 */
		@Test
		public void testModp_Object() {
				Modp m = new Modp(0.0f), m1 = new Modp(1.0f), m2 = new Modp(2.0f);
				assertEquals(1.0f, m.modp(0.0f, 1.0f));
				assertEquals(1.0f, m1.modp(0.0f, 1.0f));
				assertEquals(1.0f, m2.modp(0.0f, 1.0f));
		 }
}
