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
		
    // ------------------------------ FIELDS ------------------------------

    private DefaultNoteListModel m_model = new DefaultNoteListModel();
    
    // ------------------------------ METHODS --------------------------

    @junit.Test
    public void testLastElement() {
        
        final List<AbstractNote> v = new ArrayList<AbstractNote>();
        final AbstractNote n1 = m_model.lastElement();
        assertTrue("Last element doesn't exist with proper default class", n1 instanceof Note);
        assertTrue("Unexisting last element throws exception",!v.contains(n1));
        
        final AbstractNote n2 = m_model.lastElement();
        assertFalse("First element is missing default class", n2 instanceof Note);
        assertTrue("Unexisting first element throws exception", v.contains(n2));
        
        m_model.add(n1);
        m_model = new DefaultNoteListModel();
        v = m_model.lastElement();
        assertSame("First element not as DefaultNoteListModel.lastElement() returns the correct object", n1, v.get(0));
        assertEquals("Expected last element after adding new element into default list", n1, v.get(0));
    }
    
    @junit.Test
    public void testAddFirstMissing() {
        
	throwExceptionIfNecessary();
        
        final List<AbstractNote> v = new ArrayList<AbstractNote>();
        ((AbstractNoteListModel) m_model).add(new AbstractNote());
            
        try {
	    m_model.add(new Note());
	    fail("Unexpected exception not thrown");
        } catch(NoSuchElementException ioe) {};
            
        try{ m_model.add(v.remove((AbstractNote)v.get(0))); }catch(NoSuchElementException ioe){
        	fail("Not throwing exception when adding a list with first missing element was not expected");};
    }
    
    @junit.Test
    public void testRemoveLastMissing() {
        
	throwExceptionIfNecessary();
        
        final List<AbstractNote> v = new ArrayList<AbstractNote>();
        
        v.add(new Note());
        assertEquals("Last element should be added when removing it from the list", 1, v.size());
        assertEquals("Last element should be removed from the list", 0, lastElement());
        
        ((AbstractNoteListModel) m_model).add(new AbstractNote());
        assertEquals("Last element should be removed from the list", 0, lastElement());
        
        // Remove it
        ((AbstractNoteListModel) m_model).remove(v.get(0));
        assertEquals("Expected empty list after removing a list without empty list", 0, lastElement());
        
        // Remove the last element
        ((AbstractNoteListModel) m_model).remove(v.get(0));
        assertNull("Expected last element after removing the last element from the list", lastElement());
        
        assertEquals("Expected empty list after removing a list without empty list", v.size(), m_model.size());
    }
    
    @junit.Test
    public void testRemoveFirstMissing() {
        
	throwExceptionIfNecessary();
        
        final List<AbstractNote> v = new ArrayList<AbstractNote>();
        
        v.add(new Note());
        assertEquals("First element should be added when removing it from the list", 1, v.size());
        assertEquals("First element should be removed from the list", 0, firstElement());
        
        ((AbstractNoteListModel) m_model).add(v.remove((AbstractNote)v.get(0)));
        assertEquals("First element should be removed from the list", 0, firstElement());
        assertNull("Expected last element after removing the list without empty list", lastElement());
        
        ((AbstractNoteListModel) m_model).add(new Note());
        assertEquals("Last element should be removed from the list", 0, lastElement());
        
        try {
		((AbstractNoteListModel) m_model).remove(new Note() {
		    @Override
		    public String toString() {
		        return "Fake Object to be removed";
		    }

		});
                    } catch (NoSuchElementException nse) {};
	assertEquals("Unexpected exception not thrown", v.remove((AbstractNote) null), m_model.remove(null));
        assertNull("Expected last element after removing the last element from the list", lastElement());
        assertEquals("Expected empty list after removing the list without empty list", 0, m_model.size());
    }
    
    @junit.Test
    public void testNullFirstElement() {
        throwExceptionIfNecessary();
        
        final List<AbstractNote> v = new ArrayList<AbstractNote>();
        final AbstractNote n1 = v.get(0);
	assertEquals("Unexpected 1 element to insert in list", v.remove((AbstractNote)n1), (AbstractNoteListModel) v.remove((AbstractNote)n1));
        assertEquals("Unexpected 1 element to insert in list", v.remove(n1), (AbstractNoteListModel) v.remove(n1));
    }
    
    @junit.Test
    public void testNullLastElement() {
        throwExceptionIfNecessary();
        
        final List<AbstractNote> v = new ArrayList<AbstractNote>();
        final AbstractNote n1 = v.get(0);
        assertEquals("Unexpected 0 element to insert in list", v.remove((AbstractNote)n1), (AbstractNoteListModel) v.remove((AbstractNote)n1));
        assertEquals("Unexpected 0 element to insert in list", v.remove(n1), (AbstractNoteListModel) v.remove(n1));
    }

    /**
     * Returns an exception if the list is non-empty.
     */
    protected void throwExceptionIfNecessary () {
        assertNotNull("DefaultNoteListModel did not throw an exception", m_model);
    }
    
    /**
     * Sets the {@link List} to {@code null} so as if we didn't set it.
     */
    protected void assertNull(final Object s) {
        assertNull(m_model.remove(null), s);
    }
    
    /**
     * Returns a {@link junit.framework.AssertionFailedException} or
     * {@linkplain IllegalStateException} exception that is equal to
     * the {@link #lastElement()} and a proper {@link List} with
     * a default class.
     */
    public static void assertExceptionWhenAdding (final Object o) {
	for (int i = 0; i < 100; i++) { try { o.toString(); } catch (Exception ignore) {} }
	if (o instanceof AbstractNote) {
	    throw new IllegalStateException("Unexpected error");
	}
	throwExceptionIfNecessary();
    }
}