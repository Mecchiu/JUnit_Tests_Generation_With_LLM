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
	 * Test if the size of the list is 0 when the list is empty.
	 */
	@Test
	void testSize1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertEquals(0, model.size());
	}
	
	/**
	 * Test case 2:
	 * Test if the size of the list is 1 when the list contains one element.
	 */
	@Test
	void testSize2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		assertEquals(1, model.size());
	}
	
	/**
	 * Test case 3:
	 * Test if the size of the list is 2 when the list contains two elements.
	 */
	@Test
	void testSize3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(2, model.size());
	}
	
	/**
	 * Test case 4:
	 * Test if the size of the list is 3 when the list contains three elements.
	 */
	@Test
	void testSize4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(3, model.size());
	}
	
	/**
	 * Test case 5:
	 * Test if the size of the list is 4 when the list contains four elements.
	 */
	@Test
	void testSize5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(4, model.size());
	}
	
	/**
	 * Test case 6:
	 * Test if the size of the list is 5 when the list contains five elements.
	 */
	@Test
	void testSize6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(5, model.size());
	}
	
	/**
	 * Test case 7:
	 * Test if the size of the list is 6 when the list contains six elements.
	 */
	@Test
	void testSize7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(6, model.size());
	}
	
	/**
	 * Test case 8:
	 * Test if the size of the list is 7 when the list contains seven elements.
	 */
	@Test
	void testSize8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(7, model.size());
	}
	
	/**
	 * Test case 9:
	 * Test if the size of the list is 8 when the list contains eight elements.
	 */
	@Test
	void testSize9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		model.add(new AbstractNote());
		assertEquals(8, model.size());
	}
	
	/**
	 * Test case 10:
	 * Test if the size of the list is 9 when the list contains nine elements.
	 */
	@Test
	void testSize10() {
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
		assertEquals(9, model.size());
	}
}
```

## 2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.