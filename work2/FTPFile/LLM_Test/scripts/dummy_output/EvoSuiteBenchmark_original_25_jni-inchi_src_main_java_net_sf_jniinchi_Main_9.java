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
     * Simple constructor.
     */
    public MainTest() {    
    }

    /**
     * Tests the {@link Main#getTestMolecule()} method.
     * @throws Exception
     */
    @Test
    @SuppressWarnings({"serial"})
    public void testGetTestMolecule()
            throws Exception {
        try {
            Main.getTestMolecule();
            fail("Could not instantiate JniInchi from scratch, with unknown parameters");
        } catch (Exception e) {
            assertEquals(e.getLocalizedMessage(), "Not a valid JNIInchi");
        }
        try {
            Main.getTestMolecule();
            fail("Could not instantiate JNIInchi from scratch, with unrecognized file");
        } catch (Exception e) {
            assertTrue(false);
        }
        
        
        final JniInchiStructure inchi = (JniInchiStructure) JniInchi.readFromFile("/path2");
        assertNotNull(inchi);
        
        try {
            java.awt.EventQueue.invokeAndWait(new Runnable() {
                
                public void run() {
					Main.getTestMolecule();	
				 }
            	
            } );
            fail("Event queue should be blocked");
            
        } catch (java.awt.IllegalComponentStateException e) {
        }

        
        try {
            Main.getTestMolecule();
            fail("Main method should fail to instantiate a JNIInchi");
        } catch (Exception e) {
            if (e instanceof OutOfMemoryError) {
                fail("Test didn't fail due to trying to create a JNIInchi from scratch");
            } else {
                fail("Unknown error");
            }
        }
    }
    
    /**
	 * Verify the {@link String#matches(String)} method.
	 * The function does not yet have any local variable information
	 * but this function contains the expected parameters.
	 * @throws Exception
	 */
	@Test
	@SuppressWarnings("unused")
	public void testGetStringMatches() throws Exception {
                assertEquals(".{0,}1{3,15}", Main.getStringMatches(".{0}"
                       , "1{"));
        assertEquals("{0, 1, 3, 15, 16}", Main.getStringMatches("{0}"
                       , "1{"));
        assertEquals("[].{0,1}", Main.getStringMatches("[].{0}"
                       , "1{"));
        assertEquals("{0,1,3,15,16}", Main.getStringMatches("{0}"
                       , "1{"));
        assertEquals("[0,10,2,12,11]", Main.getStringMatches("[0, "+
                "10,2,12,11,0]", "1{"));
        assertEquals(
                "{0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28+}"
                       , Main.getStringMatches("{0}"
                               , "1{"));
        assertEquals("{1,3,5,7,9,11,15}"
                       , Main.getStringMatches("{1}"
                               , "[3,5,7,9,11,15]"
                               , "1{"));
                
        

		assertEquals("{1," +
                "10,16,20,24,28,40,48,60,72,84,96,110,140,180,208}",
                Main.getStringMatches("{1}"
                       , "[10,16,20,24,28,40,48,60,72,84," +
                        "96,110,140,180,208]"
                       , "1{"));
        assertEquals("{1,1,1}"
                       , Main.getStringMatches("{1}"
                               , "[1,1,1]"
                               , "1{"));
                        
		assertEquals("{,{1}"
                       , Main.getStringMatches("{,{1}"
                               , ","
                               , "1{1}"
                               , "1{"));
        
        assertEquals("{1,1}"
                       , Main.getStringMatches("{1}"
                               , ","
                               , "[1,"
                               , "1]"
                               , "1{"));
        assertEquals("{1,1}"
                       , Main.getStringMatches("{1}"
                               , "[1,1,1]"
                               , "[1}"
                               , "1{"));
                
        
        assertEquals("{0,1,2}", Main.getStringMatches("{0}"
                       , "{"));
        assertEquals("{0}"
                       , Main.getStringMatches("{0}"
                               , "{"));
        assertEquals("[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28, 29,30,31,32]"
                       , Main.getStringMatches("{0}"
                               , "[0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28, 29,30,31,32]"
                               , "{"));
}
}