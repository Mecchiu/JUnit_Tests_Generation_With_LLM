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
* It contains ten unit test cases for the {@link Challenge#dice(int)} method.
*/
class Challenge_1Test {

	/**
	 * Test method for {@link Challenge#dice(int)}.
	 */
	@Test
	void testDice() {
		int sides = 20;
		int ret = -1;
		for (int i = 0; i < 10; i++) {
			ret = Challenge.dice(sides);
			assertTrue(ret >= 1 && ret <= sides);
		}
	}
}

// Challenge_2Test.java
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
class Challenge_2Test {
		
	/**
	 * Test method for {@link Challenge#roll()}.
	 */
	@Test
	void testRoll() {
		Hero h = new Hero();
		h.setAttrValue("MU", 10);
		h.setAttrValue("KL", 10);
		h.setAttrValue("IN", 10);
		h.setAttrValue("CH", 10);
		h.setAttrValue("FF", 10);
		h.setAttrValue("GE", 10);
		h.setAttrValue("KO", 10);
		h.setAttrValue("KK", 10);
		h.setAttrValue("SO", 10);
		h.setAttrValue("LP", 10);
		h.setAttrValue("AE", 10);
		h.setAttrValue("MR", 10);
		h.setAttrValue("LE", 10);
		h.setAttrValue("AU", 10);
		h.setAttrValue("AS", 10);
		h.setAttrValue("BE", 10);
		h.setAttrValue("RS", 10);
		h.setAttrValue("GS", 10);
		h.setAttrValue("WS", 10);
		h.setAttrValue("GS", 10);
		h.setAttrValue("ZT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttrValue("INI", 10);
		h.setAttrValue("AT", 10);
		h.setAttrValue("PA", 10);
		h.setAttrValue("FK", 10);
		h.setAttr