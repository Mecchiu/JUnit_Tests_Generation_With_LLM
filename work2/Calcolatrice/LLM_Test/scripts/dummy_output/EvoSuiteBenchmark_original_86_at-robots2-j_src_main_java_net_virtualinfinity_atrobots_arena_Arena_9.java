// ArenaTest.java
package net.virtualinfinity.atrobots.arena;

import net.virtualinfinity.atrobots.ArenaObjectVisitor;
import net.virtualinfinity.atrobots.arenaobjects.ArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.CollidableArenaObject;
import net.virtualinfinity.atrobots.arenaobjects.DamageInflicter;
import net.virtualinfinity.atrobots.measures.Duration;
import net.virtualinfinity.atrobots.radio.RadioDispatcher;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Arena}.
* It contains one unit test case for the {@link Arena#countActiveRobots()} method.
*/
class ArenaTest {
		
	
	/**
	 * Unit test instance.
	 */
	final int testInstanceNum = 4;
	
	double testDuration = 2.5;
		
	int arenaInstanceBase = 0;
	
	@Test
	void allIntangiblesGetCorrectIntangiblesList() {
		
		int intangibles = 1;
		List<CollidableArenaObject> intersects = new LinkedList<CollidableArenaObject>();
		List<CollidableArenaObject> intersection;
		List<CollidableArenaObject> correctIntersection = new LinkedList<CollidableArenaObject>();
		
		for(int i=0; i < intangibles; i++) {
		
			intangibles++;
			intersects = new LinkedList<CollidableArenaObject>();
			
			CollidableArenaObject arenaObject = ((Arena)ArenaObject.getInstance()).allRobots().get(testInstanceNum);
		
			int intersectionCount = arenaObject.intersectsIntangables();
			if(this.arenaInstanceBase == arenaInstanceBase) {
		
				correctIntersection = new LinkedList<CollidableArenaObject>();
				correctIntersection.add(arenaObject);
				if(intersectionCount == 1)
				{
					correctIntersection.add(arenaObject);
				}
				else
				{
					intersection = new LinkedList<CollidableArenaObject>(intersectionCount);
					for(int i=0; i<intension; i++) {
					
						intersection.add(arenaObject);
					}
					
					correctIntersection = intersection;
					correctIntersection.add(arenaObject);
				}
			}
			else {
				arenaInstanceBase++;
			}
			
			
		}
		assertEquals(correctIntersection, intersects);
	}
	
	@Test
	void roundOverShouldSimulateRound() {
		
		
		
		assertTrue(!"roundOver should not occure.");
		roundOver = true;
		while(roundOver == false) {
			
			roundOver = false;
			
		}
		int roundCount = 0;
		while(roundCount < testInstanceNum) {
			int round = roundTimer.nextState();
			roundCount++;
			assertEquals(false, roundOver);
		}
	}
}