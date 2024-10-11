// MainTest.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains one unit test case for the {@link Main#getTestMolecule()} method.
*/
class MainTest {
		// Private
		private final static JniInchiStructure testStructure = new JniInchiStructure("Test molecule",
				"-DlogName=org.apache.log4j");
		private static JniInchiStructure testStructure4 = new JniInchiStructure("Test molecule",
				"-DlogName=org.apache.log4j.oracle.junit4.OracleLogging");
		private static JniInchiStructure testStructure6 = new JniInchiStructure("Test molecule",
				"-DlogName=org.apache.log4j.net3");

				// Private unit test structure
		private final static JniInchiStructure testStructure3 = new JniInchiStructure("Test molecule",
				"-DlogName=org.apache.log4j.net3.SimpleNet3Logging");
		private static JniInchiStructure testStructure3_sub = new JniInchiStructure("Test molecule",
				"-DlogName=org.apache.log4j.net3.SimpleNet3Logging-Sub");

		private final static String LOG4J_LOG = "org.apache.log4j.net.SimpleNet3Logging";

				// Private unit test structure
		private final static String LOG4J_LOG2 = "org.apache.log4j.net.SimpleNet3Logging";
		private static Level LOG_LEVEL = Level.OFF;

		private final JniInchiStructure testStructure = testStructure3;
		private final JniInchiStructure testStructure2 = testStructure3_sub;

				// Unit test structure
		private final JniInchiStructure testMolecule = testStructure;
		private final JniInchiStructure testMol6 = testStructure6;

		@Test
		public void mainTest_ValidStructure() {
			// Set up test structure
			testStructure.testInit();

			assertEquals( testStructure.getVersion().getCurrent().getValue(), "0.0.11");
			assertEquals( testStructure.getVersion().getCurrent().getMinor().getValue(), "0.0.13");
			assertEquals( testStructure.getVersion().getCurrent().getMajor().getValue(), "0.0.14");

			// Test equality
			assertEquals( testMolecule.equals(testStructure), true);
			assertEquals( testStructure.equals(testMolecule), true);

			// Test hashing
			assertEquals( testStructure.equals(testStructure), true);
			assertEquals( testStructure.hashCode(), testStructure.hashCode());
			assertEquals( testStructure.hashCode(), 0);

			// Test pattern matching
			assertEquals( testMolecule.equals(testStructure), true);
			assertEquals( testStructure.equals(testMolecule), true);
			assertEquals( patternLayout.matches(getLogPattern()), true);
			assertEquals( patternLayout.matches(testName), true);

			assertEquals( testMolecule.equals(testStructure2), false);
			assertEquals( testStructure.equals(testMolecule2), false);

			LOG.setLevel( LOG_LEVEL);
			assertEquals( LOG4J_LOG2.equals( LOG_LEVEL), true);
			LOG.setLevel( Level.ALL);

			assertEquals( testMolecule.equals(testStructure2), false);
			assertEquals( testStructure.equals(testMolecule2), false);

		}

		@Test
		public void mainTest_InvalidStructure() {
			assertThrows( IllegalArgumentException.class, () -> {
				testStructure.testInit();
			});
			assertThrows( AssertionFailedError.class, () -> {
				testStructure.testInit();
			});
			assertThrows( IllegalArgumentException.class, () -> {
				testStructure.getVersion().setValue("2.0");
			});
			assertThrows( IllegalArgumentException.class, () -> {
				testStructure.getVersion().setMinor("2.0");
			});
			assertThrows( IllegalArgumentException.class, () -> {
				testStructure.getVersion().setMajor("2.0");
			});
			assertThrows( IllegalArgumentException.class, () -> {
				testStructure.getVersion().setCurrent("2.0");
			});
			assertThrows( IllegalArgumentException.class, () -> {
				testStructure.getVersion().setMinor("-1");
			});
			assertThrows( IllegalArgumentException.class, () -> {
				testStructure.getVersion().setMajor("-1");
			});
			assertThrows( IllegalArgumentException.class, () -> {
				testStructure.getVersion().setCurrent("-1");
			});
			assertThrows( IllegalArgumentException.class, () -> {
				testStructure.getVersion().setMajor("2.0");
			});
			testStructure.testInit();
		}

		private String getLogPattern() {
			return
				"@LOG4J_LOG = " + LOG_LEVEL.getLevel() + "_" + new Date().getTime() + " "
					+ testStructure.getPrefix() + LOG_LEVEL.getLevel() + " " + LOG_LEVEL.getLevel().toString()
					+ " " + new Date().getTime() + " log4j.";
		}

		private String getName() {
			return testStructure.getName();
		}
}