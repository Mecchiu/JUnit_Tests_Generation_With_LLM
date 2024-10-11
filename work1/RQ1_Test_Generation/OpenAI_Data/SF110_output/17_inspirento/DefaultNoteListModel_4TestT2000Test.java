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

		private DefaultNoteListModel model;
		private AbstractNote note1;
		private AbstractNote note2;
		private AbstractNote note3;
		private AbstractNote note4;
		private AbstractNote note5;
		private AbstractNote note6;
		private AbstractNote note7;
		private AbstractNote note8;
		private AbstractNote note9;
		private AbstractNote note10;
		
		public DefaultNoteListModel_4Test() {
				model = new DefaultNoteListModel();
				note1 = new AbstractNote();
				note2 = new AbstractNote();
				note3 = new AbstractNote();
				note4 = new AbstractNote();
				note5 = new AbstractNote();
				note6 = new AbstractNote();
				note7 = new AbstractNote();
				note8 = new AbstractNote();
				note9 = new AbstractNote();
				note10 = new AbstractNote();
		}
		
		@Test
		void testIndexOf_1() {
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				model.addElement(note5);
				model.addElement(note6);
				model.addElement(note7);
				model.addElement(note8);
				model.addElement(note9);
				model.addElement(note10);
				assertEquals(0, model.indexOf(note1));
				assertEquals(1, model.indexOf(note2));
				assertEquals(2, model.indexOf(note3));
				assertEquals(3, model.indexOf(note4));
				assertEquals(4, model.indexOf(note5));
				assertEquals(5, model.indexOf(note6));
				assertEquals(6, model.indexOf(note7));
				assertEquals(7, model.indexOf(note8));
				assertEquals(8, model.indexOf(note9));
				assertEquals(9, model.indexOf(note10));
		}
		
		@Test
		void testIndexOf_2() {
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				model.addElement(note5);
				model.addElement(note6);
				model.addElement(note7);
				model.addElement(note8);
				model.addElement(note9);
				model.addElement(note10);
				assertEquals(0, model.indexOf(note1, 0));
				assertEquals(1, model.indexOf(note2, 0));
				assertEquals(2, model.indexOf(note3, 0));
				assertEquals(3, model.indexOf(note4, 0));
				assertEquals(4, model.indexOf(note5, 0));
				assertEquals(5, model.indexOf(note6, 0));
				assertEquals(6, model.indexOf(note7, 0));
				assertEquals(7, model.indexOf(note8, 0));
				assertEquals(8, model.indexOf(note9, 0));
				assertEquals(9, model.indexOf(note10, 0));
		}
		
		@Test
		void testIndexOf_3() {
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				model.addElement(note5);
				model.addElement(note6);
				model.addElement(note7);
				model.addElement(note8);
				model.addElement(note9);
				model.addElement(note10);
				assertEquals(0, model.indexOf(note1, 1));
				assertEquals(1, model.indexOf(note2, 1));
				assertEquals(2, model.indexOf(note3, 1));
				assertEquals(3, model.indexOf(note4, 1));
				assertEquals(4, model.indexOf(note5, 1));
				assertEquals(5, model.indexOf(note6, 1));
				assertEquals(6, model.indexOf(note7, 1));
				assertEquals(7, model.indexOf(note8, 1));
				assertEquals(8, model.indexOf(note9, 1));
				assertEquals(9, model.indexOf(note10, 1));
		}
		
		@Test
		void testIndexOf_4() {
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				model.addElement(note5);
				model.addElement(note6);
				model.addElement(note7);
				model.addElement(note8);
				model.addElement(note9);
				model.addElement(note10);
				assertEquals(0, model.indexOf(note1, 2));
				assertEquals(1, model.indexOf(note2, 2));
				assertEquals(2, model.indexOf(note3, 2));
				assertEquals(3, model.indexOf(note4, 2));
				assertEquals(4, model.indexOf(note5, 2));
				assertEquals(5, model.indexOf(note6, 2));
				assertEquals(6, model.indexOf(note7, 2));
				assertEquals(7, model.indexOf(note8, 2));
				assertEquals(8, model.indexOf(note9, 2));
				assertEquals(9, model.indexOf(note10, 2));
		}
		
		@Test
		void testIndexOf_5() {
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				model.addElement(note4);
				model.addElement(note5);
				model.addElement(note6);
				model.addElement(note7);
				model.addElement(note8);
				model.addElement(note9);
				model.addElement(note10);
				assertEquals(0, model.indexOf(note1, 3));
				assertEquals(1, model.indexOf(note2, 3));
				assertEquals(2, model.indexOf(note3, 3));
				assertEquals(3, model.indexOf(note4, 3));
				assertEquals(4, model.indexOf(note5, 3));
				assertEquals(5, model.indexOf(note6, 3));
				assertEquals(6, model.indexOf(note7, 3));
				assertEquals(7, model.indexOf(note8,