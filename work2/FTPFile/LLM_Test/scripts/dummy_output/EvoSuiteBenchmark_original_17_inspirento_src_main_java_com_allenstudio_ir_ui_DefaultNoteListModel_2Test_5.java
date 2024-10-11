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
		private final DefaultNoteListModel model = new DefaultNoteListModel();
        	
        /**
     * Test method for {@link com.allenstudio.ir.core.plugins.AbstractNote#getComponents()}.
     * @throws AssertionError on invalid input
        */
     @Test
	      public void testGetComponents() {
			AbstractNote currentElement = null;
    		// this ensures that the model won't update its iterator
    		model.elements();
			assertThrows(IllegalStateException.class, ()-> currentElement = model.getElement());
			assertTrue(currentElement.equals(model.getElement()));
			assertTrue(currentElement.isComponent(AbstractNote.class));
	     }
	       
        // Test event listener mechanism.
        class TestNoteListDataEvent extends NoteListDataEvent {
            public TestNoteListDataEvent(AbstractNote ae) {
                super(ae);
            }
        }			
        class TestNoteListDataListener extends NoteListDataListener implements NoteListDataListener {
            private Stack<AbstractNote> stack = null;
            public void stackChanged(AbstractNote[] newArray) {
                if (newArray == null) {
                    return;
                }
                stack = new HashSet(Arrays.asList(newArray));
            }

            private Stack<AbstractNote> getStack() {
                return stack;
            }
        }
        
        // test listener method
        @Test
		public void testListenerMethod() {
			DefaultNoteListModel.TestNoteListDataListener testListener =  new DefaultNoteListModel.TestNoteListDataListener() {
				public void stackChanged(AbstractNote[] newArray) {
					assertTrue(1 == newArray.length);                // a new array of one element
				}
				public void stackChanged(AbstractNote[] newArray) {
					assertTrue(0 == newArray.length);                // a second new array of zero elements
				}
			};
             assertSucceedsNotNull(stack);
             assertSucceeds(stack, Collections.singleton(null));				// empty stack and singleton array

			assertSucceeds(model.getElement(), Collections.singleton(AbstractNote.class));
               // now test to check the listener is called.
            int i = 0;
            List<AbstractNote> list = new LinkedList();
            boolean b = model.setElement(AbstractNote.class, list);
            assertSucceeds(b, list);
            i++;
            list = new LinkedList();
            b = model.setElement(AbstractNote.class, Collections.singleton(AbstractNote.class));
            assertSucceeds(b, list);
            i++;
            list = new LinkedList();
            b = model.setElement(AbstractNote.class, Arrays.asList(list));
            assertSucceeds(b, list);
            i++;
        }        


        @Test
		public void testRemoveElement() {
			final int NUM = 10;
			final List<AbstractNote> list = new ArrayList<>(NUM);
			for (int i = 0; i < NUM; i++) {
				list.add(new AbstractNote("test"));
			}
            DefaultNoteListModel instance = new DefaultNoteListModel();
            assertSucceeds(instance.removeElement(AbstractNote.class, list), new ArrayList<>());
            assertTrue(list.equals(new ArrayList<>()));
        }
}