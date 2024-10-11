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
		 * Erzeugt einen Logger zur Ausdruck durch das TestInstanz.
		 *
		 * @return Logger
		 **/
    public static Logger makeTestLogger() {
		    return LoggerFactory.make();
    }
}