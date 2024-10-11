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
		final Logger logger = LoggerFactory.make();
		assertNotNull(logger);
		assertEquals(LoggerFactoryTest.class.getName(), logger.getName());
	}
}