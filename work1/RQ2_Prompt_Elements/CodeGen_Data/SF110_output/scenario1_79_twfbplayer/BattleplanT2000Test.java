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
private final Battleplan battlePlan;

	public BattleplanTest(final Battleplan battleplan) {
		this.battlePlan = battleplan;
	}

	@Test
	void numberOfRoundsTest() {
		assertEquals(5, battlePlan.numberOfRounds());
	}

	@Test
	void getRoundTest() {
		// Create the second round
		SortedMap<Double, Collection<Integer>> sortedRound;
		{
			SortedMap<Double, Collection<Integer>> sortedRound2 = new TreeMap<>();
			sortedRound2.put(1.5d, new Collection<>());
			sortedRound2.put(1.0d, new Collection<>());
			rounds.put(1, sortedRound2);
		}
		// Now we can create the test round
		assertEquals(5, battlePlan.getRound().size());
		SortedMap<Double, Collection<Integer>> round = battlePlan.getRound();
		SortedMap<Double, Collection<Integer>> sortedRound2 = new TreeMap<>();
		for (Collection<Integer> testRound : round.keySet()) {
			sortedRound2.put(round.get(testRound), new Collection<>());
		}
		// compare the rounds with the last order
		assertEquals("round1: " + battlePlan.format(round2), "round1: " + battlePlan.format(sortedRound), assertListOrdering(sortedRound2));
		sortedRound2.put(1.0d, new Collection<>());
		assertEquals("round2: " + battlePlan.format(round2), "round1: " + battlePlan.format(sortedRound), assertListOrdering(sortedRound2));
		assertEquals("round3: " + battlePlan.format(round3), "round2: " + battlePlan.format(sortedRound), assertListOrdering(sortedRound2));
		sortedRound2.put(1.5d, new Collection<>());
		assertEquals("round3: " + battlePlan.format(round3), "round2: " + battlePlan.format(sortedRound), assertListOrdering(sortedRound2));
		sortedRound2.put(1.0d, new Collection<>());
		assertEquals("round4: " + battlePlan.format(round4), "round3: " + battlePlan.format(sortedRound), assertListOrdering(sortedRound2));
		sortedRound2.put(0.5d, new Collection<>());
		assertEquals("round5: " + battlePlan.format(round5), "round4: " + battlePlan.format(sortedRound), assertListOrdering(sortedRound2));
		sortedRound2.put(0.0d, new Collection<>());
		assertEquals("round6: " + battlePlan.format(round6), "round5: " + battlePlan.format(sortedRound), assertListOrdering(sortedRound2));
		sortedRound2.put(0.5d, new Collection<>());
		assertEquals("round7: " + battlePlan.format(round7), "round6: " + battlePlan.format(sortedRound), assertListOrdering(sortedRound2));
		sortedRound2.put(0d, new Collection<>());
		assertEquals("round8: " + battlePlan.format(round8), "round7: " + battlePlan.format(sortedRound), assertListOrdering(sortedRound2));
		sortedRound2.put(0.5d, new Collection<>());
		assertEquals("round9: " + battlePlan.format(round9), "round8: " + battlePlan.format(sortedRound), assertListOrdering(sortedRound2));
	}

	private void assertListOrdering(final SortedMap<Double, Collection<Integer>> sortedMap) {
		StringBuilder sb = new StringBuilder();
		for (Integer first : sortedMap.keySet()) {
			sb.append(first)
			.append(": ")
			.append(sortedMap.get(first));
			Collection<Integer> rval = sortedMap.get(first);
			if (rval!= null &&!rval.isEmpty()) {
				assertListOrdering(sb.append(", ").append(rval).append(")");
			}
		}
	}

	@Test
	void createRoundTest() {
		// create the battle
		battlePlan.createRound();
		// create the actual round
		assertEquals(6, battlePlan.round().size());
	}

}
// BattleplanTest.java