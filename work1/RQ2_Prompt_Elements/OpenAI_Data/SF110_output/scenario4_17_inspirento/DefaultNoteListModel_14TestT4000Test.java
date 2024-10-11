// DefaultNoteListModel_14Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_14Test {

	/**
	* Test case 1:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_1() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(5);
		assertEquals(9, list.getSize());
		assertEquals(5, list.indexOf(removed));
	}
	
	/**
	* Test case 2:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_2() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(0);
		assertEquals(9, list.getSize());
		assertEquals(0, list.indexOf(removed));
	}
	
	/**
	* Test case 3:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_3() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(9);
		assertEquals(9, list.getSize());
		assertEquals(9, list.indexOf(removed));
	}
	
	/**
	* Test case 4:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_4() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(4);
		assertEquals(9, list.getSize());
		assertEquals(4, list.indexOf(removed));
	}
	
	/**
	* Test case 5:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_5() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(8);
		assertEquals(9, list.getSize());
		assertEquals(8, list.indexOf(removed));
	}
	
	/**
	* Test case 6:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_6() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(7);
		assertEquals(9, list.getSize());
		assertEquals(7, list.indexOf(removed));
	}
	
	/**
	* Test case 7:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_7() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(6);
		assertEquals(9, list.getSize());
		assertEquals(6, list.indexOf(removed));
	}
	
	/**
	* Test case 8:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_8() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(1);
		assertEquals(9, list.getSize());
		assertEquals(1, list.indexOf(removed));
	}
	
	/**
	* Test case 9:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_9() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(2);
		assertEquals(9, list.getSize());
		assertEquals(2, list.indexOf(removed));
	}
	
	/**
	* Test case 10:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_10() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(3);
		assertEquals(9, list.getSize());
		assertEquals(3, list.indexOf(removed));
	}
}

// DefaultNoteListModel_15Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModel_15Test {
		
	/**
	* Test case 1:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_1() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(5);
		assertEquals(9, list.getSize());
		assertEquals(5, list.indexOf(removed));
	}
	
	/**
	* Test case 2:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_2() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(0);
		assertEquals(9, list.getSize());
		assertEquals(0, list.indexOf(removed));
	}
	
	/**
	* Test case 3:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_3() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(9);
		assertEquals(9, list.getSize());
		assertEquals(9, list.indexOf(removed));
	}
	
	/**
	* Test case 4:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
	@Test
	void testRemove_4() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		list.add(0, new AbstractNote());
		list.add(1, new AbstractNote());
		list.add(2, new AbstractNote());
		list.add(3, new AbstractNote());
		list.add(4, new AbstractNote());
		list.add(5, new AbstractNote());
		list.add(6, new AbstractNote());
		list.add(7, new AbstractNote());
		list.add(8, new AbstractNote());
		list.add(9, new AbstractNote());
		
		AbstractNote removed = list.remove(4);
		assertEquals(9, list.getSize());
		assertEquals(4, list.indexOf(removed));
	}
	
	/**
	* Test case 5:
	* The element at the specified position in this list is removed.
	* The element that was removed from the list is returned.
	*
	* @see DefaultNoteListModel#remove(int)
	*/
