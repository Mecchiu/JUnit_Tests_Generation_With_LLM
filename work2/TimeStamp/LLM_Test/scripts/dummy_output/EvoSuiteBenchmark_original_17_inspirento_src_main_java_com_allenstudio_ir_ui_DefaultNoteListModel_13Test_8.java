// DefaultNoteListModel_13Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#get(int)} method.
*/
class DefaultNoteListModel_13Test {
		
	/**
	 * Tests {@link DefaultNoteListModel#get(int)}.
	 * 
	 * @throws Exception if the test fails
	 */
	@Test
    public void testGet() throws Exception {
		DefaultNoteListModel model = new DefaultNoteListModel();
		for(int i = 0; i < 15; i++) model.addElement(createNote(i));
		
		for(int i = 0; i < 300; i++) model.addElement(createNote(i));
		
		// we can get at each of the 5 different numbers from the model
		Set<Object> values = new HashSet<>();
		for(int i = 2; i < 5; i++) {
			Object o = model.get(i);
			values.add(o);
		}
		// we have 5 elements in the model, which each have 5 numbers, so all the
		// elements will be the same value.
	}
	
	/**
	 * Tests adding an element to the list.
	 * 
	 * @throws Exception if the test fails
	 */
	@Test
    public void testAddElement() throws Exception {
		DefaultNoteListModel model = new DefaultNoteListModel();
		Collection<Object> expected = new HashSet<>();
		model.addElement(createNote(0));
		expected.add(createNote(0));
		expected.add(createNote(1));
		expected.add(createNote(3));
		expected.add(createNote(5));
		expected.add(createNote(7));
		expected.add(createNote(11));
		expected.add(createNote(15));
		expected.add(createNote(17));
		expected.add(createNote(19));
		expected.add(createNote(23));
		expected.add(createNote(29));
		expected.add(createNote(31));
		expected.add(createNote(33));
		model.addElement(createNote(35));
		expected.add(createNote(29));
		expected.add(createNote(51));
		expected.add(createNote(55));
		expected.add(createNote(61));
		expected.add(createNote(77));
		expected.add(createNote(91));
		expected.add(createNote(87));
		model.addElement(createNote(19));
		expected.add(createNote(23));
		expected.add(createNote(47));
		expected.add(createNote(61));
		expected.add(createNote(91));
		model.addElement(createNote(19));
		expected.add(createNote(63));
		expected.add(createNote(87));
		model.addAll(expected);
		
		// the same number of objects should be added, no change
		assertEquals(expected, model.getAll());
		
		model.addElement(createNote(18));
	}
	
	/**
	 * Tests deleting an element from the list.
	 * 
	 * @throws Exception if the test fails
	 */
	@Test
    public void testRemoveElement() throws Exception {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.addElement(createNote(0));
		
		// make sure that we can find the element we are trying to delete
		Collection<Object> values = model.get(0);
		assertEquals(createNote(0), values.iterator().next());
		setListener(0, 0, 0);
		
		if(values.isEmpty()) throw new AssertionError("Unable to get the correct element from table. Values: " + values);
		
		values.clear();
		
		// make sure that we can find the element we are trying to delete
		values = model.get(1);
	    assertEquals(createNote(1), values.iterator().next());
		setListener(1, 1, 0);
		
		// make sure that we can find what was created since the
		// element we are trying to delete was added
		values = model.getAll();
		assertTrue(values.isEmpty());
	}
	
	/**
	 * Tests that a listener for a given element does nothing if the list is empty
	 * or a listener exists for the specified element.
	 * 
	 * @throws Exception if the test fails
	 */
	@Test
    public void testGetAllListener() throws Exception {
		DefaultNoteListModel model = new DefaultNoteListModel();
		setListener(0, 0, 0);
		assertEquals(new LinkedHashSet<>(), model.getAll());
		model.setAll(Arrays.asList(createNote(0), createNote(1), createNote(2), createNote(3), createNote(4), createNote(5), createNote(6), createNote(7), createNote(8), createNote(9), createNote(10)));
		assertEquals(new LinkedHashSet<>(), model.getAll());
		setListener(2, 2, Arrays.asList(createNote(4), createNote(9), createNote(11)));
		assertEquals(new LinkedHashSet<>(), model.getAll());
		setListener(21, 3, Arrays.asList(createNote(35), createNote(43)));
		assertEquals(new LinkedHashSet<>(), model.getAll());
		
		String[] values = getAll();
		assertEquals(new String[] {"3", "35", "43"}, values);
	}
	
	/**
	 * Returns the given object as a String.
	 *  
	 * @param o the object to return
	 */
	private static String toString( Object o ) {
		return o.toString();
	}
	
	/**
	 * Returns the given collection representing the given object as a String.
	 *  
	 * @param c the collection to return
	 */
	private static String toString( Collection<Object> c ) {
		return toString(c.toArray());
	}
	
}