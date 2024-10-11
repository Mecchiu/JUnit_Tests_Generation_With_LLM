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
public void make() {
    final Logger logger = LoggerFactory.make();
    assertTrue(logger.isLoggable(Logger.INFO));
    final Logger logger2 = LoggerFactory.make();
    assertFalse(logger2.isLoggable(Logger.WARNING));
	
	/*log.setLevel(Level.INFO);
    assertEquals(log, LoggerFactory.make());*/
}
	
}
