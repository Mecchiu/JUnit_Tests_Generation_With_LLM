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
* It contains ten unit test cases for the {@link DefaultNoteListModel#firstElement()} method.
*/
class DefaultNoteListModelTest {
		
	/**
	* Test case 1:
	*
	* This test case tests the {@link DefaultNoteListModel#firstElement()} method
	* when the list is empty.
	*
	* Expected result:
	*
	* A <code>NoSuchElementException</code> is thrown.
	*/
	@Test
	void testFirstElement_EmptyList() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertThrows(NoSuchElementException.class, () -> {
			model.firstElement();
		});
	}
	
	/**
	* Test case 2:
	*
	* This test case tests the {@link DefaultNoteListModel#firstElement()} method
	* when the list contains one element.
	*
	* Expected result:
	*
	* The first element is returned.
	*/
	@Test
	void testFirstElement_OneElement() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		assertEquals(note, model.firstElement());
	}
	
	/**
	* Test case 3:
	*
	* This test case tests the {@link DefaultNoteListModel#firstElement()} method
	* when the list contains two elements.
	*
	* Expected result:
	*
	* The first element is returned.
	*/
	@Test
	void testFirstElement_TwoElements() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		assertEquals(note1, model.firstElement());
	}
	
	/**
	* Test case 4:
	*
	* This test case tests the {@link DefaultNoteListModel#firstElement()} method
	* when the list contains three elements.
	*
	* Expected result:
	*
	* The first element is returned.
	*/
	@Test
	void testFirstElement_ThreeElements() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		assertEquals(note1, model.firstElement());
	}
	
	/**
	* Test case 5:
	*
	* This test case tests the {@link DefaultNoteListModel#firstElement()} method
	* when the list contains four elements.
	*
	* Expected result:
	*
	* The first element is returned.
	*/
	@Test
	void testFirstElement_FourElements() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		assertEquals(note1, model.firstElement());
	}
	
	/**
	* Test case 6:
	*
	* This test case tests the {@link DefaultNoteListModel#firstElement()} method
	* when the list contains five elements.
	*
	* Expected result:
	*
	* The first element is returned.
	*/
	@Test
	void testFirstElement_FiveElements() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		assertEquals(note1, model.firstElement());
	}
	
	/**
	* Test case 7:
	*
	* This test case tests the {@link DefaultNoteListModel#firstElement()} method
	* when the list contains six elements.
	*
	* Expected result:
	*
	* The first element is returned.
	*/
	@Test
	void testFirstElement_SixElements() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		model.addElement(note6);
		assertEquals(note1, model.firstElement());
	}
	
	/**
	* Test case 8:
	*
	* This test case tests the {@link DefaultNoteListModel#firstElement()} method
	* when the list contains seven elements.
	*
	* Expected result:
	*
	* The first element is returned.
	*/
	@Test
	void testFirstElement_SevenElements() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		model.addElement(note6);
		model.addElement(note7);
		assertEquals(note1, model.firstElement());
	}
	
	/**
	* Test case 9:
	*
	* This test case tests the {@link DefaultNoteListModel#firstElement()} method
	* when the list contains eight elements.
	*
	* Expected result:
	*
	* The first element is returned.
	*/
	@Test
	void testFirstElement_EightElements() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		AbstractNote note8 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		model.addElement(note6);
		model.addElement(note7);
		model.addElement(note8);
		assertEquals(note1, model.firstElement());
	}
	
	/**
	* Test case 10:
	*
	* This test case tests the {@link DefaultNoteListModel#firstElement()} method
	* when the list contains nine elements.
	*
	* Expected result:
	*
	* The first element is returned.
	*/
	@Test
	void testFirstElement_NineElements() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		AbstractNote note8 = new AbstractNote();
		AbstractNote note9 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		model.addElement(note6);
		model.addElement(note7);
		model.addElement(note8);
		model.addElement(note9);
		assertEquals(note1, model.firstElement());
	}
}