// GenericSortedListModelTest.java
package de.huxhorn.lilith.swing.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GenericSortedListModel}.
* It contains one unit test case for the {@link GenericSortedListModel#getElementAt(int)} method.
*/
class GenericSortedListModelTest {

    /**
	* Test method for {@link #getElementAt(int) getElementAt(int)}.
	* Tests for the exception that is thrown when the index is out of bounds.
	*/
	@Test
	public void testGetElementAtIndexOutOfBounds() {
		GenericSortedListModel<String> listModel =
				new GenericSortedListModel
						<List<String>>() {

					/** The List model */
					private List list = new ArrayList();

					public int getSize() {
						return 0;
					}

					public boolean add(String s) {
						list.add(s);
						return true;
					}

					public List getList() {
						return list;
					}

					public void setList(List list) {
						this.list = list;
					}

					public void removeElementAt(int index) {
						assertTrue("remove element at out of bounds index", index > list.size());
						ListUtils.addToList(list, list.get(index - 1));
						ListUtils.addToList(list, list.get(index));

						ListUtils.addToList(list, index);
					}

					public void add(int index, String s) {
						assertTrue("add element at out of bounds index", index > list.size());
						ListUtils.addToList(list, s);
					}

					public String remove(int index) {
						assertTrue("remove element at out of bounds index", index > list.size());
						return (String) list.remove(index);
					}

					public List removeElementAt(int index) {
						assertTrue("remove element at out of bounds index", index > list.size());
						return (List) list.remove(index);
					}

					public void clear() {
						ListUtils.removeFromList(list, Collections.<String>emptyList());
					}
				};
		
		
		assertEquals(listModel, listModel.getList());
		assertEquals(listModel, listModel.get());
		
		assertTrue(listModel.getList().size() > 0);

	}
    
}

// GenericListModelTest.java
//
package de.huxhorn.lilith.swing.preferences;

import javax.swing.JList;
import org.junit.jupiter.api.Test;

public abstract class GenericListModelTest<T extends Comparable> extends TestBase{

	public abstract AbstractListModel<T> createElementAt();

	public abstract void removeElementAt(int index);

	public abstract void removeElementAt(int index, int count);

	public abstract void clear();

	public abstract void add(int index);
	public abstract List<String> getList();

	String T[] = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
	
	public AbstractListModel<T> getListModel(){
		return createElementAt();
	}

}
