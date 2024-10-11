// GetApiTokenTest.java
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
class GetApiTokenTest {

		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* It tests if the method returns true if the token is empty.
		*/
		@Test
		void testHasMoreMessages_emptyToken() {
				GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", MW1_12, new Userinfo());
				getApiToken.token = "";
				assertTrue(getApiToken.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* It tests if the method returns true if the token is null.
		*/
		@Test
		void testHasMoreMessages_nullToken() {
				GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", MW1_12, new Userinfo());
				getApiToken.token = null;
				assertTrue(getApiToken.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* It tests if the method returns true if the token is not empty.
		*/
		@Test
		void testHasMoreMessages_notEmptyToken() {
				GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", MW1_12, new Userinfo());
				getApiToken.token = "Test";
				assertFalse(getApiToken.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* It tests if the method returns true if the token is not null.
		*/
		@Test
		void testHasMoreMessages_notNullToken() {
				GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", MW1_12, new Userinfo());
				getApiToken.token = "Test";
				assertFalse(getApiToken.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* It tests if the method returns true if the token is not empty and the first flag is true.
		*/
		@Test
		void testHasMoreMessages_notEmptyToken_firstTrue() {
				GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", MW1_12, new Userinfo());
				getApiToken.token = "Test";
				getApiToken.first = true;
				assertTrue(getApiToken.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* It tests if the method returns true if the token is not null and the first flag is true.
		*/
		@Test
		void testHasMoreMessages_notNullToken_firstTrue() {
				GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", MW1_12, new Userinfo());
				getApiToken.token = "Test";
				getApiToken.first = true;
				assertTrue(getApiToken.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* It tests if the method returns true if the token is not empty and the first flag is false.
		*/
		@Test
		void testHasMoreMessages_notEmptyToken_firstFalse() {
				GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", MW1_12, new Userinfo());
				getApiToken.token = "Test";
				getApiToken.first = false;
				assertFalse(getApiToken.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* It tests if the method returns true if the token is not null and the first flag is false.
		*/
		@Test
		void testHasMoreMessages_notNullToken_firstFalse() {
				GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", MW1_12, new Userinfo());
				getApiToken.token = "Test";
				getApiToken.first = false;
				assertFalse(getApiToken.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* It tests if the method returns true if the token is empty and the first flag is false.
		*/
		@Test
		void testHasMoreMessages_emptyToken_firstFalse() {
				GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", MW1_12, new Userinfo());
				getApiToken.token = "";
				getApiToken.first = false;
				assertTrue(getApiToken.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetApiToken#hasMoreMessages()} method.
		* It tests if the method returns true if the token is null and the first flag is false.
		*/
		@Test
		void testHasMoreMessages_nullToken_firstFalse() {
				GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", MW1_12, new Userinfo());
				getApiToken.token = null;
				getApiToken.first = false;
				assertTrue(getApiToken.hasMoreMessages());
		}
}

// GetPage.java
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
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException