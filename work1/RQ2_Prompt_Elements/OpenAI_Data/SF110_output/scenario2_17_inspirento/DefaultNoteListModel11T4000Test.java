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
* It contains ten unit test cases for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModelTest {

	/**
	* Test case 1 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 1 is to test the case when the list is empty.
	* The expected result is that the method returns false.
	*/
	@Test
	void testRemoveElement1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		assertFalse(model.removeElement(note));
	}
	
	/**
	* Test case 2 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 2 is to test the case when the list contains one element.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		assertTrue(model.removeElement(note));
	}
	
	/**
	* Test case 3 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 3 is to test the case when the list contains two elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 4 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 4 is to test the case when the list contains three elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 5 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 5 is to test the case when the list contains four elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 6 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 6 is to test the case when the list contains five elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 7 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 7 is to test the case when the list contains six elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		model.addElement(note6);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 8 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 8 is to test the case when the list contains seven elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		model.addElement(note6);
		model.addElement(note7);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 9 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 9 is to test the case when the list contains eight elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		AbstractNote note8 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		model.addElement(note6);
		model.addElement(note7);
		model.addElement(note8);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 10 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 10 is to test the case when the list contains nine elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		AbstractNote note8 = new AbstractNote();
		AbstractNote note9 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		model.addElement(note6);
		model.addElement(note7);
		model.addElement(note8);
		model.addElement(note9);
		assertTrue(model.removeElement(note1));
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
     * Removes the first (lowest-indexed) occurrence of the argument from this
     * list.
     *
     * @param obj the component to be removed
     * @return <code>true</code> if the argument was a component of this list;
     *         <code>false</code> otherwise
     * @see Vector#removeElement(Object)
     */
    public boolean removeElement(AbstractNote obj) {
        int index = indexOf(obj);
        boolean an = delegate.removeElement(obj);
        if (index >= 0) {
            fireItemRemoved(this, index);
        }
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
* It contains ten unit test cases for the {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
*/
class DefaultNoteListModelTest {
		
	/**
	* Test case 1 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 1 is to test the case when the list is empty.
	* The expected result is that the method returns false.
	*/
	@Test
	void testRemoveElement1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		assertFalse(model.removeElement(note));
	}
	
	/**
	* Test case 2 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 2 is to test the case when the list contains one element.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		assertTrue(model.removeElement(note));
	}
	
	/**
	* Test case 3 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 3 is to test the case when the list contains two elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 4 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 4 is to test the case when the list contains three elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 5 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 5 is to test the case when the list contains four elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 6 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 6 is to test the case when the list contains five elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 7 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 7 is to test the case when the list contains six elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model.addElement(note3);
		model.addElement(note4);
		model.addElement(note5);
		model.addElement(note6);
		assertTrue(model.removeElement(note1));
	}
	
	/**
	* Test case 8 for {@link DefaultNoteListModel#removeElement(AbstractNote)} method.
	* Test case 8 is to test the case when the list contains seven elements.
	* The expected result is that the method returns true.
	*/
	@Test
	void testRemoveElement8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		model.addElement(note1);
		model.addElement(note2);
		model