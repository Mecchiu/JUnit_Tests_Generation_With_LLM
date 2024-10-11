// DefaultNoteListModel_7Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {
		@Test
		public void defaultNoteListModel() {
			DefaultNoteListModel model = new DefaultNoteListModel();
			model.listenToCurrent(new TestDataEvent());
			assertNotNull( model.first().getData());
			assertNotNull( model.last().getData());
			assertTrue(model.lastIndexOf(new DefaultNote("1st")) == 0);
			assertTrue( model.lastIndexOf(new DefaultNote("2nd")) == 1);
		}

		static class TestDataEvent implements NoteListDataListener, NoteListDataEvent {

			@Override
			public void noteDataChanged(NoteListDataEvent event) {
				if( event instanceof NoteListDataEvent_0){
					NoteListDataEvent_0 dataEvent_0 = (NoteListDataEvent_0) event.clone();
					NoteListDataEvent_1.addData(dataEvent_0);
				}
			}
		}
}