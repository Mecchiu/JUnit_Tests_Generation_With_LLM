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
		HashSet<TestShootLine> shootlines;
	
	/**
	* Defines the set of test lines that are to be considered when shooting.
	 */
	private static Set<TestShootLine> shootlinesToTest = new HashSet<>();

	/**
	* Defines the set of test lines that are to be considered when shooting.
	*/
	static {
		shootlinesToTest.add(TestShootLine.RUSH_UP);
	}
	
	/**
	* Constructor for class PlayerConfiguration_2Test.
	*/
	public PlayerConfiguration_2Test() {
		shootlines = new HashSet<>();
	}
	
	/**
	* Add a shootline to this instance.
	* 
	* @param shootline the shootline to add
	*/
	public void addShootLine(TestShootLine shootline) {
		shootlines.add(shootline);
	}
	
	/**
	* @return the set of shootlines that are to be added to this instance
	*/
	public Set<TestShootLine> getShootlinesToTest() {
		return shootlinesToTest;
	}
	
}