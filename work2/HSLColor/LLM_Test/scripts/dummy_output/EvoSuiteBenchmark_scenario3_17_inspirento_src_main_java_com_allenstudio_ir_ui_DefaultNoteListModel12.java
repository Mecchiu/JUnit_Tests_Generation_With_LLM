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
* It contains ten unit test cases for the {@link DefaultNoteListModel#toArray()} method.
*/
class DefaultNoteListModelTest {
		
	/**
	 * Test case 1:
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * The test case is passed if the returned array is not null.
	 */
	@Test
	void testToArray1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote[] notes = model.toArray();
		assertNotNull(notes);
	}
	
	/**
	 * Test case 2:
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * The test case is passed if the returned array is empty.
	 */
	@Test
	void testToArray2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote[] notes = model.toArray();
		assertEquals(0, notes.length);
	}
	
	/**
	 * Test case 3:
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * The test case is passed if the returned array is not empty.
	 */
	@Test
	void testToArray3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		AbstractNote[] notes = model.toArray();
		assertEquals(1, notes.length);
	}
	
	/**
	 * Test case 4:
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * The test case is passed if the returned array is not empty.
	 */
	@Test
	void testToArray4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		AbstractNote[] notes = model.toArray();
		assertEquals(2, notes.length);
	}
	
	/**
	 * Test case 5:
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * The test case is passed if the returned array is not empty.
	 */
	@Test
	void testToArray5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		AbstractNote[] notes = model.toArray();
		assertEquals(3, notes.length);
	}
	
	/**
	 * Test case 6:
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * The test case is passed if the returned array is not empty.
	 */
	@Test
	void testToArray6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		AbstractNote[] notes = model.toArray();
		assertEquals(4, notes.length);
	}
	
	/**
	 * Test case 7:
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * The test case is passed if the returned array is not empty.
	 */
	@Test
	void testToArray7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		AbstractNote[] notes = model.toArray();
		assertEquals(5, notes.length);
	}
	
	/**
	 * Test case 8:
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * The test case is passed if the returned array is not empty.
	 */
	@Test
	void testToArray8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		AbstractNote[] notes = model.toArray();
		assertEquals(6, notes.length);
	}
	
	/**
	 * Test case 9:
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * The test case is passed if the returned array is not empty.
	 */
	@Test
	void testToArray9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		AbstractNote[] notes = model.toArray();
		assertEquals(7, notes.length);
	}
	
	/**
	 * Test case 10:
	 * Test the {@link DefaultNoteListModel#toArray()} method.
	 * The test case is passed if the returned array is not empty.
	 */
	@Test
	void testToArray10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		AbstractNote[] notes = model.toArray();
		assertEquals(8, notes.length);
	}
}