// GetApiToken_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.StringReader;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetApiToken}.
* It contains ten unit test cases for the {@link GetApiToken#hasMoreMessages()} method.
*/
class GetApiToken_1Test {

		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testHasMoreMessages_1() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.DELETE, "Test", MW1_12, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testHasMoreMessages_2() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.DELETE, "Test", MW1_13, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testHasMoreMessages_3() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.DELETE, "Test", MW1_14, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testHasMoreMessages_4() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.DELETE, "Test", MW1_15, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testHasMoreMessages_5() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.DELETE, "Test", MW1_16, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testHasMoreMessages_6() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.EDIT, "Test", MW1_12, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testHasMoreMessages_7() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.EDIT, "Test", MW1_13, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testHasMoreMessages_8() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.EDIT, "Test", MW1_14, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testHasMoreMessages_9() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.EDIT, "Test", MW1_15, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testHasMoreMessages_10() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.EDIT, "Test", MW1_16, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.hasMoreMessages());
		}
}

// GetApiToken_2Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.StringReader;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetApiToken}.
* It contains ten unit test cases for the {@link GetApiToken#getNextMessage()} method.
*/
class GetApiToken_2Test {
		
		/**
		* Test case for {@link GetApiToken#getNextMessage()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testGetNextMessage_1() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.DELETE, "Test", MW1_12, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.getNextMessage() instanceof Get);
		}
		
		/**
		* Test case for {@link GetApiToken#getNextMessage()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testGetNextMessage_2() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.DELETE, "Test", MW1_13, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.getNextMessage() instanceof Get);
		}
		
		/**
		* Test case for {@link GetApiToken#getNextMessage()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testGetNextMessage_3() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.DELETE, "Test", MW1_14, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.getNextMessage() instanceof Get);
		}
		
		/**
		* Test case for {@link GetApiToken#getNextMessage()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testGetNextMessage_4() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.DELETE, "Test", MW1_15, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.getNextMessage() instanceof Get);
		}
		
		/**
		* Test case for {@link GetApiToken#getNextMessage()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testGetNextMessage_5() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.DELETE, "Test", MW1_16, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.getNextMessage() instanceof Get);
		}
		
		/**
		* Test case for {@link GetApiToken#getNextMessage()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testGetNextMessage_6() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.EDIT, "Test", MW1_12, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.getNextMessage() instanceof Get);
		}
		
		/**
		* Test case for {@link GetApiToken#getNextMessage()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testGetNextMessage_7() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.EDIT, "Test", MW1_13, new Userinfo("Test", "Test"));
				assertTrue(classUnderTest.getNextMessage() instanceof Get);
		}
		
		/**
		* Test case for {@link GetApiToken#getNextMessage()} method.
		* @throws VersionException if the MediaWiki version is not supported
		* @throws IOException if an IOException occurs
		* @throws JDOMException if a JDOMException occurs
		* @throws ProcessException if a ProcessException occurs
		*/
		@Test
		void testGetNextMessage_8() throws VersionException, IOException, JDOMException, ProcessException {
				GetApiToken classUnderTest = new GetApiToken(GetApiToken.Intoken.EDIT, "