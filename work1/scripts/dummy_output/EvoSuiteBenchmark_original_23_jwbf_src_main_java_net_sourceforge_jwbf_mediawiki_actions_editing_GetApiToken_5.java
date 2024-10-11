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
		public void noMoreMessagesReturned() throws IOException, VersionException, JDOMException,
		InterruptedException {
			log.info("Testing {}", this.getClass().getCanonicalName());
			assertFalse(this.hasMoreMessages());
		}


			/**
		 * Tests if a call to {@link GetApiToken} works fine when no
		 * content exists yet.
		 */
			@Test
		public void noMoreMessagesReturnedWithNoContent() throws IOException, VersionException,
			JDOMException, InterruptedException {
				/* Create an empty Wiki content with 0 nodes to be used in the test */
				Document doc = new SAXBuilder().setFeature("javacss", "disable-features #textContent, #hasText, #hasImageContent").
						build(new StringReader("")).toString();
				Element root = doc.getRootElement();
				Userinfo ui = Userinfo.createUserinfoFromNode(doc, root.getChildren("userinfo"), false);
				Element et = root.getChild("editlist");
				assertTrue(et == null);

				Version version = Version.createVersion(doc);
				GetApiToken.VERSION = version;
				log.info("Testing {}", this.getClass().getCanonicalName());
				assertFalse(this.hasMoreMessages());
			}
		
			@Test
		public void hasMoreMessages()
							throws IOException, VersionException, JDOMException, InterruptedException {
				boolean result = this.hasMoreMessages();
				assertTrue("Didn't have more messages", result);
			}

		/** 
		* {@inheritDoc}
		*/
		@Override
		public String toString() {
			return "GetApiToken Test";
		}
}