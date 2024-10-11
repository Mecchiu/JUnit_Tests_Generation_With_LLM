@Test
void testGetFormat() {
    HSSFDataFormat dataFormat = new HSSFDataFormat();
    short index;

    // Test built-in formats
    index = dataFormat.getFormat("General");
    assertEquals(0, index);

    index = dataFormat.getFormat("0.00");
    assertEquals(2, index);

    index = dataFormat.getFormat("#,##0.00");
    assertEquals(3, index);

    index = dataFormat.getFormat("0%");
    assertEquals(9, index);

    index = dataFormat.getFormat("0.00%");
    assertEquals(10, index);

    index = dataFormat.getFormat("yyyy/mm/dd");
    assertEquals(14, index);

    index = dataFormat.getFormat("d-mmm-yy");
    assertEquals(15, index);

    index = dataFormat.getFormat("hh:mm AM/PM");
    assertEquals(18, index);

    // Test custom format
    index = dataFormat.getFormat("#,##0.00 [$USD]");
    assertTrue(index > 0);
}
}