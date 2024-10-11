// SimpleCombatant_1Test.java
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
* It contains one unit test case for the {@link SimpleCombatant#_getCurrentLP()} method.
*/
class SimpleCombatant_1Test {
/**
		 * Test of getCurrentLP method, of class SimpleCombatant.
		 * @throws Exception if something goes wrong within the method, including any exception of
		 * its own.
		 */
        @Test
		public void test_getCurrentLP_getCurrentLP() throws Exception {
				SimpleCombatant instance = new SimpleCombatant();
				this.check(instance, _getCurrentLP());
		}

		/**
		 * Test of getCurrentLP method, of class SimpleCombatant.
		 * @throws Exception if something goes wrong within the method, including any exception of
		 * its own.
		 */
        @Test
		public void test_getCurrentLP_nonComparable() throws Exception {
				SimpleCombatant instance = new SimpleCombatant();
				instance.setSectorBonus(SectorBonus.SECTOR_BONUS_ONE);
				assertThrows(() -> instance.getCurrentLP(), IllegalArgumentException.class);
		}

		/**
		 * Test of getCurrentLP method, of class SimpleCombatant.
		 * @throws Exception if something goes wrong within the method, including any exception of
		 * its own.
		 */
        @Test
		public void test_getCurrentLP_null() throws Exception {
				SimpleCombatant instance = new SimpleCombatant();
				this.check(instance, null);
		}

		/**
		 * Test of getCurrentLP method, of class SimpleCombatant.
		 * @throws Exception if something goes wrong within the method, including any exception of
		 * its own.
		 */
	    @Test
		public void test_getCurrentLP_isComparable() throws Exception {
		SimpleCombatant instance = new SimpleCombatant();
		assertEquals(0, instance._getCurrentLP(), 0.0);
		instance.setSectorBonus(SectorBonus.SECTOR_BONUS_ONE);
		assertEquals(1, instance._getCurrentLP(), 0.0);
		setSectorBonusToNull(instance);
		assertEquals(1, instance._getCurrentLP(), 0.0);
		assertEquals(_getCurrentLP(), 0);
	}

	/**
	 * Test of setSectorBonus method, of class SimpleCombatant.
	 * @throws Exception if something goes wrong within the method, including any exception of
	 * its own.
	 */
	@Test
	public void test_setSectorBonus() throws Exception {
		SimpleCombatant instance = new SimpleCombatant();
		assertEquals(0, instance.getSectorBonus(), 0.0);
		assertTrue(instance.getSectorBonus() == null);
		instance.setSectorBonus(SectorBonus.SECTOR_BONUS_ONE);
		assertEquals(1, instance.getSectorBonus(), 0.0);
		assertFalse(instance.getSectorBonus() == null);
		assertTrue(instance.getSectorBonus()!= SectorBonus.SECTOR_BONUS_NONE);
	}

	/**
	 * Test of getObserver method, of class SimpleCombatant.
	 * @throws Exception if something goes wrong within the method, including any exception of
	 * its own.
	 */
	@Test
	public void test_getObserver() throws Exception {
		SimpleCombatant instance = new SimpleCombatant();
		instance.addObserver(new SimpleCombatantObserver(true));
		CombatantObserver instanceExpected = new SimpleCombatantObserver(true);
		CombatantObserver instanceActual = instance.getObserver();
		assertEquals(true, instanceActual.isEnabled());
		assertEquals(instanceExpected, instanceActual);
	}

			/**
		 * Test of isAttackable method, of class SimpleCombatant.
		 * @throws Exception if something goes wrong within the method, including any exception of
		 * its own.
		 */
		@Test
		public void test_isAttackable() throws Exception {
				SimpleCombatant instance = new SimpleCombatant();
				assertEquals(false, instance.isAttackable());
				instance.setAttackable(true);
				assertEquals(true, instance.isAttackable());
				assertEquals(true, instance.isAttackable());
				assertEquals(true, instance.isAttackable());
				instance.setAttackable(false);
				assertEquals(false, instance.isAttackable());
		}

    private static void check(SimpleCombatant instance, Integer expected) {
        Set<Combatant> result = instance.getCombatants();
        assertEquals(true, result.contains(instance));

        if (expected == null) {
			assertFalse(result.contains(instance));
		}
        else {
			assertTrue(result.contains(instance));
		}
    }

    private static void setSectorBonusToNull(SimpleCombatant instance) {
        Set<Combatant> result = instance.getCombatants();
        InstanceMap.put(instance, result);
    }

    private static void assertThrows(Runnable r, Class c) {
        try {
            r.run();
        }
        catch (Exception e) {}
    }

	/**
	 * Test of clearObserver method, of class SimpleCombatant.
	 * @throws Exception if something goes wrong within the method, including any exception of
	 * its own.
	 */
	@Test
	public void test_clearObserver() throws Exception {
	        SimpleCombatant instance = new SimpleCombatant();
		CombatantObserver instanceExpected = new SimpleCombatantObserver(true);
		CombatantObserver instanceActual = instance.getObserver();
		assertEquals(true, instanceActual.isEnabled());
		assertEquals(instanceExpected, instanceActual);
		instance.clearObserver();
		assertEquals(false, instanceActual.isEnabled());
	}

    private static Logger _log = Logger.getLogger(SimpleCombatant_1Test.class.getName());
	private static String[] _getSectors();
	private static SectorBonus[] _getSectorBonuses();
	private static Set<Combatant> _getCombatants();
	private static Set<Combatant> _getObservers();
	private static void setSectorBonusesToNull(SimpleCombat