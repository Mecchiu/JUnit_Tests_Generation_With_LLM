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
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf1() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(1, model.indexOf(note2, 0));
		}
		
		/**
		* Test case 2:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf2() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(2, model.indexOf(note3, 0));
		}
		
		/**
		* Test case 3:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf3() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(0, model.indexOf(note1, 0));
		}
		
		/**
		* Test case 4:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf4() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(1, model.indexOf(note2, 1));
		}
		
		/**
		* Test case 5:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf5() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(2, model.indexOf(note3, 1));
		}
		
		/**
		* Test case 6:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf6() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(0, model.indexOf(note1, 1));
		}
		
		/**
		* Test case 7:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf7() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(1, model.indexOf(note2, 2));
		}
		
		/**
		* Test case 8:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf8() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(2, model.indexOf(note3, 2));
		}
		
		/**
		* Test case 9:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf9() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(0, model.indexOf(note1, 2));
		}
		
		/**
		* Test case 10:
		* Test if the method returns the correct index of the element in the list.
		*/
		@Test
		void testIndexOf10() {
				DefaultNoteListModel model = new DefaultNoteListModel();
				AbstractNote note1 = new AbstractNote();
				AbstractNote note2 = new AbstractNote();
				AbstractNote note3 = new AbstractNote();
				model.addElement(note1);
				model.addElement(note2);
				model.addElement(note3);
				assertEquals(-1, model.indexOf(note1, 3));
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
     * Returns the number of components in this list.
     *
     * @return the number of components in this list
     */
    int getSize();

    /**
     * Returns the component at the specified index.
     *
     * @param index an index into this list
     * @return the component at the specified index
     * @throws ArrayIndexOutOfBoundsException if the <code>index</code> is
     *         negative or greater than the current size of this list
     */
    AbstractNote getElementAt(int index);

    /**
     * Adds the specified component to the end of this list.
     *
     * @param element the component to be added
     */
    void addElement(AbstractNote element);

    /**
     * Inserts the specified component at the specified <code>index</code> in
     * this list.
     *
     * @param element the component to be inserted
     * @param index where to insert the new component
     * @throws ArrayIndexOutOfBoundsException if the <code>index</code> is
     *         invalid
     */
    void insertElementAt(AbstractNote element, int index);

    /**
     * Removes the first (lowest-indexed) occurrence of the argument from this
     * list.
     *
     * @param element the component to be removed
     */
    void removeElement(AbstractNote element);

    /**
     * Removes the component at the specified <code>index</code> from this list.
     *
     * @param index the index of the object to remove
     */
    void removeElementAt(int index);

    /**
     * Removes all components from this list and sets its size to zero.
     */
    void removeAllElements();

    /**
     * Returns the index of the first (lowest-indexed) occurrence of the
     * specified element in this list, or -1 if the list does not contain this
     * element.
     *
     * @param elem element to search for
     * @return the index of the first occurrence of the argument in this list;
     *         returns -1 if the object is not found
     */
    int indexOf(AbstractNote elem);

    /**
     * Returns the index of the first occurrence of the specified element in
     * this list, searching forwards from <code>index</code>, or returns -1 if
     * the element is not found.
     *
     * @param elem element to search for
     * @param index index to start searching from
     * @return the index of the first occurrence of the element in this list at
     *         position <code>index</code> or later in the list; returns -1 if
     *         the element is not found
     * @throws ArrayIndexOutOfBoundsException if the <code>index</code> is
     *         invalid
     */
    int indexOf(AbstractNote elem, int index);

    /**
     * Returns the index of the last occurrence of the specified element in this
     * list, or -1 if the list does not contain this element.
     *
     * @param elem element to search for
     * @return the index of the last occurrence of the argument in this list;
     *         returns -1 if the object is not found
     */
    int lastIndexOf(AbstractNote elem);

    /**
     * Returns the index of the last occurrence of the specified element in this
     * list, searching backwards from <code>index</code>, or returns -1 if the
     * element is not found.
     *
     * @param elem element to search for
     * @param index index to start searching backwards from
     * @return the index of the last occurrence of the element at position less
     *         than <code>index</code> in this list; returns -1 if the element
     *         is not found
     * @throws ArrayIndexOutOfBoundsException if the <code>index</code> is
     *         invalid
     */
    int lastIndexOf(AbstractNote elem, int index);

    /**
     * Returns the first component (the item at index <code>0</code>) of this
     * list.
     *
     * @return the first component of this list
     * @throws NoSuchElementException if this list has no components
     */
    AbstractNote firstElement();

    /**
     * Returns the last component of the list.
     *
     * @return the last component of the list
     * @throws NoSuchElementException if this list has no components
     */
    AbstractNote lastElement();

    /**
     * Returns the component at the specified <code>index</code>.
     *
     * @param index an index into this list
     * @return the component at the specified <code>index</code>
     * @throws ArrayIndexOutOfBoundsException if the <code>index</code> is
     *         negative or greater than the current size of this list
     */
    AbstractNote elementAt(int index);

    /**
     * Returns an array containing all of the elements in this list in the
     * correct order.
     *
     * @return an array containing the elements of the list
     */
    AbstractNote[] toArray();

    /**
     * Returns an array containing all of the elements in this list in the
     * correct order; the runtime type of the returned array is that of the
     * specified array.
     *
     * @param a the array into which the elements of the list are to be stored,
     *          if it is big enough; otherwise, a new array of the same runtime
     *          type is allocated for this purpose
     * @return an array containing the elements of the list
     * @throws ArrayStoreException if the runtime type of the specified array is
     *         not a supertype of the runtime type of every element in this list
     */
    AbstractNote[] toArray(AbstractNote[] a);

    /**
     * Returns an iterator over the elements in this list in proper sequence.
     *
     * @return an iterator over the elements in this list in proper sequence
     */
    Iterator<AbstractNote> iterator();

    /**
     * Returns a list iterator of the elements in this list (in proper
     * sequence).
     *
     * @return a list iterator of the elements in this list (in proper
     *         sequence)
     */
    ListIterator<AbstractNote> listIterator();

    /**
     * Returns a list iterator of the elements in this list (in proper
     * sequence), starting at the specified position in this list.
     *
     * @param index index of the first element to be returned from the list
     *              iterator (by a call to the <code>next</code> method)
     * @return a list iterator of the elements in this list (in proper
     *         sequence), starting at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<code>index &lt; 0 || index &gt; size()</code>)
     */
    ListIterator<AbstractNote> listIterator(int index);

    /**
     * Returns a view of the portion of this list between the specified
     * <code>fromIndex</code>, inclusive, and <code>toIndex</code>, exclusive.
     *
     * @param fromIndex low endpoint (inclusive) of the subList
     * @param toIndex high endpoint (exclusive) of the subList
     * @return a view of the specified range within this list
     * @throws IndexOutOfBoundsException if an endpoint index value is out of
     *         range (<code>fromIndex &lt; 0 || toIndex &gt; size ||
     *         fromIndex &gt; toIndex</code>)
     */
    List<AbstractNote> subList(int fromIndex, int toIndex);

    /**
     * Returns <code>true</code> if this list contains no components.
     *
     * @return <code>true</code> if this list contains no components
     */
    boolean isEmpty();

    /**
     * Returns <code>true</code> if this list contains the specified element.
     *
     * @param elem element whose presence in this list is to be tested
     * @return <code>true</code> if this list contains the specified element
     */
    boolean contains(AbstractNote elem);

    /**
     * Returns <code>true</code> if this list contains all of the elements of
     * the specified collection.
     *
     * @param c collection to be checked for containment in this list
     * @return <code>true</code> if this list contains all of the elements of
     *         the specified collection
     */
    boolean containsAll(Collection<? extends AbstractNote> c);

    /**
     * Returns the hash code value for this list.
     *
     * @return the hash code value for this list
     */
    int hashCode();

    /**
     * Returns <code>true</code> if this list contains all of the elements of
     * the specified collection.
     *
     * @param c collection to be checked for containment in