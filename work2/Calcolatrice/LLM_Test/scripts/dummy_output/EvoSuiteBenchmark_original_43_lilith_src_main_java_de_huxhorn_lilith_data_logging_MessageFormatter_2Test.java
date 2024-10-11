package de.huxhorn.lilith.data.logging;
java
class MessageFormatter_2Test {

    @Test
    void testEvaluateArguments_NullArguments() {
        assertNull(MessageFormatter.evaluateArguments("Test", null));
    }

    @Test
    void testEvaluateArguments_NoPlaceholders() {
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Test", new Object[]{"arg1", "arg2"});
        assertNotNull(result);
        assertArrayEquals(new String[]{"arg1", "arg2"}, result.getArguments());
        assertNull(result.getThrowable());
    }

    @Test
    void testEvaluateArguments_WithThrowable() {
        Throwable throwable = new RuntimeException("Test Exception");
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Test {}", new Object[]{"arg1", throwable});
        assertNotNull(result);
        assertArrayEquals(new String[]{"arg1"}, result.getArguments());
        assertEquals(throwable, result.getThrowable());
    }

    @Test
    void testEvaluateArguments_SpecialCase() {
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Test {}", new Object[]{"arg1", "arg2"});
        assertNotNull(result);
        assertArrayEquals(new String[]{"[arg1, arg2]"}, result.getArguments());
        assertNull(result.getThrowable());
    }

    @Test
    void testEvaluateArguments_Map() {
        Map<String, String> map = Map.of("key1", "value1", "key2", "value2");
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Test {}", new Object[]{map});
        assertNotNull(result);
        assertArrayEquals(new String[]{"{key1=value1, key2=value2}"}, result.getArguments());
        assertNull(result.getThrowable());
    }

    @Test
    void testEvaluateArguments_Collection() {
        Collection<String> collection = Arrays.asList("item1", "item2");
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Test {}", new Object[]{collection});
        assertNotNull(result);
        assertArrayEquals(new String[]{"[item1, item2]"}, result.getArguments());
        assertNull(result.getThrowable());
    }

    @Test
    void testEvaluateArguments_Date() {
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        String formattedDate = format.format(date);
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Test {}", new Object[]{date});
        assertNotNull(result);
        assertArrayEquals(new String[]{formattedDate}, result.getArguments());
        assertNull(result.getThrowable());
    }

    @Test
    void testEvaluateArguments_RecursiveObject() {
        Set<Object> set = new HashSet<>();
        set.add(set);
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Test {}", new Object[]{set});
        assertNotNull(result);
        assertArrayEquals(new String[]{"[..."+set.hashCode()+"...]"}, result.getArguments());
        assertNull(result.getThrowable());
    }

    @Test
    void testEvaluateArguments_ExceptionInToString() {
        Object obj = new Object() {
            @Override
            public String toString() {
                throw new RuntimeException("Test Exception");
            }
        };
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments("Test {}", new Object[]{obj});
        assertNotNull(result);
        assertArrayEquals(new String[]{"[!!!"+obj.getClass().getName()+"@"+Integer.toHexString(System.identityHashCode(obj))+":Test Exception!!!]"}, result.getArguments());
        assertNull(result.getThrowable());
    }
}
