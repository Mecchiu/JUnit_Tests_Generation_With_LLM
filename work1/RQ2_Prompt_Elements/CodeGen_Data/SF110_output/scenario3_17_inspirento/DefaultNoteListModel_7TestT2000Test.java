// DefaultNoteListModel_7Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_7Test {

    // This test class is executed for the sole purpose of test purposes;
    // see {@link DefaultNoteListModel_7Test@DefaultNoteListModel()}
	@Test
    public void DefaultNoteListModel_7Test() {
	    List<String> list = new ArrayList<>();
		// create an empty entry for each object
		for (int i = 0; i < 10; ++i) {
			list.addAll(new ArrayList<>());
		}

        // create a new empty entry for each object
        String firstObject = null;
        int index = 0;
        for (AbstractNote object : list) {
            assertNotNull(firstObject);
            try {
                assertEquals(index, lastIndexOf(firstObject, index));
            }
            catch (AssertionError error) {
                assertTrue("not found", false);
            }
            firstObject = object.getText();
            index += 1;
        }
	}
}
