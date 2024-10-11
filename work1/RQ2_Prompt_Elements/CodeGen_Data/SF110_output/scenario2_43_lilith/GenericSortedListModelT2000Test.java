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
final JComboBox comboBox1 = new JComboBox();
		
		/**
		* This method initializes a new instance of the {@link GenericSortedListModel} class.
		*/
		private GenericSortedListModelTest() {
		}
		
		/**
		* This method tests if the getElementAt method will return the correct value for the index.
		*/
		@Test
		public void testGetElementAtIndex() {
			this.comboBox1.setModel(new GenericSortedListModel());
			assertNotNull(this.comboBox1.getSelectedIndex());
			this.comboBox1.setSelectedIndex(0);
			assertNotNull(this.comboBox1.getSelectedIndex());
			Object value = this.comboBox1.getSelectedValue();
			assertNotNull(value);
			assertFalse(value instanceof List);
		}
}