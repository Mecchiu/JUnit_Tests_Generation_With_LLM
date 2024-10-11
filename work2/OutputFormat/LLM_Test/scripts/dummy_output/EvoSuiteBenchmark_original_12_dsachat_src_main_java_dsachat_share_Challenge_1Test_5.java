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
		 * test for bonus of talents
		 */
		@Test
		public void testTalent1() {
			String t = "talent";

			final Hero h = new Hero();
			h.setName(talent1(t, h));
			assertFalse(h.bonus(h, 1));

			Talent t1 = new Talent();
			t1.setName(talent2(h));
			h.setTalent(t1);
			assertFalse(h.bonus(h));

			Hero t2 = new Hero();
			t2.setName(talent3(h));
			h.setTalent(t2);
			t2 = t2.clone();
			t1 = new Talent();
			t1.setName(talent4(h));
			h.setTalent(t1);
			assertTrue(h.bonus(h));

			Talent t3 = new Talent();
			t3.setName(talent5(h));
			h.setTalent(t3);
			t3 = t3.clone();
			t1 = t3.clone();
			t1 = t1.clone();
			t3 = t3.clone();
			assertTrue(h.bonus(h));
			h.setTalent(t3);
			assertTrue(h.bonus(h));
			assertEquals(-1, h.bonus(h));

		}

		/**
		* test for bonus of attributes
		*/
		@Test
		public void testAttrib1() {
			String t = "attrib";
			final Hero h = new Hero();
			h.setName(attrib1(h, t));
			assertFalse(h.bonus(h));

			Attrib1_5 ta1 = new Attrib1_5();
			ta1.setName(String.valueOf(attack));
			h.setAttrib1(ta1);
			assertFalse(h.bonus(h));

			Attrib2_5 ta2 = new Attrib2_5();
			ta2.setName(Number.valueOf(dmgkk + 1));
			h.setAttrib2(ta2);
			assertFalse(h.bonus(h));

			Attrib3_5 ta3 = new Attrib3_5();
			ta3.setName("value");
			h.setAttrib3(ta3);
			assertTrue(h.bonus(h));
			Attrib3_5 ta4 = new Attrib3_5();
			ta4.setName("value");
			h.setAttrib3(ta4);
			assertFalse(h.bonus(h));

			Attrib_5 ta = new Attrib_5();
			ta.setName(String.valueOf(hit));
			h.setAttrib(ta);
			assertFalse(h.bonus(h));
			assertFalse(h.bonus(h));

			Attrib_5 ta2 = new Attrib_5();
			ta.setName("value");
			h.setAttrib(ta2);
			assertTrue(h.bonus(h));
			assertFalse(h.bonus(h));
			Attrib_5 ta3 = new Attrib_5();
			ta3.setName("value");
			h.setAttrib(ta3);
			assertTrue(h.bonus(h));
			assertFalse(h.bonus(h));
			Attrib_5 ta4 = new Attrib_5();
			ta4.setName("value");
			h.setAttrib(ta4);
			assertTrue(h.bonus(h));
			assertFalse(h.bonus(h));
			Attrib_5 ta5 = new Attrib_5();
			ta5.setName("value");
			h.setAttrib(ta5);
			assertTrue(h.bonus(h));
			assertFalse(h.bonus(h));
		}

}