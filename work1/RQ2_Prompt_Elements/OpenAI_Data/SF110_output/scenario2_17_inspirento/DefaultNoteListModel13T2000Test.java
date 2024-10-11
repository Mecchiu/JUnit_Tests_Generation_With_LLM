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
* It contains ten unit test cases for the {@link DefaultNoteListModel#get(int)} method.
*/
class DefaultNoteListModelTest {

	/**
	* Test case 1:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.get(0);
			fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("0", e.getMessage());
		}
	}
	
	/**
	* Test case 2:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.get(1);
			fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("1", e.getMessage());
		}
	}
	
	/**
	* Test case 3:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.get(2);
			fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("2", e.getMessage());
		}
	}
	
	/**
	* Test case 4:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.get(3);
			fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("3", e.getMessage());
		}
	}
	
	/**
	* Test case 5:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.get(4);
			fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("4", e.getMessage());
		}
	}
	
	/**
	* Test case 6:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.get(5);
			fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("5", e.getMessage());
		}
	}
	
	/**
	* Test case 7:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.get(6);
			fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("6", e.getMessage());
		}
	}
	
	/**
	* Test case 8:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.get(7);
			fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("7", e.getMessage());
		}
	}
	
	/**
	* Test case 9:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.get(8);
			fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("8", e.getMessage());
		}
	}
	
	/**
	* Test case 10:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.get(9);
			fail("Expected an ArrayIndexOutOfBoundsException to be thrown");
		} catch (ArrayIndexOutOfBoundsException e) {
			assertEquals("9", e.getMessage());
		}
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
     * Returns the element at the specified position in this list.
     * <p>
     * Throws an <code>ArrayIndexOutOfBoundsException</code> if the index is
     * out of range (<code>index &lt; 0 || index &gt;= size()</code>).
     *
     * @param index index of element to return
     */
    public AbstractNote get(int index) {
        return delegate.elementAt(index);
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#get(int)} method.
*/
class DefaultNoteListModelTest {
		
	/**
	* Test case 1:
	* The index is out of range.
	* Expected result:
	* Throws an <code>ArrayIndexOutOfBoundsException</code>.
	*/
	@Test
	void testCase1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {