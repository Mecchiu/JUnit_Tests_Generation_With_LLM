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
		* Test case for {@link GetPage#hasMoreMessages()}.
		* It tests if the method returns true if the text is empty.
		*/
		@Test
		void testHasMoreMessages_0() {
				// Arrange
				GetPage getPage = new GetPage("");
				// Act
				boolean result = getPage.hasMoreMessages();
				// Assert
				assertTrue(result);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		* It tests if the method returns true if the text is not empty.
		*/
		@Test
		void testHasMoreMessages_1() {
				// Arrange
				GetPage getPage = new GetPage("");
				getPage.processReturningText("", null);
				// Act
				boolean result = getPage.hasMoreMessages();
				// Assert
				assertTrue(result);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		* It tests if the method returns false if the text is not empty.
		*/
		@Test
		void testHasMoreMessages_2() {
				// Arrange
				GetPage getPage = new GetPage("");
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				// Act
				boolean result = getPage.hasMoreMessages();
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		* It tests if the method returns false if the text is not empty.
		*/
		@Test
		void testHasMoreMessages_3() {
				// Arrange
				GetPage getPage = new GetPage("");
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				// Act
				boolean result = getPage.hasMoreMessages();
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		* It tests if the method returns false if the text is not empty.
		*/
		@Test
		void testHasMoreMessages_4() {
				// Arrange
				GetPage getPage = new GetPage("");
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				// Act
				boolean result = getPage.hasMoreMessages();
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		* It tests if the method returns false if the text is not empty.
		*/
		@Test
		void testHasMoreMessages_5() {
				// Arrange
				GetPage getPage = new GetPage("");
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				// Act
				boolean result = getPage.hasMoreMessages();
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		* It tests if the method returns false if the text is not empty.
		*/
		@Test
		void testHasMoreMessages_6() {
				// Arrange
				GetPage getPage = new GetPage("");
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				// Act
				boolean result = getPage.hasMoreMessages();
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		* It tests if the method returns false if the text is not empty.
		*/
		@Test
		void testHasMoreMessages_7() {
				// Arrange
				GetPage getPage = new GetPage("");
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				// Act
				boolean result = getPage.hasMoreMessages();
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		* It tests if the method returns false if the text is not empty.
		*/
		@Test
		void testHasMoreMessages_8() {
				// Arrange
				GetPage getPage = new GetPage("");
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				// Act
				boolean result = getPage.hasMoreMessages();
				// Assert
				assertFalse(result);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		* It tests if the method returns false if the text is not empty.
		*/
		@Test
		void testHasMoreMessages_9() {
				// Arrange
				GetPage getPage = new GetPage("");
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText("", null);
				getPage.processReturningText