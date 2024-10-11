// DefaultNoteListModel_0Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_0Test {
		
    final double[] x = {0,0.1,0.4,.9};
    final double[][] y = {
		{0,0,0,0},
		{0.1,0.4,0.9,0.5},
		{.9,0,0,0.4},
    };
    final Object[] r = {
		new Object[]{0,0,0,0},
		new Object[]{0.1,0.4,0.9,0.5},
		new Object[]{.9,0,0,0.4},
    };
    
    TestClass() { }
    
    /**
     * Test method for {@link com.allenstudio.ir.core.plugins.AbstractNote#getData()}.
     */
    @Test
	public void test0() {
        // check correct value of object array
        assertArrayEquals(r, getData().array(), 1.0e-8);
		
		// check correct value of array
		assertArrayEquals(x, getData().array(), 1.0e-8);
    }
    
    /**
     * Test method for {@link com.allenstudio.ir.core.plugins.AbstractNote#getData()}.
     * throws exception should result in null
     */
    @Test(expected = NullPointerException.class)
	public void test1() {
        // check exception
		getData().array();
	}
    
    /**
     * Test method for {@link com.allenstudio.ir.core.plugins.AbstractNote#getData()}.
     * throws exception should result in null
     *
     * @throws Exception some exception
     */
    @Test(expected = NullPointerException.class)
    public void test2() throws Exception {
        AbstractNote.getData();
    }
    
    /**
     * Test method for {@link com.allenstudio.ir.core.plugins.AbstractNote#getData()}.
     * throws exception should result in null
     */
    @Test(expected = UnknownPropertyException.class)
    public void test3() throws UnknownPropertyException {
        // check correct property
        AbstractNote.getData();
    }
    
	 // No Data Event is notified
	@Test
	public void test4() {
        assertNotInitialized();
    }
	
    
    
    
}