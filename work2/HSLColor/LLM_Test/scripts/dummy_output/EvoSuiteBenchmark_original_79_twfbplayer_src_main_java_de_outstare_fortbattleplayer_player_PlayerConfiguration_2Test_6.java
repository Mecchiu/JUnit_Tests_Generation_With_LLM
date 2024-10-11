// PlayerConfiguration_2Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {
		// Unit test cases for default settings/locking/locking
		@Test
		void defaultConfiguration();
	
		// Unit test cases for testing configuration value override
		@Test
		void overridingConfiguration();
	
		// Unit test cases for locked/unlocked operations
		@Test
		void lockingNotLocked();
		@Test
		void lockingLocked();
		@Test
		void unlockingLocked();
	
		// Unit test cases for changing the lock order
		@Test
		void orderChange();
		@Test
		void changingUnlockOrder();
		@Test
		void changingLockingOrder();
		@Test
		void changingLockingLockedOrder();
	
		@Test
		void reorderingLocks();
	
		// PlayerConfiguration_2Test.java
		public static void main(String[] args) {
            String version = Configuration.getConfig().getProperty("player.version");
			long seed = Configuration.getConfig().getProperty("player.seed");
			boolean playGame = (boolean)Configuration.getConfig().getProperty("play.game");
			PlayerConfiguration p = new PlayerConfiguration()
                   .seed(seed)
                   .version(Integer.parseInt(version))
                   .mode((byte) playGame? 1 : 0)
                   .isShowShootline(true)
                   .playWith(new PlayerConfiguration())
                   .startupGame();
			assertSame(p.getMode(), 1);
			
            p.getConfiguration().showShootline();
			try {
				p.getLockedPlayer().getPlayer();
				p.getUnlockedPlayer().getPlayer();
			} catch (final OutOfResourcesException e) {
				// Should happen if the player was not locked.
			}
		}
		
}