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
* It contains ten unit test cases for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {

	/**
	 * Test case 1:
	 * Test the {@link DefaultNoteListModel#remove(int)} method.
	 * Test the {@link DefaultNoteListModel#getElementAt(int)} method.
	 * Test the {@link DefaultNoteListModel#getSize()} method.
	 * Test the {@link DefaultNoteListModel#isEmpty()} method.
	 * Test the {@link DefaultNoteListModel#contains(AbstractNote)} method.
	 * Test the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
	 * Test the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
	 * Test the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	 * Test the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	 * Test the {@link DefaultNoteListModel#elementAt(int)} method.
	 * Test the {@link DefaultNoteListModel#firstElement()} method.
	 * Test the {@link DefaultNoteListModel#lastElement()} method.
	 * Test the {@link DefaultNoteListModel#elements()} method.
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * Test the {@link DefaultNoteListModel#get(int)} method.
	 * Test the {@link DefaultNoteListModel#set(int, AbstractNote)} method.
	 * Test the {@link DefaultNoteListModel#add(int, AbstractNote)} method.
	 * Test the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	 * Test the {@link DefaultNoteListModel#removeElementAt(int)} method.
	 * Test the {@link DefaultNoteListModel#insertElementAt(AbstractNote, int)} method.
	 * Test the {@link DefaultNoteListModel#addElement(AbstractNote)} method.
	 * Test the {@link DefaultNoteListModel#setElementAt(AbstractNote, int)} method.
	 * Test the {@link DefaultNoteListModel#capacity()} method.
	 * Test the {@link DefaultNoteListModel#size()} method.
	 * Test the {@link DefaultNoteListModel#toString()} method.
	 */
	@Test
	void testRemove_0() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.addElement(new AbstractNote());
		model.remove(0);
		assertEquals(9, model.getSize());
		assertEquals(new AbstractNote(), model.getElementAt(0));
		assertEquals(new AbstractNote(), model.getElementAt(1));
		assertEquals(new AbstractNote(), model.getElementAt(2));
		assertEquals(new AbstractNote(), model.getElementAt(3));
		assertEquals(new AbstractNote(), model.getElementAt(4));
		assertEquals(new AbstractNote(), model.getElementAt(5));
		assertEquals(new AbstractNote(), model.getElementAt(6));
		assertEquals(new AbstractNote(), model.getElementAt(7));
		assertEquals(new AbstractNote(), model.getElementAt(8));
		assertFalse(model.isEmpty());
		assertTrue(model.contains(new AbstractNote()));
		assertEquals(0, model.indexOf(new AbstractNote()));
		assertEquals(0, model.indexOf(new AbstractNote(), 0));
		assertEquals(8, model.lastIndexOf(new AbstractNote()));
		assertEquals(8, model.lastIndexOf(new AbstractNote(), 8));
		assertEquals(new AbstractNote(), model.elementAt(0));
		assertEquals(new AbstractNote(), model.firstElement());
		assertEquals(new AbstractNote(), model.lastElement());
		Enumeration<AbstractNote> e = model.elements();
		assertEquals(new AbstractNote(), e.nextElement());
		assertEquals(new AbstractNote(), e.nextElement());
		assertEquals(new AbstractNote(), e.nextElement());
		assertEquals(new AbstractNote(), e.nextElement());
		assertEquals(new AbstractNote(), e.nextElement());
		assertEquals(new AbstractNote(), e.nextElement());
		assertEquals(new AbstractNote(), e.nextElement());
		assertEquals(new AbstractNote(), e.nextElement());
		assertEquals(new AbstractNote(), e.nextElement());
		AbstractNote[] an = model.toArray();
		assertEquals(new AbstractNote(), an[0]);
		assertEquals(new AbstractNote(), an[1]);
		assertEquals(new AbstractNote(), an[2]);
		assertEquals(new AbstractNote(), an[3]);
		assertEquals(new AbstractNote(), an[4]);
		assertEquals(new AbstractNote(), an[5]);
		assertEquals(new AbstractNote(), an[6]);
		assertEquals(new AbstractNote(), an[7]);
		assertEquals(new AbstractNote(), an[8]);
		assertEquals(new AbstractNote(), model.get(0));
		assertEquals(new AbstractNote(), model.set(0, new AbstractNote()));
		assertEquals(new AbstractNote(), model.get(0));
		assertEquals(new AbstractNote(), model.get(1));
		assertEquals(new AbstractNote(), model.get(2));
		assertEquals(new AbstractNote(), model.get(3));
		assertEquals(new AbstractNote(), model.get(4));
		assertEquals(new AbstractNote(), model.get(5));
		assertEquals(new AbstractNote(), model.get(6));
		assertEquals(new AbstractNote(), model.get(7));
		assertEquals(new AbstractNote(), model.get(8));
		model.add(0, new AbstractNote());
		assertEquals(10, model.getSize());
		assertEquals(new AbstractNote(), model.getElementAt(0));
		assertEquals(new AbstractNote(), model.getElementAt(1));
		assertEquals(new AbstractNote(), model.getElementAt(2));
		assertEquals(new AbstractNote(), model.getElementAt(3));
		assertEquals(new AbstractNote(), model.getElementAt(4));
		assertEquals(new AbstractNote(), model.getElementAt(5));
		assertEquals(new AbstractNote(), model.getElementAt(6));
		assertEquals(new AbstractNote(), model.getElementAt(7));
		assertEquals(new AbstractNote(), model.getElementAt(8));
		assertEquals(new AbstractNote(), model.getElementAt(9));
		assertEquals(new AbstractNote(), model.remove(0));
		assertEquals(9, model.getSize());
		assertEquals(new AbstractNote(), model.getElementAt(0));
		assertEquals(new AbstractNote(), model.getElementAt(1));
		assertEquals(new AbstractNote(), model.getElementAt(2));
		assertEquals(new AbstractNote(), model.getElementAt(3));
		assertEquals(new AbstractNote(), model.getElementAt(4));
		assertEquals(new AbstractNote(), model.getElementAt(5));
		assertEquals(new AbstractNote(), model.getElementAt(6));
		assertEquals(new AbstractNote(), model.getElementAt(7));
		assertEquals(new AbstractNote(), model.getElementAt(8));
		assertTrue(model.removeElement(new AbstractNote()));
		assertEquals(8, model.getSize());
		assertEquals(new AbstractNote(), model.getElementAt(0));
		assertEqu