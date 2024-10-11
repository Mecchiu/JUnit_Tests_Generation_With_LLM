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
		 * tests the make() method with a valid config.
		 */
    @Test
    public void validConfiguration() {
        LoggerFactory factory = new LoggerFactory();

        Logger log = factory.make();

        log.debug("Debug-Log");

        // verify the configuration of the logger
        assertTrue(log.isDebugEnabled());
        assertFalse(log.isInfoEnabled());
        assertFalse(log.isWarnEnabled());
        assertFalse(log.isErrorEnabled());
        assertTrue(log.isFinerEnabled());
    }
}