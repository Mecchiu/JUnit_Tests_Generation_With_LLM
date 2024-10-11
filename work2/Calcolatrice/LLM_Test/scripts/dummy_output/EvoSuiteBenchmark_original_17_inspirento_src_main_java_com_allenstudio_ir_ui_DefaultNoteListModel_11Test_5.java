// DefaultNoteListModel_11Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModel_11Test {
		public final DefaultNoteListModel TestObject = new DefaultNoteListModel();

		/**
		* Tests {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
		*
		* @throws AssertionError if test fails.
		*/
		@Test
		public void testRemoveElement() {
			assertEquals(false, TestObject.removeElement(new Vector().add(new AbstractNote())));
		}
}