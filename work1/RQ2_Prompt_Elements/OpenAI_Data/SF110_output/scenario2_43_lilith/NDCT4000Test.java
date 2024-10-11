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

	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack is empty.
	*/
	@Test
	public void testGetContextStack_empty() {
		NDC.clear();
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(0, contextStack.length);
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack contains one message.
	*/
	@Test
	public void testGetContextStack_one() {
		NDC.clear();
		NDC.push("one");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack contains two messages.
	*/
	@Test
	public void testGetContextStack_two() {
		NDC.clear();
		NDC.push("one");
		NDC.push("two");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(2, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack contains three messages.
	*/
	@Test
	public void testGetContextStack_three() {
		NDC.clear();
		NDC.push("one");
		NDC.push("two");
		NDC.push("three");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(3, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack contains four messages.
	*/
	@Test
	public void testGetContextStack_four() {
		NDC.clear();
		NDC.push("one");
		NDC.push("two");
		NDC.push("three");
		NDC.push("four");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(4, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
		assertEquals("four", contextStack[3].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack contains five messages.
	*/
	@Test
	public void testGetContextStack_five() {
		NDC.clear();
		NDC.push("one");
		NDC.push("two");
		NDC.push("three");
		NDC.push("four");
		NDC.push("five");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(5, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
		assertEquals("four", contextStack[3].getMessage());
		assertEquals("five", contextStack[4].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack contains six messages.
	*/
	@Test
	public void testGetContextStack_six() {
		NDC.clear();
		NDC.push("one");
		NDC.push("two");
		NDC.push("three");
		NDC.push("four");
		NDC.push("five");
		NDC.push("six");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(6, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
		assertEquals("four", contextStack[3].getMessage());
		assertEquals("five", contextStack[4].getMessage());
		assertEquals("six", contextStack[5].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack contains seven messages.
	*/
	@Test
	public void testGetContextStack_seven() {
		NDC.clear();
		NDC.push("one");
		NDC.push("two");
		NDC.push("three");
		NDC.push("four");
		NDC.push("five");
		NDC.push("six");
		NDC.push("seven");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(7, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
		assertEquals("four", contextStack[3].getMessage());
		assertEquals("five", contextStack[4].getMessage());
		assertEquals("six", contextStack[5].getMessage());
		assertEquals("seven", contextStack[6].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack contains eight messages.
	*/
	@Test
	public void testGetContextStack_eight() {
		NDC.clear();
		NDC.push("one");
		NDC.push("two");
		NDC.push("three");
		NDC.push("four");
		NDC.push("five");
		NDC.push("six");
		NDC.push("seven");
		NDC.push("eight");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(8, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
		assertEquals("four", contextStack[3].getMessage());
		assertEquals("five", contextStack[4].getMessage());
		assertEquals("six", contextStack[5].getMessage());
		assertEquals("seven", contextStack[6].getMessage());
		assertEquals("eight", contextStack[7].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack contains nine messages.
	*/
	@Test
	public void testGetContextStack_nine() {
		NDC.clear();
		NDC.push("one");
		NDC.push("two");
		NDC.push("three");
		NDC.push("four");
		NDC.push("five");
		NDC.push("six");
		NDC.push("seven");
		NDC.push("eight");
		NDC.push("nine");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(9, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
		assertEquals("four", contextStack[3].getMessage());
		assertEquals("five", contextStack[4].getMessage());
		assertEquals("six", contextStack[5].getMessage());
		assertEquals("seven", contextStack[6].getMessage());
		assertEquals("eight", contextStack[7].getMessage());
		assertEquals("nine", contextStack[8].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the case when the NDC stack contains ten messages.
	*/
	@Test
	public void testGetContextStack_ten() {
		NDC.clear();
		NDC.push("one");
		NDC.push("two");
		NDC.push("three");
		NDC.push("four");
		NDC.push("five");
		NDC.push("six");
		NDC.push("seven");
		NDC.push("eight");
		NDC.push("nine");
		NDC.push("ten");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(10, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
		assertEquals("four", contextStack[3].getMessage());
		assertEquals("five", contextStack[4].getMessage());
		assertEquals("six", contextStack[5].getMessage());
		assertEquals("seven", contextStack[6].getMessage());
		assertEquals("eight", contextStack[7].getMessage());
		assertEquals("nine", contextStack[8].getMessage());
		assertEquals("ten", contextStack[9].getMessage());
	}
}

// NDCAdapter.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;

public class NDCAdapter {

    public static Message[] getContextStack() {
        return new Message[0];
    }
}

// NDCAdapterTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDCAdapter}.
* It contains ten unit test cases for the {@link NDCAdapter#getContextStack()} method.
*/
class NDCAdapterTest {
		
	/**
	* Test case for {@link NDCAdapter#getContextStack()} method.
	* It tests the case when the NDC stack is empty.
	*/
	@Test
	public void testGetContextStack_empty() {
		NDCAdapter.clear();
		Message[] contextStack = NDCAdapter.getContextStack();
		assertNotNull(contextStack);
		assertEquals(0, contextStack.length);
	}
	
	/**
	* Test case for {@link NDCAdapter#getContextStack()} method.
	* It tests the case when the NDC stack contains one message.
	*/
	@Test
	public void testGetContextStack_one() {
		NDCAdapter.clear();
		NDCAdapter.push("one");
		Message[] contextStack = NDCAdapter.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
	}
	
	/**
	* Test case for {@link NDCAdapter#getContextStack()} method.
	* It tests the case when the NDC stack contains two messages.
	*/
	@Test
	public void testGetContextStack_two() {
		NDCAdapter.clear();
		NDCAdapter.push("one");
		NDCAdapter.push("two");
		Message[] contextStack = NDCAdapter.getContextStack();
		assertNotNull(contextStack);
		assertEquals(2, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
	}
	
	/**
	* Test case for {@link NDCAdapter#getContextStack()} method.
	* It tests the case when the NDC stack contains three messages.
	*/
	@Test
	public void testGetContextStack_three() {
		NDCAdapter.clear();
		NDCAdapter.push("one");
		NDCAdapter.push("two");
		NDCAdapter.push("three");
		Message[] contextStack = NDCAdapter.getContextStack();
		assertNotNull(contextStack);
		assertEquals(3, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
	}
	
	/**
	* Test case for {@link NDCAdapter#getContextStack()} method.
	* It tests the case when the NDC stack contains four messages.
	*/
	@Test
	public void testGetContextStack_four() {
		NDCAdapter.clear();
		NDCAdapter.push("one");
		NDCAdapter.push("two");
		NDCAdapter.push("three");
		NDCAdapter.push("four");
		Message[] contextStack = NDCAdapter.getContextStack();
		assertNotNull(contextStack);
		assertEquals(4, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
		assertEquals("four", contextStack[3].getMessage());
	}
	
	/**
	* Test case for {@link NDCAdapter#getContextStack()} method.
	* It tests the case when the NDC stack contains five messages.
	*/
	@Test
	public void testGetContextStack_five() {
		NDCAdapter.clear();
		NDCAdapter.push("one");
		NDCAdapter.push("two");
		NDCAdapter.push("three");
		NDCAdapter.push("four");
		NDCAdapter.push("five");
		Message[] contextStack = NDCAdapter.getContextStack();
		assertNotNull(contextStack);
		assertEquals(5, contextStack.length);
		assertEquals("one", contextStack[0].getMessage());
		assertEquals("two", contextStack[1].getMessage());
		assertEquals("three", contextStack[2].getMessage());
		assertEquals("four", contextStack[3].getMessage());
		assertEquals("five", contextStack[4].getMessage());
	}
	
	/**
	* Test case for {@link NDCAdapter#getContextStack()