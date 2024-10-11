// Here's an example of how you could write a test case for the selectMail() method:

@Test
void testSelectMail() {
    // Create a sample TableStockage object with some data
    TableStockage originalTable = new TableStockage();
    originalTable.addRow(new Object[]{"John", "Doe", "johndoe@example.com"});
    originalTable.addRow(new Object[]{"Jane", "Doe", "janedoe@example.com"});
    originalTable.addRow(new Object[]{"Bob", "Smith", "bobsmith@example.com"});
    originalTable.addRow(new Object[]{"Alice", "Jones", "alicejones@example.com"});

    // Create a ModifTableStockage object and call the selectMail() method
    ModifTableStockage modifier = new ModifTableStockage();
    TableStockage modifiedTable = modifier.selectMail(originalTable);

    // Check that the modified table only contains rows with email addresses
    for (int i = 0; i < modifiedTable.getRowCount(); i++) {
        String email = (String) modifiedTable.getValueAt(i, 2);
        assertTrue(email.contains("@"));
    }
}