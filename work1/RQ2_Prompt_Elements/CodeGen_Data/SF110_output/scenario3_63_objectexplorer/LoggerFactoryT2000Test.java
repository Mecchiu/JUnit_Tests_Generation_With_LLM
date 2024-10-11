// LoggerFactoryTest.java
package de.paragon.explorer.util;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LoggerFactory}.
* It contains one unit test case for the {@link LoggerFactory#make()} method.
*/
class LoggerFactoryTest {

	/**
	 * Test of make().
	 * <br><strong>Attributes:</strong> {@code logger}
	 */
	@Test
	void testMake() {
		Logger logger = LoggerFactory.make();
		assertNotNull(logger);
	}
	
	/**
	 * Test of make().
	 * <br><strong>Attributes:</strong> {@code logger}
	 */
	@Test
	void testMake2() {
		Logger logger = LoggerFactory.make();
		assertNotNull(logger);
	}
}
