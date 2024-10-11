// DefaultNoteListModel_1Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModel_1Test {
		/**
		* Tests if this list model contains all components
		*/
		@Test
		public void testForAllComponents() {
			DefaultNoteListModel m = new DefaultNoteListModel();	// TODO: should create a new empty model

			// test that the size of the list is equal
			int size = m.size();
			for (int i = 0; i < size; i++)
				assertEquals(true, m.contains(new DefaultNote(1)));

		}

		/**
		* Tests if an item is added
		*/
		@Test
		public void addTest() {
			// create an empty model
			DefaultNoteListModel m = new DefaultNoteListModel();

			// check the empty model
			boolean result = m.add();
			assertEquals(false, result);
		}

		/**
		* Tests adding the object with a specific parameter
		*/
		@Test
		public void addWithObjectTest() {

			// create an empty model
			DefaultNoteListModel m = new DefaultNoteListModel();

			// get the first item
			AbstractNote item = m.add(new DefaultNote(1));
			assertEquals(true, m.contains(item));
			assertEquals(1, m.size());
			AbstractNote object = new DefaultNote(1);
			assertEquals(true, m.add(object));
			assertEquals(2, m.size());
		}
}