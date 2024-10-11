```java
    @Test
    void testPrintFields_NoFields() {
        ClassInfo classInfo = new ClassInfo();
        String[] fields = classInfo.printFields();
        assertNull(fields);
    }

    @Test
    void testPrintFields_WithFields() {
        ClassInfo classInfo = new ClassInfo("javax.swing.WindowConstants");
        String[] fields = classInfo.printFields();
        assertNotNull(fields);
        assertTrue(fields.length > 0);
    }

    @Test
    void testPrintFields_NullClass() {
        ClassInfo classInfo = new ClassInfo();
        String[] fields = classInfo.printFields();
        assertNull(fields);
    }

    @Test
    void testPrintFields_IllegalAccessException() {
        ClassInfo classInfo = new ClassInfo("javax.swing.WindowConstants");
        String[] fields = classInfo.printFields();
        assertNotNull(fields);
        for (String field : fields) {
            assertTrue(field.contains("ILLEGAL ACCESS EXCEPTION"));
        }
    }

    @Test
    void testPrintFields_IllegalArgumentException() {
        ClassInfo classInfo = new ClassInfo("javax.swing.WindowConstants");
        String[] fields = classInfo.printFields();
        assertNotNull(fields);
        for (String field : fields) {
            assertTrue(field.contains("ILLEGAL ARGUMENT EXCEPTION"));
        }
    }

    @Test
    void testPrintFields_DebugMode() {
        ClassInfo.debug = true;
        ClassInfo classInfo = new ClassInfo("javax.swing.WindowConstants");
        String[] fields = classInfo.printFields();
        assertNotNull(fields);
    }

    @Test
    void testPrintFields_NoFields_DebugMode() {
        ClassInfo.debug = true;
        ClassInfo classInfo = new ClassInfo();
        String[] fields = classInfo.printFields();
        assertNull(fields);
    }

    @Test
    void testPrintFields_NullClass_DebugMode() {
        ClassInfo.debug = true;
        ClassInfo classInfo = new ClassInfo();
        String[] fields = classInfo.printFields();
        assertNull(fields);
    }

    @Test
    void testPrintFields_WithFields_DebugMode() {
        ClassInfo.debug = true;
        ClassInfo classInfo = new ClassInfo("javax.swing.WindowConstants");
        String[] fields = classInfo.printFields();
        assertNotNull(fields);
        assertTrue(fields.length > 0);
    }
```
```