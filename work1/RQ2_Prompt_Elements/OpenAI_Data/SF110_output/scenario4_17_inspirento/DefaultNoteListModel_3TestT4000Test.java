// DefaultNoteListModel_3Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
*/
class DefaultNoteListModel_3Test {

		/**
		* Test case 1:
		* The element is in the list.
		*/
		@Test
		void testCase1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertTrue(model.contains(note));
		}
		
		/**
		* Test case 2:
		* The element is not in the list.
		*/
		@Test
		void testCase2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertFalse(model.contains(note));
		}
		
		/**
		* Test case 3:
		* The element is null.
		*/
		@Test
		void testCase3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = null;
				assertFalse(model.contains(note));
		}
		
		/**
		* Test case 4:
		* The element is in the list.
		*/
		@Test
		void testCase4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertTrue(model.contains(note));
		}
		
		/**
		* Test case 5:
		* The element is not in the list.
		*/
		@Test
		void testCase5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertFalse(model.contains(note));
		}
		
		/**
		* Test case 6:
		* The element is null.
		*/
		@Test
		void testCase6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = null;
				assertFalse(model.contains(note));
		}
		
		/**
		* Test case 7:
		* The element is in the list.
		*/
		@Test
		void testCase7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertTrue(model.contains(note));
		}
		
		/**
		* Test case 8:
		* The element is not in the list.
		*/
		@Test
		void testCase8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertFalse(model.contains(note));
		}
		
		/**
		* Test case 9:
		* The element is null.
		*/
		@Test
		void testCase9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = null;
				assertFalse(model.contains(note));
		}
		
		/**
		* Test case 10:
		* The element is in the list.
		*/
		@Test
		void testCase10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertTrue(model.contains(note));
		}
}

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
		* The element is in the list.
		*/
		@Test
		void testCase1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.indexOf(note));
		}
		
		/**
		* Test case 2:
		* The element is not in the list.
		*/
		@Test
		void testCase2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertEquals(-1, model.indexOf(note));
		}
		
		/**
		* Test case 3:
		* The element is null.
		*/
		@Test
		void testCase3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = null;
				assertEquals(-1, model.indexOf(note));
		}
		
		/**
		* Test case 4:
		* The element is in the list.
		*/
		@Test
		void testCase4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.indexOf(note));
		}
		
		/**
		* Test case 5:
		* The element is not in the list.
		*/
		@Test
		void testCase5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertEquals(-1, model.indexOf(note));
		}
		
		/**
		* Test case 6:
		* The element is null.
		*/
		@Test
		void testCase6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = null;
				assertEquals(-1, model.indexOf(note));
		}
		
		/**
		* Test case 7:
		* The element is in the list.
		*/
		@Test
		void testCase7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.indexOf(note));
		}
		
		/**
		* Test case 8:
		* The element is not in the list.
		*/
		@Test
		void testCase8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertEquals(-1, model.indexOf(note));
		}
		
		/**
		* Test case 9:
		* The element is null.
		*/
		@Test
		void testCase9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = null;
				assertEquals(-1, model.indexOf(note));
		}
		
		/**
		* Test case 10:
		* The element is in the list.
		*/
		@Test
		void testCase10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.indexOf(note));
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
		* The element is in the list.
		*/
		@Test
		void testCase1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.indexOf(note, 0));
		}
		
		/**
		* Test case 2:
		* The element is not in the list.
		*/
		@Test
		void testCase2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertEquals(-1, model.indexOf(note, 0));
		}
		
		/**
		* Test case 3:
		* The element is null.
		*/
		@Test
		void testCase3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = null;
				assertEquals(-1, model.indexOf(note, 0));
		}
		
		/**
		* Test case 4:
		* The element is in the list.
		*/
		@Test
		void testCase4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.indexOf(note, 0));
		}
		
		/**
		* Test case 5:
		* The element is not in the list.
		*/
		@Test
		void testCase5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertEquals(-1, model.indexOf(note, 0));
		}
		
		/**
		* Test case 6:
		* The element is null.
		*/
		@Test
		void testCase6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = null;
				assertEquals(-1, model.indexOf(note, 0));
		}
		
		/**
		* Test case 7:
		* The element is in the list.
		*/
		@Test
		void testCase7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.indexOf(note, 0));
		}
		
		/**
		* Test case 8:
		* The element is not in the list.
		*/
		@Test
		void testCase8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertEquals(-1, model.indexOf(note, 0));
		}
		
		/**
		* Test case 9:
		* The element is null.
		*/
		@Test
		void testCase9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = null;
				assertEquals(-1, model.indexOf(note, 0));
		}
		
		/**
		* Test case 10:
		* The element is in the list.
		*/
		@Test
		void testCase10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.indexOf(note, 0));
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
		* The element is in the list.
		*/
		@Test
		void testCase1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note));
		}
		
		/**
		* Test case 2:
		* The element is not in the list.
		*/
		@Test
		void testCase2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertEquals(-1, model.lastIndexOf(note));
		}
		
		/**
		* Test case 3:
		* The element is null.
		*/
		@Test
		void testCase3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = null;
				assertEquals(-1, model.lastIndexOf(note));
		}
		
		/**
		* Test case 4:
		* The element is in the list.
		*/
		@Test
		void testCase4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note));
		}
		
		/**
		* Test case 5:
		* The element is not in the list.
		*/
		@Test
		void testCase5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
			