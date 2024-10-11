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
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;

/**
 * Action class using the MediaWiki-<a
 * href="http://www.mediawiki.org/wiki/API:Changing_wiki_content"
 * >Editing-API</a>. <br />
 * Its job is to get the content of a given article.
 *
 * @author Thomas Stock
 */
@Slf4j
@SupportedBy({ MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
public final class GetPage extends MWAction {

    private final String title;

    private final Get msg;

    private Article a;

    /**
     * Constructs a new <code>GetPage</code> action.
     *
     * @param title
     *          title of the article to get
     * @param si
     *          site info object
     * @throws VersionException
     *           if this action is not supported of the MediaWiki version
     *           connected to
     */
    public GetPage(String title, Version v) throws VersionException {
    }

    /**
     * Generates the next MediaWiki API request (GetMethod) and adds it to
     * msgs.
     *
     * @param title
     *          title of the article to get
     */
    private void generateRequest(String title);

    /**
     * Returns the requested article after parsing the result from MediaWiki.
     *
     * @return the requested article
     */
    public Article getArticle();

    /**
     * {@inheritDoc}
     */
    @Override
    public String processReturningText(String s, HttpAction hm) throws ProcessException;

    /**
     * {@inheritDoc}
     */
    public HttpAction getNextMessage();

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasMoreMessages();

    /**
     * Processing the XML {@link Document} returned from the MediaWiki API.
     *
     * @param doc
     *          XML <code>Document</code>
     * @throws JDOMException
     *           thrown if the document could not be parsed
     */
    private void process(Document doc);
}

// GetPageTest.java
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
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetPage}.
* It contains ten unit test cases for the {@link GetPage#hasMoreMessages()} method.
*/
class GetPageTest {
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()} method.
		* It tests if the method returns true if the article is null.
		*/
		@Test
		void testHasMoreMessages_nullArticle() {
				GetPage getPage = new GetPage("Test", MW1_12);
				getPage.a = null;
				assertTrue(getPage.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()} method.
		* It tests if the method returns true if the article is not null.
		*/
		@Test
		void testHasMoreMessages_notNullArticle() {
				GetPage getPage = new GetPage("Test", MW1_12);
				getPage.a = new SimpleArticle();
				assertFalse(getPage.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()} method.
		* It tests if the method returns true if the article is null and the first flag is true.
		*/
		@Test
		void testHasMoreMessages_nullArticle_firstTrue() {
				GetPage getPage = new GetPage("Test", MW1_12);
				getPage.a = null;
				getPage.first = true;
				assertTrue(getPage.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()} method.
		* It tests if the method returns true if the article is not null and the first flag is true.
		*/
		@Test
		void testHasMoreMessages_notNullArticle_firstTrue() {
				GetPage getPage = new GetPage("Test", MW1_12);
				getPage.a = new SimpleArticle();
				getPage.first = true;
				assertTrue(getPage.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()} method.
		* It tests if the method returns true if the article is null and the first flag is false.
		*/
		@Test
		void testHasMoreMessages_nullArticle_firstFalse() {
				GetPage getPage = new GetPage("Test", MW1_12);
				getPage.a = null;
				getPage.first = false;
				assertTrue(getPage.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()} method.
		* It tests if the method returns true if the article is not null and the first flag is false.
		*/
		@Test
		void testHasMoreMessages_notNullArticle_firstFalse() {
				GetPage getPage = new GetPage("Test", MW1_12);
				getPage.a = new SimpleArticle();
				getPage.first = false;
				assertFalse(getPage.hasMoreMessages());
		}
		
		/**
		* Test case for {@link GetPage#hasMoreMessages()} method.
		* It tests if the method returns true if the article is null and the first flag is true.
		*/
		@Test
		void testHasMoreMessages_nullArticle_firstTrue() {
