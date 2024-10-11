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
     * Provide test structure.
     *
     * @return
     */
    public static JniInchiStructure getTestMolecule();
    
    /**
     * Test default instance.
     */
    @Test
    public void testDefaultInstance(){
    	Main.getTestMolecule().setLevel(JniInchiStructure.Level.INFO);
    	Main.getTestMolecule();
    }
    
    /**
     * Test level.
     */
    @Test
    public void testLevel(){
        assertEquals(Level.ERROR.toString(), Main.getTestMolecule().getLevel().toString());
    }
    
    /**
     * Test level.
     */
    @Test
    public void testResetLevel(){
        Main.getTestMolecule().setLevel(JniInchiStructure.Level.INFO);
        assertEquals(Level.ERROR.toString(), Main.getTestMolecule().getLevel().toString());
	Main.getTestMolecule();
    }
    
    /**
     * Test level.
     */
    @Test
    public void testConsoleAppender(){
    	ConsoleAppender appender = ConsoleAppender.newConsoleAppender();
    	appender.setContext(new JniInchiContext()).setStream(TestHelper.TEST_OUT);
        assertNotNull(appender);
    	appender.setFormatter(new JniInchiFormatter());
    	appender.setFormatterFactory(new ConsoleFormatterFactory());
        appender.activateOptions();
    	appender.start();
    	Main.getTestMolecule().setLevel(Level.INFO);
        
	assertNull(appender);
    }
    
    /**
     * Test regular expression patterns.
     */
    @Test
    public void testRegexPattern(){
    	PatternLayout  pattern  = new PatternLayout(PatternLayout.DEFAULT_PATTERN);
    	pattern.setContext(new JniInchiContext()).setStream(TestHelper.TEST_OUT);
        
	assertNotNull(pattern);
    	
    	assertEquals(PatternLayout.NARROW.toString(),
    	    pattern.getLayoutData(PatternLayout.NARROW) 
    	   .toString());
    	
    	assertEquals(PatternLayout.CENTER_LEFT.toString(),
    	    pattern.getLayoutData(PatternLayout.CENTER_LEFT).toString());
    }
    
    /**
     * Test empty buffer.
     */
    @Test
    public void testEmptyBuffer(){
    	Main.getTestMolecule().setLevel(JniInchiStructure.Level.INFO );
    	Main.getTestMolecule().resetLevel();
    	String msg = TestHelper.TEST_INCAP;
    	assertTrue(msg.length() > 0);
    	Main.getTestMolecule().setLevel(Level.INFO);
		assertEquals(Level.ERROR.toString(), 
		    Main.getTestMolecule().getLevel().toString()
        );
    }
}