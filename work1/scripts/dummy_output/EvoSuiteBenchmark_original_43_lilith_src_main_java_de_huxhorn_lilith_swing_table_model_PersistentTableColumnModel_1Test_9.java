// PersistentTableColumnModel_1Test.java
package de.huxhorn.lilith.swing.table.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.TableColumn;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PersistentTableColumnModel}.
* It contains one unit test case for the {@link PersistentTableColumnModel#getColumnCount(boolean)} method.
*/
class PersistentTableColumnModel_1Test {
		
	// Test data
	private List<TableColumn> testData;

	@Test
	void testGetColumnCount() {
		// Create a list used to test the implementation of this class
		List<TableColumn> columns = new ArrayList<>();

		// Insert a column with a style name
		ColumnWithStyle nameCol = new ColumnWithStyle();
		nameCol.setStyleName("My style");
		TableColumn nameCol1 = new TableColumn(nameCol);
		columns.add(nameCol1);

		// Insert a column with a style name that is a subclass of String
		ColumnWithStyle anotherClassName = new ColumnWithStyle();
		anotherClassName.setStyleName("Another style");
		TableColumn nameCol2 = new TableColumn(anotherClassName);
		columns.add(nameCol2);

		// Insert multiple columns using this instance of the model
		List<TableColumn> columns2 = new ArrayList<>();

		TableColumn colorCol = new TableColumn();
		colorCol.setHeaderValue(null);
		TableColumn titleCol = new TableColumn();
		titleCol.setHeaderValue(null);
		TableColumn textCol = new TableColumn();
		textCol.setHeaderValue(null);

		testData = columns2;
		testData.add(nameCol);
		testData.add(anotherClassName);
		testData.add(colorCol);
		testData.add(titleCol);
		testData.add(textCol);

		// Check the number of columns created
		assertEquals(2, testData.size());

		// Check if there are only visible columns with the right style
		testData = new ArrayList<>();
		testData.add(titleCol);
		testData.add(textCol);
		assertNotNull(new PersistentTableColumnModel().getColumns(true));
		assertNull(new PersistentTableColumnModel().getColumns(false));

		// Check if the model is now updated
		assertEquals(testData.size(), testData.size());

		// Check that only visible columns match the model
		assertTrue(testData.contains(nameCol));
		assertTrue(testData.contains(anotherClassName));
		assertTrue(testData.contains(textCol));
	}


	@Test
	void testEquals() {

		// Two model objects have to be identical, so we can't rely on their hash codes
		TableColumnModel model1 = new PersistentTableColumnModel();
		TableColumnModel model2 = new PersistentTableColumnModel();

		// Create columns
		List<TableColumn> columns1 = new ArrayList<>(testData);
		List<TableColumn> columns2 = new ArrayList<>(columns1);

		// Compare them
		assertTrue(columns1.isEqual(columns2));

		// Modify their number
		testData.set(3, testData.get(1));
		model1 = new PersistentTableMode().getModelForColumns(testData).getModel();
		columns2.set(1, testData.get(3));

		// Compare them
		assertTrue(model1.equals(model2));
		assertTrue(model1.hashCode()!= model2.hashCode());
	}
	
	@Test
	void testHashCode() {
		TableColumnModel model = new PersistentTableColumnModel();
		testData.set(3, testData.get(1));
		model = new PersistentTableMode().getModelForColumns(testData).getModel();
		assertEquals(model.hashCode(), model.hashCode());
	}

	@Test
	void testIterator() {
		// Create the model (only columns)
		TestDataIterator dataIterator1 = new TestDataIterator(testData, true);

		// Check the first element
		assertEquals(testData.get(0), dataIterator1.getModel().getColumns().iterator().next());

		// Check that it continues to return the current element in the iterator
		assertTrue(dataIterator1.hasNext());
		assertEquals(testData.get(0), dataIterator1.next().getModel().getColumns().iterator().next());

		// Check the second element
		assertEquals(testData.get(1), dataIterator1.getModel().getColumns().iterator().next());

		// check the end iteration
		assertFalse(dataIterator1.hasNext());
	}

	@Test
	void testIterator1() {
		// Create the model (only columns), checking that all elements that exist in the last call to the iterator
		// are checked in the previous calling call.
		TestDataIterator dataIterator2 = new TestDataIterator(testData, true);

		// Start the iterator
		Iterator<TableColumn> it = dataIterator2.iterator();
		boolean oneCarry = false;
		while (it.hasNext()) {
			TableColumn testCol = it.next();
			assertEquals(testData.get(1), testCol.getModel().getColumns().iterator().next());
			if (oneCarry) {
				assertFalse(it.hasNext());
				break;
			}
			oneCarry =!it.hasNext();
		}

		assertFalse(it.hasNext());

		// Add a second column
		TableColumn testCol2 = new TableColumn();
		testCol2.setHeaderValue("Second column with style 'Another style' not in the model!");
		testCol2.setStyleName("Another style");
		testData.add(testCol2);

		it = dataIterator2.iterator();
		oneCarry = false;
		while (it.hasNext()) {
			TableColumn testCol = it.next();
			assertEquals(testCol2, testCol.getModel().getColumns().iterator().next());
			if (oneCarry) {
				assertTrue(it.hasNext());
				break;
			}
			oneCarry =!it.hasNext();
		}
	}

	private static class TestDataIterator implements Iterator<TableColumn> {

		final List<TableColumn> testData;
		final boolean onlyVisible;
		private boolean hasNext = false;

		private TestDataIterator(List<TableColumn> testData, boolean onlyVisible) {
			this.testData = testData;
			this.onlyVisible = onlyVisible;
		}

}
}