// DefaultNoteListModel_10Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastElement()} method.
*/
class DefaultNoteListModel_10Test {
		/**
		 * Unit test for the <code>lastElement()</code> method.
		*/
	@Test
		public void lastElement_returns_the_last_element_of_the_list() {
			AbstractNoteListModel namem = new DefaultNoteListModel();
			/*
			* TestCase
			*/
			AbstractNote lElement = namem.lastElement();
			assertEquals(lElement, namem.lastElement());

			AbstractNote ndElement = namem.elementAt(0);
			System.identityHashCode(ndElement);
			assertEquals(ndElement, namem.elementAt(0));
		}
			/**
		 * In test method, the vector can be changed from an empty set of components
		 */
		@Test
		public void has_no_components_after_change_of_the_list() {
			AbstractNoteListModel namem = new DefaultNoteListModel();
			AbstractNoteListModel namem2 = new DefaultNoteListModel();
			AbstractNote nd1 = new DefaultNote();
			AbstractNote nd2 = new DefaultNote();

			assertFalse(namem.hasNextElement());
	}

} // class test_with_default_note_list_model_10_test