// PlayerConfiguration_0Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_0Test {
		private PlayerConfiguration obj1;

		/**
		 * Test method for
		 * {@link PlayerConfiguration#PlayerConfiguration(java.util.HashSet)}
		 *.
		 *
		 * <ol>
		 * <li> Check if null given as parameters </li>
		 * <li> Check if given null</li>
		 * <li> Lock</li>
		 * <li> Check of set</li>
		 * <li> Unlock*/
		@Test
		public void testPlayerConfiguration() {
					try {
						final Lock lock = new ReentrantLock();
			lock.lock();
						final Set<String> values2 = new HashSet<>();
			obj1 = this.newPlayerConfiguration(values2);
			lock.unlock();
						assertNull(values2);
					} catch (IllegalArgumentException e) {
						fail("Illegal argument");
			}
		}

		/**
		 * Test method for
		 * {@link PlayerConfiguration#PlayerConfiguration()}
		 *
		 * <ol>
		 * <li> Check if null given as parameter </li>
		 * <li> Check if given null</li>
		 * <li> Lock</li>
		 * <li> Unlock</li>
		 * <li> Check of set</li>
		 * <li> Check of remove</li>
		 * <li> Check of removeAll </li>
		 * <li> Check if player set has size zero</li>
    assertTrue(true);
    * </ol>
		*/

		@Test
		public void testPlayerConfiguration() {
					lock();
			obj1.setPlayerState(PlayerState.BELIEVING);
			lock.unlock();
		}
}