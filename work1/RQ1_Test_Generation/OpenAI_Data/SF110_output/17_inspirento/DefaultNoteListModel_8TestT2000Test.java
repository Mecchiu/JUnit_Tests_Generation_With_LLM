// DefaultNoteListModel_8Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#elementAt(int)} method.
*/
class DefaultNoteListModel_8Test {

		/**
		* Test case 1 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 1 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 1 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 1 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 1 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 1 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 1 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 1 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 1 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 1 for {@link DefaultNoteListModel#elementAt(int)}
		*/
		@Test
		void testElementAt1() {
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
				assertEquals(model.elementAt(0), model.elementAt(0));
				assertEquals(model.elementAt(1), model.elementAt(1));
				assertEquals(model.elementAt(2), model.elementAt(2));
				assertEquals(model.elementAt(3), model.elementAt(3));
				assertEquals(model.elementAt(4), model.elementAt(4));
				assertEquals(model.elementAt(5), model.elementAt(5));
				assertEquals(model.elementAt(6), model.elementAt(6));
				assertEquals(model.elementAt(7), model.elementAt(7));
				assertEquals(model.elementAt(8), model.elementAt(8));
				assertEquals(model.elementAt(9), model.elementAt(9));
		}
		
		/**
		* Test case 2 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 2 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 2 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 2 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 2 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 2 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 2 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 2 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 2 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 2 for {@link DefaultNoteListModel#elementAt(int)}
		*/
		@Test
		void testElementAt2() {
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
				assertNotEquals(model.elementAt(0), model.elementAt(1));
				assertNotEquals(model.elementAt(1), model.elementAt(2));
				assertNotEquals(model.elementAt(2), model.elementAt(3));
				assertNotEquals(model.elementAt(3), model.elementAt(4));
				assertNotEquals(model.elementAt(4), model.elementAt(5));
				assertNotEquals(model.elementAt(5), model.elementAt(6));
				assertNotEquals(model.elementAt(6), model.elementAt(7));
				assertNotEquals(model.elementAt(7), model.elementAt(8));
				assertNotEquals(model.elementAt(8), model.elementAt(9));
				assertNotEquals(model.elementAt(9), model.elementAt(0));
		}
		
		/**
		* Test case 3 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 3 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 3 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 3 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 3 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 3 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 3 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 3 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 3 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 3 for {@link DefaultNoteListModel#elementAt(int)}
		*/
		@Test
		void testElementAt3() {
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
				assertNotEquals(model.elementAt(0), model.elementAt(2));
				assertNotEquals(model.elementAt(1), model.elementAt(3));
				assertNotEquals(model.elementAt(2), model.elementAt(4));
				assertNotEquals(model.elementAt(3), model.elementAt(5));
				assertNotEquals(model.elementAt(4), model.elementAt(6));
				assertNotEquals(model.elementAt(5), model.elementAt(7));
				assertNotEquals(model.elementAt(6), model.elementAt(8));
				assertNotEquals(model.elementAt(7), model.elementAt(9));
				assertNotEquals(model.elementAt(8), model.elementAt(0));
				assertNotEquals(model.elementAt(9), model.elementAt(1));
		}
		
		/**
		* Test case 4 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 4 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 4 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 4 for {@link DefaultNoteListModel#elementAt(int)}
		* Test case 4 for {@link