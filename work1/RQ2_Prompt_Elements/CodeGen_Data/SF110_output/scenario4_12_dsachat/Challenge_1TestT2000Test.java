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
private static final int ATTR = 1;

		private static final int HPK = 50;
		private static final int ATTK2 = 100;
		private static final int HPK2 = 150;
		private static final int ATT3 = 200;
		private static final int DEX2= 200;
		private static final int DEX1 = 150;
		private static final int DMK2	 = 1;
		private static final int DMK1 = 2;
		private static final int DMK0 = 0;
		private static final int DMKO = -15;
		private static final int DMKO2 = 15;
		private static final int DMS = 30;
		private static final int DMS2 = 100;
		private static final int DMS1 = 45;
		private static final int DMKO3 = 30;

		/**
		 * Return an attribute for a new Hero.
		 * @param h
		 * @return new attribute or null
		 */
		private static Talent getTalent(Hero h) {
			return Game.gameObjects[ATTR];
		};

		/**
		 * Get the values of the named talents
		 * @param h the hero
		 * @return attribute values
		 */
		private static int getAttrfromHero(Hero h) {
			return Game.gameObjects[ATTR];
		};

		/**
		 * Return the values of the skill of the hero.
		 * @param h the hero
		 * @return skill values
		 */
		private static int getSkil_2(Hero h) {
			return Game.gameObjects[DMKO3];
		};

		/**
		 * return the values of the skill of the hero
		 * @param h the hero
		 * @return skill values
		 */
		private static int getSkil_1(Hero h) {
			return Game.gameObjects[DMKO1];
		};

		/**
		 * return the value of the attribute of h with name dms?
		 * @param h
		 * @return attribute value
		 */
		private static int getAttribFromHero(Hero h, String dms) {
			return Game.attrib;
		};

		/**
		 * return the value of the attribute of h with name dms2?
		 * @param h
		 * @return attribute value
		 */
		private static int getAttribFromHero(Hero h, String dms2) {
			return Game.attrib;
		};

		/**
		 * return the values of the skill of h and skill of h2 of the Hero
		 * @param h
		 * @param h2
		 * @return skill of h and skill of h 2
		 */
		private static int getSkilOfHs(Hero h, Hero h2) {
			return Math.min(dms2, dms1);
		};

		/**
		 * return the value of the skill of h and skill of h1 of the Hero
		 * @param h
		 * @param h1
		 * @return skill of h and skill of h 1
		 */
		private static int getSkilOfHs(Hero h, Hero h1) {
			return Math.min(dms1, dms);
		};

		/**
		 * return the values of HPK and HPK2 from the Hero.
		 * @param h
		 * @return HPK1 and HPK2
		 */
		private static int getHPKhpk2(Hero h) {
			return Math.min(HPK2, HPK);
		};

		/**
		 * return the values of HPK and HPK1 from the Hero.
		 * @param h
		 * @return HPK
		 */
		private static int getHPKhpk1(Hero h) {
			return Math.min(HPK2, HPK);
		};

		/**
		 * return the values of HPK and HPK2 from the Hero.
		 * @param h
		 * @return HPK
		 */
		private static int getHPKhpk(Hero h) {