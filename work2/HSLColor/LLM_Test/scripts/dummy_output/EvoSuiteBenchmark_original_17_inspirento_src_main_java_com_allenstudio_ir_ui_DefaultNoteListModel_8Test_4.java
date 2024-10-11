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
		
	/**
	 * Test method for
     {@link DefaultNoteListModel#AbstractNoteListModel(AbstractNoteListModel)}.
     <blockquote> Note: AbstractNoteListModel. AbstractNoteListModel() constructor
     must be used </blockquote>
     *
	 * @throws Exception should not happen
	 */
    @Test
    public void testConstructor() throws Exception {
        if (System.getProperty("os.name").contains("MacOS X")) {
            AbstractNote note1 = new DefaultNote(new DefaultNoteEvent(), "test 1", 1, 10);
            AbstractNote note2 = new DefaultNote(new DefaultNoteEvent(), "test 2", 1, 11);
            AbstractNote note3 = new DefaultNote(new DefaultNoteEvent(), "test 3", 1, 12);
            AbstractNote note4 = new DefaultNote(new DefaultNoteEvent(), "test 4", 1, 13);
            AbstractNote note5 = new DefaultNote(new DefaultNoteEvent(), "test 5", 1, 14);
            AbstractNote note6 = new DefaultNote(new DefaultNoteEvent(), "test 6", 1, 15);
            AbstractNote note7 = new DefaultNote(new DefaultNoteEvent(), "test 7", 1, 16);
            DefaultNoteListModel list;
        }
    }

}