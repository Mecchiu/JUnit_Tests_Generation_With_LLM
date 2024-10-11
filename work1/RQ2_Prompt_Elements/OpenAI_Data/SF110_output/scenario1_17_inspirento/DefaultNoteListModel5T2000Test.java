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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModelTest {

		/**
		* Test case 1:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(1, model.indexOf(note2, 0));
		}
		
		/**
		* Test case 2:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(2, model.indexOf(note3, 0));
		}
		
		/**
		* Test case 3:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(0, model.indexOf(note1, 0));
		}
		
		/**
		* Test case 4:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(1, model.indexOf(note2, 1));
		}
		
		/**
		* Test case 5:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(2, model.indexOf(note3, 1));
		}
		
		/**
		* Test case 6:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(0, model.indexOf(note1, 1));
		}
		
		/**
		* Test case 7:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(1, model.indexOf(note2, 2));
		}
		
		/**
		* Test case 8:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(2, model.indexOf(note3, 2));
		}
		
		/**
		* Test case 9:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(0, model.indexOf(note1, 2));
		}
		
		/**
		* Test case 10:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(-1, model.indexOf(note1, 3));
		}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Interface for a list of notes.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    /**
     * Returns the number of components in this list.
     *
     * @return the number of components in this list
     */
    int getSize();

    /**
     * Returns the component at the specified index.
     *
     * @param index an index into this list
     * @return the component at the specified index
     * @throws ArrayIndexOutOfBoundsException if the <code>index</code> is
     *         negative or greater than the current size of this list
     */
    AbstractNote getElementAt(int index