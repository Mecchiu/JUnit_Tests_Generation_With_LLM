package fr.unice.gfarce.interGraph;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import javax.swing.JOptionPane;

class ModifTableStockage_7Test {

    @Test
    void testSelectMail_AllSelected() {
        // Test case where all emails are selected
        ModifTableStockage modifTableStockage = new ModifTableStockage(new TableStockage(3, 3));
        TableStockage tableStockage = new TableStockage(3, 3);
        tableStockage.setValueAt(true, 0, 2);
        tableStockage.setValueAt(true, 1, 2);
        tableStockage.setValueAt(true, 2, 2);
        modifTableStockage.selectMail();
        assertEquals(tableStockage, modifTableStockage.selectMail());
    }

    @Test
    void testSelectMail_NoneSelected() {
        // Test case where no email is selected
        ModifTableStockage modifTableStockage = new ModifTableStockage(new TableStockage(3, 3));
        TableStockage tableStockage = new TableStockage(1, 3);
        modifTableStockage.selectMail();
        assertEquals(tableStockage, modifTableStockage.selectMail());
    }

    @Test
    void testSelectMail_SomeSelected() {
        // Test case where some emails are selected
        ModifTableStockage modifTableStockage = new ModifTableStockage(new TableStockage(3, 3));
        TableStockage tableStockage = new TableStockage(2, 3);
        tableStockage.setValueAt(true, 0, 2);
        tableStockage.setValueAt(true, 1, 2);
        modifTableStockage.selectMail();
        assertEquals(tableStockage, modifTableStockage.selectMail());
    }

    @Test
    void testSelectMail_NoEmailColumn() {
        // Test case where there is no email column
        ModifTableStockage modifTableStockage = new ModifTableStockage(new TableStockage(3, 3));
        TableStockage tableStockage = new TableStockage(3, 3);
        modifTableStockage.selectMail();
        assertEquals(tableStockage, modifTableStockage.selectMail());
    }

    @Test
    void testSelectMail_ShowInformationMessage() {
        // Test case where an information message is shown
        ModifTableStockage modifTableStockage = new ModifTableStockage(new TableStockage(3, 3));
        TableStockage tableStockage = new TableStockage(3, 3);
        JOptionPane.showMessageDialog(null, "Le mail sera envoye a toute la liste", "Information", JOptionPane.INFORMATION_MESSAGE);
        modifTableStockage.selectMail();
        assertEquals(tableStockage, modifTableStockage.selectMail());
    }

    @Test
    void testSelectMail_EmptyTable() {
        // Test case where the table is empty
        ModifTableStockage modifTableStockage = new ModifTableStockage(new TableStockage(0, 0));
        TableStockage tableStockage = new TableStockage(0, 0);
        modifTableStockage.selectMail();
        assertEquals(tableStockage, modifTableStockage.selectMail());
    }

    @Test
    void testSelectMail_OneRow() {
        // Test case where there is only one row in the table
        ModifTableStockage modifTableStockage = new ModifTableStockage(new TableStockage(1, 3));
        TableStockage tableStockage = new TableStockage(1, 3);
        tableStockage.setValueAt(true, 0, 2);
        modifTableStockage.selectMail();
        assertEquals(tableStockage, modifTableStockage.selectMail());
    }

    @Test
    void testSelectMail_OneColumn() {
        // Test case where there is only one column in the table
        ModifTableStockage modifTableStockage = new ModifTableStockage(new TableStockage(3, 1));
        TableStockage tableStockage = new TableStockage(3, 1);
        modifTableStockage.selectMail();
        assertEquals(tableStockage, modifTableStockage.selectMail());
    }

    @Test
    void testSelectMail_NullTable() {
        // Test case where the table is null
        ModifTableStockage modifTableStockage = new ModifTableStockage(null);
        assertNull(modifTableStockage.selectMail());
    }

    @Test
    void testSelectMail_ColumnNameMismatch() {
        // Test case where the email column name does not match
        ModifTableStockage modifTableStockage = new ModifTableStockage(new TableStockage(3, 3));
        TableStockage tableStockage = new TableStockage(3, 3);
        tableStockage.setColumnName(0, "Name");
        tableStockage.setColumnName(1, "Age");
        tableStockage.setColumnName(2, "Email");
        modifTableStockage.selectMail();
        assertEquals(tableStockage, modifTableStockage.selectMail());
    }
}
