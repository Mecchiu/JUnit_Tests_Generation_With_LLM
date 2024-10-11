// LoggerFactoryTest.java
package de.paragon.explorer.util;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LoggerFactory}.
* It contains ten unit test cases for the {@link LoggerFactory#make()} method.
*/
class LoggerFactoryTest {

	/**
	* Test method for {@link LoggerFactory#make()}.
	*/
	@Test
	void testMake() {
		Logger logger = LoggerFactory.make();
		assertNotNull(logger);
		assertEquals(logger.getName(), "de.paragon.explorer.util.LoggerFactoryTest");
	}
}