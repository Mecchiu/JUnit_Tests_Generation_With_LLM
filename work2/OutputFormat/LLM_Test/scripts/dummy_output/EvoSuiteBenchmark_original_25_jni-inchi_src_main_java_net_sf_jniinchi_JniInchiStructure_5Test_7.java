// JniInchiStructure_5Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getStereo0D(int)} method.
*/
class JniInchiStructure_5Test {
		
	private static final boolean DETAILED = false;

    /**
	 * @throws javax.swing.UnsupportedLookAndFeelException
	 */
	@Test
    public void testCase0() throws UnsupportedLookAndFeelException {
        List<JniInchiStereo0D> results = new ArrayList<JniInchiStereo0D>();
        for (int i = 0; i < 2; i++) {
            results.add(getStereo0D(i));
        }
        assertEQ(results, new JniInchiStereo0D[] { getStereo0D(0), getStereo0D(1) });
    }
    
    /**
	* @throws javax.swing.UnsupportedLookAndFeelException
	*/
	@Test
    public void testCase1() throws UnsupportedLookAndFeelException {
        List<JniInchiStereo0D> results = new ArrayList<JniInchiStereo0D>();
        for (int i = 0; i < 2; i++) {
            results.add(getStereo0D(2, i));
        }
        assertEQ(results, new JniInchiStereo0D[] { getStereo0D(4), getStereo0D(1, 1) });
    }
    
    /**
	* @throws javax.swing.UnsupportedLookAndFeelException
	*/
	@Test
    public void testCase2() throws UnsupportedLookAndFeelException {
        List<JniInchiStereo0D> results = new ArrayList<JniInchiStereo0D>();
        for (int i = 0; i < 2; i++) {
            results.add(getStereo0D(i, 2));
        }
        assertEQ(results, new JniInchiStereo0D[] { getStereo0D(0, 0), getStereo0D(1, 0) });
    }
    
    /**
	* @throws UnsupportedLookAndFeelException
	*/
	@Test
    public void testCase3() throws UnsupportedLookAndFeelException {
        List<JniInchiStereo0D> results = new ArrayList<JniInchiStereo0D>();
        results.add(getStereo0D(2, 0));
        results.add(getStereo0D(3, 0));
        results.add(getStereo0D(4, 0));
        results.add(getStereo0D(5, 0));
        assertEQ(results, new JniInchiStereo0D[] { });
    }
    
    /**
	* @throws UnsupportedLookAndFeelException
	*/
	@Test
    public void testCase4() throws UnsupportedLookAndFeelException {
        List<JniInchiStereo0D> results = new ArrayList<JniInchiStereo0D>();
        results.add(getStereo0D(4));
        results.add(getStereo0D(5));
        assertEQ(results, new JniInchiStereo0D[] { getStereo0D(0) });
    }
    
	
}