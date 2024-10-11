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
		
	public GenericSortedListModelTest() {
	}

	@SuppressWarnings("EmptyMethod")
	@Test
	public void testGetSize() {
	}

	@SuppressWarnings("EmptyMethod")
	@Test
	public void testAdd() {
		assertNotNull(getModel());
		final List<T> emptyList = new ArrayList<T>();
		assertEquals("null after", getModel().getSize(), emptyList.getSize());
		add(emptyList);
		assertEquals("one after", 1, emptyList.size());
		final List<T> list = new ArrayList<T>();
		for (int i = 0; i < 10; i++) {
			list.add(new Element(i));
		}
		assertEquals("one after", 10, list.size());
		assertEquals("element at position 0", (Element) list.toArray()[0], getModel().getElementAt(0));
	}

	@SuppressWarnings("EmptyMethod")
	@Test
	public void testRemove() {
		assertNotNull(getModel());
		final List<T> emptyList = new ArrayList<T>();
		assertEquals("null after", getModel().getSize(), emptyList.getSize());
		remove(emptyList);
		System.out.println("size after");
		assertEquals("one empty", 1, emptyList.size());

		final List<T> list = new ArrayList<T>();
		list.add(new Element(10));
		list.remove(new Element(9));
		System.out.println("removed");
		assertEquals("empty now", 0, list.size());
		assertEquals("element at position 0", (Element) list.toArray()[0], getModel().getElementAt(0));
	}

	@SuppressWarnings("EmptyMethod")
	@Test
	public void testCompare() {
		assertNotNull(getModel());
		final List<T> list1 = new ArrayList<T>();
		final List<T> list2 = new ArrayList<T>();
		for (int i = 0; i < 10; i++) {
			list1.add(new Element(i));
		}
		assertEquals("list1 now", Collections.<T>emptyList(), list1);		
		list2.add(new Element(10));
		list1.add(new Element(9));
		list2.add(new Element(8));
		Collections.sort(list1, list2);
		final List<T> result = new ArrayList<T>();
		result.add(new Element(9));
		result.add(new Element(10));
		result.add(new Element(1));
		result.remove(1);
		assertEquals("reordered", Collections.<T>emptyList(), result);
		assertEquals("compare by position 1", 0, list2.indexOf(new Element(9)));
		assertEquals("compare by position 1", -1, list2.indexOf(new Element(10)));
	}
	
	private class Element implements Comparable<Element> {

		int index;

		Element(int index) {
			this.index = index;
		}

		@Override
		public int compareTo(Element element) {
			return index - element.index;
		}

		@Override
		public String toString() {
			return "The list[" + index + "] is a copy of the list[]";
		}
	}
}