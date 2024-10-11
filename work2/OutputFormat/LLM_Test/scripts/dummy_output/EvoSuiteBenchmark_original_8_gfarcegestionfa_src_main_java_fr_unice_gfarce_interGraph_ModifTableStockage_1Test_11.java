// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains one unit test case for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_1Test {
		
    private final String table;
    
    public ModifTableStockage_1Test(String table) {
        this.table = table;
    }
    
    @Test
    public void test1() {
        final TableStockage tableStockage = new ModifTableStockage().colonneMail();
        assertEquals(table, tableStockage.getTable());
    }
}