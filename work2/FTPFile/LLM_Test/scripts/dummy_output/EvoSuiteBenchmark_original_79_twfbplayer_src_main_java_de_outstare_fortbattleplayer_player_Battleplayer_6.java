// BattleplayerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplayer}.
* It contains one unit test case for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {
		
	@Test
	void numberOfRounds() {
		Battleplayer battle = new Battleplayer();
		assertEquals(0, battle.numberOfRounds());
	}
	
	@Test
	void setAndRetrieveCombatants() {
		List<Combatant> combatants = new ArrayList<>();
		Set<Combatant> expectedCombatants = new HashSet<>();
		
		expectedCombatants.add(new Combatant(0, "0"));
		expectedCombatants.add(new Combatant(1, "1"));
		combatants.addAll(expectedCombatants);
		
		Battleplayer battle = new Battleplayer();
		Combatant temp = battle.getCombatant(combatants);
		
		assertEquals(expectedCombatants, temp.getCombatants());
		
		combatants = new ArrayList<>();
		combatants.add(battle);
		combatants.add(new Combatant(2, "2"));
		combatants.add(new Combatant(3, "3"));
		
		expectedCombatants.clear();
		expectedCombatants.add(new Combatant(4, "4"));
		expectedCombatants.add(new Combatant(5, "5"));
		
		combatants.addAll(expectedCombatants);
		
		battle.setCombatants(combatants);
		temp = battle.getCombatant(combatants);
		temp.setCombatants(combatants);
		assertEquals(expectedCombatants, temp.getCombatants());
	}
}