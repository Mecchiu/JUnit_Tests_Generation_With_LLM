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
		 * The method returns -1 if the object is not found.
		 */
		@Test
		void testIndexOf1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				assertEquals(-1, model.indexOf(note));
		}
		
		/**
		 * Test case 2:
		 * The method returns the index of the first occurrence of the argument in this list.
		 */
		@Test
		void testIndexOf2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note = new AbstractNote();
				model.addElement(note);
				assertEquals(0, model.indexOf(note));
		}
		
		/**
		 * Test case 3:
		 * The method returns the index of the first occurrence of the argument in this list.
		 */
		@Test
		void testIndexOf3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				assertEquals(1, model.indexOf(note2));
		}
		
		/**
		 * Test case 4:
		 * The method returns the index of the first occurrence of the argument in this list.
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
				assertEquals(2, model.indexOf(note3));
		}
		
		/**
		 * Test case 5:
		 * The method returns the index of the first occurrence of the argument in this list.
		 */
		@Test
		void testIndexOf5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				AbstractNote note4 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				assertEquals(3, model.indexOf(note4));
		}
		
		/**
		 * Test case 6:
		 * The method returns the index of the first occurrence of the argument in this list.
		 */
		@Test
		void testIndexOf6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				AbstractNote note4 = new AbstractNote();
				AbstractNote note5 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				model.addElement(note5);
				assertEquals(4, model.indexOf(note5));
		}
		
		/**
		 * Test case 7:
		 * The method returns the index of the first occurrence of the argument in this list.
		 */
		@Test
		void testIndexOf7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				AbstractNote note4 = new AbstractNote();
				AbstractNote note5 = new AbstractNote();
				AbstractNote note6 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				model.addElement(note5);
				model.addElement(note6);
				assertEquals(5, model.indexOf(note6));
		}
		
		/**
		 * Test case 8:
		 * The method returns the index of the first occurrence of the argument in this list.
		 */
		@Test
		void testIndexOf8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				AbstractNote note4 = new AbstractNote();
				AbstractNote note5 = new AbstractNote();
				AbstractNote note6 = new AbstractNote();
				AbstractNote note7 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				model.addElement(note5);
				model.addElement(note6);
				model.addElement(note7);
				assertEquals(6, model.indexOf(note7));
		}
		
		/**
		 * Test case 9:
		 * The method returns the index of the first occurrence of the argument in this list.
		 */
		@Test
		void testIndexOf9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				AbstractNote note4 = new AbstractNote();
				AbstractNote note5 = new AbstractNote();
				AbstractNote note6 = new AbstractNote();
				AbstractNote note7 = new AbstractNote();
				AbstractNote note8 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				model.addElement(note5);
				model.addElement(note6);
				model.addElement(note7);
				model.addElement(note8);
				assertEquals(7, model.indexOf(note8));
		}
		
		/**
		 * Test case 10:
		 * The method returns the index of the first occurrence of the argument in this list.
		 */
		@Test
		void testIndexOf10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				AbstractNote note4 = new AbstractNote();
				AbstractNote note5 = new AbstractNote();
				AbstractNote note6 = new AbstractNote();
				AbstractNote note7 = new AbstractNote();
				AbstractNote note8 = new