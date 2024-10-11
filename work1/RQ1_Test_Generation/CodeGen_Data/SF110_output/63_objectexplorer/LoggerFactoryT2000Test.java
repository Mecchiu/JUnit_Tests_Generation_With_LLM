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
		* Test case.
		* @throws Exception
*/
	@Test
	void test1() throws Exception {
		LoggerFactory lf = new LoggerFactory();
		try {
			assertNotNull(lf.make()); // just for sure
			assertEquals(logger(), LF.makeInstance());
			assertEquals(LoggerFactory.class.getName(), LF.makeInstance().getClass().getName()); // just for sure
		}
		finally {
			assertNull(lf.make()); // just for sure
		}
	}
}
