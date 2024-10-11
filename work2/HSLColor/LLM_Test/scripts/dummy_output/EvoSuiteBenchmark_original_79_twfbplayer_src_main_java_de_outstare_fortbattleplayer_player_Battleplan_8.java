// BattleplanTest.java
package de.outstare.fortbattleplayer.player;

import java.util.Collection;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplan}.
* It contains one unit test case for the {@link Battleplan#numberOfRounds()} method.
*/
class BattleplanTest {
		private static final Logger log = Logger.getLogger(BattleplanTest.class.getName());
		@Test
		void numberOfRounds_is_correct() {
			Collection<Battleplan> plans = new Battleplan().plan();
			log.info("Number of plans: " + plans.size());
			assertEquals("Number of plans must be 1", 1, plans.size());
		}
}