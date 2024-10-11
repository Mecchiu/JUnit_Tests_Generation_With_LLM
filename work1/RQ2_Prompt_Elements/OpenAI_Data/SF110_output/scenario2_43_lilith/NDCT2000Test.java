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
	* It tests the method with an empty NDC stack.
	*/
	@Test
	void testGetContextStackEmpty() {
		NDC.clear();
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(0, contextStack.length);
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the method with a NDC stack containing one message.
	*/
	@Test
	void testGetContextStackOne() {
		NDC.clear();
		NDC.push("Test");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(1, contextStack.length);
		assertEquals("Test", contextStack[0].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the method with a NDC stack containing two messages.
	*/
	@Test
	void testGetContextStackTwo() {
		NDC.clear();
		NDC.push("Test1");
		NDC.push("Test2");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(2, contextStack.length);
		assertEquals("Test1", contextStack[0].getMessage());
		assertEquals("Test2", contextStack[1].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the method with a NDC stack containing three messages.
	*/
	@Test
	void testGetContextStackThree() {
		NDC.clear();
		NDC.push("Test1");
		NDC.push("Test2");
		NDC.push("Test3");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(3, contextStack.length);
		assertEquals("Test1", contextStack[0].getMessage());
		assertEquals("Test2", contextStack[1].getMessage());
		assertEquals("Test3", contextStack[2].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the method with a NDC stack containing four messages.
	*/
	@Test
	void testGetContextStackFour() {
		NDC.clear();
		NDC.push("Test1");
		NDC.push("Test2");
		NDC.push("Test3");
		NDC.push("Test4");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(4, contextStack.length);
		assertEquals("Test1", contextStack[0].getMessage());
		assertEquals("Test2", contextStack[1].getMessage());
		assertEquals("Test3", contextStack[2].getMessage());
		assertEquals("Test4", contextStack[3].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the method with a NDC stack containing five messages.
	*/
	@Test
	void testGetContextStackFive() {
		NDC.clear();
		NDC.push("Test1");
		NDC.push("Test2");
		NDC.push("Test3");
		NDC.push("Test4");
		NDC.push("Test5");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(5, contextStack.length);
		assertEquals("Test1", contextStack[0].getMessage());
		assertEquals("Test2", contextStack[1].getMessage());
		assertEquals("Test3", contextStack[2].getMessage());
		assertEquals("Test4", contextStack[3].getMessage());
		assertEquals("Test5", contextStack[4].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the method with a NDC stack containing six messages.
	*/
	@Test
	void testGetContextStackSix() {
		NDC.clear();
		NDC.push("Test1");
		NDC.push("Test2");
		NDC.push("Test3");
		NDC.push("Test4");
		NDC.push("Test5");
		NDC.push("Test6");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(6, contextStack.length);
		assertEquals("Test1", contextStack[0].getMessage());
		assertEquals("Test2", contextStack[1].getMessage());
		assertEquals("Test3", contextStack[2].getMessage());
		assertEquals("Test4", contextStack[3].getMessage());
		assertEquals("Test5", contextStack[4].getMessage());
		assertEquals("Test6", contextStack[5].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the method with a NDC stack containing seven messages.
	*/
	@Test
	void testGetContextStackSeven() {
		NDC.clear();
		NDC.push("Test1");
		NDC.push("Test2");
		NDC.push("Test3");
		NDC.push("Test4");
		NDC.push("Test5");
		NDC.push("Test6");
		NDC.push("Test7");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(7, contextStack.length);
		assertEquals("Test1", contextStack[0].getMessage());
		assertEquals("Test2", contextStack[1].getMessage());
		assertEquals("Test3", contextStack[2].getMessage());
		assertEquals("Test4", contextStack[3].getMessage());
		assertEquals("Test5", contextStack[4].getMessage());
		assertEquals("Test6", contextStack[5].getMessage());
		assertEquals("Test7", contextStack[6].getMessage());
	}
	
	/**
	* Test case for {@link NDC#getContextStack()} method.
	* It tests the method with a NDC stack containing eight messages.
	*/
	@Test
	void testGetContextStackEight() {
		NDC.clear();
		NDC.push("Test1");
		NDC.push("Test2");
		NDC.push("Test3");
		NDC.push("Test4");
		NDC.push("Test5");
		NDC.push("Test6");
		NDC.push("Test7");
		NDC.push("Test8");
		Message[] contextStack = NDC.getContextStack();
		assertNotNull(contextStack);
		assertEquals(8, contextStack.length);
		assertEquals("Test1", contextStack[0].getMessage());
		assertEquals("Test2", contextStack[1].getMessage());
		assertEquals("Test3", contextStack[2].getMessage());
		assertEquals("Test4", contextStack[3].getMessage());
		assertEquals("Test5", contextStack[4].getMessage());
		assertEquals("Test6", contextStack[5].getMessage());
		assertEquals("Test7", contextStack[6].getMessage());
		assertEquals("Test8", contextStack[7].getMessage());
	