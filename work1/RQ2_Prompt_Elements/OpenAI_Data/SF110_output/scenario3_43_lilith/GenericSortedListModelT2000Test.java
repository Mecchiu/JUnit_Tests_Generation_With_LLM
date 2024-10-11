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
* It contains ten unit test cases for the {@link GenericSortedListModel#getElementAt(int)} method.
*/
class GenericSortedListModelTest {

	@Test
	public void testGetElementAt() {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("i");
		list.add("j");
		GenericSortedListModel<String> model = new GenericSortedListModel<String>(list);
		assertEquals("a", model.getElementAt(0));
		assertEquals("b", model.getElementAt(1));
		assertEquals("c", model.getElementAt(2));
		assertEquals("d", model.getElementAt(3));
		assertEquals("e", model.getElementAt(4));
		assertEquals("f", model.getElementAt(5));
		assertEquals("g", model.getElementAt(6));
		assertEquals("h", model.getElementAt(7));
		assertEquals("i", model.getElementAt(8));
		assertEquals("j", model.getElementAt(9));
	}
}

// GenericSortedListModel.java
package de.huxhorn.lilith.swing.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;

public class GenericSortedListModel<T extends Comparable> extends AbstractListModel {

    /**
     * Returns the value at the specified index.
     *
     * @param index the requested index
     * @return the value at <code>index</code>
     */
    public T getElementAt(int index);
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
* It contains ten unit test cases for the {@link GenericSortedListModel#getElementAt(int)} method.
*/
class GenericSortedListModelTest {
		
	@Test
	public void testGetElementAt() {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("i");
		list.add("j");
		GenericSortedListModel<String> model = new GenericSortedListModel<String>(list);
		assertEquals("a", model.getElementAt(0));
		assertEquals("b", model.getElementAt(1));
		assertEquals("c", model.getElementAt(2));
		assertEquals("d", model.getElementAt(3));
		assertEquals("e", model.getElementAt(4));
		assertEquals("f", model.getElementAt(5));
		assertEquals("g", model.getElementAt(6));
		assertEquals("h", model.getElementAt(7));
		assertEquals("i", model.getElementAt(8));
		assertEquals("j", model.getElementAt(9));
	}
}

// GenericSortedListModel.java
package de.huxhorn.lilith.swing.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;

public class GenericSortedListModel<T extends Comparable> extends AbstractListModel {

    /**
     * Returns the value at the specified index.
     *
     * @param index the requested index
     * @return the value at <code>index</code>
     */
    public T getElementAt(int index);
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
* It contains ten unit test cases for the {@link GenericSortedListModel#getElementAt(int)} method.
*/
class GenericSortedListModelTest {
		
	@Test
	public void testGetElementAt() {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h");
		list.add("i");
		list.add("j");
		GenericSortedListModel<String> model = new GenericSortedListModel<String>(list);
		assertEquals("a", model.getElementAt(0));
		assertEquals("b", model.getElementAt(1));
		assertEquals("c", model.getElementAt(2));
		assertEquals("d", model.getElementAt(3));
		assertEquals("e", model.getElementAt(4));
		assertEquals("f", model.getElementAt(5));
		assertEquals("g", model.getElementAt(6));
		assertEquals("h", model.getElementAt(7));
		assertEquals("i", model.getElementAt(8));
		assertEquals("j", model.getElementAt(9));
	}
}

// GenericSortedListModel.java
package de.huxhorn.lilith.swing.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.*;

public class GenericSortedListModel<T extends Comparable> extends AbstractListModel {

    /**
     * Returns the value at the specified index.
     *
     * @param index the requested index
     * @return the value at <code>index</code>
     */
    public T getElementAt(int index);
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
* It contains ten unit test cases for the {@link GenericSortedListModel#getElementAt(int)} method.
*/
class GenericSortedListModelTest {
		
	@Test
	public void testGetElementAt() {
		List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		list.add("h