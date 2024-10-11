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
	* The identifier is the column name.
	* The identifier is not null.
	* The identifier is not empty.
	* The identifier is not a blank string.
	* The identifier is not a string of blanks.
	* The identifier is not a string of tabs.
	* The identifier is not a string of newlines.
	* The identifier is not a string of spaces.
	* The identifier is not a string of formfeeds.
	* The identifier is not a string of carriage returns.
	* The identifier is not a string of backspaces.
	* The identifier is not a string of vertical tabs.
	* The identifier is not a string of null characters.
	* The identifier is not a string of non-printable characters.
	* The identifier is not a string of non-printable characters and blanks.
	* The identifier is not a string of non-printable characters, blanks and tabs.
	* The identifier is not a string of non-printable characters, blanks, tabs and newlines.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines and spaces.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces and formfeeds.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds and carriage returns.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns and backspaces.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces and vertical tabs.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs and null characters.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters and printable characters.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters and blanks.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks and tabs.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs and newlines.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines and spaces.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces and formfeeds.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds and carriage returns.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns and backspaces.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces and vertical tabs.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs and null characters.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters and printable characters.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters and blanks.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks and tabs.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs and newlines.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines and spaces.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces and formfeeds.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds and carriage returns.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns and backspaces.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces and vertical tabs.
	* The identifier is not a string of non-printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs, null characters, printable characters, blanks, tabs, newlines, spaces, formfeeds, carriage returns, backspaces, vertical tabs and null