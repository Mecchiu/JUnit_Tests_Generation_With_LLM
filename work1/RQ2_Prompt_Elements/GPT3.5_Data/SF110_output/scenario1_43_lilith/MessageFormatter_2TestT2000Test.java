// Here's an implementation of the MessageFormatter_2Test class with ten unit test cases for the evaluateArguments method:

class MessageFormatter_2Test {

    @Test
    void testNullArguments() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test", null);
        assertNull(result);
    }

    @Test
    void testNoArguments() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test", new Object[0]);
        assertNotNull(result);
        assertEquals(0, result.getArgumentCount());
        assertNull(result.getThrowable());
    }

    @Test
    void testOneArgument() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test {}", new Object[]{"arg"});
        assertNotNull(result);
        assertEquals(1, result.getArgumentCount());
        assertNull(result.getThrowable());
        assertEquals("arg", result.getArguments()[0]);
    }

    @Test
    void testTwoArguments() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test {} {}", new Object[]{"arg1", "arg2"});
        assertNotNull(result);
        assertEquals(2, result.getArgumentCount());
        assertNull(result.getThrowable());
        assertEquals("arg1", result.getArguments()[0]);
        assertEquals("arg2", result.getArguments()[1]);
    }

    @Test
    void testThreeArguments() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test {} {} {}", new Object[]{"arg1", "arg2", "arg3"});
        assertNotNull(result);
        assertEquals(3, result.getArgumentCount());
        assertNull(result.getThrowable());
        assertEquals("arg1", result.getArguments()[0]);
        assertEquals("arg2", result.getArguments()[1]);
        assertEquals("arg3", result.getArguments()[2]);
    }

    @Test
    void testThrowable() {
        Throwable throwable = new RuntimeException("test");
        ArgumentResult result = MessageFormatter.evaluateArguments("test", new Object[]{throwable});
        assertNotNull(result);
        assertEquals(0, result.getArgumentCount());
        assertEquals(throwable, result.getThrowable());
    }

    @Test
    void testThrowableWithArguments() {
        Throwable throwable = new RuntimeException("test");
        ArgumentResult result = MessageFormatter.evaluateArguments("test {}", new Object[]{"arg", throwable});
        assertNotNull(result);
        assertEquals(1, result.getArgumentCount());
        assertEquals(throwable, result.getThrowable());
        assertEquals("arg", result.getArguments()[0]);
    }

    @Test
    void testSpecialCase() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test {}", new Object[]{"arg1", "arg2"});
        assertNotNull(result);
        assertEquals(1, result.getArgumentCount());
        assertNull(result.getThrowable());
        assertEquals("[arg1, arg2]", result.getArguments()[0]);
    }

    @Test
    void testNullArgument() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test {}", new Object[]{null});
        assertNotNull(result);
        assertEquals(1, result.getArgumentCount());
        assertNull(result.getThrowable());
        assertNull(result.getArguments()[0]);
    }

    @Test
    void testMultipleThrowables() {
        Throwable throwable1 = new RuntimeException("test1");
        Throwable throwable2 = new RuntimeException("test2");
        ArgumentResult result = MessageFormatter.evaluateArguments("test {} {}", new Object[]{throwable1, throwable2});
        assertNotNull(result);
        assertEquals(0, result.getArgumentCount());
        assertEquals(throwable2, result.getThrowable());
    }
}