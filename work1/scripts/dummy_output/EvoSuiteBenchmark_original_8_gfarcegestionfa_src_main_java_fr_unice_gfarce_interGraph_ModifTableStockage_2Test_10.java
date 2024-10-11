// ModifTableStockage_2Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains one unit test case for the {@link ModifTableStockage#selectMail()} method.
*/
class ModifTableStockage_2Test {
		
    @Test
    void testCase_1() {
        String content= JOptionPane.showInputDialog(
                "Oui: "+ JOptionPane.QUESTION_MESSAGE,
                "Choose which table to look up",
                "Which table does the table stockage affect?",
                "String");
        assertEquals("Oui", content);
        TableStockage table = selectMail();
        assertEquals("Oui", table.getContent());
        
                 System.out.println("\n");
    }
    
    @Test
    void testCase_2() {
        String content= JOptionPane.showInputDialog(
                "Oui: "+ JOptionPane.QUESTION_MESSAGE,
                "Choose which table to look up",
                "Which table does the table stockage affect?",
                "String");
        assertEquals("Oui", content);
        assertNull(JOptionPane.showInputDialog("Oui", "Choose which table"));
        
    }

}