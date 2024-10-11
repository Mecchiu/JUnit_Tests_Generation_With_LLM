// Here's an example of how you can test the DictionaryInfo class:

@Test
void testGetField() {
    DictionaryInfo dictionary = new DictionaryInfo();
    List<FieldInfo> fields = new ArrayList<>();
    fields.add(new FieldInfo(1, "Account"));
    fields.add(new FieldInfo(11, "ClOrdID"));
    fields.add(new FieldInfo(38, "OrderQty"));
    fields.add(new FieldInfo(40, "OrdType"));
    fields.add(new FieldInfo(44, "Price"));
    fields.add(new FieldInfo(54, "Side"));
    fields.add(new FieldInfo(55, "Symbol"));
    fields.add(new FieldInfo(58, "Text"));
    fields.add(new FieldInfo(59, "TimeInForce"));
    fields.add(new FieldInfo(60, "TransactTime"));
    dictionary.setFields(fields);

    // Test getting a field that exists
    FieldInfo field = dictionary.getField(55);
    assertNotNull(field);
    assertEquals("Symbol", field.getName());

    // Test getting a field that doesn't exist
    field = dictionary.getField(999);
    assertNull(field);
}
