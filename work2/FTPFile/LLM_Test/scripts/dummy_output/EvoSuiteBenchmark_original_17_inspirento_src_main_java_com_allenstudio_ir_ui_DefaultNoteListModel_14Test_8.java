// DefaultNoteListModel_14Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {
		
	/**
	 * Tests removal of the specified element from the list. Returns the removed
	 * element in the same array as this.
	 */
	@Test
	public void testRemove() {
		DefaultNoteListModel m = new DefaultNoteListModel();
		
		final AbstractNote a1 = new StandardNote("A");
		final AbstractNote a2 = new StandardNote("B");
		final AbstractNote a3 = new StandardNote("C");
		
		Collection<AbstractNote> c = new ArrayList<AbstractNote>(4);
		c.add(a1);
		c.add(a2);
		c.add(a3);
		c.add(a2);
		
		m.add(a1);
		m.add(a2);
		m.add(a3);
		
		assertTrue("The list is empty after adding elements.", m.remove(0));
		assertFalse("The list is empty after removing a third element.",
				((AbstractNote) m.get(1)).equals(a1));
		
		assertNotNull("The returned element is null.", m.get(1));
		assertTrue("The removed list is not empty.", m.get(1).equals(c));
	}
		
	/**
	 * Tests removal of the specified element from the list.
	 */
	@Test(expected = IndexOutOfBoundsException.class)
	public void testRemove_out_of_bounds() {
		DefaultNoteListModel m = new DefaultNoteListModel();
		
		final AbstractNote a1 = new StandardNote("A");
		final AbstractNote a2 = new StandardNote("B");
		final AbstractNote a3 = new StandardNote("C");
		
		Collection<AbstractNote> c = new ArrayList<AbstractNote>(4);
		c.add(a1);
		c.add(a2);
		c.add(a3);
		
		// Add another one of the same element before the test
		m.add(a1);
		m.add(a2);
		
		m.remove(0);
	}
	
	/**
	 * Tests that the specified index is found and removed from the list.
	 */
	@Test
	public void testRemove_index() {
		DefaultNoteListModel m = new DefaultNoteListModel();
		
		final Collection<AbstractNote> c = new ArrayList<AbstractNote>(4);
		final AbstractNote a1 = new StandardNote("A");
		final AbstractNote a2 = new StandardNote("B");
		final AbstractNote a3 = new StandardNote("C");
		final AbstractNote a4 = new StandardNote("D");
		final AbstractNote a5 = new StandardNote("E");
		
		Collection<AbstractNote> c2 = new ArrayList<AbstractNote>(2);
		c2.add(a3);
		c2.add(a4);
		
		m.add(a1);
		m.add(a2);
		m.add(a4);
		m.add(a5);
		
		m.remove(a1.getNumber());
		assertTrue("The indexed element was not found.", c.contains(a1));
		
		assertFalse("The returned element should not be contained by the removed one", c2.contains(c.get(0)));
		assertTrue("The indexed element was not found.", c2.contains(c.get(1)));
	}
	
}