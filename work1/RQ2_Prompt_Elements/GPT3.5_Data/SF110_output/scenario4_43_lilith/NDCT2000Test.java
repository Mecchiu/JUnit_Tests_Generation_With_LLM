// Here's an example implementation of the NDCAdapter interface that can be used in the static block of the NDC class.

// ExampleNDCAdapter.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

import java.util.Stack;

public class ExampleNDCAdapter implements NDCAdapter {

    private static final ThreadLocal<Stack<Message>> THREAD_LOCAL_STACK = new ThreadLocal<>();

    @Override
    public void push(Message message) {
        Stack<Message> stack = THREAD_LOCAL_STACK.get();
        if (stack == null) {
            stack = new Stack<>();
            THREAD_LOCAL_STACK.set(stack);
        }
        stack.push(message);
    }

    @Override
    public Message pop() {
        Stack<Message> stack = THREAD_LOCAL_STACK.get();
        if (stack == null || stack.isEmpty()) {
            return null;
        }
        return stack.pop();
    }

    @Override
    public int getDepth() {
        Stack<Message> stack = THREAD_LOCAL_STACK.get();
        if (stack == null) {
            return 0;
        }
        return stack.size();
    }

    @Override
    public void clear() {
        THREAD_LOCAL_STACK.remove();
    }

    @Override
    public Message[] toArray() {
        Stack<Message> stack = THREAD_LOCAL_STACK.get();
        if (stack == null) {
            return new Message[0];
        }
        return stack.toArray(new Message[stack.size()]);
    }
}

// And here's an example implementation of the NDC class that uses the ExampleNDCAdapter.

// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDC {

    private static final NDCAdapter ndcAdapter;

    static {
        ndcAdapter = new ExampleNDCAdapter();
    }

    private NDC() {
    }

    public static void push(String message) {
        ndcAdapter.push(new Message(message));
    }

    public static void push(String messagePattern, Object[] arguments) {
        ndcAdapter.push(new Message(messagePattern, arguments));
    }

    public static void pop() {
        ndcAdapter.pop();
    }

    public static int getDepth() {
        return ndcAdapter.getDepth();
    }

    public static void setMaximumDepth(int maximumDepth) {
        // Not implemented in this example.
    }

    public static boolean isEmpty() {
        return ndcAdapter.getDepth() == 0;
    }

    public static void clear() {
        ndcAdapter.clear();
    }

    public static Message[] getContextStack() {
        return ndcAdapter.toArray();
    }
}

// And finally, here's an example test class for the NDC class.

// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test class of {@link NDC}.
 * It contains ten unit test cases for the {@link NDC#getContextStack()} method.
 */
class NDCTest {

    @Test
    void testEmptyStack() {
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(0, stack.length);
    }

    @Test
    void testPushAndPop() {
        NDC.push("message 1");
        NDC.push("message 2");
        NDC.push("message 3");
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(3, stack.length);
        assertEquals("message 3", stack[0].getMessage());
        assertEquals("message 2", stack[1].getMessage());
        assertEquals("message 1", stack[2].getMessage());
        NDC.pop();
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(2, stack.length);
        assertEquals("message 2", stack[0].getMessage());
        assertEquals("message 1", stack[1].getMessage());
        NDC.pop();
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(1, stack.length);
        assertEquals("message 1", stack[0].getMessage());
        NDC.pop();
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(0, stack.length);
    }

    @Test
    void testPushWithArguments() {
        NDC.push("message {} with {}", new Object[]{"one", "two"});
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(1, stack.length);
        assertEquals("message one with two", stack[0].getMessage());
    }

    @Test
    void testClear() {
        NDC.push("message 1");
        NDC.push("message 2");
        NDC.push("message 3");
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(3, stack.length);
        NDC.clear();
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(0, stack.length);
    }

    @Test
    void testGetDepth() {
        assertEquals(0, NDC.getDepth());
        NDC.push("message 1");
        assertEquals(1, NDC.getDepth());
        NDC.push("message 2");
        assertEquals(2, NDC.getDepth());
        NDC.push("message 3");
        assertEquals(3, NDC.getDepth());
        NDC.pop();
        assertEquals(2, NDC.getDepth());
        NDC.pop();
        assertEquals(1, NDC.getDepth());
        NDC.pop();
        assertEquals(0, NDC.getDepth());
    }

    @Test
    void testIsEmpty() {
        assertTrue(NDC.isEmpty());
        NDC.push("message 1");
        assertFalse(NDC.isEmpty());
        NDC.pop();
        assertTrue(NDC.isEmpty());
    }

    @Test
    void testToArray() {
        NDC.push("message 1");
        NDC.push("message 2");
        NDC.push("message 3");
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(3, stack.length);
        assertEquals("message 3", stack[0].getMessage());
        assertEquals("message 2", stack[1].getMessage());
        assertEquals("message 1", stack[2].getMessage());
        stack[0] = new Message("modified message 3");
        stack[1] = new Message("modified message 2");
        stack[2] = new Message("modified message 1");
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(3, stack.length);
        assertEquals("message 3", stack[0].getMessage());
        assertEquals("message 2", stack[1].getMessage());
        assertEquals("message 1", stack[2].getMessage());
    }

    @Test
    void testThreadSafety() throws InterruptedException {
        final int numThreads = 10;
        final int numIterations = 1000;
        Thread[] threads = new Thread[numThreads];
        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < numIterations; j++) {
                    NDC.push("message " + j);
                    NDC.pop();
                }
            });
            threads[i].start();
        }
        for (int i = 0; i < numThreads; i++) {
            threads[i].join();
        }
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(0, stack.length);
    }
}