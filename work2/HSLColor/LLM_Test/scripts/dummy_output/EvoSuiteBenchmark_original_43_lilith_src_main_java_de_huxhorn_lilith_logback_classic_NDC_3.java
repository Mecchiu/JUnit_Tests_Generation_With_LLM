// NDCTest.java
package de.huxhorn.lilith.logback.classic;

import de.huxhorn.lilith.data.logging.Message;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NDC}.
* It contains one unit test case for the {@link NDC#getContextStack()} method.
*/
class NDCTest {
		/**
		 * Class test case for {@link NDC#getContextStack()}.
		 */
		static class TestClass {
			/**
			 * Method to get the array of messages of the stack
			 * @return an array of messages of the stack
			 */
			public static Message[] getContextStack() {
				return new Message[]{
						new Message( "Hello world!", "My message", "a", "f", null, null, null ),

					    	new Message( "Hello hello! I didn't say anything!", "Other message", "b", "f", null, null, null )
				};
			}
		}

		/*
		 * Test method for {@link NDC#getContextStack()}.
		 */
		@Test
		public void testGetContextStack() {
			System.out.println("Class test");

			// No-op
			System.out.println("getContextStack");
			assertEquals(new TestClass[]{}, NDC.getContextStack());

			// Test method for {@link NDC#getContextStack()}.
			assertArrayEquals(new Message[]{
		        new Message( "Hello world!", "My message",  "a", "f", null, null, null ),
				new Message( "Hello hello! I didn't say anything!", "Other message", "b", "f", null, null, null )},
				NDC.getContextStack());

			// Test method for {@link NDC#getContextStack()}.
			assertArrayEquals(new Message[]{
		        new Message( "Hello world!", "My message",  "a", "f", null, null, null ),
				new Message( "Hello hello! I didn't say anything!", "Other message", "b", "f", null, null, null )},
				new TestClass[]{
		        new TestClass()
		       ,   new TestClass()
		       ,    new TestClass()
		    });
		}
}