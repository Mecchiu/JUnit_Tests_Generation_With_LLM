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
private final Set<String> TEST_CALLS = new HashSet<>();
	 
	/**
	* Test {@link Configuration#hasValue(Integer)} method for a
	* {@link PlayerConfiguration_0Test#TEST_CALLS} with a number equal to
	* <code>1</code>
	*/	
	@Test
	public void testTestsWithOneTestAndOneCalc() {

		assertEquals(this.TEST_CALLS.size(), 0);

		int value = 1;
		PlayerConfiguration_0 other = new PlayerConfiguration_0();

		other.addCalc(value);
		assertEquals(
				this.TEST_CALLS,
				new Set<>(values()
		)); // Set is not modified

		other = this.copy();

		other.addCalc(value);

		assertEquals(
				this.TEST_CALLS,
				new HashSet<>(values())); // Set is modified
	}

		/**
	* Test {@link Configuration#containsIndex(Integer)} for a
	* {@link PlayerConfiguration_0Test#TEST_CALLS} with a number in
	* the {@link PlayerConfiguration_0Test#TEST_CALLS} that is equal to
	* <code>2</code>
	*/	
	@Test
	public void testTestsWithOneThenTheOtherContains() {

		int value = 1;
		PlayerConfiguration_0 other = new PlayerConfiguration_0();

		other.addCalc(value);
		assertTrue(
				other.containsIndex(value));

		other.addCalc(value+1);

		assertFalse(other.containsIndex(value+1));

		other = this.copy();

		other.addCalc(value);

		other.addCalc(value);

		assertTrue(other.containsIndex(value));

		other = this.copy();

		other.addCalc(value+1);
		assertFalse(other.containsIndex(value+1));

		other = this.copy();

		other.addCalc(value);

		assertTrue(other.containsIndex(value));

		other = this.copy();

		other.addCalc(value+1);
		assertFalse(other.containsIndex(value+1));

		other = this.copy();

		other.addCalc(value);
		assertTrue(other.containsIndex(value+1));
	}

	/**
	* Test {@link PlayerConfiguration#getCalls()} for a {@link PlayerConfiguration_0Test#TEST_CALLS} with a string value.
	* The value should be copied into the array before being sent to the server.
	*/	
	@Test
	public void testTestsWithOneThenGetCalls() {

		// Test with one string -> test with string's copy.
	    int value = 1;
		PlayerConfiguration_0 other = new PlayerConfiguration_0();

		other.addCalc(value);

		assertEquals(1, this.getCalls().size());

		other.addString(value+2);

		assertEquals(2, values().size());

		other.setDefault();

		other.addString(value+1);

		assertEquals(3, values().size());
	}
}