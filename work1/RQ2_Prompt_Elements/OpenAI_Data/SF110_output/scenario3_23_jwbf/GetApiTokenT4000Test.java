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
	 * It tests if the method returns true if the response contains the token.
	 */
	@Test
	void testHasMoreMessages_true() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"  <tokens>\n" +
				"    <csrftoken>+\\</csrftoken>\n" +
				"  </tokens>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertTrue(result);
	}
	
	/**
	 * Test case for {@link GetApiToken#hasMoreMessages()} method.
	 * It tests if the method returns false if the response does not contain the token.
	 */
	@Test
	void testHasMoreMessages_false() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link GetApiToken#hasMoreMessages()} method.
	 * It tests if the method returns false if the response contains the token but it is empty.
	 */
	@Test
	void testHasMoreMessages_false_emptyToken() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"  <tokens>\n" +
				"    <csrftoken></csrftoken>\n" +
				"  </tokens>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link GetApiToken#hasMoreMessages()} method.
	 * It tests if the method returns false if the response contains the token but it is null.
	 */
	@Test
	void testHasMoreMessages_false_nullToken() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"  <tokens>\n" +
				"    <csrftoken>null</csrftoken>\n" +
				"  </tokens>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link GetApiToken#hasMoreMessages()} method.
	 * It tests if the method returns false if the response contains the token but it is whitespace.
	 */
	@Test
	void testHasMoreMessages_false_whitespaceToken() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"  <tokens>\n" +
				"    <csrftoken> </csrftoken>\n" +
				"  </tokens>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link GetApiToken#hasMoreMessages()} method.
	 * It tests if the method returns false if the response contains the token but it is a newline.
	 */
	@Test
	void testHasMoreMessages_false_newlineToken() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"  <tokens>\n" +
				"    <csrftoken>\n</csrftoken>\n" +
				"  </tokens>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link GetApiToken#hasMoreMessages()} method.
	 * It tests if the method returns false if the response contains the token but it is a tab.
	 */
	@Test
	void testHasMoreMessages_false_tabToken() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"  <tokens>\n" +
				"    <csrftoken>\t</csrftoken>\n" +
				"  </tokens>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link GetApiToken#hasMoreMessages()} method.
	 * It tests if the method returns false if the response contains the token but it is a carriage return.
	 */
	@Test
	void testHasMoreMessages_false_carriageReturnToken() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"  <tokens>\n" +
				"    <csrftoken>\r</csrftoken>\n" +
				"  </tokens>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link GetApiToken#hasMoreMessages()} method.
	 * It tests if the method returns false if the response contains the token but it is a form feed.
	 */
	@Test
	void testHasMoreMessages_false_formFeedToken() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"  <tokens>\n" +
				"    <csrftoken>\f</csrftoken>\n" +
				"  </tokens>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link GetApiToken#hasMoreMessages()} method.
	 * It tests if the method returns false if the response contains the token but it is a backspace.
	 */
	@Test
	void testHasMoreMessages_false_backspaceToken() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"  <tokens>\n" +
				"    <csrftoken>\b</csrftoken>\n" +
				"  </tokens>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link GetApiToken#hasMoreMessages()} method.
	 * It tests if the method returns false if the response contains the token but it is a vertical tab.
	 */
	@Test
	void testHasMoreMessages_false_verticalTabToken() {
		// Arrange
		String response = "<?xml version=\"1.0\"?>\n" +
				"<api>\n" +
				"  <query>\n" +
				"    <pages>\n" +
				"      <page pageid=\"1\" ns=\"0\" title=\"Main Page\" touched=\"2010-03-25T13:19:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" />\n" +
				"    </pages>\n" +
				"  </query>\n" +
				"  <tokens>\n" +
				"    <csrftoken>\u000B</csrftoken>\n" +
				"  </tokens>\n" +
				"</api>";
		GetApiToken getApiToken = new GetApiToken(response);
		
		// Act
		boolean result = getApiToken.hasMoreMessages();
		
		// Assert
		assertFalse(result);
	}
}

// GetPage.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.source