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
		private final ArrayList<AbstractNote> noteList = new ArrayList<>();


		/**
		 * Constructor of <code>DefaultNoteListModel_4Test</code>.
		 */
		public DefaultNoteListModel_4Test() {
			noteList.add(new AbstractNote("Note 1"));
			noteList.add(new AbstractNote("Note 2"));
			noteList.add(new AbstractNote("Note 3"));
		}
		/**
		 * <code>indexOf</code> for the search
		 *
		 * @param elem the argument from the method <code>indexOf</code>
		 * @return the index of the first occurrence of argument <code>elem</code>
		 */
		@Test
	// DefaultNoteListModel_4Test.java  no change
		public void indexOf(AbstractNote elem) {
			assertEquals(4, noteList.size());
			assertEqual("Note 1", noteList.get(0).getName());
			assertEqual("Note 2", noteList.get(1).getName());
			assertEqual("Note 3", noteList.get(2).getName());
			assertEqual("Note 4", noteList.get(3).getName());
			for(int i=0; i<noteList.size(); i++) {
				assertEqual(i+"", noteList.get(i).getName());
			}
		}
}