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
     * Gibt ein leben {@link Logger} zurück.
     */
    public static final Logger logger;
	
    /**
     * Testet das Anforderliche Funktionalit�t.
     */
    @Test
    public void createLogger() {
        logger = LoggerFactory.make();
        logger.fine(String.format("%1s", Thread.currentThread().getName()));
        assertNotNull(logger.getLogger());
        logger.info(String.format("%1s", Thread.currentThread().getName()));
        logger.fine("falser log");
        assertNull(logger.getLogger());
    }
}