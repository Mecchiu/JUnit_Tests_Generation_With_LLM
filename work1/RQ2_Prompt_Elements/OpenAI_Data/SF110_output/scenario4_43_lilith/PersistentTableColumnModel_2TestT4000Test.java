// PersistentTableColumnModel_2Test.java
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
class PersistentTableColumnModel_2Test {

	/**
	* Test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* This test case tests the method with the parameter <code>onlyVisible</code> set to <code>true</code>.
	* The test case expects that the method returns an <code>Iterator</code> with the size of the visible columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_true() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn(0));
		persistentTableColumnModel.addColumn(new TableColumn(1));
		persistentTableColumnModel.addColumn(new TableColumn(2));
		persistentTableColumnModel.addColumn(new TableColumn(3));
		persistentTableColumnModel.addColumn(new TableColumn(4));
		persistentTableColumnModel.addColumn(new TableColumn(5));
		persistentTableColumnModel.addColumn(new TableColumn(6));
		persistentTableColumnModel.addColumn(new TableColumn(7));
		persistentTableColumnModel.addColumn(new TableColumn(8));
		persistentTableColumnModel.addColumn(new TableColumn(9));
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		int count = 0;
		while (iterator.hasNext()) {
			iterator.next();
			count++;
		}
		assertEquals(5, count);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* This test case tests the method with the parameter <code>onlyVisible</code> set to <code>false</code>.
	* The test case expects that the method returns an <code>Iterator</code> with the size of all columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_false() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn(0));
		persistentTableColumnModel.addColumn(new TableColumn(1));
		persistentTableColumnModel.addColumn(new TableColumn(2));
		persistentTableColumnModel.addColumn(new TableColumn(3));
		persistentTableColumnModel.addColumn(new TableColumn(4));
		persistentTableColumnModel.addColumn(new TableColumn(5));
		persistentTableColumnModel.addColumn(new TableColumn(6));
		persistentTableColumnModel.addColumn(new TableColumn(7));
		persistentTableColumnModel.addColumn(new TableColumn(8));
		persistentTableColumnModel.addColumn(new TableColumn(9));
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		int count = 0;
		while (iterator.hasNext()) {
			iterator.next();
			count++;
		}
		assertEquals(10, count);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* This test case tests the method with the parameter <code>onlyVisible</code> set to <code>true</code>.
	* The test case expects that the method returns an <code>Iterator</code> with the size of the visible columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_true_2() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn(0));
		persistentTableColumnModel.addColumn(new TableColumn(1));
		persistentTableColumnModel.addColumn(new TableColumn(2));
		persistentTableColumnModel.addColumn(new TableColumn(3));
		persistentTableColumnModel.addColumn(new TableColumn(4));
		persistentTableColumnModel.addColumn(new TableColumn(5));
		persistentTableColumnModel.addColumn(new TableColumn(6));
		persistentTableColumnModel.addColumn(new TableColumn(7));
		persistentTableColumnModel.addColumn(new TableColumn(8));
		persistentTableColumnModel.addColumn(new TableColumn(9));
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		int count = 0;
		while (iterator.hasNext()) {
			iterator.next();
			count++;
		}
		assertEquals(5, count);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* This test case tests the method with the parameter <code>onlyVisible</code> set to <code>false</code>.
	* The test case expects that the method returns an <code>Iterator</code> with the size of all columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_false_2() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn(0));
		persistentTableColumnModel.addColumn(new TableColumn(1));
		persistentTableColumnModel.addColumn(new TableColumn(2));
		persistentTableColumnModel.addColumn(new TableColumn(3));
		persistentTableColumnModel.addColumn(new TableColumn(4));
		persistentTableColumnModel.addColumn(new TableColumn(5));
		persistentTableColumnModel.addColumn(new TableColumn(6));
		persistentTableColumnModel.addColumn(new TableColumn(7));
		persistentTableColumnModel.addColumn(new TableColumn(8));
		persistentTableColumnModel.addColumn(new TableColumn(9));
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		int count = 0;
		while (iterator.hasNext()) {
			iterator.next();
			count++;
		}
		assertEquals(10, count);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* This test case tests the method with the parameter <code>onlyVisible</code> set to <code>true</code>.
	* The test case expects that the method returns an <code>Iterator</code> with the size of the visible columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_true_3() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn(0));
		persistentTableColumnModel.addColumn(new TableColumn(1));
		persistentTableColumnModel.addColumn(new TableColumn(2));
		persistentTableColumnModel.addColumn(new TableColumn(3));
		persistentTableColumnModel.addColumn(new TableColumn(4));
		persistentTableColumnModel.addColumn(new TableColumn(5));
		persistentTableColumnModel.addColumn(new TableColumn(6));
		persistentTableColumnModel.addColumn(new TableColumn(7));
		persistentTableColumnModel.addColumn(new TableColumn(8));
		persistentTableColumnModel.addColumn(new TableColumn(9));
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		int count = 0;
		while (iterator.hasNext()) {
			iterator.next();
			count++;
		}
		assertEquals(5, count);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* This test case tests the method with the parameter <code>onlyVisible</code> set to <code>false</code>.
	* The test case expects that the method returns an <code>Iterator</code> with the size of all columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_false_3() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn(0));
		persistentTableColumnModel.addColumn(new TableColumn(1));
		persistentTableColumnModel.addColumn(new TableColumn(2));
		persistentTableColumnModel.addColumn(new TableColumn(3));
		persistentTableColumnModel.addColumn(new TableColumn(4));
		persistentTableColumnModel.addColumn(new TableColumn(5));
		persistentTableColumnModel.addColumn(new TableColumn(6));
		persistentTableColumnModel.addColumn(new TableColumn(7));
		persistentTableColumnModel.addColumn(new TableColumn(8));
		persistentTableColumnModel.addColumn(new TableColumn(9));
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(false);
		int count = 0;
		while (iterator.hasNext()) {
			iterator.next();
			count++;
		}
		assertEquals(10, count);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* This test case tests the method with the parameter <code>onlyVisible</code> set to <code>true</code>.
	* The test case expects that the method returns an <code>Iterator</code> with the size of the visible columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_true_4() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn(0));
		persistentTableColumnModel.addColumn(new TableColumn(1));
		persistentTableColumnModel.addColumn(new TableColumn(2));
		persistentTableColumnModel.addColumn(new TableColumn(3));
		persistentTableColumnModel.addColumn(new TableColumn(4));
		persistentTableColumnModel.addColumn(new TableColumn(5));
		persistentTableColumnModel.addColumn(new TableColumn(6));
		persistentTableColumnModel.addColumn(new TableColumn(7));
		persistentTableColumnModel.addColumn(new TableColumn(8));
		persistentTableColumnModel.addColumn(new TableColumn(9));
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(4), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(6), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(8), false);
		Iterator<TableColumn> iterator = persistentTableColumnModel.getColumns(true);
		int count = 0;
		while (iterator.hasNext()) {
			iterator.next();
			count++;
		}
		assertEquals(5, count);
	}
	
	/**
	* Test case for the {@link PersistentTableColumnModel#getColumns(boolean)} method.
	* This test case tests the method with the parameter <code>onlyVisible</code> set to <code>false</code>.
	* The test case expects that the method returns an <code>Iterator</code> with the size of all columns.
	*/
	@Test
	public void testGetColumns_onlyVisible_false_4() {
		PersistentTableColumnModel persistentTableColumnModel = new PersistentTableColumnModel();
		persistentTableColumnModel.addColumn(new TableColumn(0));
		persistentTableColumnModel.addColumn(new TableColumn(1));
		persistentTableColumnModel.addColumn(new TableColumn(2));
		persistentTableColumnModel.addColumn(new TableColumn(3));
		persistentTableColumnModel.addColumn(new TableColumn(4));
		persistentTableColumnModel.addColumn(new TableColumn(5));
		persistentTableColumnModel.addColumn(new TableColumn(6));
		persistentTableColumnModel.addColumn(new TableColumn(7));
		persistentTableColumnModel.addColumn(new TableColumn(8));
		persistentTableColumnModel.addColumn(new TableColumn(9));
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(0), false);
		persistentTableColumnModel.setColumnVisible(persistentTableColumnModel.getColumn(2), false);
		persistentTableColumnModel.setColumn