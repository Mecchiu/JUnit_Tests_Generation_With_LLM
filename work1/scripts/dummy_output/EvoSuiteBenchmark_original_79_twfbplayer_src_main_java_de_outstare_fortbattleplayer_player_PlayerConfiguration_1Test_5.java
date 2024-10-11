// PlayerConfiguration_1Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains one unit test case for the {@link PlayerConfiguration#showMoveTargets()} method.
*/
class PlayerConfiguration_1Test {
		setUp;
		@Test
		void testShowMoveTargets() {
			
			new Set(Configuration.player1, Configuration.player2, Configuration.playerPlayer3)
				.stream().filter(c -> c.isTickInRange(Configuration.player1.tickInterval).value() > 0).forEach(
					c -> assertTrue(c.getMoveTargets().size() > 0));				
		}
}