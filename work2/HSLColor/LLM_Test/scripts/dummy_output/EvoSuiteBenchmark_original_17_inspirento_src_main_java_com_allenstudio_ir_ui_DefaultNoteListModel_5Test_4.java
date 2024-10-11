// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {
		/**
		 * The class under test
		 *
		 * @throws Exception the expected exceptions
		 */
		protected static void testCase18(NoteListModel model, long startTime) throws Exception {
			final String text = "test text";
			final boolean marked = true;
			final AbstractNote toBeDeleted = new AbstractNote();
			AbstractNote deleted = null;
			AbstractNote n1 = new AbstractNote("N1", toBeDeleted, marked);
			final int INDEX_1 = model.indexOf(n1);
			assertTrue("Index 1 not found", INDEX_1 >= 0);
			assertEquals(text, model.get(startTime + INDEX_1, 0).toString());

			AbstractNote n2 = new AbstractNote("N2", toBeDeleted, marked);

			// 1st time to be deleted
			deleted = model.delete(startTime + INDEX_1, 0);
			assertTrue(deleted == null);
			assertEquals(n1, deleted);

			final int INDEX_2 = model.indexOf(n1);
			assertTrue("Index 2 not found", INDEX_2 > INDEX_1);

			final int numberOfAddedNote = (INDEX_2 == INDEX_1)? 1 : 2;
			assertEquals(numberOfAddedNote, model.getVisibleNoteCount());
			assertEquals(numberOfAddedNote, model.getNoteList().size());

			final Map<AbstractNote, Integer> oldToNewNotesMap = new HashMap<>();
			for (AbstractNote note : model.getNoteList()) {
				oldToNewNotesMap.put(note, 1);
				if (indexOf(note, startTime) == INDEX_2) {
					break;
				}
			}
			assertEquals(1, oldToNewNotesMap.size());
			assertEquals(numberOfAddedNote, model.getVisibleNoteCount());

			// 2nd time to be deleted
			deleted = model.delete(startTime, INDEX_1 + 1);
			assertTrue("Second time to be deleted", deleted == null);
			assertEquals(1, model.getVisibleNoteCount());

			final Map<AbstractNote, Integer> oldToNewNotesMap = new HashMap<>();
			for (AbstractNote note : model.getNoteList()) {
				oldToNewNotesMap.put(note, 0);
				if (indexOf(note, startTime) == INDEX_2) {
					break;
				}
			}
			assertEquals(numberOfAddedNote, model.getVisibleNoteCount());
			assertEquals(0, oldToNewNotesMap.size());

			// Delete an item from the empty list
			model.delete(startTime + INDEX_1, INDEX_1 + 1);
			assertEquals(0, model.getVisibleNoteCount());
			assertEquals(numberOfAddedNote, model.getNoteList().size());
			assertEquals(0, model.getVisibleNoteCount());

			// Delete item in a larger model (a model with no visible notes).
			final DefaultSingleListModel<AbstractNote> newModel = new DefaultSingleListModel(text);
			newModel.addAllWithUniqueNote(model);
			final AbstractNote[] current = newModel.getCurrent();
			for (AbstractNote note : current) {
				if (note.getText().equals(text)) {
					assertFalse("Note should not be in the list", newModel.contains(note));
				}
			}
			final int INDEX = INDEX_2 - INDEX_1;
			final AbstractNote toBeRemoved = new ModelSubstitutionModel<>(newModel).remove(0);
			assertTrue("To be removed note should be in the list", model.contains(toBeRemoved));

			// Delete the item in another model.
			model.delete(startTime + INDEX_1, INDEX_1 + 1);
			assertEquals(0, newModel.getCurrent().length);
			assertEquals(0, newModel.getVisibleNoteCount());
			assertEquals(numberOfAddedNote, newModel.getNoteList().size());
			assertEquals(0, model.getVisibleNoteCount());
		}

		/**
		 * A fixture for this test class
		 * <br />
		 * It allows the creation of a couple of test cases
		 *
		 * @throws InterruptedException if the test fails
		 */
		protected static void testCase23(NoteListModel model) throws InterruptedException {
			final long startTime = System.currentTimeMillis();
			final int index1 = model.indexOf(new ModelSubstitutionModel<>(new DefaultNoteListModel()).replace(new ModelSubstitutionModel<>(new DefaultNoteListModel())).replace(new ModelSubstitutionModel<>(new DefaultNoteListModel())).replace(new DefaultNoteListModel()).replace(new ModelSubstitutionModel<>(new DefaultNoteListModel()).replace(new ModelSubstitutionModel<>(new DefaultNoteListModel())).replace(new DefaultNoteListModel())));
			int index2 = model.indexOf(new ModelSubstitutionModel<>(new DefaultNoteListModel()).replace(new ModelSubstitutionModel<>(new DefaultNoteListModel())));
			System.out.println(String.format("%d: %d", index1, index2));
			long timeTaken = System.currentTimeMillis() - startTime;
			assertEquals(startTime, timeTaken);
		}
}