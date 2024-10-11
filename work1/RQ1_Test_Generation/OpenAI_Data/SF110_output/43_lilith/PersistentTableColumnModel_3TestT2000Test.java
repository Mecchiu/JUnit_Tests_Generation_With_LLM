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
	* Tested with a column model with two columns, one visible and one invisible.
	* The identifier of the visible column is searched.
	* The expected result is 0.
	*/
	@Test
	public void testGetColumnIndex_1() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		column1.setIdentifier("Column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn(1);
		column2.setIdentifier("Column2");
		columnModel.addColumn(column2);
		columnModel.removeColumn(column2);
		int result = columnModel.getColumnIndex("Column1", true);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model with two columns, one visible and one invisible.
	* The identifier of the invisible column is searched.
	* The expected result is 0.
	*/
	@Test
	public void testGetColumnIndex_2() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		column1.setIdentifier("Column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn(1);
		column2.setIdentifier("Column2");
		columnModel.addColumn(column2);
		columnModel.removeColumn(column2);
		int result = columnModel.getColumnIndex("Column2", false);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model with two columns, one visible and one invisible.
	* The identifier of the visible column is searched.
	* The expected result is 0.
	*/
	@Test
	public void testGetColumnIndex_3() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		column1.setIdentifier("Column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn(1);
		column2.setIdentifier("Column2");
		columnModel.addColumn(column2);
		columnModel.removeColumn(column2);
		int result = columnModel.getColumnIndex("Column1", false);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model with two columns, one visible and one invisible.
	* The identifier of the invisible column is searched.
	* The expected result is 0.
	*/
	@Test
	public void testGetColumnIndex_4() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		column1.setIdentifier("Column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn(1);
		column2.setIdentifier("Column2");
		columnModel.addColumn(column2);
		columnModel.removeColumn(column2);
		int result = columnModel.getColumnIndex("Column2", true);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model with two columns, both visible.
	* The identifier of the first column is searched.
	* The expected result is 0.
	*/
	@Test
	public void testGetColumnIndex_5() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		column1.setIdentifier("Column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn(1);
		column2.setIdentifier("Column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("Column1", true);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model with two columns, both visible.
	* The identifier of the second column is searched.
	* The expected result is 0.
	*/
	@Test
	public void testGetColumnIndex_6() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		column1.setIdentifier("Column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn(1);
		column2.setIdentifier("Column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("Column2", true);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model with two columns, both visible.
	* The identifier of the first column is searched.
	* The expected result is 0.
	*/
	@Test
	public void testGetColumnIndex_7() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		column1.setIdentifier("Column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn(1);
		column2.setIdentifier("Column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("Column1", false);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model with two columns, both visible.
	* The identifier of the second column is searched.
	* The expected result is 0.
	*/
	@Test
	public void testGetColumnIndex_8() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		column1.setIdentifier("Column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn(1);
		column2.setIdentifier("Column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("Column2", false);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model with two columns, both visible.
	* The identifier of the first column is searched.
	* The expected result is 0.
	*/
	@Test
	public void testGetColumnIndex_9() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		column1.setIdentifier("Column1");
		columnModel.addColumn(column1);
		TableColumn column2 = new TableColumn(1);
		column2.setIdentifier("Column2");
		columnModel.addColumn(column2);
		int result = columnModel.getColumnIndex("Column1", true);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link Persistent