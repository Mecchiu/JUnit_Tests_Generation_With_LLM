// DefaultNoteListModel_0Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModel_0Test {

	/**
	 * Unit test for {@link DefaultNoteListModel#capacity()} method.
	 * Initially implemented unit test case.
	 *
	 * @throws Exception 
	 */
	@Test
	public void capacityTest() throws Exception {
		NoteListModel delegate = buildDelegate();
		delegate.addData(new AbstractNote("Note1"));
		delegate.addData(new Note("Note2"));
		Integer result = delegate.capacity();
		assertEquals(delegate.count() + 1, result);
	}
	
	private static DefaultNoteListModel buildDelegate() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = buildDelegate1();
		return model;
	}
	
	
	private static DefaultNoteListModel buildDelegate1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = buildNoteListModel();
		return model;
	}
	
	
	private static DefaultNoteListModel buildNoteListModel() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = buildDelegate2();
		return model;
	}
	
	private static DefaultNoteListModel buildDelegate2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = buildNoteListModel2();
		return model;
	}
	
	private static DefaultNoteListModel buildNoteListModel2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.delegate = buildDelegate3();
		return model;
	}
	
}