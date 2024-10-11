// PersistentTableColumnModel_3Test.java
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModel_3Test {

	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The column identifier is not null.
	* The column identifier is equal to the specified identifier.
	* The onlyVisible parameter is set to true.
	* Expected result: 0
	*/
	@Test
	public void testGetColumnIndex_1() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		columnModel.addColumn(column);
		int result = columnModel.getColumnIndex("column", true);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The column identifier is not null.
	* The column identifier is equal to the specified identifier.
	* The onlyVisible parameter is set to false.
	* Expected result: 0
	*/
	@Test
	public void testGetColumnIndex_2() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		columnModel.addColumn(column);
		int result = columnModel.getColumnIndex("column", false);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The column identifier is not null.
	* The column identifier is not equal to the specified identifier.
	* The onlyVisible parameter is set to true.
	* Expected result: -1
	*/
	@Test
	public void testGetColumnIndex_3() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		columnModel.addColumn(column);
		int result = columnModel.getColumnIndex("column2", true);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The column identifier is not null.
	* The column identifier is not equal to the specified identifier.
	* The onlyVisible parameter is set to false.
	* Expected result: -1
	*/
	@Test
	public void testGetColumnIndex_4() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		columnModel.addColumn(column);
		int result = columnModel.getColumnIndex("column2", false);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The column identifier is null.
	* The onlyVisible parameter is set to true.
	* Expected result: -1
	*/
	@Test
	public void testGetColumnIndex_5() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier(null);
		columnModel.addColumn(column);
		int result = columnModel.getColumnIndex("column", true);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The column identifier is null.
	* The onlyVisible parameter is set to false.
	* Expected result: -1
	*/
	@Test
	public void testGetColumnIndex_6() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier(null);
		columnModel.addColumn(column);
		int result = columnModel.getColumnIndex("column", false);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is invisible.
	* The column identifier is not null.
	* The column identifier is equal to the specified identifier.
	* The onlyVisible parameter is set to true.
	* Expected result: -1
	*/
	@Test
	public void testGetColumnIndex_7() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		columnModel.addColumn(column);
		columnModel.setColumnVisible(column, false);
		int result = columnModel.getColumnIndex("column", true);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is invisible.
	* The column identifier is not null.
	* The column identifier is equal to the specified identifier.
	* The onlyVisible parameter is set to false.
	* Expected result: 0
	*/
	@Test
	public void testGetColumnIndex_8() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		columnModel.addColumn(column);
		columnModel.setColumnVisible(column, false);
		int result = columnModel.getColumnIndex("column", false);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is invisible.
	* The column identifier is not null.
	* The column identifier is not equal to the specified identifier.
	* The onlyVisible parameter is set to true.
	* Expected result: -1
	*/
	@Test
	public void testGetColumnIndex_9() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		columnModel.addColumn(column);
		columnModel.setColumnVisible(column, false);
		int result = columnModel.getColumnIndex("column2", true);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is invisible.
	* The column identifier is not null.
	* The column identifier is not equal to the specified identifier.
	* The onlyVisible parameter is set to false.
	* Expected result: -1
	*/
	@Test
	public void testGetColumnIndex_10() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("column");
		columnModel.addColumn(column);
		columnModel.setColumnVisible(column, false);
		int result = columnModel.getColumnIndex("column2", false);
		assertEquals(-1, result);
	}
	
}

// PersistentTableColumnModel_4Test.java
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModel_4Test {
		
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing two columns.
	* The first column is visible.
	* The first column identifier is not null.
	* The first column identifier is equal to the specified identifier.
	* The second column is visible.
	* The second column identifier is not null.
	* The second column identifier is not equal to the specified identifier.
	* The onlyVisible parameter is set to true.
	* Expected result: 0
	*/
	@Test
	public void testGetColumnIndex_1() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn();
		column1.setIdentifier("column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("column1", true);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing two columns.
	* The first column is visible.
	* The first column identifier is not null.
	* The first column identifier is equal to the specified identifier.
	* The second column is visible.
	* The second column identifier is not null.
	* The second column identifier is not equal to the specified identifier.
	* The onlyVisible parameter is set to false.
	* Expected result: 0
	*/
	@Test
	public void testGetColumnIndex_2() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn();
		column1.setIdentifier("column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("column1", false);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing two columns.
	* The first column is visible.
	* The first column identifier is not null.
	* The first column identifier is not equal to the specified identifier.
	* The second column is visible.
	* The second column identifier is not null.
	* The second column identifier is equal to the specified identifier.
	* The onlyVisible parameter is set to true.
	* Expected result: 1
	*/
	@Test
	public void testGetColumnIndex_3() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn();
		column1.setIdentifier("column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("column2", true);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing two columns.
	* The first column is visible.
	* The first column identifier is not null.
	* The first column identifier is not equal to the specified identifier.
	* The second column is visible.
	* The second column identifier is not null.
	* The second column identifier is equal to the specified identifier.
	* The onlyVisible parameter is set to false.
	* Expected result: 1
	*/
	@Test
	public void testGetColumnIndex_4() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn();
		column1.setIdentifier("column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("column2", false);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing two columns.
	* The first column is visible.
	* The first column identifier is not null.
	* The first column identifier is not equal to the specified identifier.
	* The second column is visible.
	* The second column identifier is not null.
	* The second column identifier is not equal to the specified identifier.
	* The onlyVisible parameter is set to true.
	* Expected result: -1
	*/
	@Test
	public void testGetColumnIndex_5() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn();
		column1.setIdentifier("column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("column3", true);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing two columns.
	* The first column is visible.
	* The first column identifier is not null.
	* The first column identifier is not equal to the specified identifier.
	* The second column is visible.
	* The second column identifier is not null.
	* The second column identifier is not equal to the specified identifier.
	* The onlyVisible parameter is set to false.
	* Expected result: -1
	*/
	@Test
	public void testGetColumnIndex_6() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn();
		column1.setIdentifier("column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn();
		column2.setIdentifier("column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("column3", false);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing two columns.
	* The first column is visible.
	* The first column identifier is null.
	* The second column is visible.
	* The second column identifier is not null.
	* The second column identifier is equal to the specified identifier.
	* The onlyVisible parameter is set to true.
	* Expected result: 1
	*/
	@Test
	public void testGetColumnIndex_7() {
		PersistentTableColumnModel column