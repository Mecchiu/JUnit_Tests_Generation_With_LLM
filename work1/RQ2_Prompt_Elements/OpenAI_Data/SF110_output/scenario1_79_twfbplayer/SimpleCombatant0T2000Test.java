// SimpleCombatantTest.java
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
* It contains ten unit test cases for the {@link SimpleCombatant#_getMaxLP()} method.
*/
class SimpleCombatantTest {

		private static final Logger LOG = Logger.getLogger(SimpleCombatantTest.class.getName());
		
		@Test
		public void test_getMaxLP_1() {
				SimpleCombatant combatant = new SimpleCombatant();
				int maxLP = combatant._getMaxLP();
				assertEquals(100, maxLP);
		}
		
		@Test
		public void test_getMaxLP_2() {
				SimpleCombatant combatant = new SimpleCombatant();
				int maxLP = combatant._getMaxLP();
				assertEquals(100, maxLP);
		}
		
		@Test
		public void test_getMaxLP_3() {
				SimpleCombatant combatant = new SimpleCombatant();
				int maxLP = combatant._getMaxLP();
				assertEquals(100, maxLP);
		}
		
		@Test
		public void test_getMaxLP_4() {
				SimpleCombatant combatant = new SimpleCombatant();
				int maxLP = combatant._getMaxLP();
				assertEquals(100, maxLP);
		}
		
		@Test
		public void test_getMaxLP_5() {
				SimpleCombatant combatant = new SimpleCombatant();
				int maxLP = combatant._getMaxLP();
				assertEquals(100, maxLP);
		}
		
		@Test
		public void test_getMaxLP_6() {
				SimpleCombatant combatant = new SimpleCombatant();
				int maxLP = combatant._getMaxLP();
				assertEquals(100, maxLP);
		}
		
		@Test
		public void test_getMaxLP_7() {
				SimpleCombatant combatant = new SimpleCombatant();
				int maxLP = combatant._getMaxLP();
				assertEquals(100, maxLP);
		}
		
		@Test
		public void test_getMaxLP_8() {
				SimpleCombatant combatant = new SimpleCombatant();
				int maxLP = combatant._getMaxLP();
				assertEquals(100, maxLP);
		}
		
		@Test
		public void test_getMaxLP_9() {
				SimpleCombatant combatant = new SimpleCombatant();
				int maxLP = combatant._getMaxLP();
				assertEquals(100, maxLP);
		}
		
		@Test
		public void test_getMaxLP_10() {
				SimpleCombatant combatant = new SimpleCombatant();
				int maxLP = combatant._getMaxLP();
				assertEquals(100, maxLP);
		}
}