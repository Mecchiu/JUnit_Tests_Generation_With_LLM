// DefaultNoteListModelTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModelTest {

	/**
	 * Test case 1:
	 * Test if the capacity of the list is 0 when the list is empty.
	 */
	@Test
	void testCapacity1() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		assertEquals(0, list.capacity());
	}
	
	/**
	 * Test case 2:
	 * Test if the capacity of the list is 10 when the list contains 10 elements.
	 */
	@Test
	void testCapacity2() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 10; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(10, list.capacity());
	}
	
	/**
	 * Test case 3:
	 * Test if the capacity of the list is 20 when the list contains 20 elements.
	 */
	@Test
	void testCapacity3() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 20; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(20, list.capacity());
	}
	
	/**
	 * Test case 4:
	 * Test if the capacity of the list is 30 when the list contains 30 elements.
	 */
	@Test
	void testCapacity4() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 30; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(30, list.capacity());
	}
	
	/**
	 * Test case 5:
	 * Test if the capacity of the list is 40 when the list contains 40 elements.
	 */
	@Test
	void testCapacity5() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 40; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(40, list.capacity());
	}
	
	/**
	 * Test case 6:
	 * Test if the capacity of the list is 50 when the list contains 50 elements.
	 */
	@Test
	void testCapacity6() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 50; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(50, list.capacity());
	}
	
	/**
	 * Test case 7:
	 * Test if the capacity of the list is 60 when the list contains 60 elements.
	 */
	@Test
	void testCapacity7() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 60; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(60, list.capacity());
	}
	
	/**
	 * Test case 8:
	 * Test if the capacity of the list is 70 when the list contains 70 elements.
	 */
	@Test
	void testCapacity8() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 70; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(70, list.capacity());
	}
	
	/**
	 * Test case 9:
	 * Test if the capacity of the list is 80 when the list contains 80 elements.
	 */
	@Test
	void testCapacity9() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 80; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(80, list.capacity());
	}
	
	/**
	 * Test case 10:
	 * Test if the capacity of the list is 90 when the list contains 90 elements.
	 */
	@Test
	void testCapacity10() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 90; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(90, list.capacity());
	}
}

// DefaultNoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Default implementation of <code>NoteListModel</code>
 *
 * @author Allen Chue
 */
public class DefaultNoteListModel implements NoteListModel {

    /**
     * Returns the current capacity of this list.
     *
     * @return the current capacity
     * @see Vector#capacity()
     */
    public int capacity() {
        return notes.capacity();
    }
}

// DefaultNoteListModelTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains ten unit test cases for the {@link DefaultNoteListModel#capacity()} method.
*/
class DefaultNoteListModelTest {
		
	/**
	 * Test case 1:
	 * Test if the capacity of the list is 0 when the list is empty.
	 */
	@Test
	void testCapacity1() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		assertEquals(0, list.capacity());
	}
	
	/**
	 * Test case 2:
	 * Test if the capacity of the list is 10 when the list contains 10 elements.
	 */
	@Test
	void testCapacity2() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 10; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(10, list.capacity());
	}
	
	/**
	 * Test case 3:
	 * Test if the capacity of the list is 20 when the list contains 20 elements.
	 */
	@Test
	void testCapacity3() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 20; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(20, list.capacity());
	}
	
	/**
	 * Test case 4:
	 * Test if the capacity of the list is 30 when the list contains 30 elements.
	 */
	@Test
	void testCapacity4() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 30; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(30, list.capacity());
	}
	
	/**
	 * Test case 5:
	 * Test if the capacity of the list is 40 when the list contains 40 elements.
	 */
	@Test
	void testCapacity5() {
		DefaultNoteListModel list = new DefaultNoteListModel();
		for (int i = 0; i < 40; i++) {
			list.add(new AbstractNote());
		}
		assertEquals(40, list.capacity());
	}
	
	/**
	 * Test case 6:
	 * Test if the capacity of the list is 50 when the list contains 50 elements.
	 */
	@Test
	void testCapacity6() {
		DefaultNoteListModel list =