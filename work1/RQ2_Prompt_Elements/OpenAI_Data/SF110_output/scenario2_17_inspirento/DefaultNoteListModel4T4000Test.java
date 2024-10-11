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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
*/
class DefaultNoteListModelTest {

		/**
		 * Test case 1:
		 * The argument is null.
		 * Expected result:
		 * The method returns -1.
		 */
		@Test
		void testIndexOf1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.indexOf(null));
		}
		
		/**
		 * Test case 2:
		 * The argument is not null, but the list is empty.
		 * Expected result:
		 * The method returns -1.
		 */
		@Test
		void testIndexOf2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.indexOf(new AbstractNote()));
		}
		
		/**
		 * Test case 3:
		 * The argument is not null, and the list is not empty, but the argument is not in the list.
		 * Expected result:
		 * The method returns -1.
		 */
		@Test
		void testIndexOf3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addElement(new AbstractNote());
				assertEquals(-1, model.indexOf(new AbstractNote()));
		}
		
		/**
		 * Test case 4:
		 * The argument is not null, and the list is not empty, and the argument is in the list.
		 * Expected result:
		 * The method returns the index of the argument.
		 */
		@Test
		void testIndexOf4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.indexOf(note));
		}
		
		/**
		 * Test case 5:
		 * The argument is not null, and the list is not empty, and the argument is in the list.
		 * Expected result:
		 * The method returns the index of the argument.
		 */
		@Test
		void testIndexOf5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(new AbstractNote());
				model.addElement(note);
				assertEquals(1, model.indexOf(note));
		}
		
		/**
		 * Test case 6:
		 * The argument is not null, and the list is not empty, and the argument is in the list.
		 * Expected result:
		 * The method returns the index of the argument.
		 */
		@Test
		void testIndexOf6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(note);
				assertEquals(2, model.indexOf(note));
		}
		
		/**
		 * Test case 7:
		 * The argument is not null, and the list is not empty, and the argument is in the list.
		 * Expected result:
		 * The method returns the index of the argument.
		 */
		@Test
		void testIndexOf7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(note);
				assertEquals(3, model.indexOf(note));
		}
		
		/**
		 * Test case 8:
		 * The argument is not null, and the list is not empty, and the argument is in the list.
		 * Expected result:
		 * The method returns the index of the argument.
		 */
		@Test
		void testIndexOf8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(note);
				assertEquals(4, model.indexOf(note));
		}
		
		/**
		 * Test case 9:
		 * The argument is not null, and the list is not empty, and the argument is in the list.
		 * Expected result:
		 * The method returns the index of the argument.
		 */
		@Test
		void testIndexOf9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(note);
				assertEquals(5, model.indexOf(note));
		}
		
		/**
		 * Test case 10:
		 * The argument is not null, and the list is not empty, and the argument is in the list.
		 * Expected result:
		 * The method returns the index of the argument.
		 */
		@Test
		void testIndexOf10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(note);
				assertEquals(6, model.indexOf(note));
		}
}
```

### 2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2.2