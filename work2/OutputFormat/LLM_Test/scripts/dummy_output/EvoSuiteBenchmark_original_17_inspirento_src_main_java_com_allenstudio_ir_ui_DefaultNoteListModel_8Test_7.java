// DefaultNoteListModel_8Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#elementAt(int)} method.
*/
class DefaultNoteListModel_8Test {
		@jbe16
	public static void main(String[] args) {
			(new DefaultNoteListModel()).testElementAt(0);
	}

    @Test
    public void testElementAt() {
		System.out.println("testElementAt");

		DefaultNoteListModel model = new DefaultNoteListModel();

		// Basic model
		List items = new ArrayList();
		for (int index = 0; index < 100; index++) {
			items.add(new TestEntity(index % 2 == 0, "key"));
		}
		// Sort
		Collections.sort(items);
		TestEntity a = (TestEntity)items.get(20);
		TestEntity b = (TestEntity)items.get(50);
		TestEntity c = (TestEntity)items.get(40);

		for (int index = 0; index < 30; index++) {
			model.elementAt(index);
		}
		System.out.println("After elementAt");
		assertEquals(2, model.elementAt(0).getIndex());
        assertEquals("key", model.elementAt(0).getKey());
		assertNotNull(model.elementAt(1));
		assertEquals("key", model.elementAt(1).getKey());
	}
}

/**
 * The test array.
 * It contains one test case for the <code>List