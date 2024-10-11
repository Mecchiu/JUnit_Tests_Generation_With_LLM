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
		* Test case 1 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
		* Test case 1 is to test the lastIndexOf method with a null parameter.
		* The expected result is -1.
		*/
		@Test
		void testLastIndexOf1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(null));
		}
		
		/**
		* Test case 2 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
		* Test case 2 is to test the lastIndexOf method with an empty list.
		* The expected result is -1.
		*/
		@Test
		void testLastIndexOf2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				assertEquals(-1, model.lastIndexOf(new AbstractNote()));
		}
		
		/**
		* Test case 3 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
		* Test case 3 is to test the lastIndexOf method with a list containing one element.
		* The expected result is 0.
		*/
		@Test
		void testLastIndexOf3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note));
		}
		
		/**
		* Test case 4 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
		* Test case 4 is to test the lastIndexOf method with a list containing two elements.
		* The expected result is 1.
		*/
		@Test
		void testLastIndexOf4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				assertEquals(1, model.lastIndexOf(note));
		}
		
		/**
		* Test case 5 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
		* Test case 5 is to test the lastIndexOf method with a list containing three elements.
		* The expected result is 2.
		*/
		@Test
		void testLastIndexOf5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				assertEquals(2, model.lastIndexOf(note));
		}
		
		/**
		* Test case 6 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
		* Test case 6 is to test the lastIndexOf method with a list containing four elements.
		* The expected result is 3.
		*/
		@Test
		void testLastIndexOf6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				assertEquals(3, model.lastIndexOf(note));
		}
		
		/**
		* Test case 7 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
		* Test case 7 is to test the lastIndexOf method with a list containing five elements.
		* The expected result is 4.
		*/
		@Test
		void testLastIndexOf7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				assertEquals(4, model.lastIndexOf(note));
		}
		
		/**
		* Test case 8 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
		* Test case 8 is to test the lastIndexOf method with a list containing six elements.
		* The expected result is 5.
		*/
		@Test
		void testLastIndexOf8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				assertEquals(5, model.lastIndexOf(note));
		}
		
		/**
		* Test case 9 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
		* Test case 9 is to test the lastIndexOf method with a list containing seven elements.
		* The expected result is 6.
		*/
		@Test
		void testLastIndexOf9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				model.addElement(note);
				assertEquals(6, model.lastIndexOf(note));
		}
		
		/**
		* Test case 10 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
		* Test case 10 is to test the lastIndexOf method with a list containing eight elements.
		* The expected result is 7.
		*/
		@Test
		void testLastIndexOf10() {
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
				assertEquals(7, model.lastIndexOf(note));
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

    /**
     * Returns the index of the last occurrence of <code>elem</code>.
     *
     * @param elem the desired component
     * @return the index of the last occurrence of <code>elem</code> in the
     *         list; returns <code>-1</code> if the object is not found
     * @see Vector#lastIndexOf(Object)
     */
    public int lastIndex