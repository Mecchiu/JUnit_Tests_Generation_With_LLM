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
		
	/**
	 * Unit test class.
	 */
	static void testMain() {
		for (int i=0;i<1024;i++) {
			final String str="";
			// Print line for unit tests 
			System.err.println("LINE: "+String.valueOf(i));
			
			// Testing the {@link Main#getTestMolecule()} method
			final JniInchiStructure testMolecule=(JniInchiStructure)Main.getTestMolecule();
			if (testMolecule==null) {
				throw new Exception("No test molecule.");
			}
			
			// Testing a log level of 3.
			final String str1="";
			System.err.println("STR1");
			final Level level1=(Logger.getLogger(str1.toString())).getLevel();
			assertEquals("Log level differs.",Level.ALL,level1);
			
			// Testing Log4J 3.
			final PatternLayout layout1="java.util.logging.Log4J";
			System.err.println("[patternLayout: "+layout1+"]");
			ConsoleAppender capp=new ConsoleAppender();
			capp.setLayout(layout1);
			Level logLevel=(Logger.getLogger(layout1).getParent()).getLevel();
			assertEquals("Log4J format differs (Logger.getLogger(str1).getLevel).",Level.ALL,logLevel);
			
			// Test the output.
			System.err.println(str);
			
			// Testing a log level one higher than the log level of 0.
			final PatternLayout layout2="java.util.logging.Logger";
			System.err.println("[patternLayout: "+layout2+"]");
			capp=new ConsoleAppender();
			capp.setLayout(layout2);
			System.err.println(str);
		}
	}
    
    /**
     * Run the program.
     */
    static void main() {
    	Logger.getRootLogger().debug("DEBUG");
    	testMain();
    }
}