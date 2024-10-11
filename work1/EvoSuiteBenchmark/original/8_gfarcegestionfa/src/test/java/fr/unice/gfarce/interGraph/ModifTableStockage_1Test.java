package fr.unice.gfarce.interGraph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModifTableStockage_1Test {

    @Test
    void testAjouterLigneWithColumns() {
        TableStockage ts = new TableStockage(3, 2);
        ts.setColumnName(0, "Nom");
        ts.setColumnName(1, "Age");
        ts.setValueAt("Alice", 0, 0);
        ts.setValueAt(25, 0, 1);
        ts.setValueAt("Bob", 1, 0);
        ts.setValueAt(30, 1, 1);
        
        ModifTableStockage modifTable = new ModifTableStockage(ts);
        TableStockage result = modifTable.ajouterLigne();
        
        assertEquals(3, result.getRowCount());
        assertEquals(2, result.getColumnCount());
        assertEquals("Nom", result.getColumnName(0));
        assertEquals("Age", result.getColumnName(1));
        assertEquals("Alice", result.getValueAt(0, 0));
        assertEquals(25, result.getValueAt(0, 1));
        assertEquals("Bob", result.getValueAt(1, 0));
        assertEquals(30, result.getValueAt(1, 1));
        assertEquals("", result.getValueAt(2, 0));
        assertEquals(0.0, result.getValueAt(2, 1));
    }

    @Test
    void testAjouterLigneWithoutColumns() {
        TableStockage ts = new TableStockage(0, 0);
        
        ModifTableStockage modifTable = new ModifTableStockage(ts);
        TableStockage result = modifTable.ajouterLigne();
        
        assertEquals(0, result.getRowCount());
        assertEquals(0, result.getColumnCount());
    }

    @Test
    void testAjouterLigneWithEmptyTable() {
        TableStockage ts = new TableStockage(1, 0);
        
        ModifTableStockage modifTable = new ModifTableStockage(ts);
        TableStockage result = modifTable.ajouterLigne();
        
        assertEquals(2, result.getRowCount());
        assertEquals(0, result.getColumnCount());
    }
    
    @Test
    void testAjouterLigneWithDifferentColumnTypes() {
        TableStockage ts = new TableStockage(2, 2);
        ts.setColumnName(0, "Name");
        ts.setColumnName(1, "Amount");
        ts.setColumnClass(0, String.class);
        ts.setColumnClass(1, Double.class);
        ts.setValueAt("Alice", 0, 0);
        ts.setValueAt(100.0, 0, 1);
        ts.setValueAt("Bob", 1, 0);
        ts.setValueAt(200.0, 1, 1);
        
        ModifTableStockage modifTable = new ModifTableStockage(ts);
        TableStockage result = modifTable.ajouterLigne();
        
        assertEquals(3, result.getRowCount());
        assertEquals(2, result.getColumnCount());
        assertEquals("Name", result.getColumnName(0));
        assertEquals("Amount", result.getColumnName(1));
        assertEquals("Alice", result.getValueAt(0, 0));
        assertEquals(100.0, result.getValueAt(0, 1));
        assertEquals("Bob", result.getValueAt(1, 0));
        assertEquals(200.0, result.getValueAt(1, 1));
        assertEquals("", result.getValueAt(2, 0));
        assertEquals(0.0, result.getValueAt(2, 1));
    }
}
