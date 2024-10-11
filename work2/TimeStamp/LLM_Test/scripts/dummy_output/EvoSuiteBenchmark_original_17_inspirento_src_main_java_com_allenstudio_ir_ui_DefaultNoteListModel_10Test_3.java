// DefaultNoteListModel_10Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastElement()} method.
*/
class DefaultNoteListModel_10Test {
		
	/**
	 * Default Note-List Model test is
	 * <ul>
	 * <li>{@link DefaultNoteListModel#lastElement()}: {@link AbstractNote} instance returns '"Last element"'.
	 * <li>{@link DefaultNoteListModel#nextElement()}: {@link AbstractNote} throws
	 * <code>NoSuchElementException</code>
	 * <li>AbstractNote listeners are created correctly
	 * </ul>
	 *
	 * @throws Exception if there is anything wrong with the test environment
	*/
	@Test
    public void defaultNoteListModelLastElement_Test() throws Exception {
        AbstractNote lastElement = DefaultNoteListModel.lastElement();
        assertEquals(
                "AbstractNote expected to return '"
                + lastElement
                + "'."
               , lastElement
        		);

        NoteListModel.destroyListeners(lastElement);
        lastElement = null;
        AbstractNote empty = DefaultNoteListModel.nextElement();
        assertNull("AbstractNote expected to return null."
                   , lastElement);

        NoteListModel.destroyListeners(empty);
        empty = null;
        lastElement = null;
        AbstractNote empty2 = DefaultNoteListModel.nextElement();
        assertNull("AbstractNote expected to return null."
                   , lastElement);
    }

}