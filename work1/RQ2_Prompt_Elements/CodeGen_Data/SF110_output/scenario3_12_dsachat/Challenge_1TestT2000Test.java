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
	 * Create a challenge.
	 */
	public Challenge_1Test() {
		UnitUnit unit = new UnitUnit();
		unit.setX(), unit.getY(), unit.getZ();
		unit.setSide(1), unit.setHead(2), unit.setType(3), unit
				.setAttribution(4), unit.setMaxHealth(5), unit.setMaxLife(6), unit
				.setCombatSpeed(7), unit.setWeapon(8), unit.setTalent(9);
		hero1 = unit;
	}
	

	 /**
	  * The <b>Weapon</b> of unit "unit1" of course. A Unit has 5 weapon slots.
	  */
	@Test
	public void testDice() {
		Hero.testDice();
		
	}
	
	
	/**
	 * Create a new battle for the <b>T</b> object <b>t</b>.
	 * The <b>T</b> represents a talent.
	 *
	 * @param t is the <b>T</b> object to be created.
	 */
	@Test
	public void testCreateTalent(Talent t) { // create a "talent", not a weapon
		assertEquals(true, t.hasWeapon());
	}
	
	/**
	 * Test {@link Challenge#createNewTalent(talent)}.
	 *
	 * @param t is the unit object.
	 * @return the created talent.
	 */
	@Test
	public static void testCreateNewTalent(Talent t) {
		Weapon w = Hero.testCreateNewTalent(t);
		assertNotNull(w);
	}
	
	/**
	 * Test the effect of <b>t</b> when <b>w</b> has a skill.
	 */
	@Test
	public void testAddSkill() { // test the effect of <b>w</b> when <b>t</b> has a skill
		weaponSkill();
	}
	
		


	/**
	 * Unit unit.
	 */
	@Test
	public void testEquals() { // check the equals method
		Unit unit = new Unit();
		assertEquals("==", unit.equals(unit));
		unit.testEquals(unit);
		assertFalse("!==", unit.equals(new Unit()));
	}
	

	/**
	 * Test if <b>w</b> is assigned to the unit's head<br>
	 * Unit: <b>w</b> is assigned to the unit's head.
	 */
	@Test
	public void testHeadAssignment() { // test the head assignment after unit has been assigned
		Unit unit = Hero.testCreateNewElement();
		unit.setHead(2);
		// unit.testHeadAssignment(unit);

		hero1.testHeadAssignment(unit); // unit must have the Head set
		Unit head = unit.getHead(); // the Unit may then have the Head itself unchanged
		hero1.testHeadAssignment(head); // unit and head should have the same Head

		// test adding a new head, unit's head must be the same as Head
		head.addChild(unit);
		unit.testHeadAssignment(unit);	
	}

	/**
	 * Unit skill.
	 */
	@Test
	public void testSkill() { // test the effect of <b>t</b> when <b>w</b> has a skill
		skillSkill();
	}
	

		
}// Challenge_1Test.java