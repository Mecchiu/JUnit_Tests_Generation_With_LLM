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
		private final NoteListModel model;
		private final AbstractNote firstNote;
		private final AbstractNote lastNote;
		private final int start;
		private final int stop;
		private final boolean ignoreExisting;

		DefaultNoteListModel_11Test(AbstractNote firstNote, AbstractNote lastNote,
        									AbstractNote lastOldNote, boolean ignoreExisting)
		{
			final ArrayList<AbstractNote> notes = new ArrayList<>(Arrays.asList(firstNote, lastOldNote));

			firstNote = notes.get(0);
			lastNote = notes.get(notes.size() - 1);

			this.model = new DefaultNoteListModel();

			final Set<AbstractNote> oldNotes;
			if (ignoreExisting)
			{
				oldNotes = new HashSet<>();
			}
			else
			{
				oldNotes = new HashSet<>(Arrays.asList(firstNote, lastNote));
			}
			oldNotes.add(firstNote);
			oldNotes.add(lastOldNote);

			if (ignoreExisting)
			{
                model.addData(firstNote, oldNotes);
                model.addData(lastNote, oldNotes);
            }

			this.firstNote = firstNote;
			this.lastNote = lastNote;
			this.lastOldNote = lastOldNote;
			this.ignoreExisting = ignoreExisting;
		}


		/**
		 * Test method for {@link #removeElement(AbstractNote)} method.
		 *
		 * @throws NoSuchMethodException
		 *                  Test method that expects a {@link NoSuchMethodException}
		 *                  to be thrown.
		 * @throws InterruptedException
		 *                  Test method that expects a {@link InterruptedException}
		 *                  to be thrown.
		 */
		@Test
		public final void testRemoveElement() throws NoSuchMethodException, InterruptedException
		{
            final AbstractNote lastOldNote = lastOldNote();
			final AbstractNote firstOldNote = findFirst(lastOldNote);
			final AbstractNote firstOldNoteNew = findFirst(firstOldNote);
			assertNotNull("FirstOldNote should not be null", firstOldNote);
			assertNotNull("FirstOldNoteNew should not be null", firstOldNoteNew);
			final Set<AbstractNote> oldNotes;
			if (ignoreExisting)
			{
                oldNotes = new HashSet<>(Arrays.asList(firstOldNote, firstOldNoteNew));
            }
			else
			{
                oldNotes = new HashSet<>(Arrays.asList(firstOldNote, firstOldNoteNew));
            }
			oldNotes.add(firstOldNote);
			oldNotes.add(firstOldNoteNew);
			final ArrayList<AbstractNote> notesAtStart = new ArrayList<>(oldNotes);
			final ArrayList<AbstractNote> notesOfCurrent = new ArrayList<>(oldNotes);
			final int startOfNewNote= findFirst(firstNewNote());
			final int stopOfNewNote = findFirst(firstNewNote());
			for (int i = startOfNewNote, index = 0;; i++)
			{
                final AbstractNote n = notesAtStart.get(index);
                final int oldIndex = oldNotes.indexOf(n);
				assertNotNull("The list of notes should not contain an old note", oldIndex);
				assertTrue("index should equal startOfNewNote", i == (startOfNewNote + index));
				assertEquals("The first note in the list should be the one who is at the start",
									firstIfExists(firstNote), firstIndexOf(notesAtStart.get(oldIndex)));

				if (i == stopOfNewNote)
				{
					break;
				}
			}
		}

		@Test
		public final void testRemoveElementInMiddleOfList() throws InterruptedException
		{
			final TestEventListener listener = new TestEventListener();
			final TestScheduler scheduler = new SingleThreadScheduler();
            final Set<AbstractNote> oldNotes = new HashSet<>(Arrays.asList(firstOldNote(), lastOldNote(), firstNote(), lastNote()));
			final Set<AbstractNote> selectedNotes = new HashSet<>(Arrays.asList(firstNote(), lastNote(), firstOldNote(), lastOldNote()));
			final Set<AbstractNote> oldOrSelecteds = oldNotes.size() > 10? new HashSet<>(oldNotes) : new HashSet<>(oldOrSelecteds);
			final AbstractNote newFirst = new NoteAt(1, 0, 0);
			final Collection<AbstractNote> noteCollection = new HashSet<>(oldNotes);
			final Set<AbstractNote> newOrSelecteds = new SetsBuilder<>(
											Collections.unmodifiableSet(noteCollection),
											new HashBiMap<>(newFirst.getUniqueNoteId(), newFirst.getUniqueNoteId()))
									.addAll(oldOrSelecteds)
									.build();
			oldNotes.addAll(noteCollection);
			oldNotes.addAll(noteCollection);

			model.addData(firstNote, oldNotes);

			// Remove the second note from the current selection
			model.removeElement(firstNote);

			assertTrue("New note should still be an item in the model", 
									newOrSelecteds.contains(firstNote));
			assertTrue("There should not be any changes to the set of selectedNotes after the removal",
									oldOrSelecteds.isEmpty() &&
									selectedNotes.isEmpty());

			// The new note should contain more recent notes
			assertEquals("The list of selectedNotes should contain newNote",
							newOrSelecteds, oldOrSelecteds);

			scheduler.notifyTasks(null, this, listener);
            assertTrue("List task should have been executed", listener.hasBeenExecuted());
        }

        @Override
        public void addData(final AbstractNote targetNote, final Set<AbstractNote> notSelectedNotes)
        {
            model.addData(targetNote, notSelectedNotes);
        }

        @Override
        public int indexOf(final AbstractNote note)
        {
            return model.indexOf(firstNote, note);
        }

        @Override
        public Set<AbstractNote> getNotSelectedNotes()
        {
            return model.getNotSelectedNotes();
        }

        @Override
        public boolean isNotSelected(final AbstractNote note)
        {
            return model.isNotSelected(firstNote, note);
        }
    }

    private static final class TestEventListener implements NoteListDataListener, Runnable
    {
    	private boolean hasBeenExecuted = false;

		@Override
		public void addData(final AbstractNote oldNote, final Set<AbstractNote> selectedNotes)
		{
			hasBeenExecuted = true;
			selectedNotes.add(firstNote);
		}

		@Override
		public void removeData(final AbstractNote oldNote, final Set<AbstractNote> selectedNotes)
		{
}
}