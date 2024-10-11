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
	* The identifier is not null.
	* The identifier is equal to the identifier of the column.
	* The onlyVisible parameter is true.
	* Expected result: The index of the column is returned.
	*/
	@Test
	public void testGetColumnIndex_OneColumnVisibleIdentifierNotNullIdentifierEqualOnlyVisibleTrue() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		Object identifier = "Test";
		boolean onlyVisible = true;
		int result = columnModel.getColumnIndex(identifier, onlyVisible);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The identifier is not null.
	* The identifier is equal to the identifier of the column.
	* The onlyVisible parameter is false.
	* Expected result: The index of the column is returned.
	*/
	@Test
	public void testGetColumnIndex_OneColumnVisibleIdentifierNotNullIdentifierEqualOnlyVisibleFalse() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		Object identifier = "Test";
		boolean onlyVisible = false;
		int result = columnModel.getColumnIndex(identifier, onlyVisible);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The identifier is not null.
	* The identifier is not equal to the identifier of the column.
	* The onlyVisible parameter is true.
	* Expected result: An IllegalArgumentException is thrown.
	*/
	@Test
	public void testGetColumnIndex_OneColumnVisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleTrue() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		Object identifier = "Test2";
		boolean onlyVisible = true;
		assertThrows(IllegalArgumentException.class, () -&gt; {
			columnModel.getColumnIndex(identifier, onlyVisible);
		});
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The identifier is not null.
	* The identifier is not equal to the identifier of the column.
	* The onlyVisible parameter is false.
	* Expected result: An IllegalArgumentException is thrown.
	*/
	@Test
	public void testGetColumnIndex_OneColumnVisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleFalse() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		Object identifier = "Test2";
		boolean onlyVisible = false;
		assertThrows(IllegalArgumentException.class, () -&gt; {
			columnModel.getColumnIndex(identifier, onlyVisible);
		});
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The identifier is null.
	* The onlyVisible parameter is true.
	* Expected result: An IllegalArgumentException is thrown.
	*/
	@Test
	public void testGetColumnIndex_OneColumnVisibleIdentifierNullOnlyVisibleTrue() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		Object identifier = null;
		boolean onlyVisible = true;
		assertThrows(IllegalArgumentException.class, () -&gt; {
			columnModel.getColumnIndex(identifier, onlyVisible);
		});
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is visible.
	* The identifier is null.
	* The onlyVisible parameter is false.
	* Expected result: An IllegalArgumentException is thrown.
	*/
	@Test
	public void testGetColumnIndex_OneColumnVisibleIdentifierNullOnlyVisibleFalse() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		Object identifier = null;
		boolean onlyVisible = false;
		assertThrows(IllegalArgumentException.class, () -&gt; {
			columnModel.getColumnIndex(identifier, onlyVisible);
		});
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is invisible.
	* The identifier is not null.
	* The identifier is equal to the identifier of the column.
	* The onlyVisible parameter is true.
	* Expected result: An IllegalArgumentException is thrown.
	*/
	@Test
	public void testGetColumnIndex_OneColumnInvisibleIdentifierNotNullIdentifierEqualOnlyVisibleTrue() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		columnModel.setColumnVisible(column, false);
		Object identifier = "Test";
		boolean onlyVisible = true;
		assertThrows(IllegalArgumentException.class, () -&gt; {
			columnModel.getColumnIndex(identifier, onlyVisible);
		});
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is invisible.
	* The identifier is not null.
	* The identifier is equal to the identifier of the column.
	* The onlyVisible parameter is false.
	* Expected result: The index of the column is returned.
	*/
	@Test
	public void testGetColumnIndex_OneColumnInvisibleIdentifierNotNullIdentifierEqualOnlyVisibleFalse() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		columnModel.setColumnVisible(column, false);
		Object identifier = "Test";
		boolean onlyVisible = false;
		int result = columnModel.getColumnIndex(identifier, onlyVisible);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is invisible.
	* The identifier is not null.
	* The identifier is not equal to the identifier of the column.
	* The onlyVisible parameter is true.
	* Expected result: An IllegalArgumentException is thrown.
	*/
	@Test
	public void testGetColumnIndex_OneColumnInvisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleTrue() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		columnModel.setColumnVisible(column, false);
		Object identifier = "Test2";
		boolean onlyVisible = true;
		assertThrows(IllegalArgumentException.class, () -&gt; {
			columnModel.getColumnIndex(identifier, onlyVisible);
		});
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is invisible.
	* The identifier is not null.
	* The identifier is not equal to the identifier of the column.
	* The onlyVisible parameter is false.
	* Expected result: An IllegalArgumentException is thrown.
	*/
	@Test
	public void testGetColumnIndex_OneColumnInvisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleFalse() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		columnModel.setColumnVisible(column, false);
		Object identifier = "Test2";
		boolean onlyVisible = false;
		assertThrows(IllegalArgumentException.class, () -&gt; {
			columnModel.getColumnIndex(identifier, onlyVisible);
		});
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is invisible.
	* The identifier is null.
	* The onlyVisible parameter is true.
	* Expected result: An IllegalArgumentException is thrown.
	*/
	@Test
	public void testGetColumnIndex_OneColumnInvisibleIdentifierNullOnlyVisibleTrue() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		columnModel.setColumnVisible(column, false);
		Object identifier = null;
		boolean onlyVisible = true;
		assertThrows(IllegalArgumentException.class, () -&gt; {
			columnModel.getColumnIndex(identifier, onlyVisible);
		});
	}
	
	/**
	* Test case for {@link PersistentTableColumnModel#getColumnIndex(Object, boolean)} method.
	* Tested with a column model containing one column.
	* The column is invisible.
	* The identifier is null.
	* The onlyVisible parameter is false.
	* Expected result: An IllegalArgumentException is thrown.
	*/
	@Test
	public void testGetColumnIndex_OneColumnInvisibleIdentifierNullOnlyVisibleFalse() {
		PersistentTableColumnModel columnModel = new PersistentTableColumnModel();
		TableColumn column = new TableColumn();
		column.setIdentifier("Test");
		columnModel.addColumn(column);
		columnModel.setColumnVisible(column, false);
		Object identifier = null;
		boolean onlyVisible = false;
		assertThrows(IllegalArgumentException.class, () -&gt; {
			columnModel.getColumnIndex(identifier, onlyVisible);
		});
	}
	
}</code>



I have a test class for the method <code>getColumnIndex</code> of the <code>PersistentTableColumnModel</code> class.
The test class contains ten test cases.
The test cases are named like this:
<code>testGetColumnIndex_OneColumnVisibleIdentifierNotNullIdentifierEqualOnlyVisibleTrue</code>
<code>testGetColumnIndex_OneColumnVisibleIdentifierNotNullIdentifierEqualOnlyVisibleFalse</code>
<code>testGetColumnIndex_OneColumnVisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleTrue</code>
<code>testGetColumnIndex_OneColumnVisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleFalse</code>
<code>testGetColumnIndex_OneColumnVisibleIdentifierNullOnlyVisibleTrue</code>
<code>testGetColumnIndex_OneColumnVisibleIdentifierNullOnlyVisibleFalse</code>
<code>testGetColumnIndex_OneColumnInvisibleIdentifierNotNullIdentifierEqualOnlyVisibleTrue</code>
<code>testGetColumnIndex_OneColumnInvisibleIdentifierNotNullIdentifierEqualOnlyVisibleFalse</code>
<code>testGetColumnIndex_OneColumnInvisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleTrue</code>
<code>testGetColumnIndex_OneColumnInvisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleFalse</code>
<code>testGetColumnIndex_OneColumnInvisibleIdentifierNullOnlyVisibleTrue</code>
<code>testGetColumnIndex_OneColumnInvisibleIdentifierNullOnlyVisibleFalse</code>
I want to extract the test cases from the test class.
The test cases should be named like this:
<code>OneColumnVisibleIdentifierNotNullIdentifierEqualOnlyVisibleTrue</code>
<code>OneColumnVisibleIdentifierNotNullIdentifierEqualOnlyVisibleFalse</code>
<code>OneColumnVisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleTrue</code>
<code>OneColumnVisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleFalse</code>
<code>OneColumnVisibleIdentifierNullOnlyVisibleTrue</code>
<code>OneColumnVisibleIdentifierNullOnlyVisibleFalse</code>
<code>OneColumnInvisibleIdentifierNotNullIdentifierEqualOnlyVisibleTrue</code>
<code>OneColumnInvisibleIdentifierNotNullIdentifierEqualOnlyVisibleFalse</code>
<code>OneColumnInvisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleTrue</code>
<code>OneColumnInvisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleFalse</code>
<code>OneColumnInvisibleIdentifierNullOnlyVisibleTrue</code>
<code>OneColumnInvisibleIdentifierNullOnlyVisibleFalse</code>
I want to extract the test cases from the test class.
The test cases should be named like this:
<code>OneColumnVisibleIdentifierNotNullIdentifierEqualOnlyVisibleTrue</code>
<code>OneColumnVisibleIdentifierNotNullIdentifierEqualOnlyVisibleFalse</code>
<code>OneColumnVisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleTrue</code>
<code>OneColumnVisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleFalse</code>
<code>OneColumnVisibleIdentifierNullOnlyVisibleTrue</code>
<code>OneColumnVisibleIdentifierNullOnlyVisibleFalse</code>
<code>OneColumnInvisibleIdentifierNotNullIdentifierEqualOnlyVisibleTrue</code>
<code>OneColumnInvisibleIdentifierNotNullIdentifierEqualOnlyVisibleFalse</code>
<code>OneColumnInvisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleTrue</code>
<code>OneColumnInvisibleIdentifierNotNullIdentifierNotEqualOnlyVisibleFalse</code>
<code>OneColumnInvisibleIdentifierNullOnlyVisibleTrue</code>
<code>OneColumnInvisibleIdentifierNullOnlyVisibleFalse</code>
I want to extract the test cases from the test class.
The test cases should be named like this:
<code>OneColumnVisibleIdentifierNotNullIdentifierEqualOnlyVisibleTrue</code>
<code>OneColumnVisibleIdentifierNotNullIdentifierEqual