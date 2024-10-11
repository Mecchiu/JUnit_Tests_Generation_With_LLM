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
		private Challenge c1 = null;
        private Hero h1 = null;
        private int d1 = 0;

        /**
         * create a new challenge for a fight
         * @param h1 hero who will get the values from
         * @param d1 damage difficulty
         * @param silent response to sender?
         */
        public Challenge_0Test(Hero h1, int d1, boolean silent) {
                this.h1  = h1;
                this.d1   = d1;
                this.silent = silent;
        }

        /**
         * get the named talent from hero
         * @return the talent
         */
        private Talent getTalent(Hero h1, int d);

        /**
         * get the value from a the defender
         * @param h1 hero who should get the values
         * @return the value
         */
        private int getAttribFromHero(Hero h1, String attr);

        /**
	 * roll the attack or defense with a given weapon
	 * @return the string result
	 */
        private String rollFight();

        /**
	 * roll the attack or defense with a given weapon
	 * @return results
	 */
	private String rollTalent();

        /**
         * Roll a dice with variable sides
         * @param sides the sides can't have a value of 3 but a value of 1 or 2
	 * @return the value of the dice
	 */
        private static int roll(int sides);

}

class Challenge_0_Test extends Challenge_0Test {
	public Challenge_0_Test( Hero h1, Hero h, int d1, int d ) {
		super(h1, d1, false);
	}

	/**
	 * Set the values for the talents and spells
	 * @param h1 hero who will get the values from
	 */
	public void getAttr( Hero h) {

		this.h1  = h;
		this.d1   = 0;
	}

	/**
	 * Return the first attribute in a challenge
	 * @return the first attribute
	 */
	private Talent getTalent(Hero h) {

		this.h1  = h;
		this.d1   = 0;
		return this.t;
	}

	/**
	 * Return value from attributes
	 * @return the value for a attribute
	 */
	private int getAttribFromHero( Hero h, String attr) {

		this.h1  = h;
		this.d1   = 0;
		return this.getAttr(h).getAttr(attr);
	}

	/**
	 * Return the value of the attribute in a battle
	 * @return the value of the attribute
	 */
	private int getAttrValue(Hero h) {

		this.h1  = h;
		this.d1   = 0;
		return this.getAttribFromHero(h, "value").intValue();
	}

	/**
	 * return the value of attack or defense from attributes
	 * @return value of attack or defense
	 */
	private int rollFight() {
		return this.getAttrib(h1).intValue();
	}

	/**
	 * return the value of attack or defense from attributes
	 * @return value of attack or defense
	 */
	private int rollTalent() {
		this.attrib = this.getAttribFromHero(h1, "value").toString();
		return this.getAttrib(h1).intValue();
	}

	/**
	 * Roll the attack or defense with a given weapon
	 * @return the string result
	 */
	private String roll() {

		String result = null;

		int s1 = rollFight();
		int s2 = rollTalent();

		if (s1!= s2) { result = "attack"; }
		
		if (d1 == 0 && result == "attack") { result = "defense"; }

}
}