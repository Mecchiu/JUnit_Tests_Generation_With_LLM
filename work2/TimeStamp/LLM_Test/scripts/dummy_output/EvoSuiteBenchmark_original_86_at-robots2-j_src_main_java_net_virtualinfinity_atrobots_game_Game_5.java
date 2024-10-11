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
     * Test if the {@link Game#round} is running at the time this method is executed.
     */
    @Test
    void testRoundRunningAtTest() {
        Game game = new Game(1);
        game.setMaxProcessorSpeed(5);
        assertTrue(game.roundRunningAtTest());
    }

    /**
     * Test if the {@link Game#round} is running at the time this method is completed.
     */
    @Test
    void testRoundRunningAtCompleted() {
    	Game game = new Game(1);
        game.setMaxProcessorSpeed(5);
        game.roundStart();
        assertFalse(game.roundRunningAtTest());
        
    	Game game2 = new Game(2);
        game.setMaxProcessorSpeed(5);
        game2.setMaxProcessorSpeed(5);
        assertTrue(game.roundRunningAtTest());
    	
    	game2.roundStart();
    	assertTrue(game.roundRunningAtTest());
        //game2.roundEnd() ;  // not yet implemented
    }
    
    @Test
    void assertRoundRunning() {
        Game game = new Game();
        
        game.setMaxProcessorSpeed(15);
        assertTrue(game.roundRunning());
        
    	Game game2 = new Game(4);
        game2.setMaxProcessorSpeed(5);
        assertTrue(game.roundRunning());
        
    	game2.roundStart();
    	assertFalse(game.roundRunning());
    }
    
	/**
     * Test if the {@link Game#stepRound()} method is called once
     * for when the given entrant is not playing.
     */
    @Test
    void assertStepRobotNotCalling() {
    	Game game = new Game();
        
        game.setMaxProcessorSpeed(10);
        
        RobotFactory entrant = RobotFactory.createRobot("");
        entrant.setMaxProcessorSpeed(10);
        RobotFactory anotherEntrant = RobotFactory.createRobot("");
        anotherEntrant.setMaxProcessorSpeed(10);
        
        assertFalse(game.stepRound());

    	game.stepRound();
    	assertTrue(game.stepRound());
		
    	game.nextEntrantId = 1;
        assertTrue(game.stepRound());
        
    	game.stepRound();
    	assertTrue(game.stepRound());
        
    	game.nextEntrantId = 0;
        assertFalse(game.stepRound());
    }

    @Test
    void assertRoundStateCleared() {
    	Game game = new Game();

    	game.setMaxProcessorSpeed(10);
    	
    	assertFalse(game.isRoundStateCleared());
    	
    	RoundState state = new RoundState("");
        assertFalse(game.isRoundStateCleared());
        
        state.setNumberOfRounds(1);
        assertFalse(game.isRoundStateCleared());
        
        state.setNumberOfRounds(0);
        assertTrue(game.isRoundStateCleared());
    }

    @Test
    void assertRoundStopping() {
    	Game game = new Game();

    	game.setMaxProcessorSpeed(10);
    	
    	assertFalse(game.isRoundStopping());
    	
    	RoundState state = new RoundState("");
        assertFalse(game.isRoundStopping());
        
        state.setNumberOfRounds(1);
        assertFalse(game.isRoundStopping());
        
        state.setNumberOfRounds(0);
        assertTrue(game.isRoundStopping());
                  
        RobotFactory entrant = RobotFactory.createRobot("");
        entrant.reset();
        RobotFactory anotherEntrant = RobotFactory.createRobot("");
        anotherEntrant.reset();
        
        assertFalse(game.isRoundStopping());
        
        state.setNumberOfRounds(1);
        assertTrue(game.isRoundStopping());
    }

    @Test
    void assertScorekeepingCleared() {
    	Game game = new Game();

}
}