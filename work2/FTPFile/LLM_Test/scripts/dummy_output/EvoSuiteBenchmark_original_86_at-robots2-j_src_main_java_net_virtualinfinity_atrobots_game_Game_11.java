// GameTest.java
package net.virtualinfinity.atrobots.game;

import net.virtualinfinity.atrobots.arena.FrameBuilder;
import net.virtualinfinity.atrobots.arena.RoundState;
import net.virtualinfinity.atrobots.arena.SimulationObserver;
import net.virtualinfinity.atrobots.compiler.RobotFactory;
import net.virtualinfinity.atrobots.robot.FinalRobotScore;
import net.virtualinfinity.atrobots.robot.Robot;
import net.virtualinfinity.atrobots.robot.RobotScore;
import net.virtualinfinity.atrobots.robot.RobotScoreKeeper;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Game}.
* It contains one unit test case for the {@link Game#stepRound()} method.
*/
class GameTest {
		
    /**
     * Simple test for a round over.
     */
    @Test
    public void testRoundOver() {
        final Game game = new Game(1);
        game.nextRound();
        assertTrue(game.stepRound());
    }
    
    /**
     * Simple test for a round over.
     */
    @Test
    public void testStepRound() {
        final Game game = new Game(1);
        game.round.over();
        assertTrue(game.stepRound());
    }
    
    /**
     * Simple test for a round over.
     */
    @Test
    public void testStepGameOver() {
        final Game game = new Game(1);
        game.nextRound();
        game.gameOver();
        assertTrue(game.stepGameOver());
    }
    
    /**
     * Simulate the game and assert that the results are as expected.
     *
     * @param game the game to simulate
     * @return true, if the game results should be the same
     *  as in an expected sequence; otherwise false
     */
    protected boolean assertResultsAreEqual(Game game, int sequence) {
        boolean ok = true;

        final int results = game.getResults(sequence);

        assertEquals(results, game.getResults(0), "Sequence " + sequence + " results don't match");

        List<Round> rounds = game.getRounds();

        for (int i = 1; ok && i < rounds.size(); i++) {
            try {
                final Round ret = rounds.get(i);

                if (expectedResults(ret)) {
                    ok = ok && assertRoundsMatch(ret, sequence);
                }
            } catch (ClassCastException ex) {
                ok = false;
                fail("Cannot create a round for sequence " + sequence);
            }
        }
        return ok;
    }
    
    protected boolean assertRoundsMatch(Round round, int sequence) {
        if ((sequence - 1) >= 0) {
            int results = 0;
            
            results |= round.getScore(sequence -1).getScore() > 0? 1 : 0;
            results |= round.getScore(sequence).getScore() > 0? 1 : 0;
            results |= round.getScore(sequence - 1).getFinalScore() > 0? 1 : 0;
            results |= round.getScore(sequence - 1).getFinalScore() > 0? 1 : 0;

            results |= round.getScore(sequence -1).getFirstRound() == null? 1 : 0;
            results |= (round.getScore(sequence-1).getFinals().length-1) == 0? 1 : 0;
            return results == 0;
        } else {
            return false;
        }
    }

    protected void assertNoEntainers(Game game) {
        List<Robot> finalRobots;

        finalRobots = game.getFinalRobots();

        if ((finalRobots!= null) && finalRobots.size() > 0) {
            fail("Final robots should not exist, but have: \n" + finalRobots);
        } else {
            assertArrayEquals(new Robot[]{}, game.getEntrantsForRound());
        }
    }
    
    private List<RobotFactory> entrants;
    
    /**
     * Sets up the game and adds the entrants.
     */
    @Test
    public void addEntrants() {
        entrants = new ArrayList<RobotFactory>();
        
        entrants.add(RobotFactory.RADAR);
        entrants.add(RobotFactory.BENDING);
        entrants.add(RobotFactory.CRUISER);
        entrants.add(RobotFactory.JOYSTICK);
        entrants.add(RobotFactory.LIGHTNING);
        entrants.add(RobotFactory.NIGHTSTORM);
        entrants.add(RobotFactory.PING);
        entrants.add(RobotFactory.SHOT);
        entrants.add(RobotFactory.WATERFALL);

        entrants.add(RobotFactory.CRUISER_SPOT);
}
}