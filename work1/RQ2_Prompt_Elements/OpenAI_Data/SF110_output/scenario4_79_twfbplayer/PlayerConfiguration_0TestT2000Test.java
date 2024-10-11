// PlayerConfiguration_0Test.java
package de.outstare.fortbattleplayer.player;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import de.outstare.fortbattleplayer.Configuration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlayerConfiguration}.
* It contains ten unit test cases for the {@link PlayerConfiguration#copy()} method.
*/
class PlayerConfiguration_0Test {

		/**
		* Test case for {@link PlayerConfiguration#copy()}
		*
		* @throws CloneNotSupportedException
		*/
		@Test
		void testCopy() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				// when
				final PlayerConfiguration copy = config.copy();
				// then
				assertNotSame(config, copy);
				assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
				assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
				assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
				assertEquals(config.SHOW_MOVETARGETS, copy.SHOW_MOVETARGETS);
				assertEquals(config.SHOW_SHOOTLINE, copy.SHOW_SHOOTLINE);
				assertEquals(config.state, copy.state);
				assertNotSame(config.playLock, copy.playLock);
				assertNotSame(config.listeners, copy.listeners);
		}
		
		/**
		* Test case for {@link PlayerConfiguration#copy()}
		*
		* @throws CloneNotSupportedException
		*/
		@Test
		void testCopy2() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.ROUND_DELAY = 1;
				config.PLAYER_DELAY = 2;
				config.ACTION_DELAY = 3;
				config.SHOW_MOVETARGETS = true;
				config.SHOW_SHOOTLINE = true;
				config.state = PlayerState.PLAY;
				config.playLock = new ReentrantLock();
				config.listeners.add(new PlayerConfigurationListener() {
						@Override
						public void onConfigurationChanged(final PlayerConfiguration config) {
						}
				});
				// when
				final PlayerConfiguration copy = config.copy();
				// then
				assertNotSame(config, copy);
				assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
				assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
				assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
				assertEquals(config.SHOW_MOVETARGETS, copy.SHOW_MOVETARGETS);
				assertEquals(config.SHOW_SHOOTLINE, copy.SHOW_SHOOTLINE);
				assertEquals(config.state, copy.state);
				assertNotSame(config.playLock, copy.playLock);
				assertNotSame(config.listeners, copy.listeners);
		}
		
		/**
		* Test case for {@link PlayerConfiguration#copy()}
		*
		* @throws CloneNotSupportedException
		*/
		@Test
		void testCopy3() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.ROUND_DELAY = 1;
				config.PLAYER_DELAY = 2;
				config.ACTION_DELAY = 3;
				config.SHOW_MOVETARGETS = true;
				config.SHOW_SHOOTLINE = true;
				config.state = PlayerState.PLAY;
				config.playLock = new ReentrantLock();
				config.listeners.add(new PlayerConfigurationListener() {
						@Override
						public void onConfigurationChanged(final PlayerConfiguration config) {
						}
				});
				// when
				final PlayerConfiguration copy = config.copy();
				// then
				assertNotSame(config, copy);
				assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
				assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
				assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
				assertEquals(config.SHOW_MOVETARGETS, copy.SHOW_MOVETARGETS);
				assertEquals(config.SHOW_SHOOTLINE, copy.SHOW_SHOOTLINE);
				assertEquals(config.state, copy.state);
				assertNotSame(config.playLock, copy.playLock);
				assertNotSame(config.listeners, copy.listeners);
		}
		
		/**
		* Test case for {@link PlayerConfiguration#copy()}
		*
		* @throws CloneNotSupportedException
		*/
		@Test
		void testCopy4() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.ROUND_DELAY = 1;
				config.PLAYER_DELAY = 2;
				config.ACTION_DELAY = 3;
				config.SHOW_MOVETARGETS = true;
				config.SHOW_SHOOTLINE = true;
				config.state = PlayerState.PLAY;
				config.playLock = new ReentrantLock();
				config.listeners.add(new PlayerConfigurationListener() {
						@Override
						public void onConfigurationChanged(final PlayerConfiguration config) {
						}
				});
				// when
				final PlayerConfiguration copy = config.copy();
				// then
				assertNotSame(config, copy);
				assertEquals(config.ROUND_DELAY, copy.ROUND_DELAY);
				assertEquals(config.PLAYER_DELAY, copy.PLAYER_DELAY);
				assertEquals(config.ACTION_DELAY, copy.ACTION_DELAY);
				assertEquals(config.SHOW_MOVETARGETS, copy.SHOW_MOVETARGETS);
				assertEquals(config.SHOW_SHOOTLINE, copy.SHOW_SHOOTLINE);
				assertEquals(config.state, copy.state);
				assertNotSame(config.playLock, copy.playLock);
				assertNotSame(config.listeners, copy.listeners);
		}
		
		/**
		* Test case for {@link PlayerConfiguration#copy()}
		*
		* @throws CloneNotSupportedException
		*/
		@Test
		void testCopy5() throws CloneNotSupportedException {
				// given
				final PlayerConfiguration config = new PlayerConfiguration();
				config.ROUND_DELAY = 1;
				config.PLAYER_DELAY = 2;
				config.ACTION_DELAY = 3;
				config.SHOW_MOVETARGETS = true;
				config.SHOW_SHOOTLINE = true;
				config.state = PlayerState.PLAY;
				config.playLock = new ReentrantLock();
				config.listeners.