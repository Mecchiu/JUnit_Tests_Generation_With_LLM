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
		 * Erzeugt einen Einstellungsbereich von JUnit.
		 */
		@Test
		public void TestLoggerFactory() {
		assertNotNull("LoggerFactoryTest - TestLoggerFactory -> null",LoggerFactory.make());
		}
}