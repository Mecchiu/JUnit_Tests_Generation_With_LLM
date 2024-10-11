package net.virtualinfinity.atrobots.game;
java
import org.junit.jupiter.api.BeforeEach;

class GameTest {
    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game(3);
    }

    @Test
    void testStepRound_WhenRoundIsNull_ReturnsFalse() {
        assertFalse(game.stepRound());
    }

    @Test
    void testStepRound_WhenRoundIsNotNull_CallsRoundStep() {
        game.addEntrant(new RobotFactory());
        game.nextRound();
        assertTrue(game.stepRound());
    }

    @Test
    void testStepRound_WhenRoundIsNotNullAndRoundIsOver_ReturnsFalse() {
        game.addEntrant(new RobotFactory());
        game.nextRound();
        game.roundOver();
        assertFalse(game.stepRound());
    }

    @Test
    void testStepRound_WhenRoundIsNotNullAndRoundIsNotOver_ReturnsTrue() {
        game.addEntrant(new RobotFactory());
        game.nextRound();
        assertTrue(game.stepRound());
    }

    @Test
    void testStepRound_WhenRoundIsNotNullAndRoundIsOver_CallsNextRound() {
        game.addEntrant(new RobotFactory());
        game.nextRound();
        game.roundOver();
        game.stepRound();
        assertNotNull(game.getRound());
    }

    @Test
    void testStepRound_WhenRoundIsNotNullAndRoundIsOver_CallsNextRoundOnce() {
        game.addEntrant(new RobotFactory());
        game.nextRound();
        game.roundOver();
        game.stepRound();
        game.stepRound();
        assertNull(game.getRound());
    }

    @Test
    void testStepRound_WhenRoundIsNotNullAndRoundIsOver_CallsGameOver() {
        game.addEntrant(new RobotFactory());
        game.nextRound();
        game.roundOver();
        game.stepRound();
        // Add assertions for calling gameOver method
    }

    @Test
    void testStepRound_WhenRoundIsNotNullAndRoundIsOver_ReturnsFalseAfterGameOver() {
        game.addEntrant(new RobotFactory());
        game.nextRound();
        game.roundOver();
        game.stepRound();
        assertFalse(game.stepRound());
    }

    @Test
    void testStepRound_WhenRoundIsNotNullAndRoundIsNotOver_ReturnsTrueAfterMultipleSteps() {
        game.addEntrant(new RobotFactory());
        game.nextRound();
        game.stepRound();
        assertTrue(game.stepRound());
    }
}
