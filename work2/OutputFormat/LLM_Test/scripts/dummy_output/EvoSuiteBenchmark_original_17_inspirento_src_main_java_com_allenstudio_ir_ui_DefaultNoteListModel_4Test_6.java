// DefaultNoteListModel_4Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
*/
class DefaultNoteListModel_4Test {
		
	private DefaultNoteListModel testObj = new DefaultNoteListModel();
	
	/**
	 * Tests {@link DefaultNoteListModel#indexOf(AbstractNote)}.
	 * @testName indexOf
	 * @fieldType Object
	 * @methodTestExpectValidResult Index of the test object to be found.
	 * @exception {Exception} Test failed
	*/
	@org.junit.jupiter.api.Test
	void indexOf_Test() throws Exception {
		assertEquals(-1, testObj.indexOf(new AbstractNote(new Object())));
		assertEquals(1, testObj.indexOf(new AbstractNote("abcd")));
		assertEquals(-1, testObj.indexOf(new AbcIdRef(new Object())));
	}
	

	/**
	 * Tests {@link DefaultNoteListModel#getObjectsCount()}.
	 * @testName getObjectsCount
	 * @fieldType Object
	 * @methodTestExpectValidResult Number of objects.
	 * @exception {Exception} Test failed
	*/
	@org.junit.jupiter.api.Test
	void getObjectsCount_Test() throws Exception {
		assertEquals(3, testObj.getObjectsCount());
	}
	

	/**
	 * Tries a test from the {@link DefaultNoteListModel} with an exception from the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
	 *
	 * @testName indexOf exception
	 * @fieldType AbstractNote
	 * @methodTestExpectError Returns {@link DefaultNoteListModel#indexOf(AbstractNote)} method failed.
	 * @exception {Exception} Test failed
	* @throws Exception Exception raised.
	*/
	@org.junit.jupiter.api.Test
	void indexOfException_Test() throws Exception {
		try {
			testObj.indexOf(new AbstractNote(new Object("abcd")));
			fail("Should have failed because of exception");
		} catch (Exception ex) {
			// Pass
		}
	}
}