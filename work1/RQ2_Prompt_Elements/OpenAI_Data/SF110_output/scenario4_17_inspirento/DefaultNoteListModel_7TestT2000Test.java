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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {

	/**
	 * Test case 1:
	 * The parameter <code>elem</code> is null.
	 * The parameter <code>index</code> is 0.
	 * The size of the list is 0.
	 * The list is empty.
	 * The method should return -1.
	 */
	@Test
	void testCase1() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = null;
		int index = 0;
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 2:
	 * The parameter <code>elem</code> is null.
	 * The parameter <code>index</code> is 0.
	 * The size of the list is 1.
	 * The list is not empty.
	 * The method should return -1.
	 */
	@Test
	void testCase2() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = null;
		int index = 0;
		list.addElement(new AbstractNote());
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 3:
	 * The parameter <code>elem</code> is null.
	 * The parameter <code>index</code> is 0.
	 * The size of the list is 2.
	 * The list is not empty.
	 * The method should return -1.
	 */
	@Test
	void testCase3() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = null;
		int index = 0;
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 4:
	 * The parameter <code>elem</code> is null.
	 * The parameter <code>index</code> is 0.
	 * The size of the list is 3.
	 * The list is not empty.
	 * The method should return -1.
	 */
	@Test
	void testCase4() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = null;
		int index = 0;
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 5:
	 * The parameter <code>elem</code> is null.
	 * The parameter <code>index</code> is 0.
	 * The size of the list is 4.
	 * The list is not empty.
	 * The method should return -1.
	 */
	@Test
	void testCase5() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = null;
		int index = 0;
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 6:
	 * The parameter <code>elem</code> is null.
	 * The parameter <code>index</code> is 0.
	 * The size of the list is 5.
	 * The list is not empty.
	 * The method should return -1.
	 */
	@Test
	void testCase6() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = null;
		int index = 0;
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 7:
	 * The parameter <code>elem</code> is null.
	 * The parameter <code>index</code> is 0.
	 * The size of the list is 6.
	 * The list is not empty.
	 * The method should return -1.
	 */
	@Test
	void testCase7() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = null;
		int index = 0;
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 8:
	 * The parameter <code>elem</code> is null.
	 * The parameter <code>index</code> is 0.
	 * The size of the list is 7.
	 * The list is not empty.
	 * The method should return -1.
	 */
	@Test
	void testCase8() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = null;
		int index = 0;
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 9:
	 * The parameter <code>elem</code> is null.
	 * The parameter <code>index</code> is 0.
	 * The size of the list is 8.
	 * The list is not empty.
	 * The method should return -1.
	 */
	@Test
	void testCase9() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = null;
		int index = 0;
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		list.addElement(new AbstractNote());
		int expected = -1;
		int actual = list.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	 * Test case 10:
	 * The parameter <code>elem</code> is null.
	 * The parameter <code>index</code> is 0.
	 * The size of the list is 9.
	 * The list is not empty.
	 * The method should return -1.
	 */
	@Test
	void testCase10() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		AbstractNote elem = null;
		int index = 0;
