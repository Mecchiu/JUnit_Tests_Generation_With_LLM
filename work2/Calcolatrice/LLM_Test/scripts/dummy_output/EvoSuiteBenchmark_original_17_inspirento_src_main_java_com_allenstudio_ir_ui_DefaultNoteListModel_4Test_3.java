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
		// <editor-fold defaultstate="collapsed" desc="Test cases">
		// <editor-fold defaultstate="collapsed" desc="<code>indexOf(AbstractNote)</code>">">
	/**
	* Tests the indexOf method.
	*
	* @throws Exception if an error occurs while comparing the expected and received result
	*/
	@Test
    void testIndexOf() throws Exception {
		final DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote a;
		final Set entries = model.getEntries();
		int idx = model.indexOf(a);

		assertEquals(-1, idx);
}
}