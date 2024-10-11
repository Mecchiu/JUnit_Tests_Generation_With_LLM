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
* It contains ten unit test cases for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModelTest {

		/**
		* Test case 1:
		* The {@link DefaultNoteListModel#removeElement(AbstractNote)} method should return true if the element is successfully removed.
		*/
		@Test
		void testRemoveElement1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertTrue(model.removeElement(note));
		}
		
		/**
		* Test case 2:
		* The {@link DefaultNoteListModel#removeElement(AbstractNote)} method should return false if the element is not successfully removed.
		*/
		@Test
		void testRemoveElement2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertFalse(model.removeElement(note));
		}
		
		/**
		* Test case 3:
		* The {@link DefaultNoteListModel#removeElement(AbstractNote)} method should return false if the element is not successfully removed.
		*/
		@Test
		void testRemoveElement3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.removeElement(note);
				assertFalse(model.removeElement(note));
		}
		
		/**
		* Test case 4:
		* The {@link DefaultNoteListModel#removeElement(AbstractNote)} method should return true if the element is successfully removed.
		*/
		@Test
		void testRemoveElement4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				assertTrue(model.removeElement(note));
		}
		
		/**
		* Test case 5:
		* The {@link DefaultNoteListModel#removeElement(AbstractNote)} method should return true if the element is successfully removed.
		*/
		@Test
		void testRemoveElement5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				assertFalse(model.removeElement(note));
		}
		
		/**
		* Test case 6:
		* The {@link DefaultNoteListModel#removeElement(AbstractNote)} method should return true if the element is successfully removed.
		*/
		@Test
		void testRemoveElement6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				assertTrue(model.removeElement(note));
		}
		
		/**
		* Test case 7:
		* The {@link DefaultNoteListModel#removeElement(AbstractNote)} method should return true if the element is successfully removed.
		*/
		@Test
		void testRemoveElement7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				assertFalse(model.removeElement(note));
		}
		
		/**
		* Test case 8:
		* The {@link DefaultNoteListModel#removeElement(AbstractNote)} method should return true if the element is successfully removed.
		*/
		@Test
		void testRemoveElement8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				assertTrue(model.removeElement(note));
		}
		
		/**
		* Test case 9:
		* The {@link DefaultNoteListModel#removeElement(AbstractNote)} method should return true if the element is successfully removed.
		*/
		@Test
		void testRemoveElement9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				assertFalse(model.removeElement(note));
		}
		
		/**
		* Test case 10:
		* The {@link DefaultNoteListModel#removeElement(AbstractNote)} method should return true if the element is successfully removed.
		*/
		@Test
		void testRemoveElement10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				model.removeElement(note);
				model.addElement(note);
				assertTrue(model.removeElement(note));
		}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Interface for a list model that contains <code>AbstractNote</code>s.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    /**
     * Adds an element to the list.
     *
     * @param obj the element to be added
     */
    public void addElement(AbstractNote obj);

    /**
     * Removes an element from the list.
     *
     * @param obj the element to be removed
     * @return true if the element is successfully removed
     */
    public boolean removeElement(AbstractNote obj);

    /**
     * Returns the index of the specified element.
     *
     * @param obj the element to be searched
     * @return the index of the element, or -1 if the element is not found
     */
    public int indexOf(AbstractNote obj);

    /**
     * Returns the element at the specified index.
     *
     * @param index the index of the element
     * @return the element at the specified index
     */
    public AbstractNote getElement