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
* It contains ten unit test cases for the {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
*/
class DefaultNoteListModelTest {

	/**
	* Test case 1 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is not in the list.
	*/
	@Test
	void testLastIndexOf1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		assertEquals(-1, model.lastIndexOf(note));
	}
	
	/**
	* Test case 2 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		assertEquals(0, model.lastIndexOf(note));
	}
	
	/**
	* Test case 3 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		assertEquals(1, model.lastIndexOf(note));
	}
	
	/**
	* Test case 4 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(2, model.lastIndexOf(note));
	}
	
	/**
	* Test case 5 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(3, model.lastIndexOf(note));
	}
	
	/**
	* Test case 6 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(4, model.lastIndexOf(note));
	}
	
	/**
	* Test case 7 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(5, model.lastIndexOf(note));
	}
	
	/**
	* Test case 8 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(6, model.lastIndexOf(note));
	}
	
	/**
	* Test case 9 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(7, model.lastIndexOf(note));
	}
	
	/**
	* Test case 10 for {@link DefaultNoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is in the list.
	*/
	@Test
	void testLastIndexOf10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		model.addElement(note);
		assertEquals(8, model.lastIndexOf(note));
	}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * Interface for a list of notes.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    /**
     * Returns the index of the last occurrence of <code>elem</code>.
     *
     * @param elem the desired component
     * @return the index of the last occurrence of <code>elem</code> in the
     *         list; returns <code>-1</code> if the object is not found
     * @see Vector#lastIndexOf(Object)
     */
    public int lastIndexOf(AbstractNote elem);
}

// NoteListModelTest.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NoteListModel}.
* It contains ten unit test cases for the {@link NoteListModel#lastIndexOf(AbstractNote)} method.
*/
class NoteListModelTest {
		
	/**
	* Test case 1 for {@link NoteListModel#lastIndexOf(AbstractNote)} method.
	* It tests the case that the given element is not in the list.
	*/
	@Test
	void testLastIndexOf1() {
		NoteListModel model = new NoteListModel() {
			