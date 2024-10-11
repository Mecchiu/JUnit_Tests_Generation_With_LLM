```java
    @Test
    void testSrchMethods_NullInput() {
        ClassInfo classInfo = new ClassInfo();
        assertNull(classInfo.srchMethods(null));
    }

    @Test
    void testSrchMethods_EmptyInput() {
        ClassInfo classInfo = new ClassInfo();
        assertNull(classInfo.srchMethods(""));
    }

    @Test
    void testSrchMethods_NoMatch() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.printMethods();
        assertNull(classInfo.srchMethods("nonexistent"));
    }

    @Test
    void testSrchMethods_SingleMatch() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.printMethods();
        assertNotNull(classInfo.srchMethods("printMethods"));
        assertEquals(1, classInfo.srchMethods("printMethods").length);
    }

    @Test
    void testSrchMethods_MultipleMatches() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.printMethods();
        assertNotNull(classInfo.srchMethods("print"));
        assertTrue(classInfo.srchMethods("print").length > 1);
    }

    @Test
    void testSrchMethods_CaseSensitive() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.printMethods();
        assertNull(classInfo.srchMethods("PrintMethods"));
    }

    @Test
    void testSrchMethods_WithNumbers() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.printMethods();
        assertNotNull(classInfo.srchMethods("2"));
    }

    @Test
    void testSrchMethods_WithSpecialCharacters() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.printMethods();
        assertNotNull(classInfo.srchMethods("()"));
    }

    @Test
    void testSrchMethods_WithSpaces() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.printMethods();
        assertNotNull(classInfo.srchMethods("print Methods"));
    }

    @Test
    void testSrchMethods_WithSymbols() {
        ClassInfo classInfo = new ClassInfo();
        classInfo.printMethods();
        assertNotNull(classInfo.srchMethods("*"));
    }
```
```