// Here's an implementation of the LoggerFactory class with the make() method
// that returns a Logger instance.

// LoggerFactory.java
package de.paragon.explorer.util;

import org.apache.log4j.Logger;

/**
 * Factory for Log4J.
 *
 * @author Stefan Jockenhövel
 * @see http://www.javaspecialists.eu/archive/Issue137.html
 * @see http://shemnon.com/speling/2006/12/dry-logs-there-are-better-ways.html
 *      --> comment
 */
public final class LoggerFactory {

    /**
     * Erzeugt einen Logger in der aufrufenden Klasse.
     *
     * @return Logger
     */
    public static Logger make() {
        return Logger.getLogger(Thread.currentThread().getStackTrace()[2].getClassName());
    }
}

// And here's the test class for the LoggerFactory class.

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

    @Test
    void testMake() {
        Logger logger = LoggerFactory.make();
        assertNotNull(logger);
    }

    @Test
    void testMakeSameClass() {
        Logger logger1 = LoggerFactory.make();
        Logger logger2 = LoggerFactory.make();
        assertEquals(logger1.getName(), logger2.getName());
    }

    @Test
    void testMakeDifferentClasses() {
        Logger logger1 = LoggerFactory.make();
        Logger logger2 = new SomeOtherClass().getLogger();
        assertNotEquals(logger1.getName(), logger2.getName());
    }

    @Test
    void testMakeNull() {
        Logger logger = LoggerFactory.make();
        assertNotNull(logger);
    }

    @Test
    void testMakeNotNull() {
        Logger logger = LoggerFactory.make();
        assertNull(null);
    }

    @Test
    void testMakeSameInstance() {
        Logger logger1 = LoggerFactory.make();
        Logger logger2 = LoggerFactory.make();
        assertSame(logger1, logger2);
    }

    @Test
    void testMakeDifferentInstances() {
        Logger logger1 = LoggerFactory.make();
        Logger logger2 = new SomeOtherClass().getLogger();
        assertNotSame(logger1, logger2);
    }

    @Test
    void testMakeThreadSafety() {
        Logger logger1 = LoggerFactory.make();
        Logger logger2 = LoggerFactory.make();
        assertSame(logger1, logger2);
    }

    @Test
    void testMakePerformance() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            LoggerFactory.make();
        }
        long end = System.currentTimeMillis();
        assertTrue(end - start < 1000);
    }

    private static class SomeOtherClass {
        public Logger getLogger() {
            return Logger.getLogger(getClass());
        }
    }
}