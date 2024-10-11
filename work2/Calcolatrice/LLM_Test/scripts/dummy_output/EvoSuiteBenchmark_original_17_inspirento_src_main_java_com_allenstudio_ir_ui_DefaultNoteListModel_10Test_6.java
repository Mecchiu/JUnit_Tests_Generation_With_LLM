// DefaultNoteListModel_10Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastElement()} method.
*/
class DefaultNoteListModel_10Test {
		
    /**
     * Tests the {@link DefaultNoteListModel#lastElement()} method.
     *
     * @throws Exception if the test fails for any reason
     */
    @Test
    void testLastElement() throws Exception {
		final DefaultNoteListModel model = new DefaultNoteListModel();
		final int size = model.size();
        
		for(int i = size; i > 0; i--) {
			final Object expected = model.firstElement();
			assertEquals(expected, model.lastElement());
			assertEquals(expected, model.lastElement());
		}
	}
    
    /**
     * Unit test for {@link DefaultNoteListModel#lastElement()}.
     */
    @Test
    void lastElement_01Test() {
        final DefaultNoteListModel model = new DefaultNoteListModel();
        model.add(new AbstractNote("Test", 2));
        final Object expected = model.lastElement();
        assertNotNull(expected);
        assertEquals(expected, model.lastElement());
        assertEquals("not specified", "", model.lastElement());
    }
    
    /**
     * Unit test for {@link DefaultNoteListModel#lastElement()}.
     */
    @Test
	public void lastElement_02Test() {
		final DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote("Test", 3));

		assertEquals("[1, 2, 3]", model.lastElement());
		assertEquals("[2, 3]", model.lastElement());
		System.out.println(model);
	}
	
    /**
     * Unit test for {@link DefaultNoteListModel#lastElement()}.
     */
    @Test
    void lastElement_03Test() {
        final DefaultNoteListModel model = new DefaultNoteListModel();
        model.add(new AbstractNote("Test", 5));
        model.add(new Note("one", 1));

        assertEquals("[1, 2, 3, 5]", model.lastElement());
        assertEquals("[2]", model.lastElement());
        assertEquals("", model.lastElement());
        assertEquals("[5]", model.lastElement());
    }
    
    /**
     * Unit test for {@link DefaultNoteListModel#lastElement()}.
     */
    @Test
    void lastElement_04Test() {
        final DefaultNoteListModel model = new DefaultNoteListModel();
        model.add(new AbstractNote("Test", 3));

        model.add(new AbstractNote("not", 3));

        assertEquals("[1, 3]", model.lastElement());
        assertEquals("", model.lastElement());
        assertEquals("not specified", "not", model.lastElement());
    }
    
}