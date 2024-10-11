// DefaultNoteListModel_13Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#get(int)} method.
*/
class DefaultNoteListModel_13Test {
		private DefaultNoteListModel model = new DefaultNoteListModel();
		
		@Test
		public  void testGetAt() {
			for (int i = 0; i < model.size(); i++) {
							assertTrue(model.indexOf(get(i))!= -1);
				}
		};
		
		@Test
		public  void testRemoveAt() {
			assertTrue(model.remove(get(0)));
			assertFalse(model.remove(get(model.size() - 1)));
			assertTrue(model.remove(get(model.size() - 1)));
			assertNonOptional(model.remove(get(model.size() - 1)));
			assertTrue(model.remove(get(model.size() - 1)));
		};
		
        @Test
		public  void testRemoveAt2() {
			assertTrue(model.removeAt(model.size() - 1));
			assertTrue(model.removeAt(model.size() - 1));
			assertTrue(model.removeAt(model.size()));
		};

		private void assertNonOptional(Object o) {
			assertFalse(o instanceof Optional);
		};

        @Test
		public  void testRemoveAll() {
			ArrayList<Object> removeList = model.removeAll();
			ArrayList<Object> expectedRemoved = new ArrayList<>();
			for(int i = 0; i < removeList.size(); i++) {
				assertTrue(removeList.remove(i));
				expectedRemoved.add(removeList.get(i));
			}
			assertEquals(removeList.size(), expectedRemoved.size());
			assertEquals(get(0), removeList.get(0));
			assertEquals(get(0), expectedRemoved.get(0));
		};

        @Test
		public  void testSetAll() {
			ArrayList<Object> removeList = new ArrayList<>();
			ArrayList<Object> expectedRemoved = new ArrayList<>();
			for(int i = 0; i < model.size(); i++) {
				AbstractNote an = get(i);
				assertTrue(an == model.removeAt(i));
				an = model.get(i);
				assertTrue(an!= model.removeAt(i));
				an = model.get(i).toUnmodifiable();
				assertTrue(an instanceof AbstractNote);
				assertNotSame(an, model.get(i));
				expectedRemoved.add(an);
				assertNotSame(an, model.get(i));
				assertTrue(an.toString().contains("@" + model.indexOf(get(i))));
			}
			for(int i = model.size(); i < model.size(); i++) {
				assertTrue(removeList.remove(i));
				expectedRemoved.add(removeList.get(i));
			}
			assertEquals(expectedRemoved, Collections.list(removeList));
			assertEquals(get(model.size()), Collections.list(removeList));
		};
		
        @Test
		public  void testSetAll2() {
			ArrayList<AbstractNote> removeList = new ArrayList<>();
			ArrayList<AbstractNote> expectedRemoved2 = new ArrayList<>();
			int count = 10;
			for(int i = 0; i < count; i++) {
				AbstractNote an = get(i);
				assertTrue(an == model.removeAt(i));
				an = Model.createAbstractNote(null, an.getData());
				expectedRemoved2.add(an);
				assertTrue(an.equals(removeList.get(i)));
			}
			for(int i = 1; i < model.size(); i++) {
				assertTrue(removeList.remove(i));
				expectedRemoved2.add(removeList.get(i));
			}
			assertEquals(expectedRemoved2, Collections.list(removeList));
			assertEquals(get(model.size() - 1), Collections.list(removeList));
			assertEquals(removeList.size(), 0);
		};

}