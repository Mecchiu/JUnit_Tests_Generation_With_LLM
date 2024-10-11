// Here's an example implementation of the test class for the PersistentTableColumnModel class.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PersistentTableColumnModel_3Test {

    @Test
    void testGetColumnIndex() {
        // Create a new PersistentTableColumnModel
        PersistentTableColumnModel model = new PersistentTableColumnModel();

        // Add some columns to the model
        TableColumn column1 = new TableColumn(0);
        column1.setIdentifier("Column 1");
        model.addColumn(column1);

        TableColumn column2 = new TableColumn(1);
        column2.setIdentifier("Column 2");
        model.addColumn(column2);

        TableColumn column3 = new TableColumn(2);
        column3.setIdentifier("Column 3");
        model.addColumn(column3);

        // Test getColumnIndex with onlyVisible set to true
        assertEquals(0, model.getColumnIndex("Column 1", true));
        assertEquals(1, model.getColumnIndex("Column 2", true));
        assertEquals(2, model.getColumnIndex("Column 3", true));

        // Test getColumnIndex with onlyVisible set to false
        assertEquals(0, model.getColumnIndex("Column 1", false));
        assertEquals(1, model.getColumnIndex("Column 2", false));
        assertEquals(2, model.getColumnIndex("Column 3", false));

        // Test getColumnIndex with an invalid identifier
        assertThrows(IllegalArgumentException.class, () -> model.getColumnIndex(null, true));
        assertThrows(IllegalArgumentException.class, () -> model.getColumnIndex("Invalid Column", true));
    }
}