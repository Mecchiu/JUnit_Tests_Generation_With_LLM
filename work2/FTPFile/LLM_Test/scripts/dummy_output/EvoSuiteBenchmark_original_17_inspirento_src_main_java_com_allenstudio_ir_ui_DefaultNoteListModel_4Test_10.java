// DefaultNoteListModel_4Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_4Test {
		
	/**
	* Constructor.
	* It tests the behavior of the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
	*/
	@Test
	public void IndexOf_One_Test(){
		// Test 1: test without a filter
		assertEquals(-1,DefaultNoteListModel_.indexOf(new AbstractNote()));
		// Test 2: test with filter <null>
		assertEquals(-1,DefaultNoteListModel_.indexOf(new AbstractNote("xxx", null), (Vector)null));
	}
	/**
	* Constructor.
	* It tests the behavior of the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
	*/
	@Test
	public void IndexOf_Two_Test() {
		// Test 1: index of <null> is -1
		assertEquals(-1,DefaultNoteListModel_.indexOf(null, (Vector) null));
		// Test 2: index of <null> is -1
		assertEquals(-1,DefaultNoteListModel_.indexOf((AbstractNote)null, (Vector)null));
		// Test 3: test with filter null
		assertEquals(-1,DefaultNoteListModel_.indexOf(new AbstractNote(), null));
		// Test 4: test with filter null and null
		assertEquals(-1,DefaultNoteListModel_.indexOf(new AbstractNote(), null, (Vector)null));
		// Test 5: test with filter <null> and filter <null>
		assertEquals(-1,DefaultNoteListModel_.indexOf(new AbstractNote("xxx", null), null, null));
		// Test 6: test with filter <null> and filter <null>
		assertEquals(-1,DefaultNoteListModel_.indexOf(new AbstractNote("xxx", null), null, (Vector)null, (Vector)null));
		// Test 7: test with filter null and null
		assertEquals(-1,DefaultNoteListModel_.indexOf(new AbstractNote("xxx", null), (Vector)null, null, (Vector)null));
		// Test 8: test with filter null and filter <null>
		assertEquals(-1,DefaultNoteListModel_.indexOf(new AbstractNote("xxx"), null, null, (Vector)null));
		// Test 9: test with filter null and filter <null>
		assertEquals(-1,DefaultNoteListModel_.indexOf(new AbstractNote("xxx"), null, null, (Vector)null, (Vector)null));
	}
}