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
		
	public LoggerFactoryTest() {
	}

	/**
	 * Test Method for {@link LoggerFactory#make()}. TestMethod is intended to
	 * be run inside a static block and can be used inside tests
	 * to test different instantiations.
	*/
	@Test
	public void testMake() {
		final Logger l = LoggerFactory.make();
		Logger log4jLogger = LoggerFactory.createLogger();
		assertNotNull(log4jLogger);
	}
	
}/* class LoggerFactoryTest */