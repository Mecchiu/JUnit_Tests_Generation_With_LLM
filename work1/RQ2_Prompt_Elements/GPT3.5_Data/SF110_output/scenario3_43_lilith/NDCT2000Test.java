Here's a possible implementation of the `NDC` class and the `NDCTest` test class:

```java
// NDC.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

import java.util.ArrayDeque;
import java.util.Deque;

public class NDC {

    private static final ThreadLocal<Deque<Message>> STACK = ThreadLocal.withInitial(ArrayDeque::new);

    /**
     * Pushes a message onto the stack.
     *
     * @param message the message to push.
     */
    public static void push(Message message) {
        STACK.get().push(message);
    }

    /**
     * Pops the top message from the stack.
     *
     * @return the top message, or {@code null} if the stack is empty.
     */
    public static Message pop() {
        Deque<Message> stack = STACK.get();
        return stack.isEmpty() ? null : stack.pop();
    }

    /**
     * Returns an array containing all messages of the stack.
     * <p/>
     * The messages from the NDC stack should not be used in application logic.
     *
     * @return an array containing all messages of the stack.
     */
    public static Message[] getContextStack() {
        Deque<Message> stack = STACK.get();
        return stack.toArray(new Message[stack.size()]);
    }
}

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
        Message message = new Message("test");
        NDC.push(message);
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(1, stack.length);
        assertSame(message, stack[0]);
        Message popped = NDC.pop();
        assertSame(message, popped);
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(0, stack.length);
    }

    @Test
    void testPushMultiple() {
        Message message1 = new Message("test1");
        Message message2 = new Message("test2");
        NDC.push(message1);
        NDC.push(message2);
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(2, stack.length);
        assertSame(message2, stack[0]);
        assertSame(message1, stack[1]);
        Message popped = NDC.pop();
        assertSame(message2, popped);
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(1, stack.length);
        assertSame(message1, stack[0]);
        popped = NDC.pop();
        assertSame(message1, popped);
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(0, stack.length);
    }

    @Test
    void testPushNull() {
        NDC.push(null);
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(1, stack.length);
        assertNull(stack[0]);
        Message popped = NDC.pop();
        assertNull(popped);
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(0, stack.length);
    }

    @Test
    void testPopEmptyStack() {
        Message popped = NDC.pop();
        assertNull(popped);
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(0, stack.length);
    }

    @Test
    void testPushAndPopMultipleThreads() throws InterruptedException {
        Message message1 = new Message("test1");
        Message message2 = new Message("test2");
        Thread thread1 = new Thread(() -> {
            NDC.push(message1);
            Message[] stack = NDC.getContextStack();
            assertNotNull(stack);
            assertEquals(1, stack.length);
            assertSame(message1, stack[0]);
            Message popped = NDC.pop();
            assertSame(message1, popped);
            stack = NDC.getContextStack();
            assertNotNull(stack);
            assertEquals(0, stack.length);
        });
        Thread thread2 = new Thread(() -> {
            NDC.push(message2);
            Message[] stack = NDC.getContextStack();
            assertNotNull(stack);
            assertEquals(1, stack.length);
            assertSame(message2, stack[0]);
            Message popped = NDC.pop();
            assertSame(message2, popped);
            stack = NDC.getContextStack();
            assertNotNull(stack);
            assertEquals(0, stack.length);
        });
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(0, stack.length);
    }

    @Test
    void testPushAndPopNested() {
        Message message1 = new Message("test1");
        Message message2 = new Message("test2");
        Message message3 = new Message("test3");
        NDC.push(message1);
        NDC.push(message2);
        NDC.push(message3);
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(3, stack.length);
        assertSame(message3, stack[0]);
        assertSame(message2, stack[1]);
        assertSame(message1, stack[2]);
        Message popped = NDC.pop();
        assertSame(message3, popped);
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(2, stack.length);
        assertSame(message2, stack[0]);
        assertSame(message1, stack[1]);
        popped = NDC.pop();
        assertSame(message2, popped);
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(1, stack.length);
        assertSame(message1, stack[0]);
        popped = NDC.pop();
        assertSame(message1, popped);
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(0, stack.length);
    }

    @Test
    void testGetContextStackReturnsCopy() {
        Message message1 = new Message("test1");
        Message message2 = new Message("test2");
        NDC.push(message1);
        NDC.push(message2);
        Message[] stack1 = NDC.getContextStack();
        assertNotNull(stack1);
        assertEquals(2, stack1.length);
        assertSame(message2, stack1[0]);
        assertSame(message1, stack1[1]);
        Message[] stack2 = NDC.getContextStack();
        assertNotNull(stack2);
        assertEquals(2, stack2.length);
        assertSame(message2, stack2[0]);
        assertSame(message1, stack2[1]);
        assertNotSame(stack1, stack2);
        assertNotSame(stack1[0], stack2[0]);
        assertNotSame(stack1[1], stack2[1]);
    }

    @Test
    void testGetContextStackDoesNotExposeInternalState() {
        Message message1 = new Message("test1");
        Message message2 = new Message("test2");
        NDC.push(message1);
        NDC.push(message2);
        Message[] stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(2, stack.length);
        assertSame(message2, stack[0]);
        assertSame(message1, stack[1]);
        stack[0] = null;
        stack[1] = null;
        stack = NDC.getContextStack();
        assertNotNull(stack);
        assertEquals(2, stack.length);
        assertSame(message2, stack[0]);
        assertSame(message1, stack[1]);
    }
}
```

This implementation uses a thread-local stack to store the messages. The `push` method adds a message to the top of the stack, and the `pop` method removes and returns the top message. The `getContextStack` method returns a copy of the stack as an array.

The `NDCTest` class contains ten test cases for the `getContextStack` method. The test cases cover various scenarios, such as pushing and popping messages, pushing null, pushing and popping messages in multiple threads, pushing and popping nested messages, and checking that `getContextStack` returns a copy of the stack and does not expose the internal state of the stack.