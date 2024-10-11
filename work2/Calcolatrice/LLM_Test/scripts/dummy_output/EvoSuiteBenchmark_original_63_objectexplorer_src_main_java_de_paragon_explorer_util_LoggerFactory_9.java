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
		*
		*/
		@Test
        public void test_make() {
            Logger result = new LoggerFactory().make();
			Logger expectedLog2 = LoggerFactory.LOGGER_CLASS;
			assertNotNull("createLoggerFactory.test_make() Logger is null", result);
			assertSame(expectedLog2, result);
    }
}