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
		* Unit test cases for the static lastElement() method.
		*/
/*
	public static final class LastNoteListModelUnitTestCase {
			private DefaultNoteListModel m_model = new DefaultNoteListModel();


		/**
		* Get the default note from the model.
		* @return the default note
		*/

		public AbstractNote lastElement() {
			return m_model.lastElement();
		}

		/**
		* Override the lastElement method.
		* @param lastElement The last element
		*/
		public void overrideLastElement(AbstractNote lastElement) {
			m_model.lastElement(lastElement);
		}
	}
*/

	@Test
    public void testLastElement() {
		assertNotNull("The DefaultNoteListModel.lastElement() must return  non null", m_delegate.lastElement());
		{
			assertNull("The DefaultNoteListModel.get() must return  null", m_delegate.get());
			{
				assertNull("The DefaultNoteListModel.clear() must return  null", m_delegate.clear());
				m_model.clear();
				assertNull("The DefaultNoteListModel.get() must return  null", m_delegate.get());
				List<AbstractNote> list = new LinkedList<AbstractNote>();
				List<AbstractNote> result = m_delegate.get();
				List<AbstractNote> list2 = result.toArray(new AbstractNote[]{});
				assertNotNull("The ArrayList returned from get should not be null", list2);
				assertEquals("get length not equal to get size", list.size(), list2.size());
			}
        assertFalse("Non-empty list is not empty", m_delegate.get().isEmpty());
		}


		m_delegate.clear();
        assertFalse("Empty list is empty", m_delegate.get().isEmpty());

        assertNotNull( "The DefaultNoteListModel.get() must return  non null", m_delegate.get() );



	}

	@Test
    public void testCopy() {
		List<AbstractNote> src = new LinkedList<AbstractNote>();
		List<AbstractNote> dst = m_delegate.copy(src, "dest");
		assertEquals("the copy should be a new object", m_delegate.get().size(), dst.size());

        assertEquals("the list does not have the same elements as the original", src.size(), dst.size());
    }

}