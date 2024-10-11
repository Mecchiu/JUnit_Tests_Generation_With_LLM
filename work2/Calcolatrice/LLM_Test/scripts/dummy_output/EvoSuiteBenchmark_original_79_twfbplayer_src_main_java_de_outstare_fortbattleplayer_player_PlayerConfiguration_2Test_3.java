// PlayerConfiguration_2Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#showShootline()} method.
*/
class PlayerConfiguration_2Test {
		/**
		 * Construct a player configuration.
		 */
		public PlayerConfiguration_2Test() {
			super();
			System.out.println("Test: " + this);
		}
		/**
		 * Gets the values of the shooting line that have been set by this player configuration.
		 * @return the values of the showing line
		 */
		public Set<Thing> getShootingLine();
		/**
		 * Sets the values of the sharing line that have been set by this player configuration.
		 */
		public void setShootingLine(Set<Thing> shootingLine);
		/**
		 * Creates a clone of the player configuration and returns it.
		 * @return a clone of this player configuration
		 */
		public PlayerConfiguration_2Test clone();
		/**
		 * Returns the value of the shooting line set by this player configuration.
		 * @return the value of the shooting line set by this player configuration
		 */
		public Set<Thing> getShootingLineHashSet();
		/**
		 * Returns a list of all the thing of this configuration with id {@literal <} {@link #hashCode()}.
		 * @return a set containing the things
		 */
		public Set<Thing> getThingsWithId(int hashCode);
		/**
		 * Returns the player configuration parameters in case a player configuration object does not contain a specific setting.
		 * @return the parameters
		 */
		public PlayerConfig getPlayerConfig();
}