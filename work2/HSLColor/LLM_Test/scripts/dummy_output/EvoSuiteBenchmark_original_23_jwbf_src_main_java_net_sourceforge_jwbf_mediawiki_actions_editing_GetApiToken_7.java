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
		 * Returns true if the class has a test cases to execute.
		 *
		 * @return True if it has a test case.
		 */
		private boolean testClassHasTests() {
			return (hasTests() > 0);
		}

		/**
		 * Executes the test. It calls the super method with the test object.
		 *
		 * @param test the test object.
		 */
		@Test
		void executeTest(GetApiToken test) {
			// testClassHasTests
			if (testClassHasTests()) {
				assertEquals("getApiToken-test", test.getClass().getSimpleName());
			}
			// other checks for test class
			else {
				fail("ApiTokenTest has no test case");
			}
		}

		/**
		 * Checks if the document of the token contained is the document we expected.
		 *
		 * @param token the token to check.
		 * @return True if the document of the token contained is the document we expected.
		 */
		private boolean checkTokenDocument(Element token) {
			try {
				// the token is a XML fragment
				if (token.getRootElement().getName().equals(
				    "XHRExclusion")) {
					throw new RuntimeException("Token is an XHRExclusion document!");
				}
				// the token is of tag'mw:Userinfo'
				else if (token.getRootElement().getQName().equals(
				    "mw:Userinfo")) {
				    // the content of the userinfo tag must be parsed correctly
					// to find the wiki page: Userinfo content
					Document cdoc = getParsedDocument(new InputSource(new StringReader("<mw:Userinfo '"
					    + Userinfo.USERINFO_SUMMARY + "'>")));
					if (!cdoc.getRootElement().equals(token.getRootElement())) {
						return false;
					}
				}
				else {
					return false;
				}

			} catch (JDOMException | IOException e) {
				return false;
			}
			return true;
		}
	}