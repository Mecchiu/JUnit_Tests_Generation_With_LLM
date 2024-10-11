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
		public void testCase1() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				assertEquals(-1, list.lastIndexOf(new AbstractNote()));
		}
		
		/**
		* Test case 2:
		* The element is in the list.
		*/
		@Test
		public void testCase2() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				assertEquals(0, list.lastIndexOf(note));
		}
		
		/**
		* Test case 3:
		* The element is in the list.
		*/
		@Test
		public void testCase3() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				list.addElement(note);
				assertEquals(1, list.lastIndexOf(note));
		}
		
		/**
		* Test case 4:
		* The element is in the list.
		*/
		@Test
		public void testCase4() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				assertEquals(2, list.lastIndexOf(note));
		}
		
		/**
		* Test case 5:
		* The element is in the list.
		*/
		@Test
		public void testCase5() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				assertEquals(3, list.lastIndexOf(note));
		}
		
		/**
		* Test case 6:
		* The element is in the list.
		*/
		@Test
		public void testCase6() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				assertEquals(4, list.lastIndexOf(note));
		}
		
		/**
		* Test case 7:
		* The element is in the list.
		*/
		@Test
		public void testCase7() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				assertEquals(5, list.lastIndexOf(note));
		}
		
		/**
		* Test case 8:
		* The element is in the list.
		*/
		@Test
		public void testCase8() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				assertEquals(6, list.lastIndexOf(note));
		}
		
		/**
		* Test case 9:
		* The element is in the list.
		*/
		@Test
		public void testCase9() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				assertEquals(7, list.lastIndexOf(note));
		}
		
		/**
		* Test case 10:
		* The element is in the list.
		*/
		@Test
		public void testCase10() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				list.addElement(note);
				assertEquals(8, list.lastIndexOf(note));
		}
}

// DefaultNoteListModel_7Test.java
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
class DefaultNoteListModel_7Test {
		
		/**
		* Test case 1:
		* The element is not in the list.
		*/
		@Test
		public void testCase1() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				assertEquals(-1, list.lastIndexOf(new AbstractNote(), 0));
		}
		
		/**
		* Test case 2:
		* The element is in the list.
		*/
		@Test
		public void testCase2() {
				DefaultNoteListModel list = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				list.addElement(note);
				assertEquals(0, list.lastIndexOf(note, 0));
		}
		
		/**
		* Test case 3:
		* The element is in the list.
		*/
		@Test
		public void testCase3() {
				DefaultNoteListModel list = new DefaultNoteListModel();