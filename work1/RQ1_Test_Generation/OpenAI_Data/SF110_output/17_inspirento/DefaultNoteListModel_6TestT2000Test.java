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
		void testCase1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addNoteListDataListener(new NoteListDataListener() {
						public void contentChanged(NoteListDataEvent e) {
						}
						public void itemAdded(NoteListDataEvent e) {
						}
						public void itemRemoved(NoteListDataEvent e) {
						}
				});
				AbstractNote note = new AbstractNote() {
						public String getName() {
								return "test";
						}
						public String getDescription() {
								return "test";
						}
						public String getVersion() {
								return "test";
						}
						public String getAuthor() {
								return "test";
						}
						public String getDate() {
								return "test";
						}
						public String getIcon() {
								return "test";
						}
						public String getContent() {
								return "test";
						}
						public void setContent(String content) {
						}
				};
				model.addElement(note);
				assertEquals(-1, model.lastIndexOf(new AbstractNote() {
						public String getName() {
								return "test";
						}
						public String getDescription() {
								return "test";
						}
						public String getVersion() {
								return "test";
						}
						public String getAuthor() {
								return "test";
						}
						public String getDate() {
								return "test";
						}
						public String getIcon() {
								return "test";
						}
						public String getContent() {
								return "test";
						}
						public void setContent(String content) {
						}
				}));
		}
		
		/**
		* Test case 2:
		* The element is in the list.
		*/
		@Test
		void testCase2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addNoteListDataListener(new NoteListDataListener() {
						public void contentChanged(NoteListDataEvent e) {
						}
						public void itemAdded(NoteListDataEvent e) {
						}
						public void itemRemoved(NoteListDataEvent e) {
						}
				});
				AbstractNote note = new AbstractNote() {
						public String getName() {
								return "test";
						}
						public String getDescription() {
								return "test";
						}
						public String getVersion() {
								return "test";
						}
						public String getAuthor() {
								return "test";
						}
						public String getDate() {
								return "test";
						}
						public String getIcon() {
								return "test";
						}
						public String getContent() {
								return "test";
						}
						public void setContent(String content) {
						}
				};
				model.addElement(note);
				assertEquals(0, model.lastIndexOf(note));
		}
		
		/**
		* Test case 3:
		* The element is in the list.
		*/
		@Test
		void testCase3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addNoteListDataListener(new NoteListDataListener() {
						public void contentChanged(NoteListDataEvent e) {
						}
						public void itemAdded(NoteListDataEvent e) {
						}
						public void itemRemoved(NoteListDataEvent e) {
						}
				});
				AbstractNote note = new AbstractNote() {
						public String getName() {
								return "test";
						}
						public String getDescription() {
								return "test";
						}
						public String getVersion() {
								return "test";
						}
						public String getAuthor() {
								return "test";
						}
						public String getDate() {
								return "test";
						}
						public String getIcon() {
								return "test";
						}
						public String getContent() {
								return "test";
						}
						public void setContent(String content) {
						}
				};
				model.addElement(note);
				model.addElement(note);
				assertEquals(1, model.lastIndexOf(note));
		}
		
		/**
		* Test case 4:
		* The element is in the list.
		*/
		@Test
		void testCase4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				model.addNoteListDataListener(new NoteListDataListener() {
						public void contentChanged(NoteListDataEvent e) {
						}
						public void itemAdded(NoteListDataEvent e) {
						}
						public void itemRemoved(NoteListDataEvent e) {
						}
				});
				AbstractNote note = new AbstractNote() {
						public String getName() {
								return "test";
						}
						public String getDescription() {
								return "test";
						}
						public String getVersion() {