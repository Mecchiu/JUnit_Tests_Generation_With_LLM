// DefaultNoteListModel_2Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elements()} method.
*/
class DefaultNoteListModel_2Test {
		/**
		* DefaultNoteListModel.elements is called with a set of
		* <code>Vector</code> members and returns an enumeration of
		* <code>AbstractNote</code> members. It has a number of
		* additional members which are not included in the test.
		*/
        @Test
		public void DefaultNoteListModel_elementsShouldReturnElementsOfVector() {
			Vector<AbstractNote> notes = null;
			AbstractNote note_abstract_1 = new DefaultAbstractNote();
			notes = new Vector<>();
			notes.add(note_abstract_1);

            final NoteListModel newEnv = new DefaultNoteListModel();

			String name = "C.R.T.A.";
			int number = 0;

			AbstractNote abstractNote_new1 = new DefaultAbstractNote();
			notes.add(abstractNote_new1);
			assertEquals("Elements of a vector are different", notes.size(),
					1);
            notes.get(0).setName(name);
			System.out.println("Created a vector: " + notes);

			name = "C.R.T.B.";
			int number_new1 = 1;
			notes.add(new DefaultAbstractNote());
			System.out.println("Created a vector: " + notes);

			Iterator i = notes.iterator();
			while (i.hasNext()) {
				System.out.println("i.next(): " + ((Note) i.next()).getName());
			}
			newEnv.clear();
			number++;
			System.out.println("Initial size: " + notes);
			System.out.println("Initial number: " + number);
			Set<Tuple> tupleSet = new TreeSet<>();
			tupleSet.add(new Tuple(note_abstract_1.getId().intValue(), note_abstract_1.getName().toLowerCase()));
			tupleSet.add(new Tuple(note_abstract_1.getId().intValue(), note_abstract_1.getName().toLowerCase()));
			tupleSet.add(new Tuple(note_abstract_1.getId().intValue(), note_abstract_1.getName().toLowerCase()));
			tupleSet.add(new Tuple(number - 1, "Not found"));
			newEnv.addElements(tupleSet);
			System.out.println("Elements size: " + newEnv);
			System.out.println("Elements number: " + newEnv);
			
			Collection<AbstractNote> extracted = newEnv.extractNotes();
			System.out.println("The number of extracted notes: " + extracted.size());
			for (AbstractNote n : extracted) {
				n.setName(name);
			}
			int number_extracted = extracted.size();
			System.out.println("The total number of notes: " + extracted.size());
			assertEquals("The entries in the extracted collection does not match",
			number, extracted.size());
			assertEquals("The actual elements do not match", number_extracted, extracted.size());
			if(extracted!= null) {
				while(extracted.iterator().hasNext()) {
				    AbstractNote e = extracted.iterator().next();
				    String message = "Extracted tuple: ("
				            + e.getNotes().iterator().next().getName()
				            + ", " + e.getNotes().iterator().next().getName()
				            + ", " + e.getNumber()
				            + ") and the expected tuple (C.R.T.A.)";
				    assertEquals("A tuple mismatch is not expected", e, tuple(new Tuple(0, "C.R.T.A.")));
				}
			}

		}

		private enum Tuple {
			CUSTOM(0),
			ABSTRACT(2),
			;
			public int index;
			public Tuple(int index) {
				this.index = index;
			}
			public Tuple(int index, String name) {
				this.index = index;
			}
			public boolean equals(Object o) {
				return this.index == ((Tuple) o).index;
			}
			public String toString() {
				return String.format("tuple(%d, %s)", index, this.name);
			}
		}

		/**
		 * A class to hold the given
		 * <code>Enumeration</code> members and the
		 * <code>tuple</code> representing them.
		 */
	private static class Tuple {
		public AbstractNote abstractNote;
		public Tuple(int a, String b) {
			abstractNote = new DefaultAbstractNote();
			abstractNote.setId(a);
			abstractNote.setName(b);
		}
		public Tuple(Enumeration<AbstractNote> abEnum, Tuple t) {
			assertTrue("Tuple not correctly initialized", abEnum.hasMoreElements());
			abstractNote = abEnum.nextElement();
			if(t!= null) {
				assertEquals("The abstractNote is not same as expected", t.abstractNote, abstractNote);
			}
		}
		public int index;
		public String name;
		public Tuple(int index, String name, Tuple t) {
			this.index = index;
			this.name = name;
		}
		public boolean equals(Object t) {
			if(!(t instanceof Tuple)) {
				return false;
			}
			return index == ((Tuple) t).index;
		}
		public String stringValue() {
			return name;
		}
	}


}