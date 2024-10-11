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
* It contains ten unit test cases for the {@link DefaultNoteListModel#indexOf(AbstractNote)} method.
*/
class DefaultNoteListModelTest {

	/**
	 * Test case 1:
	 * The method returns -1 if the list is empty.
	 */
	@Test
	void testIndexOfEmptyList() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		assertEquals(-1, model.indexOf(new AbstractNote()));
	}
	
	/**
	 * Test case 2:
	 * The method returns -1 if the list does not contain the element.
	 */
	@Test
	void testIndexOfNotContained() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		model.add(new AbstractNote());
		assertEquals(-1, model.indexOf(new AbstractNote()));
	}
	
	/**
	 * Test case 3:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note = new AbstractNote();
		model.add(note);
		assertEquals(0, model.indexOf(note));
	}
	
	/**
	 * Test case 4:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained2() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		assertEquals(1, model.indexOf(note2));
	}
	
	/**
	 * Test case 5:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained3() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		assertEquals(2, model.indexOf(note3));
	}
	
	/**
	 * Test case 6:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained4() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		model.add(note4);
		assertEquals(3, model.indexOf(note4));
	}
	
	/**
	 * Test case 7:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained5() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		model.add(note4);
		model.add(note5);
		assertEquals(4, model.indexOf(note5));
	}
	
	/**
	 * Test case 8:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained6() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		model.add(note4);
		model.add(note5);
		model.add(note6);
		assertEquals(5, model.indexOf(note6));
	}
	
	/**
	 * Test case 9:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained7() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		model.add(note4);
		model.add(note5);
		model.add(note6);
		model.add(note7);
		assertEquals(6, model.indexOf(note7));
	}
	
	/**
	 * Test case 10:
	 * The method returns the index of the element if the list contains the element.
	 */
	@Test
	void testIndexOfContained8() {
		DefaultNoteListModel model = new DefaultNoteListModel();
		AbstractNote note1 = new AbstractNote();
		AbstractNote note2 = new AbstractNote();
		AbstractNote note3 = new AbstractNote();
		AbstractNote note4 = new AbstractNote();
		AbstractNote note5 = new AbstractNote();
		AbstractNote note6 = new AbstractNote();
		AbstractNote note7 = new AbstractNote();
		AbstractNote note8 = new AbstractNote();
		model.add(note1);
		model.add(note2);
		model.add(note3);
		model.add(note4);
		model.add(note5);
		model.add(note6);
		model.add(note7);
		model.add(note8);
		assertEquals(7, model.indexOf(note8));
	}
}

// NoteListModel.java
package com.allenstudio.ir.ui;

import com.allenstudio.ir.core.plugins.AbstractNote;
import com.allenstudio.ir.event.NoteListDataEvent;
import com.allenstudio.ir.event.NoteListDataListener;
import java.util.*;

/**
 * This interface defines the methods that a data model for a
 * <code>NoteList</code> must implement.
 *
 * @author Allen Chue
 */
public interface NoteListModel {

    /**
     * Returns the number of components in this list.
     *
     * @return the number of components in this list
     * @see Vector#size()
     */
    public int getSize();

    /**
     * Returns the component at the specified index.
     *
     * @param index an index into this list
     * @return the component at the specified index
     * @see Vector#elementAt(int)
     */
    public AbstractNote getElementAt(int index);

    /**
     * Searches for the first occurrence of <code>elem</code>.
     *
     * @param elem an object
     * @return the index of the first occurrence of the argument in this list;
     *         returns <code>-1</code> if the object is not found
     * @see Vector#indexOf(Object)
     */
    public int indexOf(AbstractNote elem);

    /**
     * Returns the first component of this list.
     *
     * @return the first component of this list
     * @see Vector#firstElement()
     */
    public AbstractNote firstElement();

    /**
     * Returns the last component of the list.
     *
     * @return the last component of the list
     * @see Vector#lastElement()
     */
    public AbstractNote lastElement();

    /**
     * Returns the component at the specified index.
     *
     * @param index an index into this list
     * @return the component at the specified index
     * @see Vector#get(int)
     */
    public AbstractNote get(int index);

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @see Vector#set(int, Object)
     */
    public AbstractNote set(int index, AbstractNote element);

    /**
     * Appends the specified element to the end of this list.
     *
     * @param element element to be appended to this list
     * @return <tt>true</tt> (as specified by {@link Collection#add})
     * @see Vector#add(Object)
     */
    public boolean add(AbstractNote element);

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @see Vector#add(int, Object)
     */
    public void add(int index, AbstractNote element);

    /**
     * Removes the first occurrence of the specified element from this list,
     * if it is present.  If the list does not contain the element, it is
     * unchanged.  More formally, removes the element with the lowest index
     * <tt>i</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;get(i)==null&nbsp;:&nbsp;o.equals(get(i)))</tt>
     * (if such an element exists).  Returns <tt>true</tt> if this list
     * contained the specified element (or equivalently, if this list
     * changed as a result of the call).
     *
     * @param o element to be removed from this list, if present
     * @return <tt>true</tt> if this list contained the specified element
     * @see Vector#remove(Object)
     */
    public boolean remove(AbstractNote o);

    /**
     * Removes the element at the specified position in this list.
     * Shifts any subsequent elements to the left (subtracts one from their
     * indices).  Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @see Vector#remove(int)
     */
    public AbstractNote remove(int index);

    /**
     * Removes all of the elements from this list.  The list will
     * be empty after this call returns.
     *
     * @see Vector#clear()
     */
    public void clear();

    /**
     * Returns <tt>true</tt> if this list contains the specified element.
     * More formally, returns <tt>true</tt> if and only if this list contains
     * at least one element <tt>e</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
     *
     * @param o element whose presence in this list is to be tested
     * @return <tt>true</tt> if this list contains the specified element
     * @see Vector#contains(Object)
     */
    public boolean contains(AbstractNote o);

    /**
     * Returns <tt>true</tt> if this list contains no elements.
     *
     * @return <tt>true</tt> if this list contains no elements
     * @see Vector#isEmpty()
     */
    public boolean isEmpty();

    /**
     * Returns an array containing all of the elements in this list
     * in the correct order.
     *
     * @return an array containing all of the elements in this list
     *         in the correct order
     * @see Vector#toArray()
     */
    public AbstractNote[] toArray();

    /**
     * Returns an array containing all of the elements in this list in the
     * correct order; the runtime type of the returned array is that of the
     * specified array.  If the list fits in the specified array, it is
     * returned therein.  Otherwise, a new array is allocated with the runtime
     * type of the specified array and the size of this list.
     *
     * @param a the array into which the elements of the list are to
     *          be stored, if it is big enough; otherwise, a new array of the
     *          same runtime type is allocated for this purpose.
     * @return an array containing the elements of the list
     * @see Vector#toArray(Object[])
     */
    public AbstractNote[] toArray(AbstractNote[] a);

    /**
     * Returns the number of elements in this list.  If this list contains
     * more than <tt>Integer.MAX_VALUE</tt> elements, returns
     * <tt>Integer.MAX_VALUE</tt>.
     *
     * @return the number of elements in this list
     * @see Vector#size()
     */
    public int size();

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return the element at the specified position in this list
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     * @see Vector#get(int)
     */
    public AbstractNote get(int index);

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     * @see Vector#set(int, Object)
     */
    public AbstractNote set(int index, AbstractNote element);

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt; size()</tt>)
     * @see Vector#add(int, Object)
     */
    public void add(int index, AbstractNote element);

    /**
     * Removes the element at the specified position in this list.  Shifts any
     * subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @throws IndexOutOfBoundsException if the index is out of range
     *         (<tt>index &lt; 0 || index &gt;= size()</tt>)
     * @see Vector#remove(int)
     */
    public AbstractNote remove(int index);

    /**
     * Removes all of the elements from this list.  The list will
     * be empty after this call returns.
     *
     * @see Vector#clear()
     */
    public void clear();

    /**
     * Returns <tt>true</tt> if this list contains the specified element.
     * More formally, returns <tt>true</tt> if and