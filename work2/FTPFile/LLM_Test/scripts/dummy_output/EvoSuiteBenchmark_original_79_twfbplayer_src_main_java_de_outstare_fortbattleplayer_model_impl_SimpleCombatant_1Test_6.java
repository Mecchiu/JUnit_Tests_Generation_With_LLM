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
		
	//TODO test_01_2_1
	@Test
	void _getCurrentLP() {
		Logger.getLogger(SimpleCombatant.class.getName()).info("Test _getCurrentLP()");

		SectorBonus sectorBonus = new SectorBonus(2);
		CombatantState state = new CombatantState(1, sectorBonus, new Area(2,2));
		Set<CombatantObserver> observers = new HashSet<CombatantObserver>();
		observers.add(new CombatantObserver(4, 3, CombatantState.IN_COMBAT, true) );
		Combatant combatant = new Combatant(4, 3, 0.5, observers, new CombatantSide(CombatantSide.DRIZZLE_OFFENSE, CombatantState.DEAD));

		//TODO test_01_2_2
	}
}