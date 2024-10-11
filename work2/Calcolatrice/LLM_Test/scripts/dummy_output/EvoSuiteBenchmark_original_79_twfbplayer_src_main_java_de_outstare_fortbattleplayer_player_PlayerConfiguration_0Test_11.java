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
		
	/**
	 * Test method for 'PlayerConfiguration.copy(boolean)'
	 * @throws CloneNotSupportedException
	 * @see PlayerConfiguration#copy(boolean)
	 */
	@Test
	public void testCopyBoolean() throws Exception {
		final Lock lock = new ReentrantLock();
		final PlayerConfiguration clone = new PlayerConfiguration();
		final Set<TKey> cloned = new HashSet<>();
		final Set<TKey> testClone = new HashSet<>();
		
		// check if the lock's state is correctly switched
		assertTrue("Lock isn't switched correctly.", lock.isLocked(), "The test case doesn't work. The state of the "
		+ "the lock isn't set correctly!");
		
		assertTrue("The object has no clone!", clone.clone().equals(clone));
		assertEquals("The object's own hash code isn't the same as the original", clone.getHashCode(),
		clone.getHashCode()); // test if one another is identical
		
		assertTrue("The object have no copy method", clone.equals(clone));
		assertNotEquals("The object's own hash code is the same as original!", clone.getHashCode(),
		clone.getHashCode());
		
		lock.set(false);
		
		assertFalse("The object is the opposite of the original!", clone.equals(clone));
		assertTrue("The object has no clone method", clone.equals(clone));
		
		for(final TKey key : cloned) {
			assertNotEquals("Some internal changes have been made to the original!", key, key);
			assertTrue("Failed",!clone.has(key));
			assertFalse("It has not been copied for the other key!", clone.has(key.getKey()));
			assertNull("The key isn't kept after cloning?", key);
		}
		
		for(final TKey key : testClone) {
			assertTrue("Some internal changes have been made to the original!", key.equals(key));
			assertTrue("Failed",!clone.has(key));
			assertTrue("It has not been copied for the other key!", clone.has(key.getKey()));
			assertNull("The key isn't kept after copying?", key);
		}
		
		for(final TKey key : cloned) {
			assertTrue("The key hasn't been modified by a 'copy'!", key.equals(testClone.get(key)));
		}
	}
}