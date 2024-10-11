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
	* Test case 1:
	* The argument is null.
	* Expected result:
	* The method returns false.
	*/
	@Test
	void testCase1() {
		// TODO Auto-generated method stub
	}
	
	/**
	* Test case 2:
	* The argument is not null.
	* The argument is not in the list.
	* Expected result:
	* The method returns false.
	*/
	@Test
	void testCase2() {
		// TODO Auto-generated method stub
	}
	
	/**
	* Test case 3:
	* The argument is not null.
	* The argument is in the list.
	* The list contains only one element.
	* Expected result:
	* The method returns true.
	* The list is empty.
	*/
	@Test
	void testCase3() {
		// TODO Auto-generated method stub
	}
	
	/**
	* Test case 4:
	* The argument is not null.
	* The argument is in the list.
	* The list contains more than one element.
	* The argument is the first element in the list.
	* Expected result:
	* The method returns true.
	* The list contains one less element.
	* The first element in the list is the second element before the method call.
	*/
	@Test
	void testCase4() {
		// TODO Auto-generated method stub
	}
	
	/**
	* Test case 5:
	* The argument is not null.
	* The argument is in the list.
	* The list contains more than one element.
	* The argument is the last element in the list.
	* Expected result:
	* The method returns true.
	* The list contains one less element.
	* The last element in the list is the second last element before the method call.
	*/
	@Test
	void testCase5() {
		// TODO Auto-generated method stub
	}
	
	/**
	* Test case 6:
	* The argument is not null.
	* The argument is in the list.
	* The list contains more than one element.
	* The argument is not the first or last element in the list.
	* Expected result:
	* The method returns true.
	* The list contains one less element.
	* The element before the argument is the same as before the method call.
	* The element after the argument is the same as before the method call.
	*/
	@Test
	void testCase6() {
		// TODO Auto-generated method stub
	}
	
	/**
	* Test case 7:
	* The argument is not null.
	* The argument is in the list.
	* The list contains more than one element.
	* The argument is the first element in the list.
	* The list contains more than one occurrence of the argument.
	* Expected result:
	* The method returns true.
	* The list contains one less occurrence of the argument.
	* The first element in the list is the second element before the method call.
	*/
	@Test
	void testCase7() {
		// TODO Auto-generated method stub
	}
	
	/**
	* Test case 8:
	* The argument is not null.
	* The argument is in the list.
	* The list contains more than one element.
	* The argument is the last element in the list.
	* The list contains more than one occurrence of the argument.
	* Expected result:
	* The method returns true.
	* The list contains one less occurrence of the argument.
	* The last element in the list is the second last element before the method call.
	*/
	@Test
	void testCase8() {
		// TODO Auto-generated method stub
	}
	
	/**
	* Test case 9:
	* The argument is not null.
	* The argument is in the list.
	* The list contains more than one element.
	* The argument is not the first or last element in the list.
	* The list contains more than one occurrence of the argument.
	* Expected result:
	* The method returns true.
	* The list contains one less occurrence of the argument.
	* The element before the argument is the same as before the method call.
	* The element after the argument is the same as before the method call.
	*/
	@Test
	void testCase9() {
		// TODO Auto-generated method stub
	}
	
	/**
	* Test case 10:
	* The argument is not null.
	* The argument is in the list.
	* The list contains more than one element.
	* The argument is the first element in the list.
	* The list contains only one occurrence of the argument.
	* Expected result:
	* The method returns true.
	* The list contains one less element.
	* The first element in the list is the second element before the method call.
	*/
	@Test
	void testCase10() {
		// TODO Auto-generated method stub
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
     * Returns the index of the first occurrence of the specified component in
     * this list, or -1 if the list does not contain this component.
     *
     * @param obj the desired component
     * @return the index of the first occurrence of the specified component in
     *         this list, or -1 if the list does not contain this component
     * @see Vector#indexOf(Object)
     */
    public int indexOf(AbstractNote obj);

    /**
     * Returns the index of the first occurrence of the specified component in
     * this list, starting at the specified index, or -1 if the list does not
     * contain this component.
     *
     * @param obj the desired component
     * @param index the index to start searching from
     * @return the index of the first occurrence of the specified component in
     *         this list at position <code>index</code> or later in the list;
     *         <code>-1</code> if the component is not found
     * @see Vector#indexOf(Object, int)
     */
    public int indexOf(AbstractNote obj, int index);

    /**
     * Returns the index of the last occurrence of the specified component in
     * this list, or -1 if the list does not contain this component.
     *
     * @param obj the desired component
     * @return the index of the last occurrence of the specified component in
     *         this list, or -1 if the list does not contain this component
     * @see Vector#lastIndexOf(Object)
     */
    public int lastIndexOf(AbstractNote obj);

    /**
     * Returns the index of the last occurrence of the specified component in
     * this list, searching backwards from the specified index, or -1 if the
     * list does not contain this component.
     *
     * @param obj the desired component
     * @param index the index to start searching backwards from
     * @return the index of the last occurrence of the specified component in
     *         this list at position less than <code>index</code> in the list;
     *         <code>-1</code> if the component is not found
     * @see Vector#lastIndexOf(Object, int)
     */
    public int lastIndexOf(AbstractNote obj, int index);

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
     * @see Vector#elementAt(int)
     */
    public AbstractNote elementAt(int index);

    /**
     * Returns an array containing all of the elements in this list in the
     * correct order.
     *
     * @return an array containing the elements of the list
     * @see Vector#toArray()
     */
    public AbstractNote[] toArray();

    /**
     * Returns the first component of this list.
     *
     * @return the first component of this list
     * @see Vector#get(int)
     */
    public AbstractNote get(int index);

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index index of the element to replace
     * @param obj element to be stored at the specified position
     * @return the element previously at the specified position
     * @see Vector#set(int, Object)
     */
    public AbstractNote set(int index, AbstractNote obj);

    /**
     * Appends the specified element to the end of this list.
     *
     * @param obj element to be appended to this list
     * @return <code>true</code> (as specified by {@link Collection#add})
     * @see Vector#add(Object)
     */
    public boolean add(AbstractNote obj);

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param obj element to be inserted
     * @see Vector#add(int, Object)
     */
    public void add(int index, AbstractNote obj);

    /**
     * Removes the first (lowest-indexed) occurrence of the argument from this
     * list.
     *
     * @param obj the component to be removed
     * @return <code>true</code> if the argument was a component of this list;
     *         <code>false</code> otherwise
     * @see Vector#removeElement(Object)
     */
    public boolean removeElement(AbstractNote obj);

    /**
     * Removes all of the elements from this list.
     *
     * @see Vector#removeAllElements()
     */
    public void removeAllElements();

    /**
     * Returns <code>true</code> if this list contains no components.
     *
     * @return <code>true</code> if this list contains no components
     * @see Vector#isEmpty()
     */
    public boolean isEmpty();

    /**
     * Returns <code>true</code> if this list contains the specified element.
     *
     * @param obj element whose presence in this list is to be tested
     * @return <code>true</code> if this list contains the specified element
     * @see Vector#contains(Object)
     */
    public boolean contains(AbstractNote obj);

    /**
     * Returns an array containing all of the elements in this list in the
     * correct order.
     *
     * @param objects the array into which the elements of the list are to be
     *        stored, if it is big enough; otherwise, a new array of the same
     *        runtime type is allocated for this purpose
     * @return an array containing the elements of the list
     * @see Vector#toArray(Object[])
     */
    public AbstractNote[] toArray(AbstractNote[] objects);

    /**
     * Returns the element at the specified position in this list.
     *
     * @param index index of the element to return
     * @return object at the specified index
     * @see List#get(int)
     */
    public AbstractNote get(int index);

    /**
     * Replaces the element at the specified position in this list with the
     * specified element.
     *
     * @param index index of the element to replace
     * @param element element to be stored at the specified position
     * @return the element previously at the specified position
     * @see List#set(int, Object)
     */
    public AbstractNote set(int index, AbstractNote element);

    /**
     * Inserts the specified element at the specified position in this list.
     * Shifts the element currently at that position (if any) and any subsequent
     * elements to the right (adds one to their indices).
     *
     * @param index index at which the specified element is to be inserted
     * @param element element to be inserted
     * @see List#add(int, Object)
     */
    public void add(int index, AbstractNote element);

    /**
     * Removes the element at the specified position in this list. Shifts any
     * subsequent elements to the left (subtracts one from their indices).
     * Returns the element that was removed from the list.
     *
     * @param index the index of the element to be removed
     * @return the element previously at the specified position
     * @see List#remove(int)
     */
    public AbstractNote remove(int index);

    /**
     * Removes the first occurrence of the specified element from this list, if
     * it is present. If the list does not contain the element, it is unchanged.
     * Returns <tt>true</tt> if this list contained the specified element
     * (or equivalently, if this list changed as a result of the call).
     *
     * @param o element to be removed from this list, if present
     * @return <tt>true</tt> if this list contained the specified element
     * @see List#remove(Object)
     */
    public boolean remove(AbstractNote o);

    /**
     * Removes all of the elements from this list. The list will be empty after
     * this call returns.
     *
     * @see List#clear()
     */
    public void clear();

    /**
     * Returns <tt>true</tt> if this list contains the specified element. More
     * formally, returns <tt>true</tt> if and only if this list contains at
     * least one element <tt>e</tt> such that
     * <tt>(o==null&nbsp;?&nbsp;e==null&nbsp;:&nbsp;o.equals(e))</tt>.
     *
     * @param o element whose presence in this list is to be tested
     * @return <tt>true</tt> if this list contains the specified element
     * @see List#contains(Object)
     */
    public boolean contains(AbstractNote o);

    /**
     * Returns <tt>true</tt> if this list contains all of the elements of the
     * specified collection.
     *
     * @param c collection to be checked for containment in this list
     * @return <tt>true</tt> if this list contains all of the elements of the
     *         specified collection
     * @see List#containsAll(Collection)
     */
    public boolean containsAll(Collection<? extends AbstractNote> c);

    /**
     * Appends all of the elements in the specified collection to the end of
     * this list, in the order that they are returned by the specified
     * collection's iterator. The behavior of this operation is undefined if the
     * specified collection is modified while the operation is in progress.
     * (This implies that the behavior of this call is undefined if the
     * specified collection is this list, and this list is nonempty.)
     *
     * @param c collection containing elements to be added to this list
     * @return <tt>true</tt> if this list changed as a result of the call
     * @see List#addAll(Collection)
     */
    public boolean addAll(Collection<? extends AbstractNote> c);

    /**
     * Inserts all of the elements in the specified collection