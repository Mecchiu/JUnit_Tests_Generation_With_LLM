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
* It contains ten unit test cases for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModelTest {

	/**
	* Test case 1:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			model.remove(10);
		});
	}
	
	/**
	* Test case 2:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			model.remove(-1);
		});
	}
	
	/**
	* Test case 3:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			model.remove(11);
		});
	}
	
	/**
	* Test case 4:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			model.remove(12);
		});
	}
	
	/**
	* Test case 5:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			model.remove(13);
		});
	}
	
	/**
	* Test case 6:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			model.remove(14);
		});
	}
	
	/**
	* Test case 7:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			model.remove(15);
		});
	}
	
	/**
	* Test case 8:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			model.remove(16);
		});
	}
	
	/**
	* Test case 9:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			model.remove(17);
		});
	}
	
	/**
	* Test case 10:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
			model.remove(18);
		});
	}
}