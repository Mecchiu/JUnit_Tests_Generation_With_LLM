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
* It contains ten unit test cases for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModelTest {
		
	/**
	 * Test case 1:
	 * Test the size method with a null list.
	 * Expected result: 0
	 */
	@Test
	void testSize1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertEquals(0, model.size());
	}
	
	/**
	 * Test case 2:
	 * Test the size method with an empty list.
	 * Expected result: 0
	 */
	@Test
	void testSize2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = new Vector<AbstractNote>();
		assertEquals(0, model.size());
	}
	
	/**
	 * Test case 3:
	 * Test the size method with a list containing one element.
	 * Expected result: 1
	 */
	@Test
	void testSize3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = new Vector<AbstractNote>();
		model.delegate.add(new AbstractNote());
		assertEquals(1, model.size());
	}
	
	/**
	 * Test case 4:
	 * Test the size method with a list containing two elements.
	 * Expected result: 2
	 */
	@Test
	void testSize4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = new Vector<AbstractNote>();
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		assertEquals(2, model.size());
	}
	
	/**
	 * Test case 5:
	 * Test the size method with a list containing three elements.
	 * Expected result: 3
	 */
	@Test
	void testSize5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = new Vector<AbstractNote>();
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		assertEquals(3, model.size());
	}
	
	/**
	 * Test case 6:
	 * Test the size method with a list containing four elements.
	 * Expected result: 4
	 */
	@Test
	void testSize6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = new Vector<AbstractNote>();
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		assertEquals(4, model.size());
	}
	
	/**
	 * Test case 7:
	 * Test the size method with a list containing five elements.
	 * Expected result: 5
	 */
	@Test
	void testSize7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = new Vector<AbstractNote>();
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		assertEquals(5, model.size());
	}
	
	/**
	 * Test case 8:
	 * Test the size method with a list containing six elements.
	 * Expected result: 6
	 */
	@Test
	void testSize8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = new Vector<AbstractNote>();
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		assertEquals(6, model.size());
	}
	
	/**
	 * Test case 9:
	 * Test the size method with a list containing seven elements.
	 * Expected result: 7
	 */
	@Test
	void testSize9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = new Vector<AbstractNote>();
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		assertEquals(7, model.size());
	}
	
	/**
	 * Test case 10:
	 * Test the size method with a list containing eight elements.
	 * Expected result: 8
	 */
	@Test
	void testSize10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = new Vector<AbstractNote>();
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		model.delegate.add(new AbstractNote());
		assertEquals(8, model.size());
	}
}