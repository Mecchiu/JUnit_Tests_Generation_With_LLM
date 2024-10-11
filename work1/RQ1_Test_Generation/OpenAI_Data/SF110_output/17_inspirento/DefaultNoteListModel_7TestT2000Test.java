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
	 * Test case 1 for method lastIndexOf(AbstractNote, int).
	 * Test case for the case when the index is negative.
	 * Expected result: {@link ArrayIndexOutOfBoundsException} is thrown.
	 */
	@Test
	void testLastIndexOf_1() {
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
		
		try {
			model.lastIndexOf(new AbstractNote(), -1);
			fail("ArrayIndexOutOfBoundsException is expected.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected
		}
	}
	
	/**
	 * Test case 2 for method lastIndexOf(AbstractNote, int).
	 * Test case for the case when the index is greater than the size of the list.
	 * Expected result: {@link ArrayIndexOutOfBoundsException} is thrown.
	 */
	@Test
	void testLastIndexOf_2() {
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
		
		try {
			model.lastIndexOf(new AbstractNote(), 10);
			fail("ArrayIndexOutOfBoundsException is expected.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected
		}
	}
	
	/**
	 * Test case 3 for method lastIndexOf(AbstractNote, int).
	 * Test case for the case when the index is equal to the size of the list.
	 * Expected result: {@link ArrayIndexOutOfBoundsException} is thrown.
	 */
	@Test
	void testLastIndexOf_3() {
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
		
		try {
			model.lastIndexOf(new AbstractNote(), 9);
			fail("ArrayIndexOutOfBoundsException is expected.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected
		}
	}
	
	/**
	 * Test case 4 for method lastIndexOf(AbstractNote, int).
	 * Test case for the case when the index is equal to the size of the list.
	 * Expected result: {@link ArrayIndexOutOfBoundsException} is thrown.
	 */
	@Test
	void testLastIndexOf_4() {
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
		
		try {
			model.lastIndexOf(new AbstractNote(), 9);
			fail("ArrayIndexOutOfBoundsException is expected.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected
		}
	}
	
	/**
	 * Test case 5 for method lastIndexOf(AbstractNote, int).
	 * Test case for the case when the index is equal to the size of the list.
	 * Expected result: {@link ArrayIndexOutOfBoundsException} is thrown.
	 */
	@Test
	void testLastIndexOf_5() {
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
		
		try {
			model.lastIndexOf(new AbstractNote(), 9);
			fail("ArrayIndexOutOfBoundsException is expected.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected
		}
	}
	
	/**
	 * Test case 6 for method lastIndexOf(AbstractNote, int).
	 * Test case for the case when the index is equal to the size of the list.
	 * Expected result: {@link ArrayIndexOutOfBoundsException} is thrown.
	 */
	@Test
	void testLastIndexOf_6() {
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
		
		try {
			model.lastIndexOf(new AbstractNote(), 9);
			fail("ArrayIndexOutOfBoundsException is expected.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected
		}
	}
	
	/**
	 * Test case 7 for method lastIndexOf(AbstractNote, int).
	 * Test case for the case when the index is equal to the size of the list.
	 * Expected result: {@link ArrayIndexOutOfBoundsException} is thrown.
	 */
	@Test
	void testLastIndexOf_7() {
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
		
		try {
			model.lastIndexOf(new AbstractNote(), 9);
			fail("ArrayIndexOutOfBoundsException is expected.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected
		}
