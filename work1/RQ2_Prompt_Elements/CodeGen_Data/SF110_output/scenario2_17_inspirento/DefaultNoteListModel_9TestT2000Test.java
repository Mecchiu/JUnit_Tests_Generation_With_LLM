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
DefaultNoteListModel(AbstractNoteListModel delegate, Vector<AbstractNote> notes) {
			delegate.addElement(firstElement());
			delegate.addElement(firstElement());
		}
		List<AbstractNote> getDeleter() {
			Collections.synchronizedList(deleter);
			return deleter;
		}
		
		@jbe10.test
		void getDefaultNoteListModel(int size, Comparator<AbstractNote> comparator) {
			assertEquals(Size10, size);
			assertFalse(comparator.compare(System.currentTimeMillis(), 1.1*System.currentTimeMillis()));
			assertFalse(comparator.compare(1.1*System.currentTimeMillis(), System.currentTimeMillis()));
		}
}