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
	void testGetColumnIndexValidIdentifierOnlyVisibleTrue() {
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
	void testGetColumnIndexValidIdentifierOnlyVisibleFalse() {
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
	void testGetColumnIndexValidIdentifierOnlyVisibleTrueNotFirst() {
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
	void testGetColumnIndexValidIdentifierOnlyVisibleFalseNotFirst() {
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
	* The identifier is not the first column.
	* The first column is not visible.
	*/
	@Test
	void testGetColumnIndexValidIdentifierOnlyVisibleTrueNotFirstFirstNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		columnModel.removeColumn(columnModel.getColumn(0));
		int columnIndex = columnModel.getColumnIndex("Test2", true);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to false.
	* The identifier is not the first column.
	* The first column is not visible.
	*/
	@Test
	void testGetColumnIndexValidIdentifierOnlyVisibleFalseNotFirstFirstNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		columnModel.removeColumn(columnModel.getColumn(0));
		int columnIndex = columnModel.getColumnIndex("Test2", false);
		assertEquals(1, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to true.
	* The identifier is not the first column.
	* The first column is not visible.
	* The second column is not visible.
	*/
	@Test
	void testGetColumnIndexValidIdentifierOnlyVisibleTrueNotFirstFirstNotVisibleSecondNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		column = new TableColumn(2);
		column.setIdentifier("Test3");
		columnModel.addColumn(column);
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		int columnIndex = columnModel.getColumnIndex("Test3", true);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to false.
	* The identifier is not the first column.
	* The first column is not visible.
	* The second column is not visible.
	*/
	@Test
	void testGetColumnIndexValidIdentifierOnlyVisibleFalseNotFirstFirstNotVisibleSecondNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		column = new TableColumn(2);
		column.setIdentifier("Test3");
		columnModel.addColumn(column);
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		int columnIndex = columnModel.getColumnIndex("Test3", false);
		assertEquals(2, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to true.
	* The identifier is not the first column.
	* The first column is not visible.
	* The second column is not visible.
	* The third column is not visible.
	*/
	@Test
	void testGetColumnIndexValidIdentifierOnlyVisibleTrueNotFirstFirstNotVisibleSecondNotVisibleThirdNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		column = new TableColumn(2);
		column.setIdentifier("Test3");
		columnModel.addColumn(column);
		column = new TableColumn(3);
		column.setIdentifier("Test4");
		columnModel.addColumn(column);
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		int columnIndex = columnModel.getColumnIndex("Test4", true);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to false.
	* The identifier is not the first column.
	* The first column is not visible.
	* The second column is not visible.
	* The third column is not visible.
	*/
	@Test
	void testGetColumnIndexValidIdentifierOnlyVisibleFalseNotFirstFirstNotVisibleSecondNotVisibleThirdNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		column = new TableColumn(2);
		column.setIdentifier("Test3");
		columnModel.addColumn(column);
		column = new TableColumn(3);
		column.setIdentifier("Test4");
		columnModel.addColumn(column);
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		int columnIndex = columnModel.getColumnIndex("Test4", false);
		assertEquals(3, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to true.
	* The identifier is not the first column.
	* The first column is not visible.
	* The second column is not visible.
	* The third column is not visible.
	* The fourth column is not visible.
	*/
	@Test
	void testGetColumnIndexValidIdentifierOnlyVisibleTrueNotFirstFirstNotVisibleSecondNotVisibleThirdNotVisibleFourthNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		column = new TableColumn(2);
		column.setIdentifier("Test3");
		columnModel.addColumn(column);
		column = new TableColumn(3);
		column.setIdentifier("Test4");
		columnModel.addColumn(column);
		column = new TableColumn(4);
		column.setIdentifier("Test5");
		columnModel.addColumn(column);
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		int columnIndex = columnModel.getColumnIndex("Test5", true);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to false.
	* The identifier is not the first column.
	* The first column is not visible.
	* The second column is not visible.
	* The third column is not visible.
	* The fourth column is not visible.
	*/
	@Test
	void testGetColumnIndexValidIdentifierOnlyVisibleFalseNotFirstFirstNotVisibleSecondNotVisibleThirdNotVisibleFourthNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		column = new TableColumn(2);
		column.setIdentifier("Test3");
		columnModel.addColumn(column);
		column = new TableColumn(3);
		column.setIdentifier("Test4");
		columnModel.addColumn(column);
		column = new TableColumn(4);
		column.setIdentifier("Test5");
		columnModel.addColumn(column);
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		int columnIndex = columnModel.getColumnIndex("Test5", false);
		assertEquals(4, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to true.
	* The identifier is not the first column.
	* The first column is not visible.
	* The second column is not visible.
	* The third column is not visible.
	* The fourth column is not visible.
	* The fifth column is not visible.
	*/
	@Test
	void testGetColumnIndexValidIdentifierOnlyVisibleTrueNotFirstFirstNotVisibleSecondNotVisibleThirdNotVisibleFourthNotVisibleFifthNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn(0);
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		column = new TableColumn(1);
		column.setIdentifier("Test2");
		columnModel.addColumn(column);
		column = new TableColumn(2);
		column.setIdentifier("Test3");
		columnModel.addColumn(column);
		column = new TableColumn(3);
		column.setIdentifier("Test4");
		columnModel.addColumn(column);
		column = new TableColumn(4);
		column.setIdentifier("Test5");
		columnModel.addColumn(column);
		column = new TableColumn(5);
		column.setIdentifier("Test6");
		columnModel.addColumn(column);
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		columnModel.removeColumn(columnModel.getColumn(0));
		int columnIndex = columnModel.getColumnIndex("Test6", true);
		assertEquals(0, columnIndex);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)}
	* with a valid identifier and onlyVisible set to false.
	* The identifier is not the first column.
	* The first column is not visible.
	* The second column is not visible.
	* The third column is not visible.
	* The fourth column is not visible.
	* The fifth column is not visible.
	*/
	@Test
	void testGetColumnIndexValidIdentifierOnlyVisibleFalseNotFirstFirstNotVisibleSecondNotVisibleThirdNotVisibleFourthNotVisibleFifthNotVisible() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn