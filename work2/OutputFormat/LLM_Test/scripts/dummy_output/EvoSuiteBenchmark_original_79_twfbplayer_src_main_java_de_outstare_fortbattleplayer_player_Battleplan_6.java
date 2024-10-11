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
	 * A unit test which checks {@link Battleplan#numberOfRounds()}
	 */
	@Test
	void test() {
		
		int expectedNumIters = 0;
		SortedMap<Integer,Integer> expectedRoundNumberMap = new TreeMap<>();
		
		// First round
		Battleplan testPlan = new Battleplan();
		Collection<Map<Integer,Integer>> result = testPlan.findAllRounds();
		expectedNumIters = result.size();
		for(Map<Integer,Integer> map : result) {
			assertEquals(map.size(),expectedNumIters);
			int firstIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			int secondIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			expectedRoundNumberMap.put(firstIter,secondIter);			
			expectedRoundNumberMap.put(secondIter,firstIter);			
		}
		
		//Second round
		testPlan = new Battleplan();
		result = testPlan.findAllRounds();
		for(Map<Integer,Integer> map : result) {
			assertEquals(map.size(),expectedNumIters);
			int firstIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			int secondIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			expectedRoundNumberMap.put(firstIter,secondIter);			
			expectedRoundNumberMap.put(secondIter,firstIter);			
		}
		
		// Third round
		testPlan = new Battleplan();
		result = testPlan.findAllRounds();
		for(Map<Integer,Integer> map : result) {
			assertEquals(map.size(),expectedNumIters);
			int firstIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			int secondIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			expectedRoundNumberMap.put(firstIter,secondIter);			
			expectedRoundNumberMap.put(secondIter,firstIter);			
		}
		
		// Fourth round
		testPlan = new Battleplan();
		testPlan.addRoundAndMoveIters(5, 5);
		expectedRoundNumberMap.put(5,6);
		expectedRoundNumberMap.put(6,5);
		
		result = testPlan.findAllRounds();
		for(Map<Integer,Integer> map : result) {
			assertEquals(map.size(),expectedNumIters);
			int firstIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			int secondIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			expectedRoundNumberMap.put(firstIter,secondIter);			
			expectedRoundNumberMap.put(secondIter,firstIter);			
		}
		
		// Fifth round
		testPlan = new Battleplan();
		testPlan.addRoundAndMoveIters(5, 5);
		expectedRoundNumberMap.put(6,5);
		expectedRoundNumberMap.put(5,6);
		
		result = testPlan.findAllRounds();
		for(Map<Integer,Integer> map : result) {
			assertEquals(map.size(),expectedNumIters);
			int firstIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			int secondIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			expectedRoundNumberMap.put(firstIter,secondIter);			
			expectedRoundNumberMap.put(secondIter,firstIter);			
		}
		
		// Sixth round
		testPlan = new Battleplan();
		testPlan.addRoundAndMoveIters(5, 5);
		expectedRoundNumberMap.put(5,6);
		expectedRoundNumberMap.put(2,2);
		
		result = testPlan.findAllRounds();
		for(Map<Integer,Integer> map : result) {
			assertEquals(map.size(),expectedNumIters);
			int firstIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			int secondIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			expectedRoundNumberMap.put(firstIter,secondIter);			
			expectedRoundNumberMap.put(secondIter,firstIter);			
		}
		
		// Seventh round
		testPlan = new Battleplan();
		testPlan.addRoundAndMoveIters(5, 5);
		expectedRoundNumberMap.put(5,6);
		expectedRoundNumberMap.put(3,3);
		
		result = testPlan.findAllRounds();
		for(Map<Integer,Integer> map : result) {
			assertEquals(map.size(),expectedNumIters);
			int firstIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			int secondIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			expectedRoundNumberMap.put(firstIter,secondIter);			
			expectedRoundNumberMap.put(secondIter,firstIter);			
		}
		
		// Eight Round
		testPlan = new Battleplan();
		testPlan.addRoundAndMoveIters(5, 5);
		expectedRoundNumberMap.put(5,6);
		expectedRoundNumberMap.put(8,8);
		
		result = testPlan.findAllRounds();
		for(Map<Integer,Integer> map : result) {
			assertEquals(map.size(),expectedNumIters);
			int firstIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			int secondIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			expectedRoundNumberMap.put(firstIter,secondIter);			
			expectedRoundNumberMap.put(secondIter,firstIter);			
		}
		
		// Ten rounds
		testPlan = new Battleplan();
		testPlan.addRoundAndMoveIters(5, 5);
		expectedRoundNumberMap.put(10,10);
		expectedRoundNumberMap.put(5,10);
		
		result = testPlan.findAllRounds();
		for(Map<Integer,Integer> map : result) {
			assertEquals(map.size(),expectedNumIters);
			int firstIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			int secondIter = Math.floorMod(map.floorIterator().nextInt(),2d)+1;
			expectedRoundNumberMap.put(firstIter,secondIter);			
			expectedRoundNumberMap.put(secondIter,firstIter);			
		}
		
		assertTrue("Unable to find correct number of rounds",expectedRoundNumberMap.size() == testPlan.numberOfRounds());
		
	}

	@SuppressWarnings("unchecked")
    Logger log = Logger.getLogger(BattleplanTest.class.getName());

}