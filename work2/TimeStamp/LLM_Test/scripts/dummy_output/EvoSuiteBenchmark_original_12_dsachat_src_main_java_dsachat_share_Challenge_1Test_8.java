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
		private static final int COUNT = 10000;

		String[] attr = new String[] {"skill", "attack", "defense", "resistance"};

		@Test
		void testRoll() throws Throwable {
			String[] ws = new String[3];
			ws[0] = "skill";
			ws[1] = "attack";
			ws[2] = "defense";

			Vector<String> attrStrings = new Vector<>();

			for (int i = 0; i < attr.length; i++) {
				attrStrings.add(attr[i]);
			}

			for (int i = 0; i < COUNT; i++) {
				System.out.print(dice(3) + "\n");
			}

			System.out.println("testRoll() : " + attrStrings);
			String challenge = this.constructChallenge(ws);
			assertTrue(
					challenge,
					challenge.startsWith("\n")
			);
			assertTrue(challenge, challenge.contains("\n"));

			System.out.println("testRoll() : " + challenge);
			System.out.println("testRoll() : " + challenge.equals(""));
			int attr1 = getAttr(ws[0], ws[1]);

			System.out.println(attr1);

			System.out.println("testRoll() : " + challenge.contains("attack"));
			System.out.println("testRoll() : " + challenge.contains("defense"));
			System.out.println("testRoll() : " + challenge.contains("resistance"));
		}

		String constructChallenge(String[] ws) throws Throwable {
			int difficultyFactor;
			String ws1 = "skill";
			String ws2 = "attack";
			String ws3 = "defense";
			String ws4 = "resistance";

			difficultyFactor = ws2.getBytes().length << 1;

			Vector<String> attr1 = new Vector<>();
			Vector<String> attr2 = new Vector<>();
			Vector<String> attr3 = new Vector<>();
			Vector<String> attr4 = new Vector<>();
			Vector<String> attr5 = new Vector<>();
			Vector<String> attr6 = new Vector<>();
			Vector<String> attr7 = new Vector<>();
			Vector<String> attr8 = new Vector<>();

			attrib1 = getAttrFromHero(ws[0], ws_1);
			attrib2 = getAttrFromHero(ws[1], ws_2);
			attrib3 = getAttrFromHero(ws[2], ws_3);
			attrib4 = getAttrFromHero(ws[3], ws4);
			attrib5 = getAttrFromHero(ws[4], ws5);
			attrib6 = getAttrFromHero(ws[5], ws6);
			attrib7 = getAttrFromHero(ws[6], ws7);
			attrib8 = getAttrFromHero(ws[7], ws8);

			assertTrue(attrib7.equals(attr7));
			assertTrue(attrib7.equals("skill"));
			assertTrue(wp.equals(ws[7]));

}
}