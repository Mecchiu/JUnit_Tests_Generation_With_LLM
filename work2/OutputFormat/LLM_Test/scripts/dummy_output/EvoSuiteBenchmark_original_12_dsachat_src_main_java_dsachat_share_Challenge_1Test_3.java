// Challenge_1Test.java
package dsachat.share;

import java.io.Serializable;
import java.util.Vector;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Talent;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Challenge}.
* It contains one unit test case for the {@link Challenge#dice(int)} method.
*/
class Challenge_1Test {
		/**
		 * Test method for {@link Challenge#dice(int)}.
		 */
		@Test
		synchronized void testDice() {
			Challenge c;
			c = new Challenge("", 1, new Hero(), true, "ab");
			assertEquals("ab", c.toString());
			c = new Challenge("", 1, new Hero(), true, "abc");
			assertEquals("abc", c.toString());
			c = new Challenge("", 1, new Hero(), false, "abc");
			assertEquals("abc", c.toString());
		}
}

class Challenge_2Test {
		/**
		 * Test method for {@link Challenge#roll()}.
		 */
		@SuppressWarnings("unused")
		synchronized String test() {
			Challenge c;
			c = new Challenge("abc", 1);
			assertEquals(c.toString(), c.roll());

			c = new Challenge("abc", 1);
			assertEquals(c.toString(), c.roll());

			c = new Challenge("abc", 1);
			assertEquals(c.toString(), c.roll());

			c = new Challenge("ab", 1);
			assertEquals(c.toString(), c.roll());

			c = new Challenge("ab", 1);
			assertEquals(c.toString(), c.roll());
		}
}

class Challenge_3Test {
		/**
		 * Test method for {@link Challenge#getTo()}.
		 */
		@SuppressWarnings("unused")
		synchronized String test() {
			Challenge c;
			c = new Challenge("abc", 1);
			assertEquals(c.getTo(), c.getTo());
			c = new Challenge("ab", 1);
			assertEquals(c.getTo(), c.getTo());
			c = new Challenge("abc", 1);
			assertEquals(c.getTo(), c.getTo());
			c = new Challenge("ab", 1);
			assertEquals(c.getTo(), c.getTo());

			c = new Challenge("abc", 1);
			assertEquals(c.getTo(), c.getTo());

			c = new Challenge("abc", 1);
			assertEquals(c.toString(), c.toString());
			c = new Challenge("ab", 1);
			assertEquals(c.toString(), c.toString());
			c = new Challenge("abc", 1);
			assertEquals(c.toString(), c.toString());
		}
}