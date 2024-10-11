// DefaultNoteListModel_5Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModel_5Test {
		
	final List<String> elements = new ArrayList<>(); 
 
	/** 
	 * Method: indexOf(AbstractNote elem, int index) 
	 */
	@Test
	public void testMethodIndexOf() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		
		int index = model.indexOf(elements.get(4));
		assertNotNull( index );
		assertEquals( 7,  index);
		
	}
	
	/** 
	 * Method: indexOf(AbstractNote elem) 
	 */
	@Test
	public void testMethodIndexOf_noElement() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		
		int index = model.indexOf(elements.get(0));
		assertNull( index);
	}
	
 	/** 
	 * Method: indexOf()  
	 */
	@Test
	public void testMethodIndexOf_nullString() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		
		int index = model.indexOf(null);
		assertNotNull( index);
		assertEquals( 6,  index);
	}
}
// DefaultNoteListModel_5Test.java