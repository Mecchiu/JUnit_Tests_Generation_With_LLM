// PersistentTableColumnModelTest.java
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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
*/
class PersistentTableColumnModelTest {

	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>true</code>.
	* The test case is successful if the method returns an <code>Enumeration</code> of all the visible columns in the model.
	*/
	@Test
	public void testGetColumns_onlyVisible_true() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		TableColumn column2 = new TableColumn(1);
		TableColumn column3 = new TableColumn(2);
		TableColumn column4 = new TableColumn(3);
		TableColumn column5 = new TableColumn(4);
		TableColumn column6 = new TableColumn(5);
		TableColumn column7 = new TableColumn(6);
		TableColumn column8 = new TableColumn(7);
		TableColumn column9 = new TableColumn(8);
		TableColumn column10 = new TableColumn(9);
		model.addColumn(column1);
		model.addColumn(column2);
		model.addColumn(column3);
		model.addColumn(column4);
		model.addColumn(column5);
		model.addColumn(column6);
		model.addColumn(column7);
		model.addColumn(column8);
		model.addColumn(column9);
		model.addColumn(column10);
		column1.setMinWidth(0);
		column1.setMaxWidth(0);
		column2.setMinWidth(0);
		column2.setMaxWidth(0);
		column3.setMinWidth(0);
		column3.setMaxWidth(0);
		column4.setMinWidth(0);
		column4.setMaxWidth(0);
		column5.setMinWidth(0);
		column5.setMaxWidth(0);
		column6.setMinWidth(0);
		column6.setMaxWidth(0);
		column7.setMinWidth(0);
		column7.setMaxWidth(0);
		column8.setMinWidth(0);
		column8.setMaxWidth(0);
		column9.setMinWidth(0);
		column9.setMaxWidth(0);
		column10.setMinWidth(0);
		column10.setMaxWidth(0);
		List<TableColumn> expected = new ArrayList<TableColumn>();
		expected.add(column1);
		expected.add(column2);
		expected.add(column3);
		expected.add(column4);
		expected.add(column5);
		expected.add(column6);
		expected.add(column7);
		expected.add(column8);
		expected.add(column9);
		expected.add(column10);
		Iterator<TableColumn> actual = model.getColumns(true);
		assertEquals(expected.size(), count(actual));
		for (TableColumn column : expected) {
			assertTrue(actual.hasNext());
			assertEquals(column, actual.next());
		}
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>false</code>.
	* The test case is successful if the method returns an <code>Enumeration</code> of all the columns in the model.
	*/
	@Test
	public void testGetColumns_onlyVisible_false() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		TableColumn column2 = new TableColumn(1);
		TableColumn column3 = new TableColumn(2);
		TableColumn column4 = new TableColumn(3);
		TableColumn column5 = new TableColumn(4);
		TableColumn column6 = new TableColumn(5);
		TableColumn column7 = new TableColumn(6);
		TableColumn column8 = new TableColumn(7);
		TableColumn column9 = new TableColumn(8);
		TableColumn column10 = new TableColumn(9);
		model.addColumn(column1);
		model.addColumn(column2);
		model.addColumn(column3);
		model.addColumn(column4);
		model.addColumn(column5);
		model.addColumn(column6);
		model.addColumn(column7);
		model.addColumn(column8);
		model.addColumn(column9);
		model.addColumn(column10);
		column1.setMinWidth(0);
		column1.setMaxWidth(0);
		column2.setMinWidth(0);
		column2.setMaxWidth(0);
		column3.setMinWidth(0);
		column3.setMaxWidth(0);
		column4.setMinWidth(0);
		column4.setMaxWidth(0);
		column5.setMinWidth(0);
		column5.setMaxWidth(0);
		column6.setMinWidth(0);
		column6.setMaxWidth(0);
		column7.setMinWidth(0);
		column7.setMaxWidth(0);
		column8.setMinWidth(0);
		column8.setMaxWidth(0);
		column9.setMinWidth(0);
		column9.setMaxWidth(0);
		column10.setMinWidth(0);
		column10.setMaxWidth(0);
		List<TableColumn> expected = new ArrayList<TableColumn>();
		expected.add(column1);
		expected.add(column2);
		expected.add(column3);
		expected.add(column4);
		expected.add(column5);
		expected.add(column6);
		expected.add(column7);
		expected.add(column8);
		expected.add(column9);
		expected.add(column10);
		Iterator<TableColumn> actual = model.getColumns(false);
		assertEquals(expected.size(), count(actual));
		for (TableColumn column : expected) {
			assertTrue(actual.hasNext());
			assertEquals(column, actual.next());
		}
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>true</code> and the model contains only one column.
	* The test case is successful if the method returns an <code>Enumeration</code> of all the visible columns in the model.
	*/
	@Test
	public void testGetColumns_onlyVisible_true_oneColumn() {
		PersistentTableColumnModel model = new PersistentTableColumnModel();
		TableColumn column1 = new TableColumn(0);
		model.addColumn(column1);
		column1.setMinWidth(0);
		column1.setMaxWidth(0);
		List<TableColumn> expected = new ArrayList<TableColumn>();
		expected.add(column1);
		Iterator<TableColumn> actual = model.getColumns(true);
		assertEquals(expected.size(), count(actual));
		for (TableColumn column : expected) {
			assertTrue(actual.hasNext());
			assertEquals(column, actual.next());
		}
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* It tests the case when the parameter <code>onlyVisible</code> is set to <code>false</code> and the model contains only one column.
	* The test case is successful if the method returns