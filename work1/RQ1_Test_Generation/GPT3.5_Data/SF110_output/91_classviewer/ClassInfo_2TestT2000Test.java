```java
    @Test
    void testPrintMethodsNoObjectMethods() {
        ClassInfo classInfo = new ClassInfo("java.lang.String");
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS);
        assertNotNull(methods);
        assertEquals(0, methods.length);
    }

    @Test
    void testPrintMethodsNoInheritedMethods() {
        ClassInfo classInfo = new ClassInfo("java.lang.String");
        String[] methods = classInfo.printMethods(ClassInfo.NO_INHERITED_METHODS);
        assertNotNull(methods);
        assertTrue(methods.length > 0);
        for (String method : methods) {
            assertFalse(method.contains("java.lang.String."));
        }
    }

    @Test
    void testPrintMethodsInvalidParam() {
        ClassInfo classInfo = new ClassInfo("java.lang.String");
        String[] methods = classInfo.printMethods(3);
        assertNull(methods);
    }

    @Test
    void testPrintMethodsNoMethods() {
        ClassInfo classInfo = new ClassInfo("java.awt.Point");
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS);
        assertNull(methods);
    }

    @Test
    void testPrintMethodsNoInheritedMethodsForInterface() {
        ClassInfo classInfo = new ClassInfo("java.util.List");
        String[] methods = classInfo.printMethods(ClassInfo.NO_INHERITED_METHODS);
        assertNull(methods);
    }

    @Test
    void testPrintMethodsNoObjectMethodsForInterface() {
        ClassInfo classInfo = new ClassInfo("java.util.List");
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS);
        assertNull(methods);
    }

    @Test
    void testPrintMethodsNoMethodsForInterface() {
        ClassInfo classInfo = new ClassInfo("java.util.List");
        String[] methods = classInfo.printMethods();
        assertNull(methods);
    }

    @Test
    void testPrintMethodsNoInheritedMethodsForAbstractClass() {
        ClassInfo classInfo = new ClassInfo("javax.swing.border.AbstractBorder");
        String[] methods = classInfo.printMethods(ClassInfo.NO_INHERITED_METHODS);
        assertNull(methods);
    }

    @Test
    void testPrintMethodsNoObjectMethodsForAbstractClass() {
        ClassInfo classInfo = new ClassInfo("javax.swing.border.AbstractBorder");
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS);
        assertNull(methods);
    }
```
