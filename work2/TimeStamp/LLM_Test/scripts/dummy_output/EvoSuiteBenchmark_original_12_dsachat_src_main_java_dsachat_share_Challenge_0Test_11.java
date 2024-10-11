// Challenge_0Test.java
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
* It contains one unit test case for the {@link Challenge#roll()} method.
*/
class Challenge_0Test {
		
	@Test
    public void test() {
		
		/* test 1 */
		assertTrue("Challenge: No winner!",
					Challenge.roll(1).equals("wotw", 1));
		assertTrue("Challenge: No winner!",
					Challenge.roll(2).equals("Wotw", 2));
		assertTrue("Challenge: No winner!",
					Challenge.roll(3).equals("woty", 3));
		
		/* test 2 */
		assertTrue("Challenge: No winner!",
							Challenge.roll(10).equals("Wotw", 10));
		assertTrue("Challenge: No winner!",
					Challenge.roll(11).equals("Wotw", 10));
		assertTrue("Challenge: No winner!",
							Challenge.roll(12).equals("Wiw", 12));
			
	}
}