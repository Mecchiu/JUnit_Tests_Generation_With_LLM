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
		* Test instance for the {@link DefaultNoteListModel#AbstractNote} method  
		* 
		* @throws java.util.ArithmeticException if the argument is zero
		* @throws org.junit.jupiter.api.Assertions.AssertThrows
		* Default NoteListModel throws an exception if the argument is zero
		* @see DefaultNoteListModel#AbstractNote(int)
		*/
	@Test
	@DependsOnMethod("test_AbstractNoteLists_9")	// TODO remove 2 and remove it from previous test
	public void test_AbstractNoteLists_9() 
	{
		int count = 0;
		ArrayList<AbstractNote> notes = new ArrayList<>();
		AbstractNote note;
		Iterator<AbstractNoteListModel> listIt  = new NoteListModel().get_AbstractNoteLists().iterator();
		while (listIt.hasNext()) {
			note = listIt.next().get_AbstractNote();
			notes.add(note);
			count++;
		}
        notes.remove(notes.size()-1);
		assertEquals("count is wrong", 0, count);
		assertEquals("exception", 0, notes.get(notes.size()-1).getText().length());
		
	}
}