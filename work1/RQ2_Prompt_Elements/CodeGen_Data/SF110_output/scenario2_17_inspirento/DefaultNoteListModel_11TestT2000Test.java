// DefaultNoteListModel_11Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModel_11Test {
// NoteListModel.java
		@Test
		public void testRemoveElement() {
                DefaultNoteListModel m = new DefaultNoteListModel();
                // Test removes the element with no reason for failure
                assertNull(m.removeElement(null));
                assertNull(m.removeElement(new Object()));
                assertNull(m.removeElement(new Object()));
                // Test removes the first occurrence of an element
                Object o = new Object();
                boolean b = m.removeElement(o);
                if (b) assertTrue(b); // this test fails when called with o = null;
        }
		// NoteListDataModel.java
        @Test
        public void testAddingNewItemsToTheList() {
                // Test notifies listeners of changes
                DefaultNoteListModel m = new DefaultNoteListModel();
                m.addListDataListener(new NoteListDataListener() {
                    public void onDataChanged(NoteListDataEvent evt) {
                        assertNotNull(evt.getOldData());
                        assertNotNull(evt.getOldData().getEventType());
                        assertNotNull(evt.getNewData());
                        assertNotNull(evt.getNewData().getEventType());
                        // assertNotNull("data changed event is null");
						assertTrue(m.removeElement(new Object()));
						System.out.println("No longer present");
                    }
                });
                // test new value
                Object[] o = new Object[] {1,2,3};
                Object o1 = new  O(o);
                boolean b = m.removeElement(o);
                // assertTrue(!b);
                boolean b1 = true;
                // test removing
                assertFalse(b);
                assertFalse(b1);
                assertTrue(m.removeElement(o1));
                // notifies list changed, and notifies list added as new element
                m.fireItemAdded(m, new ArrayList());
				m.fireListDataChanged(m);
				MVNLogging.LOGGER.debug(m.size());
                assertFalse(b1);
        }

        private void assertTrue(boolean val) {
                if (val == false)
                        throw new AssertionError("failed with: " + val);
        }

        private void assertArrayEquals(Object[] a, Object[] b) {
                assertEquals(a.length, b.length);
                for (int i = 0; i < a.length; i++) {
                        assertEquals(a[i], b[i]);
                }
        }

        static class O {
                Object value;
        }

        // ListDataModel.java
        @Test
        public void testListData() {
                DefaultNoteListModel m = new DefaultNoteListModel();
                m.addListDataListener(new NoteListDataListener() {
                        public void onDataChanged(NoteListDataEvent evt) {
                                Object[] list = evt.getOldData().getOldListData();
                                int i = evt.getKey();
                                assertArrayEquals(evt.getOldData().getOldListData(), list);
                                assertArrayEquals(list, evt.getModifications().getOldListData());
                                assertArrayEquals(list, evt.getNewListData());
                        }
                });
                assertNull(m.removeElement(new Object()));
                assertNull(m.removeElement(new Object()));
                List list = new ArrayList();
                list.add(new Object());
                list.add(new Object());
                assertTrue(m.removeElement(list.get(1)));
                assertTrue(m.removeElement(new Object()));
                m.clearListData();
        }

        // NoteListModelTest_test.java
        @Test
        public void testListenerListeners() {
                DefaultNoteListModel m = new DefaultNoteListModel();
                final NoteListModelListener l = new NoteListModelListener() {
                        public void onDataRemoved(NoteListModelEvent evt) {
                                // m.removeListDataListener(l);
                                l.onDataRemoved(new NoteListModelEvent(evt));
                        }
                };
                m.addListDataListener(l);
                assertEquals(1, m.getListDataListenerCount());

                assertNotNull(l);
                assertSame(m, l.getListModel());
        }

}