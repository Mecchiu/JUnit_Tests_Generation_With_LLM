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
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {
		DefaultNoteListModel(AbstractNoteList model, int index, int elementCount) {
			
			// Find the array of children of the model
			HashSet set = new HashSet();
			model.addContainer(set);
			if (!set.contains(new AbstractNoteList.ArrayElement(0, new AbstractNote()))) {
			System.err.println(model.getClass().getName() + ": Set of models not contained. Empty list");
				System.exit(0);
			}
			
			// Create a model to be the array of children
			// the list data event will be forwarded to this model
			AbstractNoteListModel am = newDefaultListModel(model);
			am.addListDataListener(new ListDataListener() {
				@Override
				public void entriesAdded(NoteListDataEvent event) {
					System.out.println("entriesAdded");
				}

				@Override
				public void entriesRemoved(NoteListDataEvent event) {
					System.out.println("entriesRemoved");
				}

				@Override
				public void entriesSet(NoteListDataEvent event) {
					System.out.println("entriesSet");
				}

				@Override
				public void entriesCleared(NoteListDataEvent event) {
					System.out.println("entriesCleared");
				}
			});
			
			// Add one additional element to the array of children
			set.add(new AbstractNoteList.ArrayElement(0, new AbstractNote()));
			
			// Insert the array of children to the model
			model.setArrayElement(newAbstractNoteListModel(set), index, elementCount);
		}
		
		private AbstractNoteListModel newDefaultListModel(AbstractNoteList model) {
			
			AbstractNoteListModel am;
			if (model.getDataItemSize() == 0) {
				model.addContainer(new HashSet());
				am = newDefaultListModel((AbstractNoteList)model.getContainer());
			} else {
				am = new DefaultNoteListModel(model);
				am.startList();
			}
			return am;			
		}
	
		private AbstractNoteListModel newAbstractNoteListModel(HashSet set) {
			
			AbstractNoteListModel am;
			
			// Create a list to replace the model of the array
			am = new AbstractNoteListModel(set);
			am.addListDataListener(new ListDataListener() {
				@Override
				public void entriesAdded(NoteListDataEvent event) {
					System.out.println("entriesAdded");
				}

				@Override
				public void entriesRemoved(NoteListDataEvent event) {
					System.out.println("entriesRemoved");
				}

				@Override
				public void entriesSet(NoteListDataEvent event) {
					System.out.println("entriesSet");
				}

				@Override
				public void entriesCleared(NoteListDataEvent event) {
					System.out.println("entriesCleared");
				}
			});
			
			// Insert the list data element and the array of children
			am.addListDataEvent(new ListDataEvent(am, set));
			am.startList();
			return am;			
		}
		
		@Test
		public void testIndexOf() {
			// Create one additional element
			AbstractNoteList model = new DefaultNoteList(new DefaultNote("The", new AbstractNote()));
			model.addArrayElement(new AbstractNoteList.ArrayElement(0, new AbstractNote()));
			
			// Get index of the array of children for the model
			int index = ((DefaultNoteList) model).getArrayElement(0).indexOf(new DefaultNote("The", new AbstractNote()));
			System.out.println("The 0 entry " + index);
			assertEquals("The 0 entry", index);
						
			// Get index of the next element from the array for the first one
			index = ((DefaultNoteList) model).indexOf(new DefaultNoteList.ArrayElement(0, new AbstractNote()), 1);
			System.out.println("Array[0]: Index " + index);
			assertEquals("Array[0]: Index", 0, index);

			// Get index of the given element in the array
			index = ((DefaultNoteList) model).indexOf(new DefaultNoteList.ArrayElement(0, new DefaultNote("The", new AbstractNote())));
			System.out.println("Index: " + index);
			assertEquals("Index", 12, index);			
		}
		
	}
// End DefaultNoteListModel_5Test.java