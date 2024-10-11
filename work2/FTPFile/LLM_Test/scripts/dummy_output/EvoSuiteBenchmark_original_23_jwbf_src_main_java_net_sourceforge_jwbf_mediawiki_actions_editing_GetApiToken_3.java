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
         * Test the number of actions supported: 1.
		 * This test verifies that the {@link #hasMoreMessagesWithApi()} method returns {@code true} for the latest API version.
                  <ul>
		                     <li>It verifies the result without throwing any exception by testing for the method {@link #hasMoreMessagesWithApi()} against all cases</li>
              	                  <li>It verifies the result after deleting wiki content after user is logged in</li>
              	                  <li>It verifies the result after removing a user from wiki after delete action on the wiki</li>
              	                  <li>It verifies the result after deleting wiki content again after user is logout</li>
		                  </ul>
         * @throws IOException 
		 * @throws JDOMException 
		 * @throws ProcessException 
		 */
        @Test
        public void testHasMoreMessages() throws JDOMException, IOException, ProcessException {
                // 1. Create a mock request with a callable (to return the wiki content)
                Version version = Version.parseApiVersion(getMWApiVersion());
                Document mockedDoc = createMockDocDoc("test", version);
                GetApiToken request = new Get(mockedDoc);
                // 2. Prepare mock callable
                Object[] args = {mockedDoc};
                // 3. Execute the request
                ProcessException ex = null;
                try {
                        request.execute(args);
                } catch (VersionException ex2) {
                        log.error("The version of mediawiki is " + version);
                        log.error("{}", ex2);
                        throw new RuntimeException("An exception was expected");
                } catch (IOException ex2) {
                        log.error("An unexpected IOException was expected");
                        throw new RuntimeException("An unexpected IOException was expected");
                }
                // 4. Check the response after test
                assertEquals("There are no more content.", hasMoreMessagesWithApi(), version.getNumberOfContent());
        }        
        
        /**
		 * Make callable returning the wiki content for an api
		 */
        private Document createMockDocDoc(String name, Version version) throws JDOMException, IOException, ProcessException {
                Document doc1 = prepareDocWithoutContent(name, version);
                SAXBuilder builder = new SAXBuilder();
                InputSource inputSource = createMockInputSource(doc1);                                              
                builder.setFeature(org.apache.jk.ext.wf.api.core.api.feature.MWFEATURE_API_CONTENT, Boolean.TRUE);
                
                Document mockDoc = builder.build(new InputSource(inputSource));
                return mockDoc;
        }            
        
        private Document prepareDocWithoutContent(String name, Version version) throws JDOMException, IOException, ProcessException {
                Document doc1 = prepareDocumentWithContent(name, version);
                String xml = MWAction.xml2mwDoc(doc1.getRootElement());
                String xml2 = doc1.toString();
                assertEquals(documentToString(xml), documentToString(xml2));
                
                return doc1;
        }            
        /**
         * Create mock input source for creating mw content
                 * @return input source
         */
        private InputSource createMockInputSource(Document doc) throws IOException {
                InputSource inputSource = new InputSource(getClass().getResource("/test/test_api.mwwiki"));
                inputSource.setCharacterStream(new StringReader("</html>".getBytes()));
                return inputSource;
        }
        /**
         * Get a mocked request with a document containing two content items
		 */
        private Document getMWApiVersion() throws IOException, ProcessException {
                SAXBuilder builder = new SAXBuilder();
}
}