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
		private final Monster hero = Hero.generateMonster();
        private Victory victory;

		/**
		* @return the results of the roll
		*/
	private Vector<String> getResp() {
		victory = new Victory(hero, hero.getSuit());
		return victory.getResults();
	}

		/**
		* @return the result of the roll
		* @throws IllegalStateException
		* 		if there are not 3 sides for the roll
		*/
//	private Vector<String> getRollResults() {
//		List<String> results = new ArrayList<>();
//		Vector<String> list = new Vector<>();
//
//		int sides = rollSides();
//
//		try {
//			for(int i = 0; i < sides; i++){
//				List<Hero> heroes = new ArrayList<>();
//				List<Talent> talents = new ArrayList<>();
//				List<Weapon> weapons = new ArrayList<>();
//				List<String> text = new ArrayList<>();
//
//				for(int x = 0; x < sides; x++){
//					results.add("i: "+i+ ", x: "+x);
//					heroes.add(new Hero(new Integer(x), new Integer(i)));
//				}
//				for(int x = 0; x < sides; x++){
//					text.add("a");
//					talents.add(new Talent(new Integer(i), new Integer(x)));
//				}
//				text.add("b, p1, p2");
//
//				for(int x = 0; x < sides; x++){
//					text.add("c"+x);
//					weapons.add(new Weapon(new Integer(i), new Integer(x)));
//				}
//
//				hero.setText(text);
//				String s = heroes.size() + ", " + talents.size() + ", " + weapons.size() + ", " + text.size();
//
//				list.addAll(text);
//				heroes.add(hero);
//				talents.add(talents.size() -1);
//				weapons.add(weapons.size() -1);
//
//				results.add(s);
//			}
//		} catch (Exception e) {
//			results.clear();
//			e.printStackTrace();
//		}
//		return getRollResults();
//	}

		/**
		* @return the result of the roll
		*/
	private int rollSides() {
		try {
			victory = new Victory(hero, hero.getSuit());
		} catch (Exception e) {
		}

		int sides = rollRandom();

		if (sides < 3) {
			fail("sides: " + sides + " < 3");
		}
		return sides;
	}

	private int rollRandom() {
		return RAND.nextInt(7);
	}

	/**
	 * set the attack mode of the weapon
	 */
	public void setAttackFlag() {
		weapon.setAttrib("attack");
		weapon.setAttack(true);
	}
}