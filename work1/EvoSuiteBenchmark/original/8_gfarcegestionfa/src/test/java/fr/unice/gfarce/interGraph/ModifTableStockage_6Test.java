package fr.unice.gfarce.interGraph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ModifTableStockage_6Test {

    @Test
    void testColonneMail() {
        // Given
        TableStockage ts = new TableStockage(3, 3);
        ModifTableStockage modifTableStockage = new ModifTableStockage(ts);

        // When
        TableStockage result = modifTableStockage.colonneMail();

        // Then
        assertEquals(4, result.getColumnCount());
        assertEquals(3, result.getRowCount());
        assertEquals("Envoyer E-Mail a:", result.getColumnName(3));
        assertEquals(Boolean.class, result.getColumnClass(3));
        for (int i = 0; i < 3; i++) {
            assertTrue((Boolean) result.getValueAt(i, 3));
        }
    }
}
