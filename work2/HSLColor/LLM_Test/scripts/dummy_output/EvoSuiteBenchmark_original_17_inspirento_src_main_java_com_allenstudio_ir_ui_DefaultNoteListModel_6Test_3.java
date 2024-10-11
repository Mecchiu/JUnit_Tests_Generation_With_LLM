// DefaultNoteListModel_6Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_6Test {
		 /**
		 * Create the test case.
		 */
		 DefaultNoteListModel_6Test (TestBuilder tb) {
			 tb.setA(getA());
		}

		/**
		 * Get a random AbstractNote.
		 */
		 protected AbstractNote getA() {
			 return (AbstractNote)(new Random(13053)
					.nextLong())
				.getValue();
		 }

	 /**
	 * Set actual value.
	 */
	protected final void setActualValue(int index,
										AbstractNote elem) {
		if (index == 1) {
			tb.setA((AbstractNote)elem);
		}
	}

	 /**
	 * Unit test for the {@link DefaultNoteList#copy()} method.
	 */
	@Test
	public void testCopy() {
		  // Arrange
		tb.setA(getA());

		// Act
		DefaultNoteListModel model = new DefaultNoteListModel();
		DefaultNoteList copy = model.copy();

		// Assert
		assertSame(model, copy);
		assertArrayEquals(model.toArray(), copy.toArray());
	}
}