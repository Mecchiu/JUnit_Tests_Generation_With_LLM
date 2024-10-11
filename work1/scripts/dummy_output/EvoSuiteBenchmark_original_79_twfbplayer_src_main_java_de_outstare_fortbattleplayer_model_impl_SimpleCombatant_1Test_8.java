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
		private static final Set<Combatant> COUNT_BEFORE_SETUP = new HashSet<Combatant>();
		static {
				COUNT_BEFORE_SETUP.add(new SimpleCombatant(CombatantSide.HAND, false));
		}

		String className;
        
		private static final Logger logger = Logger.getLogger(Combatant_1Test.class.getName());
        
		private static final SectorBonus bonus = new SectorBonus(100, 0);

	public SimpleCombatant_1Test() {
		this.className = BasicConstantTest.class.getCanonicalName();
		logger.setLevel(Logger.getLogger("computecombatant.ComputationLogging").getLevel());
	}

		@Test
		public void test1() {
			assertEquals((Integer) 1, new SimpleCombatant("Hand", true)._getCurrentLP());
		}

		@Test
		public void test2() {
			new SimpleCombatant(CombatantSide.HEAD, false)._setHP(-1);
			assertEquals((Integer) -1, new SimpleCombatant("Hand", true)._getCurrentLP());
		}

		@Test
		public void test3() {
			new SimpleCombatant(CombatantSide.BODY, false)._setHP(-1);
			assertEquals((Integer) -1, new SimpleCombatant("Hand", true)._getCurrentLP());
		}

		@Test
		public void test4() {
			new SimpleCombatant(CombatantSide.HEAD, false)._setHP(100);
			assertEquals((Integer) 100, new SimpleCombatant("Hand",true)._getCurrentLP());
		}
	}