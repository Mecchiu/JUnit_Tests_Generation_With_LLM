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
 * The listener interface for receiving <code>NoteListDataEvent</code>s.
 * The class that is interested in processing a <code>NoteListDataEvent</code>
 * implements this interface.
 *
 * @author Allen Chue
 */
public interface NoteListDataListener extends EventListener {

    /**
     * This method is called when the data model of a <code>NoteList</code>
     * is changed.
     *
     * @param e the <code>NoteListDataEvent</code> fired
     */
    public void contentsChanged(NoteListDataEvent e);
}

// AbstractNote.java
package com.allenstudio.ir.core.plugins;

import com.allenstudio.ir.util.*;
import java.util.*;

/**
 * This class is the superclass of all notes.
 *
 * @author Allen Chue
 */
public abstract class AbstractNote {

    /**
     * Returns the title of this note.
     *
     * @return the title of this note
     */
    public abstract String getTitle();

    /**
     * Returns the content of this note.
     *
     * @return the content of this note
     */
    public abstract String getContent();

    /**
     * Returns the date of this note.
     *
     * @return the date of this note
     */
    public abstract Date getDate();

    /**
     * Returns the icon of this note.
     *
     * @return the icon of this note
     */
    public abstract ImageIcon getIcon();
}

// NoteList.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * This class is a list of notes.
 *
 * @author Allen Chue
 */
public class NoteList extends JList {

    /**
     * Constructs a <code>NoteList</code> with an empty model.
     */
    public NoteList();

    /**
     * Constructs a <code>NoteList</code> that displays the elements in
     * the specified, non-<code>null</code> model.
     * All <code>NoteList</code> constructors delegate to this one.
     *
     * @param dataModel the data model for this list
     * @exception IllegalArgumentException if <code>dataModel</code>
     *		is <code>null</code>
     */
    public NoteList(NoteListModel dataModel);

    /**
     * Constructs a <code>NoteList</code> that displays the elements in
     * the specified, non-<code>null</code> model.
     * All <code>NoteList</code> constructors delegate to this one.
     *
     * @param dataModel the data model for this list
     * @exception IllegalArgumentException if <code>dataModel</code>
     *		is <code>null</code>
     */
    public NoteList(Vector<? extends AbstractNote> listData);

    /**
     * Constructs a <code>NoteList</code> that displays the elements in
     * the specified, non-<code>null</code> model.
     * All <code>NoteList</code> constructors delegate to this one.
     *
     * @param dataModel the data model for this list
     * @exception IllegalArgumentException if <code>dataModel</code>
     *		is <code>null</code>
     */
    public NoteList(AbstractNote[] listData);

    /**
     * Constructs a <code>NoteList</code> that displays the elements in
     * the specified, non-<code>null</code> model.
     * All <code>NoteList</code> constructors delegate to this one.
     *
     * @param dataModel the data model for this list
     * @exception IllegalArgumentException if <code>dataModel</code>
     *		is <code>null</code>
     */
    public NoteList(ListModel dataModel);

    /**
     * Constructs a <code>NoteList</code> that displays the elements in
     * the specified, non-<code>null</code> model.
     * All <code>NoteList</code> constructors delegate to this one.
     *
     * @param dataModel the data model for this list
     * @exception IllegalArgumentException if <code>dataModel</code>
     *		is <code>null</code>
     */
    public NoteList(Object[] listData);

    /**
     * Constructs a <code>NoteList</code> that displays the elements in
     * the specified, non-<code>null</code> model.
     * All <code>NoteList</code> constructors delegate to this one.
     *
     * @param dataModel the data model for this list
     * @exception IllegalArgumentException if <code>dataModel</code>
     *		is <code>null</code>
     */
    public NoteList(ListSelectionModel newSelectionModel);

    /**
     * Constructs a <code>NoteList</code> that displays the elements in
     * the specified, non-<code>null</code> model.
     * All <code>NoteList</code> constructors delegate to this one.
     *
     * @param dataModel the data model for this list
     * @exception IllegalArgumentException if <code>dataModel</code>
     *		is <code>null</code>
     */
    public NoteList(ListModel dataModel, ListSelectionModel newSelectionModel);

    /**
     * Constructs a <code>NoteList</code> that displays the elements in
     * the specified, non-<code>null</code> model.
     * All <code>NoteList</code> constructors delegate to this one.
     *
     * @param dataModel the data model for this list
     * @exception IllegalArgumentException if <code>dataModel</code>
     *		is <code>null</code>
     */
    public NoteList(Vector<? extends AbstractNote> listData, ListSelectionModel newSelectionModel);

    /**
     * Constructs a <code>NoteList</code> that displays the elements in
     * the specified, non-<code>null</code> model.
     * All <code>NoteList</code> constructors delegate to this one.
     *
     * @param dataModel the data model for this list
     * @exception IllegalArgumentException if <code>dataModel</code>
     *		is <code>null</code>
     */
    public NoteList(AbstractNote[] listData, ListSelectionModel newSelectionModel);

    /**
     * Constructs a <code>NoteList</code> that displays the elements in
     * the specified, non-<code>null</code> model.
     * All <code>NoteList</code> constructors delegate to this one.
     *
     * @param dataModel the data model for this list
     * @exception IllegalArgumentException if <code>dataModel</code>
     *		is <code>null</code>
     */
    public NoteList(Object[] listData, ListSelectionModel newSelectionModel);

    /**
     * Returns the data model that holds the list of items displayed
     * by the <code>NoteList</code> component.
     *
     * @return the <code>NoteList</code> object's data model
     * @see #setModel
     */
    public NoteListModel getModel();

    /**
     * Sets the model that represents the contents or "value" of the
     * list, notifies property change listeners, and then clears the
     * list's selection.  <code>NoteList</code>'s implementation of
     * this method in turn calls <code>setPrototypeCellValue</code>,
     * and then <code>invalidate</code>.
     * <p>
     * This method throws an
     * <code>IllegalArgumentException</code> if <code>model</code>
     * is <code>null</code>.
     *
     * @param model the <code>NoteListModel</code> that provides the
     *			displayed list of items
     * @exception IllegalArgumentException if <code>model</code>
