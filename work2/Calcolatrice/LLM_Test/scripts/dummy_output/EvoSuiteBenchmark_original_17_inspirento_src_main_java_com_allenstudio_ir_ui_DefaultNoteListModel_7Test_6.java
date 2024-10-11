// DefaultNoteListModel_7Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {
		/**
		* If the test case has one parameter.
		*/
      @Test
	  public void unitTest1() {
	    DefaultNoteListModel m = new DefaultNoteListModel();
	        m.put(new AbstractNote(""), 0);
	    assertTrue("The list should be empty", m.size() == 0);
	    m.add(new Object(), 0);
	    assertTrue("The list should contain two elements", m.size() == 2);
	    m.add(new Object(), 1);
	    assertTrue("The list should contain one more element than the last one", m.size() == 2);
	    assertEquals("The last index of the list", 1, m.lastIndexOf(new Object(), 1));
	  }
    
	 /**
	          * Tests the last index of an empty list at the end of the list.
	          */
	  @Test
	  public void testLastIndexOfEmptyList() {
	    DefaultNoteListModel m = new DefaultNoteListModel();
	        m.add(new Object(), 1);
	        m.add(new Object(), 2);
	        assertTrue("The list should contain two elements", m.size() == 2);
	        assertEquals("The last index of the list", 2, m.lastIndexOf(new Object(), 1));
	        assertEquals("The last index of the list", 1, m.lastIndexOf(new Object(), 2));
	  }
	  
	 /**
	          * Tests the first index of an empty list at the start of the list.
	          */
	  @Test
	  public void testFirstIndexOfEmptyList() {
	    DefaultNoteListModel m = new DefaultNoteListModel();
	        m.add(new Object(), 1);
	        m.add(new Object(), 2);
	        assertTrue("The list should contain two elements", m.size() == 2);
	        assertEquals("The first index of the list", 2, m.firstIndexOf(new Object(), 1));
	        assertEquals("The first index of the list", 1, m.firstIndexOf(new Object(), 2));
	  }
	  
	 /**
	          * Tests the last index of a single element.
	          */
	  @Test
	  public void testLastIndexOfSingleElement() {
	    DefaultNoteListModel m = new DefaultNoteListModel();
	        m.add(new Object(), 0);
	        assertTrue("The list should contain two elements", m.size() == 2);
	        assertEquals("The last index of the list", 0, m.lastIndexOf(new Object(), 0));
	        assertEquals("The last index of the list", 1, m.lastIndexOf(new Object(), 1));
	  }
	  
	 /**
	          * Tests the first index of a triplet.
	          */
	  @Test
	  public void testFirstIndexOfTriplet() {
	    DefaultNoteListModel m = new DefaultNoteListModel();
	        m.add(new Object(), 0);
	        assertTrue("The list should contain three elements", m.size() == 3);
	        assertEquals("The first index of the list", 0, m.firstIndexOf(new Object(), 0));
	        assertEquals("The first index of the list", 1, m.firstIndexOf(new Object(), 1));
	        assertEquals("The first index of the list", 2, m.firstIndexOf(new Object(), 2));
	  }

	 /**
	         * Tests the index of a single list.
	         */
	  @Test
	  public void testIndexOfSingleList() {
	    DefaultNoteListModel m = new DefaultNoteListModel();
	        m.add(new Object(), 0);
	        assertTrue("The list should contain three elements", m.size() == 3);
	        assertEquals("The index of the first element", 0, m.indexOf(new Object(), 0));
	        assertEquals("The index of the last element", 2, m.indexOf(new Object(), 2));
	      
	  }
	  
	 /**
	         * Tests the index of a triplet.
	         */
	  @Test
	  public void testIndexOfTriplet() {
	    DefaultNoteListModel m = new DefaultNoteListModel();
	        m.add(new Object(), 0);
	        m.add(new Object(), 1);
	        assertTrue("The list should contain three elements", m.size() == 3);
	        assertEquals("The index of the first element", 0, m.indexOf(new Object(), 0));
	        assertEquals("The index of the last element", 1, m.indexOf(new Object(), 1));
	        
	  }
	  
	 /**
	         * Tests the index of a list.
	         */
	  @Test
	  public void testIndexOfList() {
	    DefaultNoteListModel m = new DefaultNoteListModel();
	        m.add(new Object(), 0);
	        m.add(new Object(), 1);
	        assertTrue("The list should contain four elements", m.size() == 4);
	        assertEquals("The index of the first element", 0, m.indexOf(new Object(), 0));
	        assertEquals("The index of the last element", 1, m.indexOf(new Object(), 1));
	        assertTrue("The length of the result list is not the same as the given list",
	                m.size() == 4);
	        
	  }
}