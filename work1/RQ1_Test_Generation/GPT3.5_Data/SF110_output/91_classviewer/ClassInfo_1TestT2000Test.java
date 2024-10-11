```java
    private ClassInfo classInfo;

    @BeforeEach
    void setUp() {
        classInfo = new ClassInfo("javax.swing.JFrame");
    }

    @Test
    void testPrintMethodsNotNull() {
        String[] methods = classInfo.printMethods();
        assertNotNull(methods);
    }

    @Test
    void testPrintMethodsNotEmpty() {
        String[] methods = classInfo.printMethods();
        assertTrue(methods.length > 0);
    }

    @Test
    void testPrintMethodsContainsMethod() {
        String[] methods = classInfo.printMethods();
        assertTrue(Arrays.asList(methods).contains("public void javax.swing.JFrame.setVisible(boolean)"));
    }

    @Test
    void testPrintMethodsNoInheritedMethodsNotNull() {
        String[] methods = classInfo.printMethods(ClassInfo.NO_INHERITED_METHODS);
        assertNotNull(methods);
    }

    @Test
    void testPrintMethodsNoInheritedMethodsNotEmpty() {
        String[] methods = classInfo.printMethods(ClassInfo.NO_INHERITED_METHODS);
        assertTrue(methods.length > 0);
    }

    @Test
    void testPrintMethodsNoInheritedMethodsContainsMethod() {
        String[] methods = classInfo.printMethods(ClassInfo.NO_INHERITED_METHODS);
        assertFalse(Arrays.asList(methods).contains("public void java.awt.Window.setVisible(boolean)"));
    }

    @Test
    void testPrintMethodsNoObjectMethodsNotNull() {
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS);
        assertNotNull(methods);
    }

    @Test
    void testPrintMethodsNoObjectMethodsNotEmpty() {
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS);
        assertTrue(methods.length > 0);
    }

    @Test
    void testPrintMethodsNoObjectMethodsContainsMethod() {
        String[] methods = classInfo.printMethods(ClassInfo.NO_OBJECT_METHODS);
        assertFalse(Arrays.asList(methods).contains("public void java.lang.Object.wait() throws java.lang.InterruptedException"));
    }
```
