// DefaultNoteListModel_5Test.java
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
class DefaultNoteListModel_5Test {

	/**
	* Test case 1:
	* The element is not in the list.
	* The index is 0.
	* The list is empty.
	*/
	@Test
	void testCase1() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 0;
		int expected = -1;
		int actual = list.indexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2:
	* The element is not in the list.
	* The index is 0.
	* The list is not empty.
	*/
	@Test
	void testCase2() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 0;
		int expected = -1;
		list.addElement(new AbstractNote());
		int actual = list.indexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3:
	* The element is not in the list.
	* The index is not 0.
	* The list is empty.
	*/
	@Test
	void testCase3() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 1;
		int expected = -1;
		int actual = list.indexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4:
	* The element is not in the list.
	* The index is not 0.
	* The list is not empty.
	*/
	@Test
	void testCase4() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 1;
		int expected = -1;
		list.addElement(new AbstractNote());
		int actual = list.indexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5:
	* The element is in the list.
	* The index is 0.
	* The list is empty.
	*/
	@Test
	void testCase5() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 0;
		int expected = -1;
		int actual = list.indexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6:
	* The element is in the list.
	* The index is 0.
	* The list is not empty.
	*/
	@Test
	void testCase6() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 0;
		int expected = 0;
		list.addElement(elem);
		int actual = list.indexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7:
	* The element is in the list.
	* The index is not 0.
	* The list is empty.
	*/
	@Test
	void testCase7() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 1;
		int expected = -1;
		int actual = list.indexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8:
	* The element is in the list.
	* The index is not 0.
	* The list is not empty.
	*/
	@Test
	void testCase8() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 1;
		int expected = -1;
		list.addElement(new AbstractNote());
		int actual = list.indexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9:
	* The element is in the list.
	* The index is not 0.
	* The list is not empty.
	*/
	@Test
	void testCase9() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 1;
		int expected = 1;
		list.addElement(new AbstractNote());
		list.addElement(elem);
		int actual = list.indexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10:
	* The element is in the list.
	* The index is not 0.
	* The list is not empty.
	*/
	@Test
	void testCase10() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 1;
		int expected = -1;
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		int actual = list.indexOf(elem, index);
		assertEquals(expected, actual);
	}
}

// DefaultNoteListModel_6Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_6Test {
		
	/**
	* Test case 1:
	* The element is not in the list.
	* The index is 0.
	* The list is empty.
	*/
	@Test
	void testCase1() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 0;
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2:
	* The element is not in the list.
	* The index is 0.
	* The list is not empty.
	*/
	@Test
	void testCase2() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 0;
		int expected = -1;
		list.addElement(new AbstractNote());
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3:
	* The element is not in the list.
	* The index is not 0.
	* The list is empty.
	*/
	@Test
	void testCase3() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 1;
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4:
	* The element is not in the list.
	* The index is not 0.
	* The list is not empty.
	*/