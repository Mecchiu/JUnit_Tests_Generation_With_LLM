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
		
	/**
     * The battle has been initialized.
     */
    @Test
    public void battleHasBeenInitialized() {
        Logger.getGlobal().setLevel(Logger.Level.FINER);
        Battleplayer battle = new Battleplayer();
        assertEquals("Rounds", battle.numberOfRounds(), 0);
    }
    
	/**
     * A Battleplayer has one unit test.
     */
    @Test
    public void hasOneUnitTest() {
        Battleplayer battle = new Battleplayer();
        assertTrue("Only one unit test", battle.numberOfRounds() > 0);
    }
    
	/**
     * A Battleplayer has multiple unit tests but not this one.
     */
    @Test
    public void hasMultipleUnitTests() {
        Battleplayer battle = new Battleplayer();
        // unit test for a couple of times
        battle.addUnitTest("this unit test");
        assertEquals("One unit test", battle.numberOfRounds(), 1);
        
        battle.addUnitTest("another unit test");
        assertEquals("Another unit test", battle.numberOfRounds(), 2);
    }
    
}