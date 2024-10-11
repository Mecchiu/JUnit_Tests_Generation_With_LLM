// Here's an example implementation of the ClassInfo#printMethods(int) method:

/**
 * Returns an array of strings that contain the public methods for
 * the class excluding inherited methods. The data is pulled from
 * the c private Class object.
 * <p>
 * This method always returns immediately.
 *
 * @param param (not currently implemented) selects whether inherited
 *               objects are returned
 * @return string array of public methods
 */
public String[] printMethods(int param) {
    Method[] methods = c.getDeclaredMethods();
    ArrayList<String> publicMethods = new ArrayList<String>();
    for (Method method : methods) {
        if (Modifier.isPublic(method.getModifiers())) {
            publicMethods.add(method.getName());
        }
    }
    return publicMethods.toArray(new String[0]);
}

// And here's an example implementation of the ClassInfo_2Test class:

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#printMethods(int)} method.
 */
class ClassInfo_2Test {
    @Test
    void testPrintMethods_noInheritedMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(0);
        assertEquals(3, methods.length);
        assertTrue(Arrays.asList(methods).contains("method1"));
        assertTrue(Arrays.asList(methods).contains("method2"));
        assertTrue(Arrays.asList(methods).contains("method3"));
    }

    @Test
    void testPrintMethods_inheritedMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(1);
        assertEquals(6, methods.length);
        assertTrue(Arrays.asList(methods).contains("method1"));
        assertTrue(Arrays.asList(methods).contains("method2"));
        assertTrue(Arrays.asList(methods).contains("method3"));
        assertTrue(Arrays.asList(methods).contains("toString"));
        assertTrue(Arrays.asList(methods).contains("equals"));
        assertTrue(Arrays.asList(methods).contains("hashCode"));
    }

    @Test
    void testPrintMethods_nullParam() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(null);
        assertEquals(3, methods.length);
        assertTrue(Arrays.asList(methods).contains("method1"));
        assertTrue(Arrays.asList(methods).contains("method2"));
        assertTrue(Arrays.asList(methods).contains("method3"));
    }

    @Test
    void testPrintMethods_negativeParam() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(-1);
        assertEquals(3, methods.length);
        assertTrue(Arrays.asList(methods).contains("method1"));
        assertTrue(Arrays.asList(methods).contains("method2"));
        assertTrue(Arrays.asList(methods).contains("method3"));
    }

    @Test
    void testPrintMethods_largeParam() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(100);
        assertEquals(3, methods.length);
        assertTrue(Arrays.asList(methods).contains("method1"));
        assertTrue(Arrays.asList(methods).contains("method2"));
        assertTrue(Arrays.asList(methods).contains("method3"));
    }

    @Test
    void testPrintMethods_privateMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(0);
        assertFalse(Arrays.asList(methods).contains("privateMethod"));
    }

    @Test
    void testPrintMethods_protectedMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(0);
        assertFalse(Arrays.asList(methods).contains("protectedMethod"));
    }

    @Test
    void testPrintMethods_packagePrivateMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(0);
        assertFalse(Arrays.asList(methods).contains("packagePrivateMethod"));
    }

    @Test
    void testPrintMethods_staticMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(0);
        assertFalse(Arrays.asList(methods).contains("staticMethod"));
    }

    @Test
    void testPrintMethods_finalMethods() {
        ClassInfo classInfo = new ClassInfo();
        String[] methods = classInfo.printMethods(0);
        assertFalse(Arrays.asList(methods).contains("finalMethod"));
    }
}