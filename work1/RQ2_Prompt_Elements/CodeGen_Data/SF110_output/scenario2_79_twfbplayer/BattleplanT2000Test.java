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

	private static final Logger logger = Logger.getLogger(BattleplanTest.class
												.getName());

	/**
     * Test method for {@link Battleplan#numberOfRounds()}.
     *
     * @throws Exception if an error occurs
     */
	@Test
	public final void testNumberOfRounds() throws Exception {
		Battleplan battleplan = new Battleplan();
		NumberOfRounds test = battleplan.numberOfRounds();
		logger.fine("The test for {0} has been finished", battleplan.getClass().getName());
		assertTrue(test.rounds.isEmpty());
	}
	
	/**
     * Test method for {@link Battleplan#applySteps(Collection, Collection, SortedMap, SortedMap, SortedMap).get(n-1}
     *
     * @throws Exception if an error occurs
     */
	@Test
    public final void testApplyStepsNeg1() throws Exception {
        logger.fine("Test for {0}", Battleplan.class.getName());
        Battleplan battleplan = new Battleplan();
        SortedMap steps = new TreeMap(battleplan.roundStepsOrder);
        steps.put(3, battleplan.applySteps(null, null, steps, steps, null));
        Collection round = battleplan.applySteps(null, null, steps, steps, null);
        assertEquals(2, battleplan.numberOfRounds());
    }
	
	/**
     * Test method for {@link Battleplan#applySteps(Collection, Collection, SortedMap, SortedMap, SortedMap).get(n-2)}.
     *
     * @throws Exception if an error occurs
     */
	@Test
    public final void testApplyStepsNeg2() throws Exception {
        logger.fine("Test for {0}", Battleplan.class.getName());
        Battleplan battleplan = new Battleplan();
        SortedMap steps = new TreeMap(battleplan.roundStepsOrder);
                
        Collection round = battleplan.applySteps(null, null, steps, steps, null);
        Collection roundSteps = battleplan.applySteps(round, round, steps, steps, null);
        assertFalse(battleplan.isRoundOver());
                
        assertTrue(round.size() > 3);
        logger.fine("The test for the {0} step has been finished", battleplan.getClass().getName());
        assertFalse(round.iterator().hasNext());
    }
	
	/**
     * Test method for {@link Battleplan#applySteps(Collection, Collection)}.
     *
     * @throws Exception if an error occurs
     */
	@Test
    public final void testApplySteps() throws Exception {
        logger.fine("Test for {0}", Battleplan.class.getName());
        Battleplan battleplan = new Battleplan();

        SortedMap steps = new TreeMap(battleplan.roundStepsOrder);

        Collection round = battleplan.applySteps(null, null, steps, steps, null);
        assertTrue(battleplan.isRoundOver());
        logger.fine("The test for the {0} step has been finished", battleplan.getClass().getName());
        logger.fine("Collection 1 has been finished");
        assertFalse(round.iterator().hasNext());        
    }

    /**
     * Setup the {@link Battleplan} before the test
     */
    protected void setUp() {
        logger.fine("Setting up test");
    }

    /**
     * Remove the {@link Battleplan} for the {@link Integer}
     */
    protected void tearDown() {
        logger.fine("Tearing down test");
        rounds.clear();
    }
}

// BattleplanTest.java