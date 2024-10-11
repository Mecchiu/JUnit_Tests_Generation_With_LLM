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
     * unit test for {@link SimpleCombatant#_getMaxLP()}
     */
    @Test
    public void test_getMaxLP() {
    		final int hl = _getMaxLP();
        assertNotEquals(0, hl);
        assertEquals(0, hl);
    }
	
}

// Standard Class Test
static class StandardCombatant extends Combatant {
		
	Logger logger = Logger.getLogger( SimpleCombatant.class.getName());

	public StandardCombatant() {
    super("TEST");
    }

    @Override
    public void addObserver(CombatantObserver observer) {
    	//do nothing
    }
    
    @Override
    public void removeObserver(CombatantObserver observer) {
    	//nothing to do
    }
    
    @Override
    public void notifySectorObstacle(SectorBonus obst) {
    	logger.fine("obst " + obst);
    }


}

/**
* Test for checking compatibility with a Weapon
* in <code>de.outstare.fortbattleplayer.playermodel.Weapon