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
* It contains ten unit test cases for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModelTest {

	/**
	* Test case 1:
	* The input parameter is null.
	* The expected result is false.
	*/
	@Test
	void testCase1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertFalse(model.removeElement(null));
	}
	
	/**
	* Test case 2:
	* The input parameter is not null.
	* The expected result is true.
	*/
	@Test
	void testCase2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		assertTrue(model.removeElement(note));
	}
	
	/**
	* Test case 3:
	* The input parameter is not null.
	* The expected result is false.
	*/
	@Test
	void testCase3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		assertFalse(model.removeElement(note));
	}
	
	/**
	* Test case 4:
	* The input parameter is not null.
	* The expected result is true.
	*/
	@Test
	void testCase4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		assertTrue(model.removeElement(note));
	}
	
	/**
	* Test case 5:
	* The input parameter is not null.
	* The expected result is true.
	*/
	@Test
	void testCase5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertTrue(model.removeElement(note));
	}
	
	/**
	* Test case 6:
	* The input parameter is not null.
	* The expected result is true.
	*/
	@Test
	void testCase6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertTrue(model.removeElement(note));
	}
	
	/**
	* Test case 7:
	* The input parameter is not null.
	* The expected result is true.
	*/
	@Test
	void testCase7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertTrue(model.removeElement(note));
	}
	
	/**
	* Test case 8:
	* The input parameter is not null.
	* The expected result is true.
	*/
	@Test
	void testCase8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertTrue(model.removeElement(note));
	}
	
	/**
	* Test case 9:
	* The input parameter is not null.
	* The expected result is true.
	*/
	@Test
	void testCase9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertTrue(model.removeElement(note));
	}
	
	/**
	* Test case 10:
	* The input parameter is not null.
	* The expected result is true.
	*/
	@Test
	void testCase10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertTrue(model.removeElement(note));
	}
}