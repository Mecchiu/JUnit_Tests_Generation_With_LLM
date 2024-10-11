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
final static Set<String> NO_LINES = new HashSet<>();
		static {
			NO_LINES.add("");
		}
		
	/**
	 * Unit test cases.
	 */
	@Test
	void test() {
		final Lock lock = new ReentrantLock(true);
		final Lock lock2 = new ReentrantLock();
		// Check lock.
		assertNotNull(lock);
		assertSame(lock, lock2);
		lock.lock();
		assertNotNull(lock2);
		assertSame(lock, lock2);
		// Do locking.
		lock.lock();
		lock.lock();
		lock2.unlock();
		lock.unlock();
        // Check no locks.
		assertNull(lock);
		assertEquals(NO_LINES, NO_LINES);
	}
}
