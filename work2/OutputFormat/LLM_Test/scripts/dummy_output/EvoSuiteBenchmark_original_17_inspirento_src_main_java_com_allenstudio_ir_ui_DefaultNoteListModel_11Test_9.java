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
		void removeElement_GivenABooleanDataNotNil() {
			// Arrange
			final DefaultNoteListModel model = new DefaultNoteListModel();
				
			// Act
			final Map<Note, Boolean> resultMap = defaultMap();
			model.removeElement(true);
			
			// Assert result
			assertFalse(model.containsKey(new Note()));
			assertTrue(model.removeElement(true));
			assertEquals(model.size(), 1);
			assertFalse(model.containsKey(new Note()));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			
			// Verify content
			final List<Note> list = (List<Note>) model.get(new Note());
			assertFalse(list.isEmpty());
			assertEquals(0, list.size());
		}

		@Test
		void removeElement_GivenABooleanDataNotNil_WithException() {
			// Arrange
			final DefaultNoteListModel model = new DefaultNoteListModel();
			
			// Act
			model.removeElement(true);
			
			// Assert result
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertFalse(model.removeElement(true));
			assertEquals(model.size(), 0);
			assertEquals((Integer) 1, model.get(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertEquals(model.size(), 0);
			

			// Verify content
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertFalse(model.removeElement(true));
			assertEquals(model.size(), 0);
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertEquals(model.size(), 0);
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertEquals(model.size(), 0);
				
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(true));
			assertEquals(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertEquals(model.containsKey(new Comment("a", 1000)), false);
			
			// Verify content
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(true));
			assertEquals(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertEquals(model.containsKey(new Comment("a", 1000)), false);
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertFalse(model.containsKey(new Comment("a", 1000)));
			
			// Verify content
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(true));
			assertEquals(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertEquals(model.containsKey(new Comment("a", 1000)), false);
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertFalse(model.containsKey(new Comment("a", 1000)));
			
			// Verify content
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(true));
			assertEquals(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertEquals(model.containsKey(new Comment("a", 1000)), false);
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertFalse(model.containsKey(new Comment("a", 1000)));
			
			// Verify content
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(true));
			assertEquals(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertEquals(model.containsKey(new Comment("a", 1000)), false);
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertFalse(model.containsKey(new Comment("a", 1000)));
			
			// Verify content
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(true));
			assertEquals(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertEquals(model.containsKey(new Comment("a", 1000)), false);
			assertTrue(model.containsKey(new Comment("a", 1000)));
			assertTrue(model.removeElement(new Comment("a", 1000)));
			assertFalse(model.containsKey(new Comment("a", 1000)));
		}
}