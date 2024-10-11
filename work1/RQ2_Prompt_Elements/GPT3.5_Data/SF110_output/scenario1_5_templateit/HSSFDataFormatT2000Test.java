@Test
void testGetFormat() {
    HSSFWorkbook workbook = new HSSFWorkbook();
    HSSFDataFormat dataFormat = workbook.createDataFormat();
    short format;

    // Test built-in formats
    format = dataFormat.getFormat("General");
    assertEquals(0, format);
    format = dataFormat.getFormat("0.00");
    assertEquals(2, format);
    format = dataFormat.getFormat("#,##0.00");
    assertEquals(3, format);
    format = dataFormat.getFormat("0%");
    assertEquals(9, format);
    format = dataFormat.getFormat("0.00%");
    assertEquals(10, format);
    format = dataFormat.getFormat("yyyy/mm/dd");
    assertEquals(14, format);

    // Test custom format
    format = dataFormat.getFormat("0.000");
    assertEquals(164, format);
}
}