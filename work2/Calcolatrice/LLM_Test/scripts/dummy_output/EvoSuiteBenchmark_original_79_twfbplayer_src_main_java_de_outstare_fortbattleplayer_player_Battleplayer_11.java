// BattleplayerTest.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Battleplayer}.
* It contains one unit test case for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {
		
    private static Logger logger;
    private static Battle player;

    static {
        logger = Logger.getLogger(BattleplayerTest.class.getCanonicalName());
        logger.info("Instantiation");
    }

    private Battleplayer() {
    }

    /**
     * Creates and returns a new instance of {@link Battleplayer}.
     *
	 * @return a new instance of class {@link Battleplayer}
     */
	private static Battle player() {
	    return new Battleplayer();
	}

/**
 * This method performs the assertion for the {@link Battleplayer#numberOfRounds()} method and tests if
 * the returned value is not equal to or less than the given one.
 *
	 * @param value
	 *            the given number
	 * @throws AssertionError
	 */
	@Test
    void testOfNumberOfRounds() {
	    logger.info("Performing test {}", this.numberOfRounds());
	    int rounds = player().numberOfRounds();
	    logger.info("Rounds: {}", rounds);
	    assertNotEquals(rounds, rounds());
    }

	/**
	 * Creates and returns a new instance of Battleplayer.
	 *
	 * @return battle player
	 */
	public static Battleplayer battleplayer() {
		logger = Logger.getLogger(BattleplayerTest.class.getCanonicalName());
		player = new Battleplayer();
		return player();
	}

	/**
	 * Creates and returns a new instance of Battleplayer.
	 *
	 * @return battleplayer
	 */
	public static Battleplayer battleplayer() {
		logger = Logger.getLogger(BattleplayerTest.class.getCanonicalName());
		player = Battleplayer.battleplayer();
		return player();
	}
}