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
		
		AbstractNote removed = list.remove(0);
		assertEquals(9, list.getSize());
		assertEquals(removed, list.get(0));
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
		
		AbstractNote removed = list.remove(9);
		assertEquals(9, list.getSize());
		assertEquals(removed, list.get(8));
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
		
		AbstractNote removed = list.remove(5);
		assertEquals(9, list.getSize());
		assertEquals(removed, list.get(4));
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
		assertEquals(removed, list.get(3));
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
		
		AbstractNote removed = list.remove(3);
		assertEquals(9, list.getSize());
		assertEquals(removed, list.get(2));
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
		
		AbstractNote removed = list.remove(2);
		assertEquals(9, list.getSize());
		assertEquals(removed, list.get(1));
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
		
		AbstractNote removed = list.remove(1);
		assertEquals(9, list.getSize());
		assertEquals(removed, list.get(0));
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
		list.add(2, new Abstract