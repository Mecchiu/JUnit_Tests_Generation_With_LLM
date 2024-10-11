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
		/**
		 * Class constructor for unit tests.
		 */
		public PlayerConfiguration_1Test() {
		}

		/**
		 * Test of getMoveTargets method, of class PlayerConfiguration.
		 */
		@Test
		public void testGetMoveTargets() {
				final PlayerConfiguration config  = new PlayerConfiguration();
				final Set<String> expected = new HashSet<>();
				assertSame(expected, config.getMoveTargets());
		}

		/**
		 * Test of setMoveTargets method, of class PlayerConfiguration.
		 */
		@Test
		public void testSetMoveTargets() {
				final Set<String> moveTargets = new HashSet<>();
				moveTargets.add("target");
				final PlayerConfiguration config = new PlayerConfiguration();
				config.setMoveTargets(moveTargets);
				assertEquals(moveTargets, config.getMoveTargets());
		}

		/**
		 * Test of addMoveTarget method, of class PlayerConfiguration.
		 */
		@Test
		public void testAddMoveTarget() {
				final PlayerConfiguration config = new PlayerConfiguration();
				config.addMoveTarget("target");
				final Set<String> expected = new HashSet<>();
				assertEquals(expected, config.getMoveTargets());
		}

		/**
		 * Test of addMoveTarget method, of class PlayerConfiguration.
		 */
		@Test
		public void testReplaceAllMoveTarget() {
				final PlayerConfiguration config = new PlayerConfiguration();
				config.addMoveTarget("target");
				config.addMoveTarget("target2");
				final Set<String> expected = new HashSet<>();
				expected.add("target");
				expected.add("target2");
				assertEquals(expected, config.getMoveTargets());
		}

		/**
		 * Test of removeMoveTarget method, of class PlayerConfiguration.
		 */
		@Test
		public void testRemoveMoveTarget() {
				final PlayerConfiguration config = new PlayerConfiguration();
				config.addMoveTarget("target");
				final Set<String> expected = new HashSet<>();
				expected.add("target");
				assertEquals(expected, config.getMoveTargets());
				config.removeMoveTarget("target");
				assertEquals(expected, config.getMoveTargets());
		}

}