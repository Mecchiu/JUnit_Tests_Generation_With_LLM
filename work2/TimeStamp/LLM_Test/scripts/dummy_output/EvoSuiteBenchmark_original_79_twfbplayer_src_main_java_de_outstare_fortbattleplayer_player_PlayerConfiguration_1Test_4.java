// PlayerConfiguration_1Test.java
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
* It contains one unit test case for the {@link PlayerConfiguration#showMoveTargets()} method.
*/
class PlayerConfiguration_1Test {
		
	/**
	 * Simple test class for showMoveTargets.
	 * 
	 * @throws CloneNotSupportedException
	 */
	@Test
	public void testWriteRead() throws CloneNotSupportedException{
		//Simple implementation that checks for any field inside PlayerConfiguration and asserts if necessary
		PlayerConfiguration simple = new PlayerConfiguration();
		
		//Do nothing
		assertEquals(simple.showMoveTargets(), false);
		
		//Set value to true
		simple.showMoveTargets();
		
		//Set value to false
		assertEquals(simple.showMoveTargets(), true);
		
		//Set value to another boolean and check to see if set back to its previous value
		assertEquals(simple.showMoveTargets(), false);
		
		PlayerConfiguration test = new PlayerConfiguration();
		test.showMoveTargets();
		assertEquals(test.showMoveTargets(), true);
	}
	
	/**
	 * Sets the state of the configuration to false and checks the equality afterwards.
	 */
	@Test
	public void testConfigurationEquality() {
		//Set some configuration values
		PlayerConfiguration gameA = new PlayerConfiguration();
		gameA.showMoveTargets(true); 
		
		//Copy the config for the sake of the equality checks
		PlayerConfiguration gameB = new PlayerConfiguration();
		gameB.showMoveTargets(true); 
		
		//Check equality if we have the values for both
		assertNotEquals(gameA, gameB);
	}
	
	/**
	 * Checks that we are able to find a player with the given name.
	 * 
	 * @param name
	 */
	public boolean hasValidName(String name) {
		Configuration.log("Looking for '"+name+"'");
		if (Configuration.getPlayerNames().contains(name) && Configuration.getConfiguration(name).player.isLoaded()) {
			Configuration.log("Found player '"+name+"'");
			return true;
		}
		return false;
	}
}

//PlayerConfiguration_2Test.java