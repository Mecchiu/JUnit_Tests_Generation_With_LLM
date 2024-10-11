// DefaultNoteListModel_0Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_0Test {
		/**
		* Unit test for {@link DefaultNoteListModel#capacity()} method.
		*/
		@Test
		void defaultCase() {
				// Arrange
				List<String> vector = new ArrayList<>();
				int size = vector.size() + 1;
				NoteListDataEvent ev = new NoteListDataEvent(size);
				final DefaultNoteListModel model = new DefaultNoteListModel(){
						final int size = vector.size() + 1;
				@Override
				public int size() {
						return size;
				}
				@Override
				public void add(String note) {
						add_0();
				}
				@Override
				public String previousNote() {
						return previous_note_0();
				}
				@Override
				public void setPreviousNote(String note) {
						set_previous_note_0();
				}
				@Override
				public boolean remove(String note) {
						return remove_0(note);
				}
				@Override
				public void remove(String note, AbstractNote target) {
						remove(note, target);
				}
				@Override
				public void removeAll(String note) {
						remove_all_0(note);
				}
				
				
				private String previous_note_0() {
						return vector.get(size - 2);
				}
			private void remove_0(String note) {
				vector.remove(size - 2);
			}
		private void remove_all_0(String note) {
				vector.removeAll(note);
		}
				/**
		 * Returns the current index of the current note with a specified note name.
		 *
		 * @param note the name of the current note with specified index
		 * @return the current index of current note
		 * @see #getIndexOf(String)
		 */
		private int getIndexOf(String note) {
				int index = 0;
				int size = vector.size();
				for (Object element : vector) {
					if (element instanceof AbstractNote) {
						if (((AbstractNote)element).getName().equals(note)) {
							return index;
						}
					}
					index++;
				}
				return index;
		}

			/**
		 * Returns the index of the note with the specified name, or index of the last note
		 * with specified name if there is no note with the specified note name.
		 *
		 * @param noteName the name of the current note
		 * @return the index of specified note name
		 * @see #getIndexOf(String)
		 */
		private int getIndexOfOrLastIndexByName(String noteName) {
				int index = 0;
				int size = getSizeOf(noteName);
				for (int i = index; i < size; i++) {
					AbstractNote o = (AbstractNote) vector.get(i);
					if (o.getName().equals(noteName)) {
						return i;
					}
				}
				return size - 1;
		}

		/**
		 * Returns the last note with specified note name or name of last note with specified note name.
		 *
		 * @param noteName the name of the last note
		 * @return the last note with specified name or name of last note
		 * @see #getIndexOfOrLastIndexByName(String)
		 */
		private AbstractNote lastNoteByNameOrLastIndex(String noteName) {
				int last = 0;
				int size = getSizeOf(noteName);
				for (int i = last; i >= 0; i--) {
					AbstractNote o = (AbstractNote) vector.get(i);
					if (o.getName().equals(noteName)) {
						return o;
					}
					if (last == size - 1) {
						last = i;
					}
				}
				return null;
		}
		/**
		 * Returns empty vector that can hold empty note with specified note name.
		 *
		 * @param noteName the name of note
		 * @return empty vector
		 */
		Vector<AbstractNote> emptyVectorFromName(String noteName) {
				return emptyVectorFromName(noteName, 0);
		}
		/**
		 * Returns empty vector that can hold empty note with specified note name and specified initial index.
		 *
		 * @param noteName the name of note
		 * @param index the offset of new Note object
		 * @return empty vector
		 */
		private Vector<AbstractNote> emptyVectorFromName(String noteName, int index) {
				Vector<AbstractNote> rv = new Vector<>();
				for (Object o : vector) {
						if (o instanceof AbstractNote) {
								AbstractNote o2 = (AbstractNote) o;
								if (o2.getName().equals(noteName) && index == o2.getIndex()) {
									rv.add(o2);
								}
						}
}