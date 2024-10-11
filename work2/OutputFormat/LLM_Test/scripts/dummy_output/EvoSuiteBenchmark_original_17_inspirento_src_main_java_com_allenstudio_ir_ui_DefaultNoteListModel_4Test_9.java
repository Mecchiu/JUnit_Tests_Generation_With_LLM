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
		 * Test method for
		 * {@link com.allenstudio.ir.ui.DefaultNoteListModel#indexOf(java.lang.Object)}
		 * @see DefaultNoteListModel#indexOf(java.lang.Object)
		 */
		@Test
		public void indexOf() {
			final Vector<Integer> vec = new Vector<>();
			vec.add(1);
			vec.add(2);
			vec.add(3);
			vec.add(-1);
			vec.add(-2);
			vec.add(-3);

			assertEquals(-1, vec.indexOf(vec.get(0)));
			assertEquals(-1, vec.indexOf(vec.get(2)));
			assertEquals(-1, vec.indexOf(vec.get(-1)));
			assertEquals(-1, vec.indexOf(vec.get(-2)));
			assertEquals(-1, vec.indexOf(vec.get(-3)));
			assertEquals(0, vec.indexOf(vec.get(4)));
			assertEquals(1, vec.indexOf(vec.get(5)));
			assertEquals(2, vec.indexOf(vec.get(6)));
			assertEquals(-1, vec.indexOf(vec.get(7)));
			assertEquals(-1, vec.indexOf(vec.get(8)));
			assertEquals(-1, vec.indexOf(vec.get(9)));
			assertEquals(1, vec.indexOf(vec.get(10)));
			assertEquals(2, vec.indexOf(vec.get(11)));
			assertEquals(3, vec.indexOf(vec.get(12)));
			assertEquals(-1, vec.indexOf(vec.get(13)));
			assertEquals(3, vec.indexOf(vec.get(14)));
			assertEquals(4, vec.indexOf(vec.get(15)));
			assertEquals(5, vec.indexOf(vec.get(16)));
			assertEquals(6, vec.indexOf(vec.get(17)));
			assertEquals(7, vec.indexOf(vec.get(18)));
			assertEquals(8, vec.indexOf(vec.get(19)));
			assertEquals(9, vec.indexOf(vec.get(20)));
			assertEquals(10, vec.indexOf(vec.get(21)));
			assertEquals(11, vec.indexOf(vec.get(22)));
			assertEquals(12, vec.indexOf(vec.get(23)));
			assertEquals(13, vec.indexOf(vec.get(24)));
			assertEquals(14, vec.indexOf(vec.get(25)));
			assertEquals(15, vec.indexOf(vec.get(26)));
			assertEquals(17, vec.indexOf(vec.get(27)));

		}

}