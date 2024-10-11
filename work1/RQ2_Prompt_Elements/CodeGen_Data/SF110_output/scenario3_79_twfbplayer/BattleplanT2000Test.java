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
	 * Logger for test cases.
	 */
    private final Logger LOG = Logger.getLogger(BattleplanTest.class.getName());																											//	 .create();	//
	
	private final SortedMap<String, SortedMap<Integer, String>> battles;

	// ---------------------------------------------
	// Constructor
	// ---------------------------------------------
	public BattleplanTest() {
		this.battles = new TreeMap();
	}
	
	// ----------------------------------------------
	// Getters and setters
	// ----------------------------------------------
	/**
	 * @return number of the planned scenarios
	 */
	public int numberOfRounds() {
		return this.numberOfRounds;
	}
		
	/**
	 * @param n number of the planned scenarios
	 */
	public void setNumberOfRounds(int n) {
		this.numberOfRounds = n;
	}
		
	// ---------------------------------------------
	// Main functions
	// ---------------------------------------------
	/**
	 * @param scenario scenario
	 */
	public void build(Battle scenario) {
		
		for(String s : scenario.getParameters().keySet()) {
			for(int i = 0; i < scenario.getParameters().get(s).values().size(); i++) {
				SortedMap<Integer, String> m = this.battles.get(s);
				if(m == null) {
					m = new TreeMap();
					m.put(Integer.valueOf(i), scenario.getParameters().get(s).get(i));
					this.battles.put(s, m);
				}
				m.put(Integer.valueOf(i), scenario.getParameters().get(s).get(i));
			}
		}
		
		LOG.severe("battles done. Number of rounds = " + this.numberOfRounds());
	}
	
	// -----------------------------------------------------------
	// Tests
	// -----------------------------------------------------------
	/**
	 * Tests that a battles is build for a single scenario
	 */
	@Test
	public void test() {
		Battle scenario = new Battle("my first scenario");
		Battle scenario1 = new Battle("my second scenario");
		Battle plan = new Battleplan(scenario);
		
		plan.build(scenario);
		
		assertEquals(0, plan.numberOfRounds());
		
		scenario1.setName("my first plan");
		scenario.setName("my second scenario");
		plan.build(scenario1);
		
		assertEquals(scenario1.numberOfRounds(), plan.numberOfRounds());
		
		Collection<Battle> battles = plan.getBattles();
		assertEquals(plan.numberOfRounds(), battles.size());
	}
}
