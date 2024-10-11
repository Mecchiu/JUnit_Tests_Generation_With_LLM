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
     * Test unit test for {@link Main#getTestMolecule()} method.
     */
    @Test
    public void testGetTestMolecule() {
        final Main testObj = new Main();
        final JniInchiStructure testMolecule = testObj.getTestMolecule();
        JniInchiStructure testMoleculeString = new JniInchiStructure(testMolecule.toString());
        assertTrue(testMoleculeString.equals(testMolecule));

        String testMoleculeString2 = testMolecule.toString();
        final String testMolString = new String(testMoleculeString.toString());
        assertEquals(testMolString, testMoleculeString2);
    }

    /**
     *
     */
    @Test
    public void testGetMessage() {
        Logger logger = Logger.getLogger("");
        Level level = Logger.getLogger("").getLevel();
        logger.setLevel(Level.WARN);
        final ConsoleAppender consoleAppender = new ConsoleAppender(new PatternLayout(
				JniInchiStructure.TESTRC));
        Logger.getRootLogger().consoleAppender(consoleAppender);

        Logger.getLogger("").setLevel(Level.OFF);
        final ConsoleAppender consoleAppender2 = new ConsoleAppender(new PatternLayout(
				JniInchiStructure.TESTMOSER));
        Logger.getRootLogger().consoleAppender(consoleAppender2);
        final String msg = "Aaaaaaa AAA aaa aaa";
        String testString = logger.getMessage(msg);
        String testString2 = consoleAppender2.getMessage();
        final String testMoser = JniInchiStructure.TESTMOSER.toString();
        assertEquals(testString, testString2);
        assertEquals(testMoser, testString2);
    }

    /**
     * Test method of {@link Main#getTestMolecule()} method with wrong arguments.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTestMoleculeArray() {
        final String[] testArgs = new String[]{};
        new Main(testArgs);
    }

    /**
     * Test method of {@link Main#getTestMolecule()} method with wrong arguments.
     */
    @Test(expected = IllegalArgumentException.class)
    public void testGetTestMoleculeCollection() {
        new Main();
    }

}