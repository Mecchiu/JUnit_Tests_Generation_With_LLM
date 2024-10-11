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
		
	/** Constructor */
    private BattleplanTest() {}
    
	/**
	 * Tests if a number of rounds are correct.
	 * The number of rounds needs to be lower than the number of rounds for
	 * each step to fail.
	 */
	@Test
	public final void numberOfRounds() {
        Logger.getLogger(BattleplanTest.class.getPackage().getName()).info("Test, test if number of rounds is correct");
		try {
			SortedMap<Integer, Integer> map = createFromCollection(6);
    	assertEquals(6, 0, "Expected a map with a single integer value!");
    	assertEquals(3, 1, "Expected a map with a single integer value!");
    	assertEquals(2, 2, "Expected a map with a single integer value!");
    	assertEquals(3, 3, "Expected a map with a single integer value!");
    	assertEquals(4, 4, "Expected a map with a single integer value!");
    	assertEquals(5, 5, "Expected a map with a single integer value!");
    	assertEquals(3, 3, "Expected a map with a single integer value!");
			assertEquals(3, 3, "Expected a map with a single integer value!"); 
			assertEquals(2, 2, "Expected a map with a single integer value!"); 
			assertEquals(2, 2, "Expected a map with a single integer value!"); 
			assertEquals(2, 2, "Expected a map with a single integer value!"); 
			assertEquals(1, 1, "Expected a map with a single integer value!"); 
			assertEquals(1, 1, "Expected a map with a single integer value!");
			//assertEquals(1, 1, "Expected a map with a single integer value!"); 
			//assertEquals(1, 1, "Expected a map with a single integer value!");
		} catch (Exception e) {
			fail("There was an exception: " + e.getMessage());			
		}
		//fail("All possible values are correct");

		fail("You cannot test this test!");
    }

	/**
	 * @param map the map to create with a single integer value
	 * @return the created object map
	*/
    private SortedMap<Integer, Integer> createFromCollection(Integer... map) {
    	SortedMap<Integer, Integer> map = new TreeMap<Integer, Integer>();
    	for (Integer value : map) {
    	    map.put(value, value);
    	}
    	return map;
    }

	/**
	 * @see Test#runTest()
	 */
	@Override
	protected final void runTest() {
		fail("No test method implemented");
	}
}