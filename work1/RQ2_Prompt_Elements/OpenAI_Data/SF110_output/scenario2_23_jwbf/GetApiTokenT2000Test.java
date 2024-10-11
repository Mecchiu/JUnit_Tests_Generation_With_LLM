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
	* It tests if the method returns true if the first element of the XML response is a <api> element.
	*/
	@Test
	void testHasMoreMessages_1() {
		String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:22:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" /></pages></query></api>";
		GetApiToken getApiToken = new GetApiToken(xml);
		assertTrue(getApiToken.hasMoreMessages());
	}
	
	/**
	* Test case for {@link GetApiToken#hasMoreMessages()} method.
	* It tests if the method returns true if the first element of the XML response is a <api> element.
	*/
	@Test
	void testHasMoreMessages_2() {
		String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:22:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" /></pages></query></api>";
		GetApiToken getApiToken = new GetApiToken(xml);
		assertTrue(getApiToken.hasMoreMessages());
	}
	
	/**
	* Test case for {@link GetApiToken#hasMoreMessages()} method.
	* It tests if the method returns true if the first element of the XML response is a <api> element.
	*/
	@Test
	void testHasMoreMessages_3() {
		String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:22:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" /></pages></query></api>";
		GetApiToken getApiToken = new GetApiToken(xml);
		assertTrue(getApiToken.hasMoreMessages());
	}
	
	/**
	* Test case for {@link GetApiToken#hasMoreMessages()} method.
	* It tests if the method returns true if the first element of the XML response is a <api> element.
	*/
	@Test
	void testHasMoreMessages_4() {
		String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:22:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" /></pages></query></api>";
		GetApiToken getApiToken = new GetApiToken(xml);
		assertTrue(getApiToken.hasMoreMessages());
	}
	
	/**
	* Test case for {@link GetApiToken#hasMoreMessages()} method.
	* It tests if the method returns true if the first element of the XML response is a <api> element.
	*/
	@Test
	void testHasMoreMessages_5() {
		String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:22:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" /></pages></query></api>";
		GetApiToken getApiToken = new GetApiToken(xml);
		assertTrue(getApiToken.hasMoreMessages());
	}
	
	/**
	* Test case for {@link GetApiToken#hasMoreMessages()} method.
	* It tests if the method returns true if the first element of the XML response is a <api> element.
	*/
	@Test
	void testHasMoreMessages_6() {
		String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:22:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" /></pages></query></api>";
		GetApiToken getApiToken = new GetApiToken(xml);
		assertTrue(getApiToken.hasMoreMessages());
	}
	
	/**
	* Test case for {@link GetApiToken#hasMoreMessages()} method.
	* It tests if the method returns true if the first element of the XML response is a <api> element.
	*/
	@Test
	void testHasMoreMessages_7() {
		String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:22:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" /></pages></query></api>";
		GetApiToken getApiToken = new GetApiToken(xml);
		assertTrue(getApiToken.hasMoreMessages());
	}
	
	/**
	* Test case for {@link GetApiToken#hasMoreMessages()} method.
	* It tests if the method returns true if the first element of the XML response is a <api> element.
	*/
	@Test
	void testHasMoreMessages_8() {
		String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:22:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" /></pages></query></api>";
		GetApiToken getApiToken = new GetApiToken(xml);
		assertTrue(getApiToken.hasMoreMessages());
	}
	
	/**
	* Test case for {@link GetApiToken#hasMoreMessages()} method.
	* It tests if the method returns true if the first element of the XML response is a <api> element.
	*/
	@Test
	void testHasMoreMessages_9() {
		String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:22:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" /></pages></query></api>";
		GetApiToken getApiToken = new GetApiToken(xml);
		assertTrue(getApiToken.hasMoreMessages());
	}
	
	/**
	* Test case for {@link GetApiToken#hasMoreMessages()} method.
	* It tests if the method returns true if the first element of the XML response is a <api> element.
	*/
	@Test
	void testHasMoreMessages_10() {
		String xml = "<api><query><pages><page pageid=\"1\" ns=\"0\" title=\"Main Page\" contentmodel=\"wikitext\" pagelanguage=\"en\" touched=\"2010-11-15T13:22:25Z\" lastrevid=\"1\" counter=\"0\" length=\"0\" new=\"\" /></pages></query></api>";
		GetApiToken getApiToken = new GetApiToken(xml);
		assertTrue(getApiToken.hasMoreMessages());
	}
}

// GetUserinfo.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_