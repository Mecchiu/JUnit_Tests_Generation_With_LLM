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
		 * create a new test case with the given test cases as parameters
		 *
		 * @param cases parameters
		 */
		public Challenge_1Test(Object...cases) {
				Vector <Hero> heroes = new Vector<>();
				Vector <Talent> talents = new Vector<>();

				for (Object o: cases) {
						if (o instanceof Hero) {
								heroes.add((Hero) o);
						}
						if (o instanceof Talent) {
								talents.add((Talent) o);
						}
				}
				Challenge_1Test scenario = new Challenge_1Test();
				scenario.setHeroes(heroes);
				scenario.setTalents(talents);
				scenario.setSilent(true);
				scenario.setW(Weapon.create());
				scenario.setAttribShortcut("talent");
				scenario.setAttrib("hp");
				scenario.setRation(3);
				scenario.setTo(String.valueOf(true));
				scenario.setAttack(false);
				scenario.setTo("");

				
				// test
				scenario.roll();
				assertNotNull(scenario.getTo());
				scenario.roll();
				assertNotNull(scenario.getTo());
				scenario.roll();
				assertNotNull(scenario.getTo());
				scenario.roll();
				assertNull(scenario.getTo());


				// test
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				// not test null
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				// not test null
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				// not test null
				scenario.roll();
				scenario.roll();
				scenario.roll();
				
				// test
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				// not test null
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				// not test null
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				// not test null
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();

				

				// test
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				// not test null
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				// not test null
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();

				// test
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				// not test null
				scenario.roll();
				scenario.roll();
				scenario.roll();
				scenario.roll();
				// not test null
				scenario.roll();
}
}