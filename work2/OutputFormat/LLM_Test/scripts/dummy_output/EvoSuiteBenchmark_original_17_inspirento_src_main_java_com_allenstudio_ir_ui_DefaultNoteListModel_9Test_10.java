// DefaultNoteListModel_9Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#firstElement()} method.
*/
class DefaultNoteListModel_9Test {
		/**
		 * Tests whether the first element (set to <code>null</code> by default)
		 * is the "NoSuchElementException".
		 *
		 * @throws NoSuchElementException if the first element
		 * has not returned
		 */
		@Test
        public void noSuchElementException() {
			//Default note list model returns this value if the first element is null:
			final DefaultNoteListModel model = new DefaultNoteListModel();
			assertEquals("DefaultNoteListModel.firstElement() must return the default element",
					DefaultNoteListModel.firstElement(), model.firstElement());
		}

        /**
		 * Tests the default constructor
		 *
		 * @throws IllegalArgumentException if first element is <code>java.lang.NullPointerException</code>
		 */
	@Test
        public void defaultConstructor() {
            final DefaultNoteListModel model = new DefaultNoteListModel();
            assertNotNull(DefaultNoteListModel.firstElement()+" does not return a null", model.firstElement());
            assertNull(DefaultNoteListModel.firstElement()+" must return a value that is not created by this class",
					model.firstElement());
            assertEquals(DefaultNoteListModel.firstElement()+"", 1, model.size());
		}

		/**
		 * Calls the <code>add()</code> method on the first element (set to the {@link DefaultNoteListModel.firstElement()})
		 * and checks that the size and contents of this list is the same
		 * as the specified list.
		 *
		 * @throws IllegalStateException if first element is not part of this list
		 */
	@Test
        public void noInitialAdd() {
			DefaultNoteListModel.firstElement();
			final DefaultNoteListModel model = new DefaultNoteListModel();
			assertEquals(model.size(), 1);
			assertTrue("The first element must not be null", model.firstElement()!=null);
			assertEquals(model.size(), 1);
			model.add(new DefaultNote());

			assertEquals(model.size(), 2);
			assertTrue("The size should not change after the add() method is used.",
					model.size()==2);
			model.add(new DefaultNote());

			assertEquals(model.size(), 2);
			assertTrue("The size should not change after the add() method is used.",
					model.size()==2);
		}
}