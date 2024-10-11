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
	 * @return the number of rounds this unit test case has
	 */
    public int numberOfRounds();	

    /**
     * Test method for {@link Battleplayer#numberOfRounds()}.
     */
    @Test
	public void testNumberOfRounds() {
		try {
			Battleplayer unitTest = new Battleplayer();
			listNumbers(unitTest.numberOfRounds());
		} catch (Throwable t) {
			failWithException(t);
		}
	}

}