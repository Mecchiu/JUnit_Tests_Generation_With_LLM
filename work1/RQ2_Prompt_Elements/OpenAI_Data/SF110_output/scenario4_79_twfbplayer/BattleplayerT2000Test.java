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
		 * Test case for {@link Battleplayer#numberOfRounds()}
		 *
		 * @see Battleplayer#numberOfRounds()
		 */
		@Test
		public void testNumberOfRounds() {
				// given
				final Battleplayer player = new Battleplayer(null);
				
				// when
				final int result = player.numberOfRounds();
				
				// then
				assertEquals(0, result);
		}
		
		/**
		 * Test case for {@link Battleplayer#numberOfRounds()}
		 *
		 * @see Battleplayer#numberOfRounds()
		 */
		@Test
		public void testNumberOfRounds2() {
				// given
				final Battleplayer player = new Battleplayer(null);
				
				// when
				final int result = player.numberOfRounds();
				
				// then
				assertEquals(0, result);
		}
		
		/**
		 * Test case for {@link Battleplayer#numberOfRounds()}
		 *
		 * @see Battleplayer#numberOfRounds()
		 */
		@Test
		public void testNumberOfRounds3() {
				// given
				final Battleplayer player = new Battleplayer(null);
				
				// when
				final int result = player.numberOfRounds();
				
				// then
				assertEquals(0, result);
		}
		
		/**
		 * Test case for {@link Battleplayer#numberOfRounds()}
		 *
		 * @see Battleplayer#numberOfRounds()
		 */
		@Test
		public void testNumberOfRounds4() {
				// given
				final Battleplayer player = new Battleplayer(null);
				
				// when
				final int result = player.numberOfRounds();
				
				// then
				assertEquals(0, result);
		}
		
		/**
		 * Test case for {@link Battleplayer#numberOfRounds()}
		 *
		 * @see Battleplayer#numberOfRounds()
		 */
		@Test
		public void testNumberOfRounds5() {
				// given
				final Battleplayer player = new Battleplayer(null);
				
				// when
				final int result = player.numberOfRounds();
				
				// then
				assertEquals(0, result);
		}
		
		/**
		 * Test case for {@link Battleplayer#numberOfRounds()}
		 *
		 * @see Battleplayer#numberOfRounds()
		 */
		@Test
		public void testNumberOfRounds6() {
				// given
				final Battleplayer player = new Battleplayer(null);
				
				// when
				final int result = player.numberOfRounds();
				
				// then
				assertEquals(0, result);
		}
		
		/**
		 * Test case for {@link Battleplayer#numberOfRounds()}
		 *
		 * @see Battleplayer#numberOfRounds()
		 */
		@Test
		public void testNumberOfRounds7() {
				// given
				final Battleplayer player = new Battleplayer(null);
				
				// when
				final int result = player.numberOfRounds();
				
				// then
				assertEquals(0, result);
		}
		
		/**
		 * Test case for {@link Battleplayer#numberOfRounds()}
		 *
		 * @see Battleplayer#numberOfRounds()
		 */
		@Test
		public void testNumberOfRounds8() {
				// given
				final Battleplayer player = new Battleplayer(null);
				
				// when
				final int result = player.numberOfR