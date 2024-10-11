// Here's the source code for the IsNestedTest class

class IsNestedTest {
    
    @Test
    void testEmptyString() {
        assertFalse(IsNested.isNested(""));
    }
    
    @Test
    void testSingleOpeningBracket() {
        assertFalse(IsNested.isNested("["));
    }
    
    @Test
    void testSingleClosingBracket() {
        assertFalse(IsNested.isNested("]"));
    }
    
    @Test
    void testTwoOpeningBrackets() {
        assertFalse(IsNested.isNested("[["));
    }
    
    @Test
    void testTwoClosingBrackets() {
        assertFalse(IsNested.isNested("]]"));
    }
    
    @Test
    void testNestedBrackets() {
        assertTrue(IsNested.isNested("[[]]"));
    }
    
    @Test
    void testMultiple