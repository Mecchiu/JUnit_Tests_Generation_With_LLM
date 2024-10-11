// DefaultNoteListModel_0Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_0Test {
		@Test
		public void capacity() {
			List<AbstractNote> l1 = new ArrayList<>();
			l1.add(new DefaultNote(2, "test", "This is a test", "test"));
			l1.add(new DefaultNote(1, "test", "This is a test.", "Test."));
			l1.add(new DefaultNote(3, "test", "This is a test.", "Test"));

			final NumberVector v = new DefaultNumberVector(Collection.EMPTY_SET);
			new DefaultNoteListModel(v).addNoteListener(new NoteListDataListener (){
				@Override
				public void notify(NoteListDataEvent ev) {
						v.addElement(ev.getElement());
				}
			},l1);
			// add 3 NoteLists
			for(int i=4;i<l1.size();i += 10){
				ArrayList<AbstractNote> a = new ArrayList<>(l1);
				a.add(new DefaultNote (i, "test", "This is a test", "test"));
				final DefaultNoteListModel ln = new DefaultNoteListModel(a);
				v.addElement(i);
				new DefaultNoteListModel(v).addNoteListener(new NoteListDataListener (){
					@Override
					public void notify(NoteListDataEvent ev) {
						v.addElement(ev.getElement());
					}
				},ln);
			}
			assertEquals(v.getSize().intValue(), v.getElements().size());
			// remove 3 NoteLists
			ArrayList<AbstractNote> a = new ArrayList<>(l1);
			a.add(new DefaultNote(2, "test", "This is a test.", "test"));
			v.removeElement(ln);
			assertEquals(v.getSize().intValue(), v.getElements().size());
			assertFalse("Empty should not be present", a.isEmpty());
		}
}