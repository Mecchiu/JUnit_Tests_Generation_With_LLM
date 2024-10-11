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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastElement()} method.
*/
class DefaultNoteListModel_10Test {

	/**
	* Test case 1:
	* The test case tests the method when the list is empty.
	* Expected result:
	* The method should return null.
	*/
	@Test
	public void testCase1() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		assertNull(list.lastElement());
	}
	
	/**
	* Test case 2:
	* The test case tests the method when the list has one element.
	* Expected result:
	* The method should return the element.
	*/
	@Test
	public void testCase2() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		list.addElement(note);
		assertEquals(note, list.lastElement());
	}
	
	/**
	* Test case 3:
	* The test case tests the method when the list has two elements.
	* Expected result:
	* The method should return the last element.
	*/
	@Test
	public void testCase3() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		list.addElement(note1);
		list.addElement(note2);
		assertEquals(note2, list.lastElement());
	}
	
	/**
	* Test case 4:
	* The test case tests the method when the list has three elements.
	* Expected result:
	* The method should return the last element.
	*/
	@Test
	public void testCase4() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		list.addElement(note1);
		list.addElement(note2);
		list.addElement(note3);
		assertEquals(note3, list.lastElement());
	}
	
	/**
	* Test case 5:
	* The test case tests the method when the list has four elements.
	* Expected result:
	* The method should return the last element.
	*/
	@Test
	public void testCase5() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		list.addElement(note1);
		list.addElement(note2);
		list.addElement(note3);
		list.addElement(note4);
		assertEquals(note4, list.lastElement());
	}
	
	/**
	* Test case 6:
	* The test case tests the method when the list has five elements.
	* Expected result:
	* The method should return the last element.
	*/
	@Test
	public void testCase6() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		list.addElement(note1);
		list.addElement(note2);
		list.addElement(note3);
		list.addElement(note4);
		list.addElement(note5);
		assertEquals(note5, list.lastElement());
	}
	
	/**
	* Test case 7:
	* The test case tests the method when the list has six elements.
	* Expected result:
	* The method should return the last element.
	*/
	@Test
	public void testCase7() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		list.addElement(note1);
		list.addElement(note2);
		list.addElement(note3);
		list.addElement(note4);
		list.addElement(note5);
		list.addElement(note6);
		assertEquals(note6, list.lastElement());
	}
	
	/**
	* Test case 8:
	* The test case tests the method when the list has seven elements.
	* Expected result:
	* The method should return the last element.
	*/
	@Test
	public void testCase8() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		list.addElement(note1);
		list.addElement(note2);
		list.addElement(note3);
		list.addElement(note4);
		list.addElement(note5);
		list.addElement(note6);
		list.addElement(note7);
		assertEquals(note7, list.lastElement());
	}
	
	/**
	* Test case 9:
	* The test case tests the method when the list has eight elements.
	* Expected result:
	* The method should return the last element.
	*/
	@Test
	public void testCase9() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		AbstractNote note8 = new AbstractNote();
		list.addElement(note1);
		list.addElement(note2);
		list.addElement(note3);
		list.addElement(note4);
		list.addElement(note5);
		list.addElement(note6);
		list.addElement(note7);
		list.addElement(note8);
		assertEquals(note8, list.lastElement());
	}
	
	/**
	* Test case 10:
	* The test case tests the method when the list has nine elements.
	* Expected result:
	* The method should return the last element.
	*/
	@Test
	public void testCase10() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		AbstractNote note8 = new AbstractNote();
		AbstractNote note9 = new AbstractNote();
		list.addElement(note1);
		list.addElement(note2);
		list.addElement(note3);
		list.addElement(note4);
		list.addElement(note5);
		list.addElement(note6);
		list.addElement(note7);
		list.addElement(note8);
		list.addElement(note9);
		assertEquals(note9, list.lastElement());
	}
}

// DefaultNoteListModel_11Test.java
package com.allenstudio.ir.ui;
