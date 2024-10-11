// DefaultNoteListModel_9Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#firstElement()} method.
*/
class DefaultNoteListModel_9Test {
		
	/**
	 * Test <code>firstElement</code> method of <code>DefaultNoteListModel</code>
	 * with no data. (Exceptions are expected to be handled)
	 *
	 * @throws Exception if the test fails.
	 */
	@Test
	public void testFirstElement_NoData() throws Exception {
		assertNotNull("The firstElement() method of the model must always return non-null." +
						" If this is done, test will fail.",
						() -> firstElement((AbstractNote)null));
	}
	
	/**
	 * Test <code>firstElement</code> method of <code>DefaultNoteListModel</code>
	 * with valid data.
	 *
	 * @throws Exception if the test fails.
	 */
	@Test
	public void testFirstElement() throws Exception {
		assertNotNull("The firstElement() method of the model must always return non-null.",
							lastElement());
    
		lastElement().setId(1);
		lastElement().setTitle(2.2);
		lastElement().setNote(3.3);
	}
			
    /**
     * Returns the first component of this list. Throws a
     * <code>NoSuchElementException</code> if this vector has no components.
     *
     * @return the first component of this list
     * @see java.util.Vector#firstElement()
     */
    protected AbstractNote lastElement();	
}