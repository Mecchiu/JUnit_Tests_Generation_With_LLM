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
		
	@Slf4j
	private static class FailingAction extends GetApiToken {
			
		public FailingAction(InputSource input) throws IOException {
			super(input.getSystemId());
		}
		
		@Override
		public String get() throws IOException, GetException {
			throw new HttpAction.ClientExceptionException("failing", null, null, null, null);
		}
	}
	
	/**
	 * {@link FailingAction} in which the action returns a {@link NotFoundException} (instead of a
	 * {@link VersionException}).
	 */
	private static class FailingGetApiToken extends FailingAction {

		@Override
		protected String get() throws GetException, IOException, VersionException {
			throw new NotFoundException("failing");
		}
	}
	
	@Test
	public void failNoAPI() throws IOException, VersionException {
		// Given
		final InputSource input = new InputSource() {
			@Override
			public InputSource getReader() {
				try {
					return new InputSource(new StringReader("get:failing.wikipedia.com: " + this.getSystemId()));
				} catch (IOException e) {
					log.error("failed to get the requested API: {}", e.getMessage());
				}
				return this;
			}
		};
		
		// When
		final FailingGetApiToken action = new FailingGetApiToken(input);
		
		// Then
		final Version result = action.hasMoreMessages();
		assertFalse("Not returning null result in the call to hasMoreMessages.", result == null);
	}
	
	@Test
	public void failWrongVersion() throws IOException, VersionException {
		// Given
		final InputSource input = new InputSource() {
			@Override
			public InputSource getReader() {
				try {
					return new InputSource(new StringReader("get:failing.wikipedia.com: " + this.getSystemId()));
				} catch (IOException e) {
					log.error("failed to get the requested API: {}", e.getMessage());
				}
				return this;
			}
		};
		final Version original_result = getResult();
		final FailingGetApiToken action = new FailingGetApiToken(input);
		
		// When
        assertFalse("Not returning null result in the call to hasMoreMessages.", action.hasMoreMessages());
        assertFalse("Returning null version in the call to hasMoreMessages.", action.getVersion() == null);
        assertThrows(ProcessException.class, () -> action.hasMoreMessages());
        assertThrows(ProcessException.class, () -> action.getVersion());
        
		// When
		final FailingGetApiToken modified_action = new FailingGetApiToken(input);
		assertThrows(ProcessException.class, () -> modified_action.getVersion());
        assertEquals(original_result, modified_action.getVersion());
	}
	
	/**
	 * Implementation of {@link GetApiToken.Builder} for {@link FailingAction}.
	 */
	final static class FailingBuilder  extends GetApiToken.Builder {

		@Override
		public Element getConfiguration() {
			return null;
		}

		@Override
		public String getSystemId() {
			return null;
		}
		
		@Override
		public Version getVersion() {
			throw (VersionException.class)
					.newInstance("failing");
		}
	}
	
	/**
	 * Implementation of {@link FailingBuilder} for {@link FailingAction}.
	 */
	final static class FailingGetApiToken extends FailingBuilder  
			implements GetApiToken {
		
		public FailingGetApiToken(InputSource input) throws IOException {
			super(input);
		}
}
}