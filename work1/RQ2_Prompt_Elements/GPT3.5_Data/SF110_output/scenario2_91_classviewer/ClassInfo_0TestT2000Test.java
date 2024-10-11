// Here's an example of how you can test the printFields() method of ClassInfo class using JUnit 5.

class ClassInfo_0Test {

    @Test
    void testPrintFieldsReturnsNullWhenNoPublicFields() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.c = Object.class;
        assertNull(classInfo.printFields());
    }

    @Test
    void testPrintFieldsReturnsArrayOfStringsWhenPublicFieldsExist() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.c = TestClass.class;
        assertNotNull(classInfo.printFields());
        assertEquals(2, classInfo.printFields().length);
    }

    @Test
    void testPrintFieldsReturnsCorrectFieldNamesAndValues() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.c = TestClass.class;
        String[] fields = classInfo.printFields();
        assertEquals("publicField=public", fields[0]);
        assertEquals("publicStaticField=static", fields[1]);
    }

    @Test
    void testPrintFieldsHandlesIllegalAccessException() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.c = TestClassWithIllegalAccess.class;
        String[] fields = classInfo.printFields();
        assertEquals("publicField= ILLEGAL ACCESS EXCEPTION, unable to load", fields[0]);
    }

    @Test
    void testPrintFieldsHandlesIllegalArgumentException() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.c = TestClassWithIllegalArgument.class;
        String[] fields = classInfo.printFields();
        assertEquals("publicField= ILLEGAL ARGUMENT EXCEPTION, unable to load", fields[0]);
    }

    @Test
    void testPrintFieldsHandlesNullClassObject() {
        ClassInfo classInfo = new ClassInfo();
        assertNull(classInfo.printFields());
    }

    @Test
    void testPrintFieldsHandlesDebugMode() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.c = TestClass.class;
        classInfo.debug = true;
        String[] fields = classInfo.printFields();
        assertNotNull(fields);
    }

    @Test
    void testPrintFieldsHandlesEmptyClass() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.c = EmptyClass.class;
        assertNull(classInfo.printFields());
    }

    @Test
    void testPrintFieldsHandlesInheritedFields() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.c = SubTestClass.class;
        String[] fields = classInfo.printFields();
        assertEquals(3, fields.length);
        assertEquals("publicField=public", fields[0]);
        assertEquals("publicStaticField=static", fields[1]);
        assertEquals("inheritedField=inherited", fields[2]);
    }

    @Test
    void testPrintFieldsHandlesPrivateFields() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.c = TestClassWithPrivateFields.class;
        String[] fields = classInfo.printFields();
        assertEquals(1, fields.length);
        assertEquals("publicField=public", fields[0]);
    }

    // Test classes used for testing the ClassInfo class
    public static class TestClass {
        public String publicField = "public";
        public static String publicStaticField = "static";
    }

    public static class TestClassWithIllegalAccess {
        public String publicField = "public";
        private String privateField = "private";
    }

    public static class TestClassWithIllegalArgument {
        public String publicField = "public";
        public static String publicStaticField = "static";
        public String getPrivateField(String s) {
            return s;
        }
    }

    public static class EmptyClass {}

    public static class SuperTestClass {
        public String inheritedField = "inherited";
    }

    public static class SubTestClass extends SuperTestClass {
        public String publicField = "public";
        public static String publicStaticField = "static";
    }

    public static class TestClassWithPrivateFields {
        private String privateField = "private";
        public String publicField = "public";
    }
}