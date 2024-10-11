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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote, int)} method.
*/
class DefaultNoteListModelTest {

	/**
	* Test case 1:
	* Test if the method returns -1 when the list is empty.
	*/
	@Test
	void testIndexOf1() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertEquals(-1, model.indexOf(new AbstractNote(), 0));
	}
	
	/**
	* Test case 2:
	* Test if the method returns -1 when the list is not empty but the element is not in the list.
	*/
	@Test
	void testIndexOf2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.addElement(new AbstractNote());
		assertEquals(-1, model.indexOf(new AbstractNote(), 0));
	}
	
	/**
	* Test case 3:
	* Test if the method returns the correct index when the element is in the list.
	*/
	@Test
	void testIndexOf3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(note);
		assertEquals(0, model.indexOf(note, 0));
	}
	
	/**
	* Test case 4:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, 0));
	}
	
	/**
	* Test case 5:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, 1));
	}
	
	/**
	* Test case 6:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, 2));
	}
	
	/**
	* Test case 7:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, -1));
	}
	
	/**
	* Test case 8:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, -2));
	}
	
	/**
	* Test case 9:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf9() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, -3));
	}
	
	/**
	* Test case 10:
	* Test if the method returns the correct index when the element is in the list and the index is not 0.
	*/
	@Test
	void testIndexOf10() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.addElement(new AbstractNote());
		model.addElement(note);
		assertEquals(1, model.indexOf(note, -4));
	}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * This interface defines the methods components like <code>JList</code>
 * use to get the value of each cell in a list and the length of the list.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    /**
     * Returns the length of the list.
     *
     * @return the length of the list
     */
    public int getSize();

    /**
     * Returns the value at the specified index.
     *
     * @param index the requested index
     * @return the value at <code>index</code>
     */
    public AbstractNote getElementAt(int index);

    /**
     * Adds a listener to the list that's notified each time a change
     * to the data model occurs.
     *
     * @param l the <code>NoteListDataListener</code> to be added
     */
    public void addNoteListDataListener(NoteListDataListener l);

    /**
     * Removes a listener from the list that's notified each time a
     * change to the data model occurs.
     *
     * @param l the <code>NoteListDataListener</code> to be removed
     */
    public void removeNoteListDataListener(NoteListDataListener l);

    /**
     * Returns an array of all the list data listeners
     * registered on this <code>NoteListModel</code>.
     *
     * @return all of this model's <code>NoteListDataListener</code>s,
     *         or an empty array if no list data listeners
     *         are currently registered
     *
     * @see #addNoteListDataListener
     * @see #removeNoteListDataListener
     *
     * @since 1.4
     */
    public NoteListDataListener[] getNoteListDataListeners();

    /**
     * Searches for the first occurrence of <code>elem</code>, beginning the
     * search at <code>index</code>.
     *
     * @param elem an desired component
     * @param index the index from which to begin searching
     * @return the index where the first occurrence of <code>elem</code> is
     *         found after <code>index</code>; returns <code>-1</code> if
     *         the <code>elem</code> is not found in the list
     */
    public int indexOf(AbstractNote elem, int index);
}

// NoteListDataEvent.java
package com.allenstudio.ir.event;

import java.util.*;

/**
 * This class represents an event that is fired when the data model of a
 * <code>NoteList</code> is changed.
 *
 * @author Allen Chue
 */
public class NoteListDataEvent extends EventObject {

    /**
     * Constructs a <code>NoteListDataEvent</code> object.
     *
     * @param source the <code>NoteList</code> that fired the event
     */
    public NoteListDataEvent(Object source) {
        super(source);
    }
}

// NoteListDataListener.java
package com.allenstudio.ir.event;

import java.util.*;

/**
 * This interface is for listening to changes in a <code>NoteList</code>