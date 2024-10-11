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
		 * Tests the creation of xml version 1.13.
		 */
		@Test
		void testVersion1() {
				//Gets
			GetApiToken getApiToken = new GetApiToken("http://www.mediawiki.org/wiki/API:Changing_wiki_content");
				log.info("Get: " + getApiToken.getVersion());

			//Invokes the get actions
			assertTrue(getApiToken.hasMoreMessages());
			assertFalse(getApiToken.hasMoreMessages());

			//Creates an xml version 1.13.
			Document document = prepareTestDocument1(Version.MW1_13);
			Document getDocument = getDocumentWithVersion1(document, Version.MW1_13);

			//Parses the json doc.
			document.getRootElement().removeContent(null);
			StringWriter sw = new StringWriter();
			Document doc;
			try {
				doc = new SAXBuilder().build(new InputSource(new StringReader(getDocument.asXML())));
				assertEquals(Version.MW1_14, doc.getRootElement().getName());

				//Fails because the version is not available.
			    assertThrows(VersionException.class, () -> doJsonAction(doc, DocAction.FALSE)
			    );
			} catch (JDOMException | IOException e) {
				log.error("A JUnit error occurred.", e);
			} catch (XMLException e) {
				String message = e.getMessage();
				switch (e.getCause())
				{
					case FileNotFoundException.class:
						message += "(test with file not found - mediawiki may have been modified)";
						break;
					case XMLStreamException.class:
						message += "(test with XMLStreamException - mediawiki may have not been saved to disc)";
						break;
					case IOException.class:
						message += "(test with IOException - mediawiki may have not been saved to disc)";
						break;
					case DocumentException.class:
						message += "(test with DocumentException - mediawiki may have not been saved to disc)";
						break;
					case ElementNotFoundException.class:
						message += "(test with ElementNotFoundException - mediawiki may have not been saved to disc)";
						break;
					//TODO Throw-away exceptions which I didn't like.
					/*case UndefinedEntityRefException.class:
							message += "(test with UndefinedEntityRefException - mediawiki may have not been saved to disc)";
							break;
					case EntityNotPrintableException.class:
							message += "(test with EntityNotPrintableException - mediawiki may have not been saved to disc)";
							break;*/
				}
			    assertTrue("Failed with " + message, false);
			}
		}

		/**
		 * Test method for {@link GetApiToken#getVersion()} with version 1.14.
		 *
		 * @throws XMLParserException
		 */
		@Test
		boolean testVersion1_14() throws XMLParserException {
				//Gets
			GetApiToken getApiToken = new GetApiToken("http://www.mediawiki.org/wiki/API:Changing_wiki_content");
				getApiToken.setVersion(Version.MW1_14);
			StringWriter sw = new StringWriter();
			Document getDocument = getDocumentWithVersion1_14(sw, Version.MW1_14);

			Document doAction = doJsonAction(getDocument, DocAction.TRUE);

			//Parses the json doc.
			Document doc = new SAXBuilder().build(new InputSource(new StringReader(doAction.asXML())));
			log.info(doc.getRootElement().getName());

			//Parses the xml doc.
			Document getDocument2 = prepareTestDocumentWithVersion1_14(Version.MW1_14);
}
}