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
* Returns the index of the last occurrence of <code>elem</code>.
* @param elem the desired component
*/
	@Test void lastIndexOf(AbstractNote elem) {
		DefaultNoteListModel listModel = new DefaultNoteListModel();

		assertTrue(listModel.lastIndexOf(elem) >= 0);
	}
}