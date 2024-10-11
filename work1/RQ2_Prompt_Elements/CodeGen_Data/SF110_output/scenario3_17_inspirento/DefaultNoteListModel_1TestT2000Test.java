// DefaultNoteListModel_1Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#size()} method.
*/
class DefaultNoteListModel_1Test {
private Collection<AbstractNote> allNotesList = getAllNotesList() ;
		private AbstractNote toDelete;
		private int sizeOfAllNotesList = this.allNotesList.size() ;

		/**
		* Returns the number of notes in this list.
		*
		* @return the number of notes in this list
		* @see com.allenstudio.ir.ui.DefaultNoteListModel#size()
		*/
		public int size();
	        //    @Test
        public void testSize()
        {
			assertEquals(1, sizeOfAllNotesList) ;
		}

		/**
		* Checks if <code>n</code> is the last element.
		*
		* @return {@code true} if it is the last, {@code false} if not
		*/
		public boolean isLast();

		/**
		* Checks if a specific note is in this list.
		*
		* @param n the note to check
		* @return {@code true} if n is in this list and {@code false} of not
		*/
		public boolean contains(AbstractNote n);

		/**
		* Checks if a specific note is in this list.
		*
		* @param n the note to check
		* @return {@code true} if n is in this list and {@code false} of not
		*/
		public boolean contains(AbstractNote n, Collection<AbstractNote> allNotesList);

		/**
		* Returns <code>true</code> if any of the notes in the given collection is in this list.
		*
		* @param c the collection of notes to check
		* @return <code>true</code> if any of the notes in the given collection is in this list
		*/
		public boolean contains(Collection<AbstractNote> c) ;
	}
