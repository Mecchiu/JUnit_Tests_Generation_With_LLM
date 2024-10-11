// Source code for ModifTableStockage_1Test class

package fr.unice.gfarce.interGraph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link ModifTableStockage}.
 * It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
 */
class ModifTableStockage_1Test {

    /**
     * Test case for adding a "E-Mail" column to an empty table.
     * Expected result: a table with one column named "E-Mail".
     */
    @Test
    void testAjouterColonneEmptyTable() {
        TableStockage ts = new TableStockage(new String[]{}, new Object[][]{});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.colonneMail();
        assertEquals(1, result.getNbColonnes());
        assertEquals("E-Mail", result.getNomColonne(0));
    }

    /**
     * Test case for adding a "E-Mail" column to a non-empty table.
     * Expected result: a table with one additional column named "E-Mail".
     */
    @Test
    void testAjouterColonneNonEmptyTable() {
        TableStockage ts = new TableStockage(new String[]{"Name", "Age"}, new Object[][]{{"John", 25}, {"Jane", 30}});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.colonneMail();
        assertEquals(3, result.getNbColonnes());
        assertEquals("E-Mail", result.getNomColonne(2));
    }

    /**
     * Test case for adding a "E-Mail" column to a table that already has a "E-Mail" column.
     * Expected result: a table with the same columns as the original table.
     */
    @Test
    void testAjouterColonneExistingMailColumn() {
        TableStockage ts = new TableStockage(new String[]{"Name", "E-Mail"}, new Object[][]{{"John", "john@example.com"}, {"Jane", "jane@example.com"}});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.colonneMail();
        assertEquals(2, result.getNbColonnes());
        assertEquals("E-Mail", result.getNomColonne(1));
    }

    /**
     * Test case for selecting all rows in a table with a "E-Mail" column.
     * Expected result: a table with the same columns and all rows selected.
     */
    @Test
    void testSelectMailAllRows() {
        TableStockage ts = new TableStockage(new String[]{"Name", "E-Mail"}, new Object[][]{{"John", "john@example.com"}, {"Jane", "jane@example.com"}});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.selectMail();
        assertEquals(2, result.getNbLignes());
        assertTrue(result.isLigneSelectionnee(0));
        assertTrue(result.isLigneSelectionnee(1));
    }

    /**
     * Test case for selecting no rows in a table with a "E-Mail" column.
     * Expected result: a table with the same columns and no rows selected.
     */
    @Test
    void testSelectMailNoRows() {
        TableStockage ts = new TableStockage(new String[]{"Name", "E-Mail"}, new Object[][]{{"John", ""}, {"Jane", ""}});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.selectMail();
        assertEquals(2, result.getNbLignes());
        assertFalse(result.isLigneSelectionnee(0));
        assertFalse(result.isLigneSelectionnee(1));
    }

    /**
     * Test case for selecting some rows in a table with a "E-Mail" column.
     * Expected result: a table with the same columns and selected rows.
     */
    @Test
    void testSelectMailSomeRows() {
        TableStockage ts = new TableStockage(new String[]{"Name", "E-Mail"}, new Object[][]{{"John", "john@example.com"}, {"Jane", ""}, {"Bob", "bob@example.com"}});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.selectMail();
        assertEquals(3, result.getNbLignes());
        assertTrue(result.isLigneSelectionnee(0));
        assertFalse(result.isLigneSelectionnee(1));
        assertTrue(result.isLigneSelectionnee(2));
    }

    /**
     * Test case for selecting rows in a table without a "E-Mail" column.
     * Expected result: a table with the same columns and no rows selected.
     */
    @Test
    void testSelectMailNoMailColumn() {
        TableStockage ts = new TableStockage(new String[]{"Name", "Age"}, new Object[][]{{"John", 25}, {"Jane", 30}});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.selectMail();
        assertEquals(2, result.getNbLignes());
        assertFalse(result.isLigneSelectionnee(0));
        assertFalse(result.isLigneSelectionnee(1));
    }

    /**
     * Test case for selecting rows in an empty table.
     * Expected result: an empty table.
     */
    @Test
    void testSelectMailEmptyTable() {
        TableStockage ts = new TableStockage(new String[]{}, new Object[][]{});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.selectMail();
        assertEquals(0, result.getNbLignes());
    }

    /**
     * Test case for selecting rows in a table with only a "E-Mail" column.
     * Expected result: a table with the same column and no rows selected.
     */
    @Test
    void testSelectMailOnlyMailColumn() {
        TableStockage ts = new TableStockage(new String[]{"E-Mail"}, new Object[][]{{""}, {""}});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.selectMail();
        assertEquals(2, result.getNbLignes());
        assertFalse(result.isLigneSelectionnee(0));
        assertFalse(result.isLigneSelectionnee(1));
    }

    /**
     * Test case for selecting rows in a table with a "E-Mail" column and null values.
     * Expected result: a table with the same columns and no rows selected.
     */
    @Test
    void testSelectMailNullValues() {
        TableStockage ts = new TableStockage(new String[]{"Name", "E-Mail"}, new Object[][]{{"John", null}, {"Jane", null}});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.selectMail();
        assertEquals(2, result.getNbLignes());
        assertFalse(result.isLigneSelectionnee(0));
        assertFalse(result.isLigneSelectionnee(1));
    }

    /**
     * Test case for selecting rows in a table with a "E-Mail" column and non-string values.
     * Expected result: a table with the same columns and no rows selected.
     */
    @Test
    void testSelectMailNonStringValues() {
        TableStockage ts = new TableStockage(new String[]{"Name", "E-Mail"}, new Object[][]{{"John", 123}, {"Jane", true}});
        ModifTableStockage mts = new ModifTableStockage(ts);
        TableStockage result = mts.selectMail();
        assertEquals(2, result.getNbLignes());
        assertFalse(result.isLigneSelectionnee(0));
        assertFalse(result.isLigneSelectionnee(1));
    }
}