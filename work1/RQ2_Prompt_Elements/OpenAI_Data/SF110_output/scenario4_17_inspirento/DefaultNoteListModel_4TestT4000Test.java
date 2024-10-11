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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_4Test {

		/**
		* Test case 1:
		* The element is not in the list.
		*/
		@Test
		void testIndexOf_1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = model.indexOf(note);
				assertEquals(-1, index);
		}
		
		/**
		* Test case 2:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				int index = model.indexOf(note);
				assertEquals(0, index);
		}
		
		/**
		* Test case 3:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note);
				assertEquals(0, index);
		}
		
		/**
		* Test case 4:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note);
				assertEquals(0, index);
		}
		
		/**
		* Test case 5:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note);
				assertEquals(0, index);
		}
		
		/**
		* Test case 6:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note);
				assertEquals(0, index);
		}
		
		/**
		* Test case 7:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note);
				assertEquals(0, index);
		}
		
		/**
		* Test case 8:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note);
				assertEquals(0, index);
		}
		
		/**
		* Test case 9:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note);
				assertEquals(0, index);
		}
		
		/**
		* Test case 10:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note);
				assertEquals(0, index);
		}
}

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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {
		
		/**
		* Test case 1:
		* The element is not in the list.
		*/
		@Test
		void testIndexOf_1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = model.indexOf(note, 0);
				assertEquals(-1, index);
		}
		
		/**
		* Test case 2:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				int index = model.indexOf(note, 0);
				assertEquals(0, index);
		}
		
		/**
		* Test case 3:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note, 0);
				assertEquals(0, index);
		}
		
		/**
		* Test case 4:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note, 0);
				assertEquals(0, index);
		}
		
		/**
		* Test case 5:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note, 0);
				assertEquals(0, index);
		}
		
		/**
		* Test case 6:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note, 0);
				assertEquals(0, index);
		}
		
		/**
		* Test case 7:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note, 0);
				assertEquals(0, index);
		}
		
		/**
		* Test case 8:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note, 0);
				assertEquals(0, index);
		}
		
		/**
		* Test case 9:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note, 0);
				assertEquals(0, index);
		}
		
		/**
		* Test case 10:
		* The element is in the list.
		*/
		@Test
		void testIndexOf_10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				int index = model.indexOf(note, 0);
				assertEquals(0, index);
		}
}

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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_6Test {
		
		/**
		* Test case 1:
		* The element is not in the list.
		*/
		@Test
		void testLastIndexOf_1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				int index = model.lastIndexOf(note);
				assertEquals(-1, index);
		}
		
		/**
		* Test case 2:
		* The element is in the list.
		*/
		@Test
		void testLastIndexOf_2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				int index = model.lastIndexOf(note);
				assertEquals(0, index);
		}
		
		/**
		* Test case 3:
		* The element is in the list.
		*/
		@Test
		void testLastIndexOf_3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				int index = model.lastIndexOf(note);
				assertEquals(1, index);
		}
		
		/**
		* Test case 4:
		* The element