// GetPage_0Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPage_0Test {

		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
		}
		
		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages_0() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
		}
		
		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages_1() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
		}
		
		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages_2() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
		}
		
		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages_3() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
		}
		
		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages_4() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
		}
		
		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages_5() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
		}
		
		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages_6() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
		}
		
		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages_7() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
		}
		
		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages_8() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
		}
		
		/**
		 * Test method for {@link GetPage#hasMoreMessages()}.
		 */
		@Test
		void testHasMoreMessages_9() {
				GetPage testable = new GetPage("http://www.google.com");
				assertTrue(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
				assertFalse(testable.hasMoreMessages());
		}
		
}

// GetPage_1Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#getNextMessage()} method.
*/
class GetPage_1Test {
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
		}
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage_0() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
		}
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage_1() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
		}
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage_2() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
		}
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage_3() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
		}
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage_4() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
		}
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage_5() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
		}
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage_6() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
		}
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage_7() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
		}
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage_8() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
		}
		
		/**
		 * Test method for {@link GetPage#getNextMessage()}.
		 */
		@Test
		void testGetNextMessage_9() {
				GetPage testable = new GetPage("http://www.google.com");
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
				assertNotNull(testable.getNextMessage());
		}
		
}

// GetPage_2Test.java
package net.sourceforge.jwbf.core.actions;

import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#processReturningText(String