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
		
	/*
     * @Test
     * public void setUp() throws Exception {
     * 	Logger.getRootLogger().addAppender(new org.apache.log4j.ConsoleAppender(
     * 		new Logger.PidConsoleAppender(
     * 			new PatternLayout("%-4E: %-6n %c %L %p [%r]%n")));
     *  Logger.getLogger("org.apache.log4j.ConsoleAppender"));
     *  Logger rootLogger = Logger.getRootLogger();
     *  rootLogger.setLevel(Level.FATAL);
     *  Logger.getRootLogger().removeAllAppenders();
     *  Logger.getRootLogger().addAppender(new ConsoleAppender(
     *      new Log4jConsoleAppender(rootLogger, true)));
     * }
	 */
	
    @Test
    public void test1() throws Exception {
//		Logger rootLogger = Logger.getRootLogger();
//		
//		// We should observe this:
//		assertNotNull("Logger logger is null", rootLogger.getParent());
//		
//		assertNotNull("Logger logger.getParent() should not be null", 
//			rootLogger.getParent().getParent());
//		
//		// Get a logger named "myLogger":
//		Logger myLogger = 
//				rootLogger.getParent().getParent().getParent().
//				getLogger("myLogger");
//		
//		
//		// Test on it's level
//		assertTrue("myLogger.getLevel()".equals("INFO") == false);
//		myLogger.setLevel(Level.FATAL);
//		assertTrue("myLogger.getLevel()".equals("FATAL") == true);
//		
//		// getMolecule() should return null
//		assertNull("myLogger.getMolecule()".equals("myLogger"), 
//			myLogger.getMolecule());
    }
    
    @Test
    public void test2() throws Exception {
//		Logger rootLogger = Logger.getRootLogger();
//		
//		// We should observe this:
//		assertNotNull("Logger logger is null", rootLogger.getParent());
//		
//		assertNotNull("Logger logger.getParent() should not be null", 
//			rootLogger.getParent().getParent());
//		
//		// Test on it's level
//		assertTrue("rootLogger.getLevel()".equals("INFO") == false);
//		rootLogger.setLevel(Level.INFO);
//		assertTrue("rootLogger.getLevel()".equals("INFO") == true);
    }
    
    @Test
    public void test3() throws Throwable {
		Logger rootLogger = Logger.getRootLogger();
		
		// We should observe this:
		assertNotNull("Logger logger is null", rootLogger.getParent());
		
		Logger myLogger = rootLogger.getParent().getParent().getParent().
				getLogger("myLogger");
		
		String content = "This is a test";
		
		// Try and write to the logger
		if (myLogger.isLoggable(Level.ERROR)) {
			myLogger.error("Fatal error", content);
		} else {
			// We do not want to see something loggable by default.
			myLogger.info("INFO", content);
		}
		
		// Get the logger's content
		ContentLogger contentLogger = myLogger.getContentLogger();
		assertNotNull("ContentLogger.addLogLine() should not be null", 
			contentLogger);
		
		log("this is a test");
		
//		System.out.println("END!");

//		// The getLogger call is only available for Level.FATAL,
//		// except for FATAL, which we call our own for log 4j and higher.
//		// Logger logToTheEnd = Logger.getRootLogger().getLogger("test");
//		// logToTheEnd.setLevel(Level.FATAL);
//		// System.out.println("END="+logToTheEnd.getLevel());
		
		// We should get the same content in the order we started the loggers
//		String levelLogName = logToTheEnd.getContentLogger().
//				getLoggerContent("myLogger");
//		assertEquals("ContentLogger: myLogger is NOT the last level", 
//			"FATAL", levelLogName);
//		
//		// But, we should still have another entry like this
//		String levelLogName = logToTheEnd.getContentLogger().
//				getLoggerContent("myLogger2");
//		assertEquals("ContentLogger: myLogger2 is NOT the last level", 
//			"INFO", levelLogName);
	}
	
	private void log(String content) {
		System.out.println(content);
	}

}