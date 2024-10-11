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
@Test
		public void testGetCurrentLP() {
			// setup
            SimpleCombatant ob = new SimpleCombatant();
        	CombatantState stat = new CombatantState();
            Set<CombatantSide> sideSet = new HashSet<CombatantSide>();
            sideSet.add(CombatantSide.OUTSIDE);
            sideSet.add(CombatantSide.INSIDE);
            Area a;
            WeaponData wd;
            Set<CombatantSide> pSet;
            CharacterClass cs;
            SectorBonus sec;
            Weapon w;
			Combatant c1;
			
			// test
			c1 = ob.getCombatant(sideSet, stat, a, wd, cs, sec, pSet, w);
			assertNotNull(c1);
			assertTrue(c1!= null);
			assertEquals(c1.getID(), CombatantState.CREATED);
		}
}