import org.junit.jupiter.api.BeforeEach;

class NDCTest {

    private static final String MESSAGE_1 = "Message 1";
    private static final String MESSAGE_2 = "Message 2";
    private static final String MESSAGE_3 = "Message 3";

    @BeforeEach
    void setUp() {
        NDC.clear();
    }

    @Test
    void testGetContextStackEmpty() {
        Message[] contextStack = NDC.getContextStack();
        assertNotNull(contextStack);
        assertEquals(0, contextStack.length);
    }

    @Test
    void testGetContextStackOneMessage() {
        NDC.push(MESSAGE_1);
        Message[] contextStack = NDC.getContextStack();
        assertNotNull(contextStack);
        assertEquals(1, contextStack.length);
        assertEquals(MESSAGE_1, contextStack[0].getMessage());
    }

    @Test
    void testGetContextStackTwoMessages() {
        NDC.push(MESSAGE_1);
        NDC.push(MESSAGE_2);
        Message[] contextStack = NDC.getContextStack();
        assertNotNull(contextStack);
        assertEquals(2, contextStack.length);
        assertEquals(MESSAGE_2, contextStack[0].getMessage());
        assertEquals(MESSAGE_1, contextStack[1].getMessage());
    }

    @Test
    void testGetContextStackThreeMessages() {
        NDC.push(MESSAGE_1);
        NDC.push(MESSAGE_2);
        NDC.push(MESSAGE_3);
        Message[] contextStack = NDC.getContextStack();
        assertNotNull(contextStack);
        assertEquals(3, contextStack.length);
        assertEquals(MESSAGE_3, contextStack[0].getMessage());
        assertEquals(MESSAGE_2, contextStack[1].getMessage());
        assertEquals(MESSAGE_1, contextStack[2].getMessage());
    }

    @Test
    void testGetContextStackAfterPop() {
        NDC.push(MESSAGE_1);
        NDC.push(MESSAGE_2);
        NDC.pop();
        Message[] contextStack = NDC.getContextStack();
        assertNotNull(contextStack);
        assertEquals(1, contextStack.length);
        assertEquals(MESSAGE_1, contextStack[0].getMessage());
    }

    @Test
    void testGetContextStackAfterClear() {
        NDC.push(MESSAGE_1);
        NDC.push(MESSAGE_2);
        NDC.clear();
        Message[] contextStack = NDC.getContextStack();
        assertNotNull(contextStack);
        assertEquals(0, contextStack.length);
    }

    @Test
    void testPushNull() {
        assertThrows(IllegalArgumentException.class, () -> NDC.push(null));
    }

    @Test
    void testPushEmptyString() {
        assertThrows(IllegalArgumentException.class, () -> NDC.push(""));
    }

    @Test
    void testPushWhitespaceString() {
        assertThrows(IllegalArgumentException.class, () -> NDC.push("   "));
    }

    @Test
    void testPopEmptyStack() {
        assertThrows(IllegalStateException.class, () -> NDC.pop());
    }
}