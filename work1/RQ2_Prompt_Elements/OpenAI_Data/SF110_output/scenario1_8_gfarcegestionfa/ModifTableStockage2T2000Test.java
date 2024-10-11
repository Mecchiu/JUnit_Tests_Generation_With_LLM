// ModifTableStockageTest.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#selectMail()} method.
*/
class ModifTableStockageTest {

	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a table with the same number of rows as the original table.
	*/
	@Test
	void testSelectMail1() {
		TableStockage ts = new TableStockage(3, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Envoyer E-Mail a:");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(true, 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(false, 1, 2);
		ts.setValueAt("Martin", 2, 0);
		ts.setValueAt("Paul", 2, 1);
		ts.setValueAt(true, 2, 2);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts.getRowCount(), ts2.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a table with the same number of columns as the original table.
	*/
	@Test
	void testSelectMail2() {
		TableStockage ts = new TableStockage(3, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Envoyer E-Mail a:");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(true, 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(false, 1, 2);
		ts.setValueAt("Martin", 2, 0);
		ts.setValueAt("Paul", 2, 1);
		ts.setValueAt(true, 2, 2);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts.getColumnCount(), ts2.getColumnCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a table with the same number of rows as the original table.
	*/
	@Test
	void testSelectMail3() {
		TableStockage ts = new TableStockage(3, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Envoyer E-Mail a:");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(true, 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(false, 1, 2);
		ts.setValueAt("Martin", 2, 0);
		ts.setValueAt("Paul", 2, 1);
		ts.setValueAt(true, 2, 2);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts.getRowCount(), ts2.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a table with the same number of columns as the original table.
	*/
	@Test
	void testSelectMail4() {
		TableStockage ts = new TableStockage(3, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Envoyer E-Mail a:");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(true, 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(false, 1, 2);
		ts.setValueAt("Martin", 2, 0);
		ts.setValueAt("Paul", 2, 1);
		ts.setValueAt(true, 2, 2);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts.getColumnCount(), ts2.getColumnCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a table with the same number of rows as the original table.
	*/
	@Test
	void testSelectMail5() {
		TableStockage ts = new TableStockage(3, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Envoyer E-Mail a:");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(true, 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(false, 1, 2);
		ts.setValueAt("Martin", 2, 0);
		ts.setValueAt("Paul", 2, 1);
		ts.setValueAt(true, 2, 2);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts.getRowCount(), ts2.getRowCount());
	}
	
	/**
	* Test case for the {@link ModifTableStockage#selectMail()} method.
	* The test case is successful if the method returns a table with the same number of columns as the original table.
	*/
	@Test
	void testSelectMail6() {
		TableStockage ts = new TableStockage(3, 3);
		ts.setColumnName(0, "Nom");
		ts.setColumnName(1, "Prenom");
		ts.setColumnName(2, "Envoyer E-Mail a:");
		ts.setValueAt("Dupont", 0, 0);
		ts.setValueAt("Jean", 0, 1);
		ts.setValueAt(true, 0, 2);
		ts.setValueAt("Durand", 1, 0);
		ts.setValueAt("Pierre", 1, 1);
		ts.setValueAt(false, 1, 2);
		ts.setValueAt("Martin", 2, 0);
		ts.setValueAt("Paul", 2, 1);
		ts.setValueAt(true, 2, 2);
		ModifTableStockage mts = new ModifTableStockage(ts);
		TableStockage ts2 = mts.selectMail();
		assertEquals(ts.getColumnCount(), ts2.getColumnCount());
	}
	
	