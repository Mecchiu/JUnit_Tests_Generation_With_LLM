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
		 * Test case 1 for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}
		 * 
		 * @see DefaultNoteListModel#indexOf(AbstractNote, int)
		 */
		@Test
		void testIndexOf1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				assertEquals(0, model.indexOf(model.getElementAt(0), 0));
		}
		
		/**
		 * Test case 2 for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}
		 * 
		 * @see DefaultNoteListModel#indexOf(AbstractNote, int)
		 */
		@Test
		void testIndexOf2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				assertEquals(9, model.indexOf(model.getElementAt(9), 0));
		}
		
		/**
		 * Test case 3 for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}
		 * 
		 * @see DefaultNoteListModel#indexOf(AbstractNote, int)
		 */
		@Test
		void testIndexOf3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				assertEquals(5, model.indexOf(model.getElementAt(5), 0));
		}
		
		/**
		 * Test case 4 for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}
		 * 
		 * @see DefaultNoteListModel#indexOf(AbstractNote, int)
		 */
		@Test
		void testIndexOf4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				assertEquals(0, model.indexOf(model.getElementAt(0), 1));
		}
		
		/**
		 * Test case 5 for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}
		 * 
		 * @see DefaultNoteListModel#indexOf(AbstractNote, int)
		 */
		@Test
		void testIndexOf5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				assertEquals(9, model.indexOf(model.getElementAt(9), 1));
		}
		
		/**
		 * Test case 6 for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}
		 * 
		 * @see DefaultNoteListModel#indexOf(AbstractNote, int)
		 */
		@Test
		void testIndexOf6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				assertEquals(5, model.indexOf(model.getElementAt(5), 1));
		}
		
		/**
		 * Test case 7 for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}
		 * 
		 * @see DefaultNoteListModel#indexOf(AbstractNote, int)
		 */
		@Test
		void testIndexOf7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				assertEquals(0, model.indexOf(model.getElementAt(0), 2));
		}
		
		/**
		 * Test case 8 for {@link DefaultNoteListModel#indexOf(AbstractNote, int)}
		 * 
		 * @see DefaultNoteListModel#indexOf(AbstractNote, int)
		 */
		@Test
		void testIndexOf8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
				model.addElement(new AbstractNote());
