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
				List<String> data = new ArrayList<String>();
				data.add("a");
				data.add("b");
				data.add("c");
				data.add("d");
				data.add("e");
				data.add("f");
				data.add("g");
				data.add("h");
				data.add("i");
				data.add("j");
				GenericSortedListModel<String> instance = new GenericSortedListModel<String>();
				instance.setData(data);
				assertEquals("a", instance.getElementAt(0));
				assertEquals("b", instance.getElementAt(1));
				assertEquals("c", instance.getElementAt(2));
				assertEquals("d", instance.getElementAt(3));
				assertEquals("e", instance.getElementAt(4));
				assertEquals("f", instance.getElementAt(5));
				assertEquals("g", instance.getElementAt(6));
				assertEquals("h", instance.getElementAt(7));
				assertEquals("i", instance.getElementAt(8));
				assertEquals("j", instance.getElementAt(9));
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
* It contains ten unit test cases for the {@link GenericSortedListModel#getElementAt(int)} method.
*/
class GenericSortedListModelTest {
		
		@Test
		public void testGetElementAt() {
				List<String> data = new ArrayList<String>();
				data.add("a");
				data.add("b");
				data.add("c");
				data.add("d");
				data.add("e");
				data.add("f");
				data.add("g");
				data.add("h");
				data.add("i");
				data.add("j");
				GenericSortedListModel<String> instance = new GenericSortedListModel<String>();
				instance.setData(data);
				assertEquals("a", instance.getElementAt(0));
				assertEquals("b", instance.getElementAt(1));
				assertEquals("c", instance.getElementAt(2));
				assertEquals("d", instance.getElementAt(3));
				assertEquals("e", instance.getElementAt(4));
				assertEquals("f", instance.getElementAt(5));
				assertEquals("g", instance.getElementAt(6));
				assertEquals("h", instance.getElementAt(7));
				assertEquals("i", instance.getElementAt(8));
				assertEquals("j", instance.getElementAt(9));
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
* It contains ten unit test cases for the {@link GenericSortedListModel#getElementAt(int)} method.
*/
class GenericSortedListModelTest {
		
		@Test
		public void testGetElementAt() {
				List<String> data = new ArrayList<String>();
				data.add("a");
				data.add("b");
				data.add("c");
				data.add("d");
				data.add("e");
				data.add("f");
				data.add("g");
				data.add("h");
				data.add("i");
				data.add("j");
				GenericSortedListModel<String> instance = new GenericSortedListModel<String>();
				instance.setData(data);
				assertEquals("a", instance.getElementAt(0));
				assertEquals("b", instance.getElementAt(1));
				assertEquals("c", instance.getElementAt(2));
				assertEquals("d", instance.getElementAt(3));
				assertEquals("e", instance.getElementAt(4));
				assertEquals("f", instance.getElementAt(5));
				assertEquals("g", instance.getElementAt(6));
				assertEquals("h", instance.getElementAt(7));
				assertEquals("i", instance.getElementAt(8));
				assertEquals("j", instance.getElementAt(9));
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
    public T getElementAt(int index) {
        return data.get(index);
    }
}

// GenericSortedListModelTest.java
package de.huxhorn.lilith.swing.preferences;

import java.util.ArrayList;
import java.util.Collections;
import java.