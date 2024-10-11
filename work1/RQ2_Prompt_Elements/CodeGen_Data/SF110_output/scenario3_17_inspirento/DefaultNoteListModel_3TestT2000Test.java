// DefaultNoteListModel_3Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
*/
class DefaultNoteListModel_3Test {
private final DefaultNoteListModel listModel_3 = new DefaultNoteListModel();
		
		/**
		* The test method for {@link DefaultNoteListModel#contains(AbstractNote)}.
		*/
		@Test
		public void contains() {
			// given
			final AbstractNote element_3 = new TestElement_1();
			final Collection<AbstractNote> allNotes_2 = Collections.emptySet()
				.asList();
			final ListView_1 view_1 = new List_1(allNotes_2);
			assertTrue("contains for empty collection",
					listModel_3.contains(element_3));
			
//         // when
//         assertTrue("getNumberOfElements", listModel_3.getNumberOfElements()==1);
//         for (final Iterator<AbstractNote> it = listModel_3.cloneElementIterator(); it.hasNext(); ) {
//         // then
//         assertTrue("element is found", listModel.get()!=null);
//         assertTrue("element is not an element", listModel.contains(element_3)
//                 && listModel.contains(it.next()));
//         }
		}
		
        /**
        * Test method for {@link DefaultNoteListModel#getNumberOfElements()}.
        * 
        * Method testGetNumberOfElements() has return value set to 1.
        */
        @Test
        public void getNumberOfElements() {
            // arrange
            final DefaultListView<AbstractNote> listView_1;
            try {
                listView_1 = new DefaultListView<AbstractNote>(new DefaultTableModel(5));
                listModel_3.onListViewAdd(listView_1);
                listView_1.setModel(new DefaultTableModel(5)); // set empty list at the end

            } catch (final IndexOutOfBoundsException ex) {
                // expected...
            }

            // then
            assertEquals("getNumberOfElements", 1, listModel_3.getNumberOfElements());
        }

//        private final class TestElement_1 implements AbstractNote {
//            int index;
//        }
//
//        private final class List_1 implements ListModel<AbstractNote> {
//            private final List<AbstractNote> allNotes_2;
//
//            public List_1(final List<AbstractNote> allNotes_2) {
//                this.allNotes_2 = allNotes_2;
//            }
//            
//            public List<AbstractNote> get() {
//                return this.allNotes_2;
//            }
//        }
}