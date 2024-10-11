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
* It contains ten unit test cases for the {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
*/
class PersistentTableColumnModelTest {

	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to true.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleTrue() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		int columnIndex = columnModel.getColumnIndex("Test", true);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to false.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleFalse() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		int columnIndex = columnModel.getColumnIndex("Test", false);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to true.
	* The identifier is not the first column.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleTrueNotFirst() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		int columnIndex = columnModel.getColumnIndex("Test2", true);
		assertEquals(1, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to false.
	* The identifier is not the first column.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleFalseNotFirst() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		int columnIndex = columnModel.getColumnIndex("Test2", false);
		assertEquals(1, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to true.
	* The identifier is not the last column.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleTrueNotLast() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		int columnIndex = columnModel.getColumnIndex("Test", true);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to false.
	* The identifier is not the last column.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleFalseNotLast() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		int columnIndex = columnModel.getColumnIndex("Test", false);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to true.
	* The identifier is the only column.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleTrueOnly() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		int columnIndex = columnModel.getColumnIndex("Test", true);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to false.
	* The identifier is the only column.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleFalseOnly() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		int columnIndex = columnModel.getColumnIndex("Test", false);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to true.
	* The identifier is the first column.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleTrueFirst() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		int columnIndex = columnModel.getColumnIndex("Test", true);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to false.
	* The identifier is the first column.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleFalseFirst() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		int columnIndex = columnModel.getColumnIndex("Test", false);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to true.
	* The identifier is the last column.
	*/
	@Test
	public void testGetColumnIndexValidIdentifierOnlyVisibleTrueLast() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		int column