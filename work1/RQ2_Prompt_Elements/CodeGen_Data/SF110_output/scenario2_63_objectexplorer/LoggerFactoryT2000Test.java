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
LoggerFactoryTest() {
	}

	/**
	* Test methods of {@link LoggerFactory}.
	* It contains one unit test case for each method used in {@link LoggerFactory}.
	*/
	@Test
	public void test() {
		// log4j.Logger logger = make();
		assertNotNull(LoggerFactory.make());
		// logger.debug();
		assertNotNull(LoggerFactory.make());
		// logger.info("INFO");
		assertNotNull(LoggerFactory.make());
		System.out.println(LoggerFactory.make());
		assertNotNull(LoggerFactory.make());
		Logger logger = LoggerFactory.make();
		assertNotNull(logger);
		logger.debug();
		assertNotNull(logger);
		logger.info("INFO");
		assertNotNull(logger);
		logger.warn("WARN");
		assertNotNull(logger);
		System.out.println(logger);
		assertNotNull(logger);
	}
}