// ChallengeTest.java
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
* It contains ten unit test cases for the {@link Challenge#dice(int)} method.
*/
class ChallengeTest {
		
	/**
	 * Test of dice method, of class Challenge.
	 */
	@Test
	public void testDice() {
		System.out.println("dice");
		int sides = 0;
		int expResult = 0;
		int result = Challenge.dice(sides);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
		fail("The test case is a prototype.");
	}
}