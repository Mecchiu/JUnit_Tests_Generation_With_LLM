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
* It contains ten unit test cases for the {@link Battleplayer#numberOfRounds()} method.
*/
class BattleplayerTest {

		private static final transient Logger LOG = Logger.getLogger(BattleplayerTest.class.getName());
		
		private final Battleplan plan;
		
		private final Set<RoundListener> listeners = new HashSet<RoundListener>();
		
		private boolean isPaused = false;
		
		/**
		 * round numbers may not be sequential (this variable is also used for
		 * locking during a round)
		 */
		private int currentRoundNo;
		
		private volatile boolean isPlaying = false;
		
		private volatile boolean shouldStop = false;
		
		/**
		 * controls some aspects of the behavior of the player
		 */
		public final PlayerConfiguration config;
		
		/**
		 * @param plan
		 * @param config
		 */
		public Battleplayer(final Battleplan plan, final PlayerConfiguration config) {
		}
		
		/**
		 * @param plan
		 */
		public Battleplayer(final Battleplan plan) {
		}
		
		/**
		 * let the battle begin! The whole battle is done by executing the
		 * {@link Battleplan}.
		 */
		public void play();
		
		/**
		 * blocks until current round has ended
		 *
		 * @see de.outstare.fortbattleplayer.player.Player#gotoRound(de.outstare.fortbattleplayer.player.Round)
		 */
		public void gotoRound(final int i);
		
		/**
		 * executes the round of the internal state
		 */
		private void playCurrentRound(final int roundNo);
		
		/**
		 * wait the time given in {@link PlayerConfiguration#ROUND_DELAY}
		 */
		private void delayNextRound();
		
		/**
		 * tell all listeners that a new round will start now
		 *
		 * @param roundNo
		 */
		private void fireNewRoundEvent(final int roundNo);
		
		/**
		 * @param listener
		 */
		public void addRoundListener(final RoundListener listener);
		
		/**
		 * @see de.outstare.fortbattleplayer.player.Player#stop()
		 */
		public void stop();
		
		/**
		 * A RoundListener waits for Round events.
		 *
		 * @author daniel
		 */
		public static interface RoundListener {
		
				/**
				 * a new round will begin immediatly
				 *
				 * @param roundNo
				 */
				void nextRound(int roundNo);
		}
		
		/**
		 * @return the number of rounds this player shows
		 */
		public int numberOfRounds();
		
		/**
		 * toggles pause which holds playing rounds. if this player is currently
		 * paused can be checked with isPaused()
		 */
		public void pause();
		
		/**
		 * @return <code>true</code> if this player is playing and is currently hold
		 */
		public boolean isPaused();
		
		/**
		 * @see de.outstare.fortbattleplayer.player.Player#getRoundNumbers()
		 */
		public List<Integer> getRoundNumbers();
		
		/**
		 * Test method for {@link de.outstare.fortbattleplayer.player.Battleplayer#numberOfRounds()}.
		 */
		@Test
		void testNumberOfRounds() {
				// setup
				final Battleplayer player = new Battleplayer(null);
				
				// execute
				final int result = player.numberOfRounds();
				
				// verify
				assertEquals(0, result);
		}
		
		/**
		 * Test method for {@link de.outstare.fortbattleplayer.player.Battleplayer#numberOfRounds()}.
		 */
		@Test
		void testNumberOfRounds2() {
				// setup
				final Battleplayer player = new Battleplayer(null);
				
				// execute
				final int result = player.numberOfRounds();
				
				// verify
				assertEquals(0, result);
		}
		
		/**
		 * Test method for {@link de.outstare.fortbattleplayer.player.Battleplayer#numberOfRounds()}.
		 */
		@Test
		void testNumberOfRounds3() {
				// setup
				final Battleplayer player = new Battleplayer(null);
				
				// execute
				final int result = player.numberOfRounds();
				
				// verify
				assertEquals(0, result);
		}
		
		/**
		 * Test method for {@link de.outstare.fortbattleplayer.player.Battleplayer#numberOfRounds()}.
		 */
		@Test
		void testNumberOfRounds4() {
				// setup
				final Battleplayer player = new Battleplayer(null);
				
				// execute
				final int result = player.numberOfRounds();
				
				// verify
				assertEquals(0, result);
		}
		
		/**
		 * Test method for {@link de.outstare.fortbattleplayer.player.Battleplayer#numberOfRounds()}.
		 */
		@Test
		void testNumberOfRounds5() {
				// setup
				final Battleplayer player = new Battleplayer(null);
				
				// execute
				final int result = player.numberOfRounds();
				
				// verify
				assertEquals(0, result);
		}
		
		/**
		 * Test method for {@link de.outstare.fortbattleplayer.player.Battleplayer#numberOfRounds()}.
		 */
		@Test
		void testNumberOfRounds6() {
				// setup
				final Battleplayer player = new Battleplayer(null);
				
				// execute
				final int result = player.numberOfRounds();
				
				// verify
				assertEquals(0, result);
		}
		
		/**
		 * Test method for {@link de.outstare.fortbattleplayer.player.Battleplayer#numberOfRounds()}.
		 */
		@Test
		void testNumberOfRounds7() {
				// setup
				final Battleplayer player = new Battleplayer(null);
				
				// execute
				final int result = player.numberOfRounds();
				
				// verify
				assertEquals(0, result);
		}
		
		/**
		 * Test method for {@link de.outstare.fortbattleplayer.player.Battleplayer#numberOfRounds()}.
		 */
		@Test
		void testNumberOfRounds8() {
				// setup
				final Battleplayer player = new Battleplayer(null);
				
				// execute
				final int result = player.numberOfRounds();
				
				// verify
				assertEquals(0, result);
		}
		
		/**
		 * Test method for {@link de.outstare.fortbattleplayer.player.Battleplayer#numberOfRounds()}.
		 */
		@Test
		void testNumberOfRounds9() {
				// setup
				final Battleplayer player = new Battleplayer(null);
				
				// execute
				final int result = player.numberOfRounds();
				
				// verify
				assertEquals(0, result);
		}
		
		/**
		 * Test method for {@link de.outstare.fortbattleplayer.player.Battleplayer#numberOfRounds()}.
		 */
		@Test
		void testNumberOfRounds10() {
				// setup
				final Battleplayer player = new Battleplayer(null);
				
				// execute
				final int result = player.numberOfRounds();
				
				// verify
				assertEquals(0, result);
		}
}

// Battleplan.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;

/**
 * A Battleplan is a list of {@link Round}s.
 *
 * @author daniel
 */
public class Battleplan {

    private static final transient Logger LOG = Logger.getLogger(Battleplan.class.getName());

    private final List<Round> rounds = new ArrayList<Round>();

    /**
     * @param round
     */
    public void addRound(final Round round);

    /**
     * @param roundNo
     * @return
     */
    public Round getRound(final int roundNo);

    /**
     * @return
     */
    public int numberOfRounds();

    /**
     * A Round is a list of {@link Action}s.
     *
     * @author daniel
     */
    public static class Round {

        private final List<Action> actions = new ArrayList<Action>();

        /**
         * @param action
         */
        public void addAction(final Action action);

        /**
         * @return
         */
        public List<Action> getActions();

        /**
         * An Action is a command for a {@link Combatant}.
         *
         * @author daniel
         */
        public static class Action {

            private final Combatant combatant;

            private final Command command;

            /**
             * @param combatant
             * @param command
             */
            public Action(final Combatant combatant, final Command command);

            /**
             * @return
             */
            public Combatant getCombatant();

            /**
             * @return
             */
            public Command getCommand();

            /**
             * A Command is a command for a {@link Combatant}.
             *
             * @author daniel
             */
            public static enum Command {

                /**
                 *
                 */
                MOVE_FORWARD,

                /**
                 *
                 */
                MOVE_BACKWARD,

                /**
                 *
                 */
                TURN_LEFT,

                /**
                 *
                 */
                TURN_RIGHT,

                /**
                 *
                 */
                SHOOT,

                /**
                 *
                 */
                RELOAD,

                /**
                 *
                 */
                WAIT
            }
        }
    }
}

// Player.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;

/**
 * A Player controls the battle. It is a puppet player controlling the behavior
 * of the {@link Combatant}s.
 *
 * @author daniel
 */
public interface Player {

    /**
     * let the battle begin! The whole battle is done by executing the
     * {@link Battleplan}.
     */
    public void play();

    /**
     * blocks until current round has ended
     *
     * @param roundNo
     */
    public void gotoRound(int roundNo);

    /**
     * @return the number of rounds this player shows
     */
    public int numberOfRounds();

    /**
     * toggles pause which holds playing rounds. if this player is currently
     * paused can be checked with isPaused()
     */
    public void pause();

    /**
     * @return <code>true</code> if this player is playing and is currently hold
     */
    public boolean isPaused();

    /**
     * @return a list of all round numbers
     */
    public List<Integer> getRoundNumbers();

    /**
     * stops playing
     */
    public void stop();
}

// PlayerConfiguration.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;

/**
 * A PlayerConfiguration controls some aspects of the behavior of the player.
 *
 * @author daniel
 */
public class PlayerConfiguration {

    private static final transient Logger LOG = Logger.getLogger(PlayerConfiguration.class.getName());

    /**
     * the delay between two rounds in milliseconds
     */
    public static final String ROUND_DELAY = "roundDelay";

    /**
     * the delay between two actions in milliseconds
     */
    public static final String ACTION_DELAY = "actionDelay";

    /**
     * the delay between two shots in milliseconds
     */
    public static final String SHOT_DELAY = "shotDelay";

    /**
     * the delay between two reloads in milliseconds
     */
    public static final String RELOAD_DELAY = "reloadDelay";

    /**
     * the delay between two turns in milliseconds
     */
    public static final String TURN_DELAY = "turnDelay";

    /**
     * the delay between two moves in milliseconds
     */
    public static final String MOVE_DELAY = "moveDelay";

    /**
     * the delay between two waits in milliseconds
     */
    public static final String WAIT_DELAY = "waitDelay";

    /**
     * the delay between two rounds in milliseconds
     */
    public static final int DEFAULT_ROUND_DELAY = 1000;

    /**
     * the delay between two actions in milliseconds
     */
    public static final int DEFAULT_ACTION_DELAY = 100;

    /**
     * the delay between two shots in milliseconds
     */
    public static final int DEFAULT_SHOT_DELAY = 100;

    /**
     * the delay between two reloads in milliseconds
     */
    public static final int DEFAULT_RELOAD_DELAY = 100;

    /**
     * the delay between two turns in milliseconds
     */
    public static final int DEFAULT_TURN_DELAY = 100;

    /**
     * the delay between two moves in milliseconds
     */
    public static final int DEFAULT_MOVE_DELAY = 100;

    /**
     * the delay between two waits in milliseconds
     */
    public static final int DEFAULT_WAIT_DELAY = 100;

    /**
     * @param key
     * @return
     */
    public int getInt(final String key);

    /**
     * @param key
     * @param value
     */
    public void setInt(final String key, final int value);
}

// RoundListener.java
package de.outstare.fortbattleplayer.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Logger;
import de.outstare.fortbattleplayer.model.Combatant;
