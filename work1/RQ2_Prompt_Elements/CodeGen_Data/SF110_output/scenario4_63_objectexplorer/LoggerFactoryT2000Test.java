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

    /*
     * private TestResult testRunTest() {
     * 		return Log4J.getLogger("MainPanel");
     * 	}
     */
	@Test
	public void testCreate() throws Exception{
		Logger logger = LoggerFactory.make(); // log4j will use the global logger with this name
		assertNotNull(logger.getLogger("MainPanel"));
	}
	
}
