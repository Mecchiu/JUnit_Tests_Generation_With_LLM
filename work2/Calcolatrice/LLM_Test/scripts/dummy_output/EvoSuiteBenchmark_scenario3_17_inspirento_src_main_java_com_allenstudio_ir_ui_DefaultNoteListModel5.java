// DefaultNoteListModelTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModelTest {
		
	/**
	* Test case 1:
	* Test if the method returns -1 when the list is empty.
	*/
	@Test
	void testIndexOf1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertEquals(-1, model.indexOf(new AbstractNote(), 0));
	}
	
	/**
	* Test case 2:
	* Test if the method returns -1 when the list is not empty but the element is not in the list.
	*/
	@Test
	void testIndexOf2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.addElement(new AbstractNote());
		assertEquals(-1, model.indexOf(new AbstractNote(), 0));
	}
	
	/**
	* Test case 3:
	* Test if the method returns the correct index when the element is in the list.
	*/
	@Test
	void testIndexOf3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		assertEquals(0, model.indexOf(note, 0));
	}
	
	/**
	* Test case 4:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, 0));
	}
	
	/**
	* Test case 5:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, 1));
	}
	
	/**
	* Test case 6:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, 2));
	}
	
	/**
	* Test case 7:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, -1));
	}
	
	/**
	* Test case 8:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, -2));
	}
	
	/**
	* Test case 9:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, -3));
	}
	
	/**
	* Test case 10:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, -4));
	}
}