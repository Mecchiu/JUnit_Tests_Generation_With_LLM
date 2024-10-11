// DefaultNoteListModelTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModelTest {
		
		/**
		* Test case 1:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 2:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 3:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 4:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 5:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 6:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 7:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 8:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 9:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
		
		/**
		* Test case 10:
		* The input is a valid index.
		* The expected result is the note at the index is removed.
		*/
		@Test
		void testRemove10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.remove(0);
				assertEquals(0, model.getSize());
		}
}