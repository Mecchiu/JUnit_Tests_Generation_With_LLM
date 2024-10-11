// Here's an implementation of the MessageFormatter_2Test class with ten unit test cases for the evaluateArguments method.

class MessageFormatter_2Test {

    @Test
    void testNullArguments() {
        assertNull(MessageFormatter.evaluateArguments("test", null));
    }

    @Test
    void testNoArguments() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test", new Object[0]);
        assertNotNull(result);
        assertEquals(0, result.getArguments().length);
        assertNull(result.getThrowable());
    }

    @Test
    void testOneArgument() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test {}", new Object[]{"arg"});
        assertNotNull(result);
        assertEquals(1, result.getArguments().length);
        assertEquals("arg", result.getArguments()[0]);
        assertNull(result.getThrowable());
    }

    @Test
    void testTwoArguments() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test {} {}", new Object[]{"arg1", "arg2"});
        assertNotNull(result);
        assertEquals(2, result.getArguments().length);
        assertEquals("arg1", result.getArguments()[0]);
        assertEquals("arg2", result.getArguments()[1]);
        assertNull(result.getThrowable());
    }

    @Test
    void testThreeArguments() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test {} {} {}", new Object[]{"arg1", "arg2", "arg3"});
        assertNotNull(result);
        assertEquals(3, result.getArguments().length);
        assertEquals("arg1", result.getArguments()[0]);
        assertEquals("arg2", result.getArguments()[1]);
        assertEquals("arg3", result.getArguments()[2]);
        assertNull(result.getThrowable());
    }

    @Test
    void testThrowable() {
        Throwable throwable = new RuntimeException("test");
        ArgumentResult result = MessageFormatter.evaluateArguments("test", new Object[]{throwable});
        assertNotNull(result);
        assertEquals(0, result.getArguments().length);
        assertEquals(throwable, result.getThrowable());
    }

    @Test
    void testThrowableWithArguments() {
        Throwable throwable = new RuntimeException("test");
        ArgumentResult result = MessageFormatter.evaluateArguments("test {}", new Object[]{"arg", throwable});
        assertNotNull(result);
        assertEquals(2, result.getArguments().length);
        assertEquals("arg", result.getArguments()[0]);
        assertEquals(throwable, result.getThrowable());
    }

    @Test
    void testOneArgumentWithBraces() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test {{}}", new Object[]{"arg"});
        assertNotNull(result);
        assertEquals(1, result.getArguments().length);
        assertEquals("arg", result.getArguments()[0]);
        assertNull(result.getThrowable());
    }

    @Test
    void testOneArgumentWithEscapedBraces() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test \\{\\} {}", new Object[]{"arg"});
        assertNotNull(result);
        assertEquals(1, result.getArguments().length);
        assertEquals("arg", result.getArguments()[0]);
        assertNull(result.getThrowable());
    }

    @Test
    void testOneArgumentWithEscapedBracesAndText() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test \\{\\} {} test", new Object[]{"arg"});
        assertNotNull(result);
        assertEquals(1, result.getArguments().length);
        assertEquals("arg", result.getArguments()[0]);
        assertNull(result.getThrowable());
    }

    @Test
    void testArrayArgument() {
        ArgumentResult result = MessageFormatter.evaluateArguments("test {}", new Object[]{new int[]{1, 2, 3}});
        assertNotNull(result);
        assertEquals(1, result.getArguments().length);
        assertEquals("[1, 2, 3]", result.getArguments()[0]);
        assertNull(result.getThrowable());
    }
}