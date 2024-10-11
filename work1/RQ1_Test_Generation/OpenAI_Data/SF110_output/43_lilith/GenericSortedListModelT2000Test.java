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
				GenericSortedListModel<String> model = new GenericSortedListModel<String>();
				model.setData(data);
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
		
		@Test
		public void testGetElementAt2() {
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
				GenericSortedListModel<String> model = new GenericSortedListModel<String>(new Comparator<String>() {
						public int compare(String o1, String o2) {
								return o2.compareTo(o1);
						}
				});
				model.setData(data);
				assertEquals("j", model.getElementAt(0));
				assertEquals("i", model.getElementAt(1));
				assertEquals("h", model.getElementAt(2));
				assertEquals("g", model.getElementAt(3));
				assertEquals("f", model.getElementAt(4));
				assertEquals("e", model.getElementAt(5));
				assertEquals("d", model.getElementAt(6));
				assertEquals("c", model.getElementAt(7));
				assertEquals("b", model.getElementAt(8));
				assertEquals("a", model.getElementAt(9));
		}
		
		@Test
		public void testGetElementAt3() {
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
				GenericSortedListModel<String> model = new GenericSortedListModel<String>();
				model.setData(data);
				model.add("k");
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
				assertEquals("k", model.getElementAt(10));
		}
		
		@Test
		public void testGetElementAt4() {
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
				GenericSortedListModel<String> model = new GenericSortedListModel<String>();
				model.setData(data);
				model.add("a");
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
		
		@Test
		public void testGetElementAt5() {
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
				GenericSortedListModel<String> model = new GenericSortedListModel<String>();
				model.setData(data);
				model.remove("a");
				assertEquals("b", model.getElementAt(0));
				assertEquals("c", model.getElementAt(1));
				assertEquals("d", model.getElementAt(2));
				assertEquals("e", model.getElementAt(3));
				assertEquals("f", model.getElementAt(4));
				assertEquals("g", model.getElementAt(5));
				assertEquals("h", model.getElementAt(6));
				assertEquals("i", model.getElementAt(7));
				assertEquals("j", model.getElementAt(8));
		}
		
		@Test
		public void testGet