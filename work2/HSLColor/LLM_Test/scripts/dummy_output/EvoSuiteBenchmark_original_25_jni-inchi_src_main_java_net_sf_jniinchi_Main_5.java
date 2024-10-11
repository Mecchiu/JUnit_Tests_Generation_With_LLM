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
		  
    @Test
    public void testGetTestMolecule() {
        final Main m = new Main();
        assertEquals(getTestMolecule().getClass().getCanonicalName(), m.getClass().getCanonicalName());
    }
    
    @Test
    public void testGetClass() {
        final Main m = new Main();

        final Class<?> clazz = m.getClass();
        assertEquals(Main.class, clazz);
    }
}