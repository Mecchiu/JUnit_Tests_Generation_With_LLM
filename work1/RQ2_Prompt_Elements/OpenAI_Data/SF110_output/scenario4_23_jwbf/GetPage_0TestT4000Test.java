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
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testHasMoreMessages_0() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				boolean actual = getPage.hasMoreMessages();
				
				// Assert
				assertTrue(actual);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testHasMoreMessages_1() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				boolean actual = getPage.hasMoreMessages();
				
				// Assert
				assertTrue(actual);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testHasMoreMessages_2() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				boolean actual = getPage.hasMoreMessages();
				
				// Assert
				assertTrue(actual);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testHasMoreMessages_3() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				boolean actual = getPage.hasMoreMessages();
				
				// Assert
				assertTrue(actual);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testHasMoreMessages_4() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				boolean actual = getPage.hasMoreMessages();
				
				// Assert
				assertTrue(actual);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testHasMoreMessages_5() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				boolean actual = getPage.hasMoreMessages();
				
				// Assert
				assertTrue(actual);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testHasMoreMessages_6() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				boolean actual = getPage.hasMoreMessages();
				
				// Assert
				assertTrue(actual);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testHasMoreMessages_7() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				boolean actual = getPage.hasMoreMessages();
				
				// Assert
				assertTrue(actual);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testHasMoreMessages_8() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				boolean actual = getPage.hasMoreMessages();
				
				// Assert
				assertTrue(actual);
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testHasMoreMessages_9() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				boolean actual = getPage.hasMoreMessages();
				
				// Assert
				assertTrue(actual);
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
		* Test case for {@link GetPage#getNextMessage()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testGetNextMessage_0() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				HttpAction actual = getPage.getNextMessage();
				
				// Assert
				assertNotNull(actual);
		}
		
		/**
		* Test case for {@link GetPage#getNextMessage()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testGetNextMessage_1() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				HttpAction actual = getPage.getNextMessage();
				
				// Assert
				assertNotNull(actual);
		}
		
		/**
		* Test case for {@link GetPage#getNextMessage()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testGetNextMessage_2() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				HttpAction actual = getPage.getNextMessage();
				
				// Assert
				assertNotNull(actual);
		}
		
		/**
		* Test case for {@link GetPage#getNextMessage()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testGetNextMessage_3() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				HttpAction actual = getPage.getNextMessage();
				
				// Assert
				assertNotNull(actual);
		}
		
		/**
		* Test case for {@link GetPage#getNextMessage()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testGetNextMessage_4() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				HttpAction actual = getPage.getNextMessage();
				
				// Assert
				assertNotNull(actual);
		}
		
		/**
		* Test case for {@link GetPage#getNextMessage()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testGetNextMessage_5() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				HttpAction actual = getPage.getNextMessage();
				
				// Assert
				assertNotNull(actual);
		}
		
		/**
		* Test case for {@link GetPage#getNextMessage()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testGetNextMessage_6() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				HttpAction actual = getPage.getNextMessage();
				
				// Assert
				assertNotNull(actual);
		}
		
		/**
		* Test case for {@link GetPage#getNextMessage()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testGetNextMessage_7() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				HttpAction actual = getPage.getNextMessage();
				
				// Assert
				assertNotNull(actual);
		}
		
		/**
		* Test case for {@link GetPage#getNextMessage()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testGetNextMessage_8() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				HttpAction actual = getPage.getNextMessage();
				
				// Assert
				assertNotNull(actual);
		}
		
		/**
		* Test case for {@link GetPage#getNextMessage()}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testGetNextMessage_9() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				
				// Act
				HttpAction actual = getPage.getNextMessage();
				
				// Assert
				assertNotNull(actual);
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
* It contains ten unit test cases for the {@link GetPage#processReturningText(String, HttpAction)} method.
*/
class GetPage_2Test {
		
		/**
		* Test case for {@link GetPage#processReturningText(String, HttpAction)}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testProcessReturningText_0() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				String s = "";
				HttpAction hm = null;
				
				// Act
				String actual = getPage.processReturningText(s, hm);
				
				// Assert
				assertNotNull(actual);
		}
		
		/**
		* Test case for {@link GetPage#processReturningText(String, HttpAction)}.
		*
		* @throws ProcessException on any problems with inner browser
		*/
		@Test
		void testProcessReturningText_1() throws ProcessException {
				
				// Arrange
				GetPage getPage = new GetPage("/index.php?title=Special:Recentchanges&feed=rss");
				String s = "";
				Http