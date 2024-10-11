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
		
	private static final Logger LOGGER = Logger.getLogger(Battleplayer.class.getName());
 
    @Test
    void testNumberOfRounds() {
    	int expected = 3;
    	assertEquals("Wrong number of rounds!",expected,Battleplayer.numberOfRounds());
    }

    @Test
    void testEconoisInCombatant() {
    	Set<Combatant> econoisInCombatant = new HashSet<Combatant>();
		for(int i = 0;i<3;i++) {
			econoisInCombatant.add(Battleplayer.getCombatant(i));
		}
		
		for(Combatant ecoInCombatant : econoisInCombatant) {
			assertTrue("Wrong battleplayer does not fight!", econoInCombatant.fight());
		}
    }

    /* Unit test cases */

    @Test
    void testListUnit() {
    	List<Combatant> listUnit = new ArrayList<Combatant>();
		Battleplayer bp = new Battleplayer();
		
		Combatant bc1 = bp.getCombatant(Combatant.HUMAN_BLACK);
		Combatant bc2 = bp.getCombatant(Battleplayer.UNIT_BLACK);
		Combatant bc3 = bp.getCombatant(Battleplayer.UNIT_WARRIOR);
		Combatant bc4 = bp.getCombatant(Battleplayer.UNIT_PRIEST);
		Combatant dp1 = bp.getCombatant(Battleplayer.MOVING_DODGE);
		
		// check if list unit contains bc1
    	assertTrue("Wrong list unit!",bc1.equals(listUnit.get(Combatant.HUMAN_BLACK)));
		// list unit does not contain bc2
    	assertFalse("Wrong list unit!",bc2.equals(listUnit.get(Battleowner.COMBATANT)));
		// list unit does not contain bc3
    	assertFalse("Wrong list unit!",bc3.equals(listUnit.get(Battleowner.COMBATANT)));
		// list unit does not contain bc4
    	assertFalse("Wrong list unit!",bc4.equals(listUnit.get(Battleowner.COMBATANT)));
		// list unit does not contain dp1
    	String dpStr = Combatant.getTextForEnum(Battleowner.COMBATANT);
    	assertFalse("Wrong list unit!",dp1.equals(listUnit.get(Battleowner.COMBATANT)));
		// list unit does not contain dp2 
    	assertFalse("Wrong list unit!",dp2.equals(listUnit.get(Battleowner.COMBATANT)));
    }
    
    @Test
    void testSetCombatants() {
    	Battleplayer bp = new Battleplayer();
    	
		Set<Combatant> e = new HashSet<Combatant>();
		for(int i = 0;i<3;i++) {
			e.add(bp.getCombatant(Battleowner.COMBATANT));
		}
		for(Combatant c : e) {
			assertTrue("Wrong list unit contains bc: "+c.getCombatant().getCombatant(), c.equals(bp.getCombatant(Battleowner.COMBATANT)));
			//list Unit contains bc and dp
			String dp = Combatant.getTextForEnum(Battleowner.COMBATANT);
			if(dp.equals("warrior")) {
				assertTrue("Wrong list unit contains bc: "+bp.getCombatant(Battleowner.COMBATANT), c.equals(bp.getCombatant(Battleowner.COMBATANT)));
			}
			else {
				assertFalse("Wrong list unit contains bc: "+bp.getCombatant(Battleowner.COMBATANT).getCombatant(), c.equals(bp.getCombatant(Battleowner.COMBATANT)));
			}
    		
		}
    }
}