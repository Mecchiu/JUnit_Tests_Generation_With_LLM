// SimpleCombatant_0Test.java
package de.outstare.fortbattleplayer.model.impl;

import java.util.HashSet;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Area;
import de.outstare.fortbattleplayer.model.CharacterClass;
import de.outstare.fortbattleplayer.model.Combatant;
import de.outstare.fortbattleplayer.model.CombatantObserver;
import de.outstare.fortbattleplayer.model.CombatantSide;
import de.outstare.fortbattleplayer.model.CombatantState;
import de.outstare.fortbattleplayer.model.SectorBonus;
import de.outstare.fortbattleplayer.model.Weapon;
import de.outstare.fortbattleplayer.model.WeaponData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCombatant}.
* It contains one unit test case for the {@link SimpleCombatant#_getMaxLP()} method.
*/
class SimpleCombatant_0Test {
		
	/**
	 * Test of getMaxCapacity method, of class SimpleCombatant.
	 */
	@Test
    public void testGetMaxCapacity() {
		Logger logger = Logger.getLogger(Combatant.class.getName());
		logger.info("Starting");
		Combatant o = (Combatant)getField(Combatant.class,"o");
		Set<Integer> sizes = new HashSet<>();
		for (int i = 0; o.getMaxCapacity() > 0 && o.getMaxCapacity() < 11; i++) {
			int size = o.getMaxCapacity();
			sizes.add(size);
		}
		logger.info("Number of sizes is "+sizes.size());
		assertEquals(11, sizes.size());
		logger.info("Returned a value from getMaxCapacity():"+o.getMaxCapacity());
		assertEquals(o.getMaxCapacity(),o.getMaxCapacity());		
    }
		/**
	* Test of _isEnemy method, of class SimpleCombatant.
	* This test does not run automatically
	*/
	@Test
    public void test_isEnemy() {

		Combatant o = (Combatant)getField(Combatant.class,"o");
		
		o.setMaxCapacity(5);
		assertTrue("Enemy cannot be placed",!o.isEnemy(o));
		o.setMaxCapacity(10);
		//o.setMaxCapacity(100);
		assertTrue("Player cannot be reached",!o.isEnemy(o));
    }

//    @Test
//    public void _isEnemy_NoGame() {
//
//        Combatant o = (Combatant)getField(Combatant.class,"o");
//
//        o.setMaxCapacity(5);
//        o.setEnemy(o);
//        o.setEnemy(o);
//
//
//
//
//        //assertTrue("Player can be reached",!o.isEnemy(o)); // o.setMaxCapacity(100);
//        //assertFalse("Player cannot be reached",!o.isEnemy(o)); // o.setMaxCapacity(100);
//        //o.setMaxCapacity(100);             // o.setMaxCapacity(100);                // o
//        //o.setMaxCapacity(5);
//    }
//	@Test
//    public void test_canHit(){
//        Combatant o = (Combatant)getField(Combatant.class,"o");
//
//        for (int i = 1; i <= o.getMaxCapacity(); i++) {
//            o.setMaxCapacity(i);
//            assertTrue("Cannot hit, but player can now!",o.canHurtBy(o));
//        }
//    }

}