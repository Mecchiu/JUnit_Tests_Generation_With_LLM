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
		private final PlayerConfiguration config;
		private Lock lock;

		/**
		 * Instantiates a new PlayerConfiguration test with default values.
		 * @throws NullPointerException if any argument is null
		 */
		public PlayerConfiguration_1Test() throws NullPointerException {
			this.config = new PlayerConfiguration(true, false, true);
			assertTrue(this.config.showMoveTargets());
		}

		/**
		 * Instantiates a new PlayerConfiguration test with default values.
		 *
		 * @param showMoveTargets value indicating if lines to movement targets should be
		 *        displayed
		 * @throws NullPointerException if any argument is null
		 */
		public PlayerConfiguration_1Test(boolean showMoveTargets) {
				this.config = new PlayerConfiguration(showMoveTargets);
				assertTrue(this.config.showMoveTargets());
		}

		@Test
		public void testWithDisplayLists() {
				this.lock = new ReentrantLock(true);
				assertTrue(this.config.showMoveTargets());
		}

		@Test
		public void testWithoutDisplayLists() {
				this.lock = new ReentrantLock();
				this.lock.lock();

				assertFalse(this.config.showMoveTargets());
		}

}