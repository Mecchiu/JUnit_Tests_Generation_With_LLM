// DefaultNoteListModel_6Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_6Test {
		
    /**
     * Tests the behaviour of lastIndexOf
     * if the pattern returned by <code>Pattern.matches(String, String)</code>
     * is true, then the method returns the index of the last occurrence of an element,
     * including the occurrence in the opposite case.
     *
     * @see Pattern#patternSyntax(String)
     * @see Pattern
     */
	@Test  // test 1
	void lastIndexOfPatternString();
	
    /**
     * Tests the behaviour of lastIndexOf when the pattern returned by
     * <code>Pattern.matches(String, String)</code> is false,
     * then the method returns the index of the last occurrence of an element,
     * including the occurrence in the opposite case.
     *
     * @see Pattern#patternNotSyntax(String)
     * @see Pattern
     */
	@Test  // test 2
	void lastIndexOfPatternNotString();
}
// DefaultNoteListModel_6Test_2.java