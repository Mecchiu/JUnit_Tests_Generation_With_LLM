// Here's an example of how you can test the ClassInfo class using JUnit 5:

@Test
void testGetDataWithEmptyArray() {
    Member[] members = new Member[0];
    String[] result = ClassInfo.getData(members);
    assertNull(result);
}

@Test
void testGetDataWithOneMember() throws NoSuchMethodException {
    Method method = String.class.getMethod("length");
    Member[] members = {method};
    String[] result = ClassInfo.getData(members);
    assertEquals(1, result.length);
    assertEquals("public int java.lang.String.length()", result[0]);
}

@Test
void testGetDataWithMultipleMembers() throws NoSuchFieldException, NoSuchMethodException {
    Field field = String.class.getField("CASE_INSENSITIVE_ORDER");
    Method method = String.class.getMethod("length");
    Constructor<String> constructor = String.class.getConstructor(String.class);
    Member[] members = {field, method, constructor};
    String[] result = ClassInfo.getData(members);
    assertEquals(3, result.length);
    assertEquals("public static final java.util.Comparator java.lang.String.CASE_INSENSITIVE_ORDER", result[0]);
    assertEquals("public int java.lang.String.length()", result[1]);
    assertEquals("public java.lang.String(java.lang.String)", result[2]);
}

// Add more test cases as needed.