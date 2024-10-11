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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModelTest {

		/**
		* Test case 1:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 0;
				int expected = -1;
				int actual = model.lastIndexOf(note, index);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 2:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 1;
				int expected = -1;
				int actual = model.lastIndexOf(note, index);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 3:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 2;
				int expected = -1;
				int actual = model.lastIndexOf(note, index);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 4:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 3;
				int expected = -1;
				int actual = model.lastIndexOf(note, index);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 5:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 4;
				int expected = -1;
				int actual = model.lastIndexOf(note, index);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 6:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 5;
				int expected = -1;
				int actual = model.lastIndexOf(note, index);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 7:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 6;
				int expected = -1;
				int actual = model.lastIndexOf(note, index);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 8:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 7;
				int expected = -1;
				int actual = model.lastIndexOf(note, index);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 9:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 8;
				int expected = -1;
				int actual = model.lastIndexOf(note, index);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case 10:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 9;
				int expected = -1;
				int actual = model.lastIndexOf(note, index);
				assertEquals(expected, actual);
		}
}

// DefaultNoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Default implementation of <code>NoteListModel</code>
 *
 * @author Allen Chue
 */
public class DefaultNoteListModel implements NoteListModel {

    public int lastIndexOf(AbstractNote elem, int index) {
        return delegate.lastIndexOf(elem, index);
    }
}

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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModelTest {
		
		/**
		* Test case 1:
		* The {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method should return -1 if the specified element is not in the list.
		*/
		@Test
		void testCase1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = 0