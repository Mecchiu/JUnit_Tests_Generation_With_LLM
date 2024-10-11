// DefaultNoteListModel_14Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {
		
	final DefaultNoteListModel model;
	
	public DefaultNoteListModel_14Test(DefaultNoteListModel model) {
		this.model = model;
	}
	
	/**
	 * Verify that the value <code>e</code> of the listener list is empty.
	 */ 
	@Test
    public void remove_value_is_empty() {
		final ArrayList<AbstractNote> listenerlist = new ArrayList<AbstractNote>();
		final DefaultNoteListModel_14Test.AbstractNote remove_from_listenerlist = new DefaultNoteListModel_14Test.AbstractNote();
		model.remove(remove_from_listenerlist);
		assertEquals(0, remove_from_listenerlist.size());
	}
	
}