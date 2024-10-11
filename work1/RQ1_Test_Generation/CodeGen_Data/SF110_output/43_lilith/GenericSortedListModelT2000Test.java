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
// GenericSortedListModel.java
/*
 * Lilith - a log event viewer.
 * Copyright (C) 2007-2009 Joern Huxhorn
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.huxhorn.lilith.swing.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;

public class GenericSortedListModel<T extends Comparable> extends AbstractListModel {

    private final List<T> data;

    private final Comparator<T> comparator;

    public GenericSortedListModel() {
        this(null);
    }

    public GenericSortedListModel(Comparator<T> comparator) {
        this.data = new ArrayList<T>();
        this.comparator = comparator;
    }

    public void setData(List<T> data) {
        if (!this.data.equals(data)) {
            int size = this.data.size();
            if (size > 0) {
                this.data.clear();
                fireIntervalRemoved(this, 0, size - 1);
            }
            size = data.size();
            if (size > 0) {
                this.data.addAll(data);
                if (comparator!= null) {
                    Collections.sort(this.data, comparator);
                } else {
                    Collections.sort(this.data);
                }
                fireIntervalAdded(this, 0, size - 1);
            }
        }
    }

    public List<T> getData() {
        return new ArrayList<T>(data);
    }

    public void add(T element) {
        if (!data.contains(element)) {
            data.add(element);
            if (comparator!= null) {
                Collections.sort(this.data, comparator);
            } else {
                Collections.sort(this.data);
            }
            int size = data.size();
            fireContentsChanged(this, 0, size - 1);
        }
    }

    public void remove(T element) {
        int index = data.indexOf(element);
        if (index >= 0) {
            data.remove(index);
            fireIntervalRemoved(this, index, index);
        }
    }

    /**
     * Returns the length of the list.
     *
     * @return the length of the list
     */
    public int getSize() {
        return data.size();
    }

    /**
     * Returns the value at the specified index.
     *
     * @param index the requested index
     * @return the value at <code>index</code>
     */
    public T getElementAt(int index) {
        return data.get(index);
    }
}

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
		 * Tests if the default sorting happens when there are no elements.
		 * The default sorting does not happen for empty lists.
		 */
		@Test
		void when_nothing_sorted() {
			checkAndAddElementsToList(Collections.emptyList(), data);
		}
		 /**
		  * Tests if a single element is retained.
		  * The expected value is the original list element and not the removed value.
		  */
		private void checkAndAddElementsToList(List<? extends Comparable<?>> list, List<T> data) {
			assertEquals(Collections.unmodifiableList(list), data);
			assertEquals(Collections.unmodifiableList(Collections.singletonList(list.get(0))), Collections.unmodifiableList(data));
			assertEquals(Collections.unmodifiableList(Collections.singletonList(list.get(data.size() - 1))), Collections.unmodifiableList(data));
			assertEquals(Collections.unmodifiableList(Collections.singletonList(list.get(data.size() - 1))), Collections.unmodifiableList(Collections.unmodifiableList(data)));
		}
		/**
		 * Tests if the insertion and removal of an element.
		 *
		 * @param e the element that is to be inserted
		 * @param original list that contains the original list element before the insertion
		 * @param newList list that contains the element that is about to be removed
		 * @param expected the expected value for the list after the insert
		 */
		private void assertMoved(T e, List<? extends Comparable<?>> original, List<T> newList, Comparable<?> expected) {
			assertEquals(original, newList);
			assertEquals(original, Collections.unmodifiableList(Collections.unmodifiableList(Collections.singletonList(e))));
			assertEquals(newList, Collections.unmodifiableList(Collections.unmodifiableList(Collections.singletonList(e))));
			assertEquals(newList, Collections.unmodifiableList(Collections.unmodifiableList(e)));
			assertEquals(newList, Collections.unmodifiableList(Collections.unmodifiableList(e)));
			assertEquals(newList, Collections.unmodifiableList(Collections.unmodifiableList(e)));
			assertEquals(Collections.unmodifiableList(Collections.unmodifiableList(Collections.unmodifiableList(e))), Collections.unmodifiableList(Collections.unmodifiableList(expected)));
			assertEquals(Collections.unmodifiableList(Collections.unmodifiableList(Collections.unmodifiableList(Collections.unmodifiableList(Collections.unmodifiableList(expected)))), Collections.unmodifiableList(Collections.unmodifiableList(Collections.unmodifiableList(expected)))), Collections.unmodifiableList(Collections.unmodifiableList(Collections.unmodifiableList(Collections.unmodifiableList(Collections.unmodifiableList(expected)))), Collections.unmodifiableList(Collections.unmodifiableList(Collections.unmodifiableList(expected))), Collections.unmodifiableList(Collections.unmodifiableList(Collections.unmodifiableList(expected) )));
		}

		/**
		 * Tests the insertion and modification of the whole list.
		 *
		 * @param e the element that is being inserted
		 * @param original list that contains the original list element before the insertion
		 * @param newList list that contains the element that is about to be removed
		 * @param expected the expected value for the list after the insertion
		 */
		private void assertInserted(T e, List<? extends Comparable<?>> original, List<T> newList, Comparable<?> expected) {
			assertEquals(newList.get(0), e);
			assertEquals(original.get(