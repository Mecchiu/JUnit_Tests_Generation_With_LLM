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
		
	/**
	 * Checks that the number of rounds of the battle are equal to the number
	 * of rounds in the original battle.
	*/
	@Test
	public void test() {
		Battleplan battleplan = new Battleplan();
		SortedMap<Long,SortedMap<Integer,Boolean>> testmap =
				battleplan.getTestMap();
		Collection coll = testmap.values().iterator().next().keySet().iterator();
		int numberOfRounds = battleplan.numberOfRounds();
		assertEquals("Number of rounds does not match",numberOfRounds,coll.size());
	}
	
	/**
	 * Checks that the value for all rounds is equal to 0.
	 */
	@Test
	public void testNoRound() {
		Battleplan battleplan = new Battleplan();
		SortedMap<Long,SortedMap<Integer,Boolean>> testmap =
				battleplan.getTestMap();
		Collection<SortedMap<Long,SortedMap<Integer,Boolean>>> coll =
				testmap.values().iterator().next().values();
		int numberOfRounds = battleplan.numberOfRounds();
		assertEquals("Value for round nr: " + numberOfRounds,0,coll.size());
	}
	
	/**
	 * Checks that the values of all rounds are equal to 0 even for rounding 0.
	 */
	@Test
	public void testRround(@SuppressWarnings("UnnecessaryLocalVariable") boolean round0) {
		Battleplan battleplan = new Battleplan();
		SortedMap<Long,SortedMap<Integer,Boolean>> testmap =
				battleplan.getTestMap();
		Collection<SortedMap<Long,SortedMap<Integer,Boolean>>> coll =
				testmap.values().iterator().next().values();
		int numberOfRounds = battleplan.numberOfRounds();
		if (!round0) {
			assertEquals("Value for round nr: ",0,testmap.keySet().size());
			assertEquals("Values of all rounds differ",0,coll.size());
		}
		for (int i = 0; i < numberOfRounds-1; i++) {
			assertEquals("Value for round nr: " + i,0,coll.size());
		}
	}
	
	/**
	 * Checks that a new map is generated for all rounds.
	 */
	@Test
	public void testGetNewMap() {
		Battleplan battleplan = new Battleplan();
		Collection<SortedMap<Long,SortedMap<Integer,Boolean>>> coll =
				battleplan.getTestMap().values().iterator().next().values();
		assertTrue("New map should be empty",coll.isEmpty());
	}
	
	/**
	 * Tests adding a rounding to a battlemap.
	 *
	 * @param expectedToAdd
	 *               additional checking required
	 */
	@Test
	public void testAddRounding(boolean expectedToAdd) {
		Battleplan battleplan = new Battleplan(1);
		SortedMap<Long,SortedMap<Integer,Boolean>> testmap =
				battleplan.getTestMap();
		Collection<SortedMap<Long,SortedMap<Integer,Boolean>>> coll =
				testmap.values().iterator().next().values();
		logger.info("Number of rounds: " + battleplan.numberOfRounds());
		logger.info("Add rounding for rounding 0");
		int expected = battleplan.addRounding(0,10);
		logger.info("" + expected);
		assertTrue("round0 check failed",expected == coll.get(0).get(1));
		
		logger.info(
				"Add rounding for rounding 1 and no rounding 0");
		int i1 = battleplan.addRounding(1,10);
		logger.info("" + i1);
		assertEquals("round1 check failed",0,i1);
				
		testmap = battleplan.getTestMap();
		logger.info("Number of rounds: " + testmap.size());
		Collection<SortedMap<Long,SortedMap<Integer,Boolean>>> newValues =
				testmap.values().iterator().next().values();
		logger.info("Number of rounds: " + newValues.size());
		assertEquals("Rounding added",expected,newValues.size());
		assertTrue("Rounding was added correctly",newValues.containsEntry(1,new TreeMap<Integer,Boolean>()));
		assertTrue("round0 check fails",!newValues.contains(new TreeMap<Long,SortedMap<Integer,Boolean>>()));
	}
	
	/**
	 * Creates a test map that contains a number of rounds per round 0.
	 *
	 */
	private class Battleplan {
		
		/**
		 * @return the number of rounds
		 */
		private SortedMap<Long,SortedMap<Integer,Boolean>> getTestMap() {
			SortedMap<Long,SortedMap<Integer,Boolean>> testmap =
					new TreeMap<Long,SortedMap<Integer,Boolean>>();
			testmap.put(0L,new TreeMap<Integer,Boolean>());
			return testmap;
		}

	}
}