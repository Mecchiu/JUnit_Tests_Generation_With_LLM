// DefaultNoteListModel_2Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_2Test {
		
    /**
     * Returns an enumeration of the components of this list.
     * @return an enumeration of the components of this list
     * @see Vector#elements()
     */
    public Enumeration<AbstractNote> elements() {
        return elements.elements();
    }
	
	@Test
    public void testElements() {
        Vector<AbstractNote> vector = new Vector<>();
        vector.add(new AbstractNote(2, "A", 5));
        vector.add(new AbstractNote(3, "B", 4));
        vector.add(new AbstractNote(0, "C", 1));
        
        Vector<AbstractNote> expected = new Vector<>();
        expected.add(new AbstractNote(2, "A", 5));
        expected.add(new AbstractNote(3, "B", 4));
        expected.add(new AbstractNote(0, "C", 1));
        
        assertEquals(expected, elements());
    }
	
	@Test
	public void testGet() {
        assertNull(elements.get());
        
        enumeration_check("Element");
        
        AbstractNote one = elements.get();
        assertEquals("A", one.getNote().getLabel());
		
        enumeration_check("Element");
        
        AbstractNote two = elements.get();
        assertEquals("C", two.getNote().getLabel());
	}
	
	@Test
	public void testSet() {
        assertNull("Nothing yet set to vector", elements.set(null));
        
        vector_check(false);
        
        AbstractNote one = elements.set(new AbstractNote(2, "B", 1));
        assertNull("Should be null now", elements.get());
        assertEquals("A", one.getNote().getLabel());
        
        vector_check(true);
        
        AbstractNote two = elements.set(new AbstractNote(3, "B", 4));
        assertEquals("B", two.getNote().getLabel());
        assertEquals("C", two.getNote().getValue().getLabel());
        
        assertEquals("C", elements.get().get(1).getNote().getValue().getLabel());
        assertEquals("B", elements.get().get(2).getNote().getValue().getLabel());
        expected_check(2);
        
		
        AbstractNote three = elements.get().get(1);
        assertEquals("B", three.getNote().getValue().getLabel());
        AbstractNote four = elements.get().get(2);
        assertEquals("C", four.getNote().getValue().getLabel());
    }
    
	@Test
	public void testSet_after_get() {
		assertEquals("Nothing yet set to vector", elements.get(), elements.set(null));
		
		vector_check(false);
		
		AbstractNote one = elements.set(new AbstractNote(3, "B", 3));
		assertEquals("B", one.getNote().getLabel());
		assertEquals("B", elements.get().get(1).getNote().getLabel());
		assertEquals("B", elements.get().get(2).getNote().getLabel());
		assertEquals("B", elements.get().get(3).getNote().getLabel());
		assertEquals("C", elements.get().get(4).getNote().getValue().getLabel());
		assertEquals("C", elements.get().get(5).getNote().getValue().getLabel());
		assertEquals("C", elements.get().get(6).getNote().getValue().getLabel());
		assertEquals("C", elements.get().get(7).getNote().getValue().getLabel());
		assertEquals("C", elements.get().get(8).getNote().getValue().getLabel());
        
		
        vector_check(true);
		
		AbstractNote two = elements.set(new AbstractNote(3, "B", 4));
		assertEquals("B", two.getNote().getLabel());
		assertEquals("B", elements.get().get(1).getNote().getValue().getLabel());
		assertEquals("B", elements.get().get(2).getNote().getValue().getLabel());
		assertEquals("C", elements.get().get(3).getNote().getValue().getLabel());
        
		
        AbstractNote six = elements.set(new AbstractNote(0, "B", 5));
        assertEquals("B", six.getNote().getLabel());
        AbstractNote seven = elements.get().set(1, new AbstractNote(0, "A", 5));
        assertEquals("A", seven.getNote().getLabel());
		
        AbstractNote eight = elements.set(new AbstractNote(0, "B", 0));
        assertEquals("B", eight.getNote().getLabel());
		
        AbstractNote two_seven = elements.set(new AbstractNote(0, "B", 6));
		assertEquals("B", two_seven.getNote().getLabel());
        
		
        enumeration_check("Vector");
        
        vector_check(true);
        
        AbstractNote one = elements.set(new AbstractNote(0, "B", 0));
        AbstractNote two = elements.set(new AbstractNote(0, "B", 0));
        AbstractNote three = elements.set(new AbstractNote(0, "B", 0));
        AbstractNote four = elements.set(new AbstractNote(0, "B", 0));
        AbstractNote five = elements.set(new AbstractNote(0, "B", 0));
        
		enumeration_check(2);
		assertFalse("Nothing still set", elements.set(new AbstractNote(0, "B", 1)));     
		assertNull("Nothing yet set to the one-th-set", elements.get());
		assertNull("Nothing yet set to the two-th-set", elements.set(new AbstractNote(0, "B", 3)));
		assertNull("Nothing yet set to the three-th-set", elements.set(new AbstractNote(0, "B", 4)));
		// There is no possibility when to set to a certain number.
	}
	
	void vector_check(boolean set) {
		Vector<AbstractNote> vector = (Vector<AbstractNote>)elements.get();
}
}