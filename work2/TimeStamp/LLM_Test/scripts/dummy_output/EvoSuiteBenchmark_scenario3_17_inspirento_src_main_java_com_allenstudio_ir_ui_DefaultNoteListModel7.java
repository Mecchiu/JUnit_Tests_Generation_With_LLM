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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModelTest {
		
	/**
	* Test case 1 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	* It tests the case that the <code>elem</code> is not found in the list.
	*/
	@Test
	void testLastIndexOf1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		int index = 0;
		int expected = -1;
		int actual = model.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 2 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	* It tests the case that the <code>elem</code> is found in the list.
	*/
	@Test
	void testLastIndexOf2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		model.addElement(elem);
		int index = 0;
		int expected = 0;
		int actual = model.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 3 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	* It tests the case that the <code>elem</code> is found in the list.
	*/
	@Test
	void testLastIndexOf3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		model.addElement(elem);
		int index = 1;
		int expected = 0;
		int actual = model.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 4 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	* It tests the case that the <code>elem</code> is found in the list.
	*/
	@Test
	void testLastIndexOf4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		model.addElement(elem);
		int index = 2;
		int expected = 0;
		int actual = model.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 5 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	* It tests the case that the <code>elem</code> is found in the list.
	*/
	@Test
	void testLastIndexOf5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		model.addElement(elem);
		int index = 3;
		int expected = 0;
		int actual = model.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 6 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	* It tests the case that the <code>elem</code> is found in the list.
	*/
	@Test
	void testLastIndexOf6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		model.addElement(elem);
		int index = 4;
		int expected = 0;
		int actual = model.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 7 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	* It tests the case that the <code>elem</code> is found in the list.
	*/
	@Test
	void testLastIndexOf7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		model.addElement(elem);
		int index = 5;
		int expected = 0;
		int actual = model.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 8 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	* It tests the case that the <code>elem</code> is found in the list.
	*/
	@Test
	void testLastIndexOf8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		model.addElement(elem);
		int index = 6;
		int expected = 0;
		int actual = model.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 9 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	* It tests the case that the <code>elem</code> is found in the list.
	*/
	@Test
	void testLastIndexOf9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		model.addElement(elem);
		int index = 7;
		int expected = 0;
		int actual = model.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case 10 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
	* It tests the case that the <code>elem</code> is found in the list.
	*/
	@Test
	void testLastIndexOf10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote elem = new AbstractNote();
		model.addElement(elem);
		int index = 8;
		int expected = 0;
		int actual = model.lastIndexOf(elem, index);
		assertEquals(expected, actual);
	}
}