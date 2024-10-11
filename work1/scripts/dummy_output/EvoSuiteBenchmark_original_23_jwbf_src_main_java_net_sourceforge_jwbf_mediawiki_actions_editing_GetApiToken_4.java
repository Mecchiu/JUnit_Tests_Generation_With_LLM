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
* It contains one unit test case for the {@link GetApiToken#hasMoreMessages()} method.
*/
class GetApiTokenTest {
		/**
		 * {@inheritDoc}
		 */
    @Test
	public void testHasMoreMessages() throws IOException {
		// Create a builder to use for converting the XML string that is returned from the wiki
		// wiki.xml and use a SAXBuilder object
		SAXBuilder parser = new SAXBuilder();

		// Create the xml document.
		Document jsonDoc = parser.build(new StringReader(""));

		// Create the mediawiki action
		GetApiToken mediaWikiAction = new GetApiToken();
		@SuppressWarnings("fallthrough")
		VersionActionImpl versionAction = new VersionActionImpl();
		mediaWikiAction.init(new Version(versionAction));

		// Create the mediawiki object
		MediaWiki mediaWiki = new MediaWiki();
		mediaWiki.init(new Version(mediaWikiAction));

		// Create the mediawiki-<version>-1313 mediawiki
		assertTrue(mediaWikiAction.hasMoreMessages());

		Document mediaWikiDoc = versionAction.retrieve(jsonDoc, mediaWiki);

		// Test the return of the mediawiki-<version>-1313 object
		assertEquals(mediaWikiDoc.getRootElement().getElement("userinfo").getChild("nickname").getStringValue(), mediaWiki.getUserinfo().getNickname());
	}

	/**
	 * Unit test that does nothing as the action's version is equal to the version
	 * parameter, which is a MediaWiki-1313 instance.
	 */
	@Test
    public void testNoUpdate() throws VersionException, IOException {
    	// Create a builder to use for converting the XML string that is returned from the wiki
    	// wiki.xml and use a SAXBuilder object
    	SAXBuilder parser = new SAXBuilder();

    	// Create the xml document.
    	Document jsonDoc = parser.build(new StringReader(""));

    	// Create the mediawiki action
    	GetApiToken mediaWikiAction = new GetApiToken();
    	@SuppressWarnings("fallthrough")
		VersionActionImpl versionAction = new VersionActionImpl();
		mediaWikiAction.init(new Version(versionAction));

		// Create the mediawiki object
		MediaWiki mediaWiki = new MediaWiki();
		mediaWiki.init(new Version(mediaWikiAction));

        // Create the mediawiki-<version>-1313 mediawiki
        assertTrue(mediaWikiAction.hasMoreMessages());

        Document mediaWikiDoc = versionAction.retrieve(jsonDoc, mediaWiki);

        // No updates or deletes, so this version should not change any
        // values in the mediaWiki-1313 object
        assertFalse(mediaWikiAction.getVersion().compareTo(versionAction.getVersion()));

        // Test the return of the mediawiki-<version>-1313 object
        Document newMediaWikiDoc = versionAction.retrieve(mediaWikiDoc, mediaWiki);

        Document resultDocument = new MediaWikiDoc2Xml(jsonDoc, new MediaWikiDoc2Xml(mediaWikiDoc, mediaWikiDoc), new MediaWikiDoc2Xml(jsonDoc, new MediaWikiDoc2Xml(mediaWikiDoc, mediaWikiDoc)));

        assertEquals(mediaWikiDoc.getRootElement().getElement("userinfo").getChild("nickname").getStringValue(), newMediaWikiDoc.getRootElement().getElement("userinfo").getChild("nickname").getStringValue());
        assertEquals(mediaWikiDoc.getRootElement().getElementsByTagName("user_action").size(), 6);

        Element userAction = mediaWikiDoc.getRootElement().getElementsByTagName("user_action").get(3);

        // Test the return of the useraction-1313 mediawiki
        newMediaWikiDoc = versionAction.retrieve(new Document(
                "useraction-1313"),
                mediaWiki);

        assertEquals('f', userAction.getChildText("action-delete").getStringValue());
}
}