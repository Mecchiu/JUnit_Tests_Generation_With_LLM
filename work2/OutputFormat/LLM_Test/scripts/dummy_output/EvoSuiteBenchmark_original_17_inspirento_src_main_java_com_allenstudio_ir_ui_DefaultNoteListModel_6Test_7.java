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
		* This method tests {@link DefaultNoteListModel#lastIndexOf(AbstractNote)}.
		*/
	@Test
	void testLastIndexOfAbstractNote() {
		/*
		 * All the above mentioned tests do it a lot and this whole class is more complicated 
		 */
		final DefaultNoteListModel model = new DefaultNoteListModel();
		final Map<AbstractNote, Integer> map;
		// Create a container using the model and a simple map
		// Note: we will reuse some of the same object in multiple tests
		final ObjectContainer<AbstractNote> testObjectContainer;
		testObjectContainer = new ObjectContainer<AbstractNote>(AbstractNote.class);
      model.add(testObjectContainer);
      model.remove(testObjectContainer);
		map = model.map();
		AbstractNote elem = testObjectContainer.getItem(0);

		// Now check if the object was added/removed, and how
		assertNotNull("The map should not be null", map);
		if (map.size() == 0) {
			assertNull("The map should not be empty.", map);
		}
		else {
			// the object should be added one by one
			if (map.get(elem) == null) {
				assertNull("Returned wrong list", map);
			}
			else {
				assertNotNull("The item in the item list must contain the new object", map);
				assertTrue("The returned object does not contain the new object", map.get(elem).equals(elem));
			}
		}
		// Finally, check the size again
		assertTrue("The list does not contain the new object", map.size() == 1);
		// Add an additional object
		model.add(new AbstractNote(2));
		// Create a copy of the container, add it's size one
		model.add(new ObjectContainer<AbstractNote>(new ArrayList<AbstractNote>(model.size()), model));
		// check the size, as the map will have one more value
		assertEquals("The size is wrong", 1, map.size());
		// Remove it
		model.remove(model);
		assertTrue("Map should have 0 items", map.size() == 0);
		// Size should be zero
		assertFalse("There are added objects in the map", map.size() == 1);
	}
}