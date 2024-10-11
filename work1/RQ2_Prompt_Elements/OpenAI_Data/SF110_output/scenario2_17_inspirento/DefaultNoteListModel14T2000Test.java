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
* It contains ten unit test cases for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModelTest {

	/**
	* Test case 1:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(0);
			fail("An ArrayIndexOutOfBoundsException should be thrown.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected exception
		}
	}
	
	/**
	* Test case 2:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(-1);
			fail("An ArrayIndexOutOfBoundsException should be thrown.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected exception
		}
	}
	
	/**
	* Test case 3:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(1);
			fail("An ArrayIndexOutOfBoundsException should be thrown.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected exception
		}
	}
	
	/**
	* Test case 4:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(2);
			fail("An ArrayIndexOutOfBoundsException should be thrown.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected exception
		}
	}
	
	/**
	* Test case 5:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(3);
			fail("An ArrayIndexOutOfBoundsException should be thrown.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected exception
		}
	}
	
	/**
	* Test case 6:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(4);
			fail("An ArrayIndexOutOfBoundsException should be thrown.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected exception
		}
	}
	
	/**
	* Test case 7:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(5);
			fail("An ArrayIndexOutOfBoundsException should be thrown.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected exception
		}
	}
	
	/**
	* Test case 8:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(6);
			fail("An ArrayIndexOutOfBoundsException should be thrown.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected exception
		}
	}
	
	/**
	* Test case 9:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(7);
			fail("An ArrayIndexOutOfBoundsException should be thrown.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected exception
		}
	}
	
	/**
	* Test case 10:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(8);
			fail("An ArrayIndexOutOfBoundsException should be thrown.");
		} catch (ArrayIndexOutOfBoundsException e) {
			// Expected exception
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
     * Removes the element at the specified position in this list. Returns the
     * element that was removed from the list.
     * <p>
     * Throws an <code>ArrayIndexOutOfBoundsException</code> if the index is
     * out of range (<code>index &lt; 0 || index &gt;= size()</code>).
     *
     * @param index the index of the element to removed
     */
    public AbstractNote remove(int index) {
        AbstractNote an = delegate.elementAt(index);
        delegate.removeElementAt(index);
        fireItemRemoved(this, index);
        return an;
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#remove(int)} method.
*/
class DefaultNoteListModelTest {
		
	/**
	* Test case 1:
	* The index is out of range.
	* Expected result:
	* An <code>ArrayIndexOutOfBoundsException</code> is thrown.
	*/
	@Test
	void testCase1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		try {
			model.remove(0);
			fail("An ArrayIndexOutOfBoundsException should