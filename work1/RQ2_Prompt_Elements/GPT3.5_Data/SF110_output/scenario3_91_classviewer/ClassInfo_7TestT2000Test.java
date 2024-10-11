// Here's an example implementation of the ClassInfo.srchMethods() method:

/**
 * Searches through cMethods, the private array of public methods
 * for a given string fragment, and selects methods that have that
 * fragment in them.
 * <p>
 * This method calls searchStrings().
 *
 * @param tempStr string fragment with which to search
 * @return string array of found methods
 */
public String[] srchMethods(String tempStr) {
    ArrayList<String> foundMethods = new ArrayList<String>();
    for (Method method : cMethods) {
        String methodName = method.getName();
        if (methodName.contains(tempStr)) {
            foundMethods.add(methodName);
        }
    }
    return foundMethods.toArray(new String[foundMethods.size()]);
}

// And here's an example implementation of the ClassInfo_7Test class:

/**
 * Test class of {@link ClassInfo}.
 * It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
 */
class ClassInfo_7Test {
    @Test
    void testSrchMethods_emptyString() {
        String[] result = new ClassInfo().srchMethods("");
        assertEquals(0, result.length);
    }

    @Test
    void testSrchMethods_noMatch() {
        String[] result = new ClassInfo().srchMethods("xyz");
        assertEquals(0, result.length);
    }

    @Test
    void testSrchMethods_oneMatch() {
        String[] result = new ClassInfo().srchMethods("toString");
        assertEquals(1, result.length);
        assertEquals("toString", result[0]);
    }

    @Test
    void testSrchMethods_multipleMatches() {
        String[] result = new ClassInfo().srchMethods("get");
        assertEquals(3, result.length);
        assertTrue(Arrays.asList(result).contains("getFoo"));
        assertTrue(Arrays.asList(result).contains("getBar"));
        assertTrue(Arrays.asList(result).contains("getBaz"));
    }

    @Test
    void testSrchMethods_caseSensitive() {
        String[] result = new ClassInfo().srchMethods("GET");
        assertEquals(0, result.length);
    }

    @Test
    void testSrchMethods_whitespace() {
        String[] result = new ClassInfo().srchMethods("  get  ");
        assertEquals(3, result.length);
        assertTrue(Arrays.asList(result).contains("getFoo"));
        assertTrue(Arrays.asList(result).contains("getBar"));
        assertTrue(Arrays.asList(result).contains("getBaz"));
    }

    @Test
    void testSrchMethods_nullInput() {
        assertThrows(NullPointerException.class, () -> {
            new ClassInfo().srchMethods(null);
        });
    }

    @Test
    void testSrchMethods_privateMethod() throws Exception {
        Method privateMethod = ClassInfo.class.getDeclaredMethod("privateMethod");
        privateMethod.setAccessible(true);
        String[] result = new ClassInfo().srchMethods("privateMethod");
        assertEquals(0, result.length);
    }

    @Test
    void testSrchMethods_overloadedMethod() {
        String[] result = new ClassInfo().srchMethods("overloadedMethod");
        assertEquals(2, result.length);
        assertTrue(Arrays.asList(result).contains("overloadedMethod"));
        assertTrue(Arrays.asList(result).contains("overloadedMethod"));
    }

    @Test
    void testSrchMethods_staticMethod() {
        String[] result = new ClassInfo().srchMethods("staticMethod");
        assertEquals(1, result.length);
        assertEquals("staticMethod", result[0]);
    }

    private void privateMethod() {
        // do nothing
    }

    private void overloadedMethod() {
        // do nothing
    }

    private void overloadedMethod(int i) {
        // do nothing
    }

    private static void staticMethod() {
        // do nothing
    }
}