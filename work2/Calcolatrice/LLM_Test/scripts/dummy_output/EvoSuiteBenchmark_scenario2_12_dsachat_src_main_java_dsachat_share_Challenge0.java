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
* It contains ten unit test cases for the {@link Challenge#roll()} method.
*/
class ChallengeTest {
		
		/**
		 * Test case for {@link Challenge#roll()}
		 * <br>
		 * Test case for a talent challenge.
		 * <br>
		 * The test case is successful if the result is a string containing the talent name and the result of the roll.
		 */
		@Test
		void testRollTalent() {
				Hero h = new Hero();
				h.setName("Testhero");
}
}