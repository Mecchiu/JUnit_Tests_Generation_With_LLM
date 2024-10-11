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
		
  @Test
    void noAction() throws IOException, VersionException {
      // given
      DefaultGetApiToken getApiToken = new DefaultGetApiToken();
      // then
      assertTrue(getApiToken.hasMoreMessages());
    }

	@Test
    void noTokenException() throws IOException, VersionException {
			DefaultGetApiToken getApiToken = new DefaultGetApiToken();
			// given
			assertNotNull(
					getApiToken._token);
			assertNull(
					getApiToken._token.toString());
			// then
    }

	@Test
    void apiNotFound() throws IOException, VersionException {
      // given
      DefaultGetApiToken getApiToken = new DefaultGetApiToken();
      // when we see an action with the api token there
      assertTrue(getApiToken.hasMoreMessages());
      // then
      assertFalse(getApiToken.hasMoreMessages());
    }

	@Test
    void emptyApiToken() throws IOException, VersionException {
			DefaultGetApiToken getApiToken = new DefaultGetApiToken();
			// when we see an action with a token empty
			assertTrue(getApiToken.hasMoreMessages());
			// then
			assertTrue(getApiToken.hasMoreMessages());
			try {
				getApiToken.getApiToken();
				// then
				fail("empty api token");
			} catch (ProcessException ex) {
        // we expect an error
        }
    }

		@Test
    void emptyUserinfo() throws IOException, VersionException {
      // given
			DefaultGetApiToken getApiToken = new DefaultGetApiToken();
    		// when we see an action with a userinfo but no token
			assertTrue(getApiToken.hasMoreMessages());
			// then
			assertTrue(getApiToken.hasMoreMessages());
      try {
        getApiToken.getApiToken();
      } catch (ProcessException ex) {
        // expect an error of type ProcessException 
      }
		}

		@Test
    void emptyUserinfoWithPassword() throws IOException, VersionException {
      Document doc;
      // when we see an action with a userinfo and a password
      assertTrue(getApiToken.hasMoreMessages());
      // then
      assertTrue(getApiToken.hasMoreMessages());
      String action = getApiToken.getApiToken();
      try {
        // when we get the action the action has a password and it has not a username,
        // check the result is that password is empty in the action
        // instead of returning empty string
        doc = Document.Factory.parse(getApiToken.getResult());
        Element actionElement = (Element) doc.getRootElement()
                 .getElementsByTagName("api").item(0);
        assertFalse(action.contains("username"));
        assertEquals(actionElement.getAttribute("password"),"");
      } catch (JDOMException | IOException | VersionException ex) {
        assertTrue(false);
      }
    }

      public static final class DefaultGetApiToken extends GetApiToken {

        public DefaultGetApiToken(
            String apiTokenString,
            Version version) throws VersionException,
                IOException, ProcessException {
            super(apiTokenString,version);
        }

        @Override
        public Action getAction() {
            return new ApiTokenGetAction(
                new String[]{"test"});
        }

      }
	@Override
	public final DefaultGetApiToken getDefaultApiToken() throws VersionException {
		// given
		return new DefaultGetApiToken();
	}

}