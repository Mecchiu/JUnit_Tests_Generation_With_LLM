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

	/**
	* Tests the default method of {@link DefaultNoteListModel}.
	*
	*/
	@Test
    public void test() {
		// Default test implementation of the {@link DefaultNoteListModel} class
		System.out.println("DefaultNoteListModel.size() = " + DefaultNoteListModel.size());
	}
}
