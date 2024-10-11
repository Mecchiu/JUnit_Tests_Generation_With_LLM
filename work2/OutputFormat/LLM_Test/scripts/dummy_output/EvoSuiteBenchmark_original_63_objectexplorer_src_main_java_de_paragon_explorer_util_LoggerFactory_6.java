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
		@Test
        public void constructor() {
		
		// Logger oder Log4J-Log gepr�ft:
		Logger logger = new Logger();
		
		assertNotNull("no logger instance was created", logger);
				
		LoggerManager.setLog4jInstance(logger);
			
		}
}