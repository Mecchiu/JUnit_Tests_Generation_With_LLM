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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModelTest {

		/**
		* Test case 1:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method should return -1 if the list is empty.
		*/
		@Test
		void testLastIndexOf1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote()));
		}
		
		/**
		* Test case 2:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method should return -1 if the list does not contain the specified element.
		*/
		@Test
		void testLastIndexOf2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.add(new AbstractNote());
				assertEquals(-1, model.lastIndexOf(new AbstractNote()));
		}
		
		/**
		* Test case 3:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(2, model.lastIndexOf(note));
		}
		
		/**
		* Test case 4:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(3, model.lastIndexOf(note));
		}
		
		/**
		* Test case 5:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(4, model.lastIndexOf(note));
		}
		
		/**
		* Test case 6:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(5, model.lastIndexOf(note));
		}
		
		/**
		* Test case 7:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(6, model.lastIndexOf(note));
		}
		
		/**
		* Test case 8:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(7, model.lastIndexOf(note));
		}
		
		/**
		* Test case 9:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(8, model.lastIndexOf(note));
		}
		
		/**
		* Test case 10:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(9, model.lastIndexOf(note));
		}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Interface for a data model that represents a list of notes.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    public int lastIndexOf(AbstractNote elem);
}

// NoteListModelTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NoteListModel}.
* It contains ten unit test cases for the {@link NoteListModel#lastIndexOf(AbstractNote)} method.
*/
class NoteListModelTest {
		
		/**
		* Test case 1:
		* The {@link NoteListModel#lastIndexOf(AbstractNote)} method should return -1 if the list is empty.
		*/
		@Test
		void testLastIndexOf1() {
				NoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote()));
		}
		
		/**
		* Test case 2:
		* The {@link NoteListModel#lastIndexOf(AbstractNote)} method should return -1 if the list does not contain the specified element.
		*/
		@Test
		void testLastIndexOf2() {
				NoteListModel model = new DefaultNoteListModel();
				model.add(new AbstractNote());
				assertEquals(-1, model.lastIndexOf(new AbstractNote()));
		}
		
		/**
		* Test case 3:
		* The {@link NoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf3() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(2, model.lastIndexOf(note));
		}
		
		/**
		* Test case 4:
		* The {@link NoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf4() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(3, model.lastIndexOf(note));
		}
		
		/**
		* Test case 5:
		* The {@link NoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf5() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(4, model.lastIndexOf(note));
		}
		
		/**
		* Test case 6:
		* The {@link NoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf6() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(5, model.lastIndexOf(note));
		}
		
		/**
		* Test case 7:
		* The {@link NoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf7() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(6, model.lastIndexOf(note));
		}
		
		/**
		* Test case 8:
		* The {@link NoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf8() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(7, model.lastIndexOf(note));
		}
		
		/**
		* Test case 9:
		* The {@link NoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf9() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new AbstractNote());
				model.add(note);
				assertEquals(8, model.lastIndexOf(note));
		}
		
		/**
		* Test case 10:
		* The {@link NoteListModel#lastIndexOf(AbstractNote)} method should return the index of the last occurrence of the specified element in this list.
		*/
		@Test
		void testLastIndexOf10() {
				NoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(new AbstractNote());
				model.add(note);
				model.add(new Abstract