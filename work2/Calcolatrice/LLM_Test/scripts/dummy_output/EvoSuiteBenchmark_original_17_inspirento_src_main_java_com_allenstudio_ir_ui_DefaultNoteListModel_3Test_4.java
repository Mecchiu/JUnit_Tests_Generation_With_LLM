// DefaultNoteListModel_3Test.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultNoteListModel}.
* It contains one unit test case for the {@link DefaultNoteListModel#contains(AbstractNote)} method.
*/
class DefaultNoteListModel_3Test {
		
	/**
	 * Creates an empty DefaultNoteListModel.
	 *
	 * @return a new DefaultNoteListModel
	 */
	public static AbstractNoteListModel create();
	
	/**
	 * Creates a new DefaultNoteListModel that is a copy of the <code>AbstractNoteListModel</code> <code>.
	 *
	 * @return a new DefaultNoteListModel
	 */
	public static DefaultNoteListModel createFrom(DefaultNoteListModel other);

	/**
	 * It is expected that the specified <code>note</code> to already be present in
	 * the list of notes in this instance.
	 *
	 * @return A hash code of this list model.
	 */
	public int hashCode(AbstractNote note);
	
	/**
	 * It is expected that the specified <code>note</code> to already be present in the list of notes in this instance.
	 *
	 * @param note an object to check against this list model.
	 * @return <code>true</code> if and only if <code>note</code> is a
	 *         contained element of this list model.
	 */
	public boolean equals(Object note);

	/**
	 * It is expected that the specified <code>note</code> to already be present in
	 * the list of notes in this instance.
	 * <p>
	 * Returns a hash code of the set of all contained elements of this list model.
	 * <p/>
	 * <em>For {@link #hashCode()}, this method has the additional feature
	 * to guarantee such that the set is immutable and to ensure this
	 * set is independent of a user interface component.</em>
	 *
	 * @param note an object to check against this list model.
	 * @return A hash of the set of all contained elements of this list model.
	 */
	public int getContainedElementHashCode(Object note);

	/**
	 * It is expected that this list model can contain every object in this list.
	 *
	 * @return <code>true</code> if no objects are in this model and no default
	 *         object is set.
	 */
	public boolean isEmpty();
	
	/**
	 * It is expected that this list model can contain every object in this list.
	 *
	 * @param event an object to be tested to contain this list model.
	 * @return <code>true</code> if the specified object is an instance of this
	 *         list model and not equal to null.
	 */
	public boolean isEqual(Object event);

	/**
	 * It is expected that this list model can contain every object in this list,
	 * without testing the containment of the default object.
	 *
	 * @return <code>true</code> if the specified object is an instance of this
	 *         list model, without testing the containment of the default
	 *         object.
	 */
	@SuppressWarnings({"unchecked", "rawtypes"})
	public boolean isExactlyOne();

	/**
	 * It is expected that the specified <code>default</code> object contains no
	 * objects in this list.
	 *
	 * @param default an object to be tested to contain this list model.
	 * @return <code>true</code> if the specified object is a default list
	 *         model that is not a containment of this list model.
	 */
	@SuppressWarnings("unchecked")
	public boolean isSame(Object default);
	
	/**
	 * It is expected that the specified <code>default</code> object must also
	 * contain the specified <code>note</code>.
	 *
	 * @param note an object to be tested to contain this list model.
	 *
	 * @param default an object to be tested to contain this list model.
	 *
	 * @return <code>true</code> if the specified object or its subelements must
	 *         also present in this list model.
	 */
	public boolean isSubsetOf(AbstractNote note);

	/**
	 * It is expected that the specified <code>note</code> to not already be present in the
	 * list of notes in this instance.
	 *
	 * @param note an object to check against this list model.
	 * @return <code>true</code> if the specified object is not part of this list model.
	 */
	public boolean isNotIn(AbstractNote note);

	/**
	 * It is expected that the specified <code>note</code> to not already be present in the
	 * list of notes in this instance.
	 *
	 * @param note an object to check against this list model.
	 * @return <code>true</code> if the specified object is neither part nor at least part of the list model.
	 */
	public boolean isNotSubsetOf(AbstractNote note);

	/**
	 * It is safe to call from multiple threads.
	 * @param listeners an object to be tested to be notified on the set of
	 *             all listeners.
	 */
	public void setNoteListDataListener(AbstractNoteListModelListener listeners);

	/**
	 * Removes the given listener from the set of listeners for this list model
	 * that are notified when the event <code>evt</code> is received.
	 * <P>
	 * This method will throw an exception if no object exists that holds the specified
	 * listener.
	 *
	 * @param listeners an object to be removed from the set of listeners.
	 * @param event an object to be used as argument for the remove operation.
	 * @return this list model instance.
	 */
	public DefaultNoteListModel removeListener(AbstractNoteListModelListener listeners, Object event);

	/**
	 * This default implementation only works in the {@code JList} class.
	 * <P>
	 * This method is called whenever the value of a child node in the view has
	 * changed. Therefore, this method will always be called after changing
	 * a child in this model, unless the child's node has also been deleted.
	 *
	 * @param e event for which the child node changed.
	 * @param index the index of the last child node that changed.
	 * @param child the last child node that changed.
	 */
	public void processTableUpdateEvent(NoteListDataEvent e, int index, Object child);

    @Test
    public void setNotEqualTrue() {
        createFrom(new DefaultNoteListModel(new ArrayList<AbstractNote>(), false));
        
        assertTrue(isEqual(getContainedElementHashCode(new ArrayList<AbstractNote>())));
    }
}