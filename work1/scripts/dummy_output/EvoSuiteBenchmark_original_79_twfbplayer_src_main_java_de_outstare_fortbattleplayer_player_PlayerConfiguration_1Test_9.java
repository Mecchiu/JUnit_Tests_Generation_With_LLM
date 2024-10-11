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
		Lock lock = new ReentrantLock();
		PlayerConfiguration player = new PlayerConfiguration();
		@Test
		void showMoveTargets() {
				player.setDefaultValues();
				assertFalse(Configuration.showMoveTargets()); // TODO: Is this true?
                final String[] l = Configuration.getLinesToMove();
                synchronized(lock){
                    configurationChanged("Show move targets");
                         lock.notifyAll();
                }
				assertEquals(l.length, player.getLinesToMove().length);
		}
		@Test
		void testSetLinesToMove(){
				player.setDefaultValues();
				lock.lock();
				try {
					assertEquals(Configuration.getLinesToMove().length, player.getLinesToMove().length);
					assertEquals(Configuration.getLinesToMove()[0], Configuration.getDefaultLineToMove());
				} finally {
                    lock.unlock();
				}
		}
		@Test
		void testGetLinesToMove(){
				lock.lock();
                try {
                    assertTrue(Configuration.getLinesToMove()!= null && Configuration.getLinesToMove().length > 0 && Configuration.getLinesToMove()[0] > 0);
                } finally {
                    lock.unlock();
                }
		}
}