// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains one unit test case for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {
		final int a = 1;
	public final int b = 2;
	public final int c = 3;

    /**
     * Tests the constructor.
     * @throws Exception if the constructor did not fail.
     */
    @Test
    public void testConstructor() throws Exception {
		JniInchiStructure testStructure = new JniInchiStructure();
		assertTrue("JniInchiStructure didn't work properly",testStructure.getBond(a)!=null);
		assertTrue("JniInchiStructure didn't work properly", testStructure.getBond(b) == null);
		assertTrue("JniInchiStructure didn't work properly",testStructure.getBond(c) == c); 
	}

    /**
     * Tests getNrBonds.
     */
    @Test
    public void testGetNrBonds() {
	    assertEquals("incorrect getNrBonds()",1, testStructure.getBondCount());
	    JniInchiStructure.getBondCount();
    }
}