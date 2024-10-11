// DefaultNoteListModel_11Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModel_11Test {
		
	@Test
	void removeElement() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new BasicNote("Lorem ipsum"));
		model.removeElement(new BasicNote("Lorem ipsum"));
		assertEquals(0, model.size());
		assertNull(model.get(0));
	}

	@Test
	void removeElement_throwsException1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new BasicNote("Lorem ipsum"));
		assertThrowsException(() -> model.removeElement(new BasicNote("Lorem ipsum")));
	}

	@Test
	void removeElement_throwsException2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new BasicNote("Lorem ipsum"));
		assertThrowsException(() -> model.removeElement(new BasicNote("Lorem ipsum")));
	}

	@Test
	void removeElement_throwsException_notAllComponents() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new BasicNote("Lorem ipsum"));
		assertThrowsException(() -> model.removeElement(new BasicNote("Lorem ipsum")));
	}

	@Test
	void removeAll1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertThrowsException(() -> model.removeAll());
	}

	@Test
	void removeAll1_throwsException() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertThrowsException(() -> model.removeAll(Arrays.asList(new BasicNote("Lorem ipsum"), new BasicNote("Lorem ipsum"))));
	}

	@Test
	void removeAll2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new BasicNote("Lorem ipsum"));
		model.add(new BasicNote("Lorem ipsum"));
		model.removeAll();
		assertEquals(0, model.size());
	}

	@Test
	void removeAll0() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertThrowsException(() -> model.removeAll(Collections.emptySet()));
	}

}