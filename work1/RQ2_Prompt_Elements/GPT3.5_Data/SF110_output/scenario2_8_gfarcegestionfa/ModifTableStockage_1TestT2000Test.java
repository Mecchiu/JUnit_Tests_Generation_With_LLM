// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_1Test {
    
    /**
     * Test case 1: Test if the method adds a new column to the table.
     */
    @Test
    void testAjouterColonne() {
        TableStockage ts = new TableStockage(5, 5);
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        assertEquals(6, tableS.getColumnCount());
    }
    
    /**
     * Test case 2: Test if the new column added is of type Boolean.
     */
    @Test
    void testTypeColonne() {
        TableStockage ts = new TableStockage(5, 5);
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        assertEquals(Boolean.class, tableS.getColumnClass(5));
    }
    
    /**
     * Test case 3: Test if the new column added has the correct name.
     */
    @Test
    void testNomColonne() {
        TableStockage ts = new TableStockage(5, 5);
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        assertEquals("Envoyer E-Mail a:", tableS.getColumnName(5));
    }
    
    /**
     * Test case 4: Test if the new column added has checkboxes by default.
     */
    @Test
    void testCheckboxParDefaut() {
        TableStockage ts = new TableStockage(5, 5);
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        for (int i = 0; i < tableS.getRowCount(); i++) {
            assertTrue((Boolean) tableS.getValueAt(i, 5));
        }
    }
    
    /**
     * Test case 5: Test if the method returns a TableStockage object.
     */
    @Test
    void testTypeRetour() {
        TableStockage ts = new TableStockage(5, 5);
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        assertTrue(tableS instanceof TableStockage);
    }
    
    /**
     * Test case 6: Test if the method works correctly with an empty table.
     */
    @Test
    void testTableVide() {
        TableStockage ts = new TableStockage(0, 0);
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        assertEquals(1, tableS.getColumnCount());
        assertEquals("Envoyer E-Mail a:", tableS.getColumnName(0));
    }
    
    /**
     * Test case 7: Test if the method works correctly with a table with one row and one column.
     */
    @Test
    void testTableUneLigneUneColonne() {
        TableStockage ts = new TableStockage(1, 1);
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        assertEquals(2, tableS.getColumnCount());
        assertEquals("Envoyer E-Mail a:", tableS.getColumnName(1));
        assertTrue((Boolean) tableS.getValueAt(0, 1));
    }
    
    /**
     * Test case 8: Test if the method works correctly with a table with one row and multiple columns.
     */
    @Test
    void testTableUneLignePlusieursColonnes() {
        TableStockage ts = new TableStockage(1, 5);
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        assertEquals(6, tableS.getColumnCount());
        assertEquals("Envoyer E-Mail a:", tableS.getColumnName(5));
        assertTrue((Boolean) tableS.getValueAt(0, 5));
    }
    
    /**
     * Test case 9: Test if the method works correctly with a table with multiple rows and one column.
     */
    @Test
    void testTablePlusieursLignesUneColonne() {
        TableStockage ts = new TableStockage(5, 1);
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        assertEquals(2, tableS.getColumnCount());
        assertEquals("Envoyer E-Mail a:", tableS.getColumnName(1));
        for (int i = 0; i < tableS.getRowCount(); i++) {
            assertTrue((Boolean) tableS.getValueAt(i, 1));
        }
    }
    
    /**
     * Test case 10: Test if the method works correctly with a table with multiple rows and columns.
     */
    @Test
    void testTablePlusieursLignesPlusieursColonnes() {
        TableStockage ts = new TableStockage(5, 5);
        ModifTableStockage mt = new ModifTableStockage(ts);
        TableStockage tableS = mt.colonneMail();
        assertEquals(6, tableS.getColumnCount());
        assertEquals("Envoyer E-Mail a:", tableS.getColumnName(5));
        for (int i = 0; i < tableS.getRowCount(); i++) {
            assertTrue((Boolean) tableS.getValueAt(i, 5));
        }
    }
}