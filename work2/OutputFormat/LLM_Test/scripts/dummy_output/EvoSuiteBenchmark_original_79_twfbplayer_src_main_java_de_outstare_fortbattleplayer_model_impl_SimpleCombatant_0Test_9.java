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
		@org.junit.jupiter.api.Disabled("Forcing a timeout is not supported in this test")
	@Test
    public void getMaxLP() {
            assertEquals("Failed to return the max l of the sector bonus set",
                         2, this.getMaxLP());
    }
    
    //SimpleCombatant.java
    
class SimpleCombatant_1Test {
        @org.junit.jupiter.api.Disabled("Forcing a timeout is not supported in this test")
	@Test
        public void getMaxLp() {
            final String name = "A";
            final Player p = new Player("p", name);
            final PlayerObserver pObserver = new PlayerObserver(p);
            
            // A = 2.5 / 1.2 = 2.5
            final SectorBonus sector = new SectorBonus(CombatantSide.CATEGORY_TOURNAMENT, 2.5, 1.2);
            
            // First time
            final Combatant c = simpleAdd(p, sector, 1.0, "A");
            final CombatantObserver combatantsObserver = new CombatantObserver(pObserver, c);
            
            // Second time
            final Combatant c2 = simpleAdd(p, sector, 2.0, "A");
            final CombatantObserver combatantsObserver2 = new CombatantObserver(pObserver, c2);
            
            // Third time
            final Combatant c3 = simpleAdd(p, sector, 3.0, "A");
            final CombatantObserver combatantsObserver3 = new CombatantObserver(pObserver, c3);
            
            // Third time
            final CombatantCombatant c4 = simpleAdd(p, sector, 4.0, "A");
            final CombatantObserver combatantsObserver4 = new CombatantObserver(pObserver, c4);
            
            // Test
            assertEquals("Failed to return the max l of 3",
                         3.0, c4._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         3.0, pObserver._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         4.0, combatantsObserver._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         4.0, pObserver2._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         3, pObserver3._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         3, c4._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         2, pObserver2._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         2, combatantsObserver._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         2, pObserver3._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         2, combatantsObserver2._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         2, pObserver4._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         2, combatantsObserver4._getMaxL());
            
            assertEquals("Failed to return the max l of 3",
                         4, pObserver2._getMaxL());
        }
        
}
}