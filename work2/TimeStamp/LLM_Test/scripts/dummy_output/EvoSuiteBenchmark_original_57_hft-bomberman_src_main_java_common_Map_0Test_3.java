// Map_0Test.java
package common;

import java.awt.Point;
import java.io.Serializable;
import java.util.Date;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains one unit test case for the {@link Map#getTileByIndex(int, int)} method.
*/
class Map_0Test {
		
	private final String name = Map_0Test.class.getName();
	
	/**
	 * Tries to get tile by its index using Map.getTileByIndex(int x, int y)
	 * <p>This method can be used to test some Map objects such as MapGrid to be
	 * read and tested.</p>
	 */
	@Test
	public void testGetTileByIndex() {
		
		System.setProperty("game-name", name);
		System.setProperty("game-version", String.valueOf(Map_0Test_0.class.getPackage().getImplementationVersion()));
		System.setProperty("game-author", String.valueOf(Map_0Test_0.class.getPackage().getName().replaceAll(".", "_")));
}
}