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

	private DefaultNoteListModel bean = null;
	
	private void setData(AbstractNote note) {
		bean.setData(note);
	}
	
	@Test
	void setData_correct() {
		try {
		
			bean.setDelegate(new AbstractNoteListModel());
			assertNull(getDelegate());

			setData(new TestNote());
			assertNull(getDelegate());
			
			setData(new TestNote());
			assertNull(getDelegate());
			
			setData(new TestNote());
			assertNull(getDelegate());
		}
		catch(Exception e)
		{
			fail(e);
		}
	}

	private class TestNote implements AbstractNote {
			
		@Override
		public Object getData() {
			return null;
		}
	}
}

