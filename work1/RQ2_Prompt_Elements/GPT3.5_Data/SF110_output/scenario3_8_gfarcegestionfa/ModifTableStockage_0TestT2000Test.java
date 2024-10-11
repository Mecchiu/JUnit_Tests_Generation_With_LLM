// Here's an example implementation of the ModifTableStockage class and its test class:

// ModifTableStockage.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;

public class ModifTableStockage {

    /**
     * Genere en sortie une TableStockage, a partir de la table d'origine, avec une ligne en plus.
     * Ligne ajoutee a la fin de la JTable
     *
     * @return TableStockage
     */
    public TableStockage ajouterLigne(TableStockage table) {
        // Create a new TableStockage object with one additional row
        TableStockage newTable = new TableStockage(table.getNbLignes() + 1, table.getNbColonnes());
        
        // Copy the contents of the original table to the new table
        for (int i = 0; i < table.getNbLignes(); i++) {
            for (int j = 0; j < table.getNbColonnes(); j++) {
                newTable.setValeur(i, j, table.getValeur(i, j));
            }
        }
        
        // Add a new row to the end of the new table
        for (int j = 0; j < table.getNbColonnes(); j++) {
            newTable.setValeur(table.getNbLignes(), j, "");
        }
        
        return newTable;
    }
}

// ModifTableStockage_0Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#ajouterLigne(TableStockage)} method.
*/
class ModifTableStockage_0Test {
    
    @Test
    void testAjouterLigne() {
        // Create a new TableStockage object with two rows and three columns
        TableStockage table = new TableStockage(2, 3);
        table.setValeur(0, 0, "A");
        table.setValeur(0, 1, "B");
        table.setValeur(0, 2, "C");
        table.setValeur(1, 0, "D");
        table.setValeur(1, 1, "E");
        table.setValeur(1, 2, "F");
        
        // Create a new ModifTableStockage object
        ModifTableStockage modifTable = new ModifTableStockage();
        
        // Call the ajouterLigne method and check the result
        TableStockage newTable = modifTable.ajouterLigne(table);
        assertEquals(3, newTable.getNbLignes());
        assertEquals(3, newTable.getNbColonnes());
        assertEquals("A", newTable.getValeur(0, 0));
        assertEquals("B", newTable.getValeur(0, 1));
        assertEquals("C", newTable.getValeur(0, 2));
        assertEquals("D", newTable.getValeur(1, 0));
        assertEquals("E", newTable.getValeur(1, 1));
        assertEquals("F", newTable.getValeur(1, 2));
        assertEquals("", newTable.getValeur(2, 0));
        assertEquals("", newTable.getValeur(2, 1));
        assertEquals("", newTable.getValeur(2, 2));
    }
    
    @Test
    void testAjouterLigneEmptyTable() {
        // Create a new empty TableStockage object
        TableStockage table = new TableStockage(0, 0);
        
        // Create a new ModifTableStockage object
        ModifTableStockage modifTable = new ModifTableStockage();
        
        // Call the ajouterLigne method and check the result
        TableStockage newTable = modifTable.ajouterLigne(table);
        assertEquals(1, newTable.getNbLignes());
        assertEquals(0, newTable.getNbColonnes());
    }
    
    @Test
    void testAjouterLigneNullTable() {
        // Create a new ModifTableStockage object
        ModifTableStockage modifTable = new ModifTableStockage();
        
        // Call the ajouterLigne method with a null table and check the result
        assertThrows(NullPointerException.class, () -> {
            modifTable.ajouterLigne(null);
        });
    }
    
    @Test
    void testAjouterLigneLargeTable() {
        // Create a new TableStockage object with 1000 rows and 1000 columns
        TableStockage table = new TableStockage(1000, 1000);
        
        // Create a new ModifTableStockage object
        ModifTableStockage modifTable = new ModifTableStockage();
        
        // Call the ajouterLigne method and check the result
        TableStockage newTable = modifTable.ajouterLigne(table);
        assertEquals(1001, newTable.getNbLignes());
        assertEquals(1000, newTable.getNbColonnes());
    }
    
    @Test
    void testAjouterLigneLargeTableWithValues() {
        // Create a new TableStockage object with 1000 rows and 1000 columns, filled with values
        TableStockage table = new TableStockage(1000, 1000);
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                table.setValeur(i, j, Integer.toString(i) + "," + Integer.toString(j));
            }
        }
        
        // Create a new ModifTableStockage object
        ModifTableStockage modifTable = new ModifTableStockage();
        
        // Call the ajouterLigne method and check the result
        TableStockage newTable = modifTable.ajouterLigne(table);
        assertEquals(1001, newTable.getNbLignes());
        assertEquals(1000, newTable.getNbColonnes());
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                assertEquals(Integer.toString(i) + "," + Integer.toString(j), newTable.getValeur(i, j));
            }
        }
        for (int j = 0; j < 1000; j++) {
            assertEquals("", newTable.getValeur(1000, j));
        }
    }
    
    @Test
    void testAjouterLigneLargeTableWithNullValues() {
        // Create a new TableStockage object with 1000 rows and 1000 columns, filled with null values
        TableStockage table = new TableStockage(1000, 1000);
        
        // Create a new ModifTableStockage object
        ModifTableStockage modifTable = new ModifTableStockage();
        
        // Call the ajouterLigne method and check the result
        TableStockage newTable = modifTable.ajouterLigne(table);
        assertEquals(1001, newTable.getNbLignes());
        assertEquals(1000, newTable.getNbColonnes());
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                assertEquals("", newTable.getValeur(i, j));
            }
        }
        for (int j = 0; j < 1000; j++) {
            assertEquals("", newTable.getValeur(1000, j));
        }
    }
    
    @Test
    void testAjouterLigneLargeTableWithMixedValues() {
        // Create a new TableStockage object with 1000 rows and 1000 columns, filled with mixed values
        TableStockage table = new TableStockage(1000, 1000);
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    table.setValeur(i, j, Integer.toString(i) + "," + Integer.toString(j));
                }
            }
        }
        
        // Create a new ModifTableStockage object
        ModifTableStockage modifTable = new ModifTableStockage();
        
        // Call the ajouterLigne method and check the result
        TableStockage newTable = modifTable.ajouterLigne(table);
        assertEquals(1001, newTable.getNbLignes());
        assertEquals(1000, newTable.getNbColonnes());
        for (int i = 0; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    assertEquals(Integer.toString(i) + "," + Integer.toString(j), newTable.getValeur(i, j));
                } else {
                    assertEquals("", newTable.getValeur(i, j));
                }
            }
        }
        for (int