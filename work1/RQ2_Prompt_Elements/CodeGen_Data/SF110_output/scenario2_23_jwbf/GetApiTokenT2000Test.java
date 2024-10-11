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
GetApiTokenTest() throws JDOMException, IOException, VersionException {

			// Get the tokens for the test
			final String apiKey = "mytoken";
			final String user = "john";
			final String page = "page";
			final String wiki = "";
			final String apiDocUrl = "content.php?f=0&api.mode=edit&f=0&api.key=" + apiKey + "&f=0&p=" + user + "" + "&format=xml&t=" + wiki;

			assertNotNull(apiDocUrl);
			assertEquals(apiDocUrl, "content.php?f=0&api.mode=edit&f=0&api.key="+apiKey+"&f=0&amp;p="+user+"&t="+wiki+"&t=&format=xml&t=");

			// get tokens for the test
			try (final HttpAction action = new HttpAction<Void>(){
				@Override
				protected Void call() throws Exception {
					return GetApiToken.GetApiToken.call(
							new Version[] {
                                Version.M1,
                                Version.M2,
                                Version.M3,
                                Version.M4,
							}, apiKey, page);
				}
			}) {

			}

			assertNotNull(action);
			final Integer firstItem = (Integer)action.getData();
			assertEquals(1, firstItem.intValue());

			try {
			} catch (final VersionException ve) {
				assertFalse(ve.hasMoreMessages());
			}
		}

		/**
		 * Call the given action, and print the token result. <br />
		 * An API token is retrieved and sent back using {@link Version#MW1_15}
		 * and this test is supposed to pass every time this is a call.
		 * @throws IOException Exception from the server
		 * @throws VersionException Exception from the server
		 * @throws ProcessException Exception from the server
		 *
		 * @return the status of the call
		 */
		private int call(final Version[] expectedVersion, final String expectedUrl) throws JDOMException, IOException, VersionException, ProcessException {
			assertNotNull(expectedUrl);
			final Version[] expected = new Version[expectedUrl.toLowerCase().split("\\?").length];
			int result = 0;
			final StringReader reader = new StringReader(expectedUrl);
			final Document doc;
			try (final InputSource input = new InputSource(reader)) {
				final SAXBuilder builder = new SAXBuilder();
				builder.setValidating(false);
				doc = builder.build(input);
			}
			assertNotNull("No XML content", doc);

			try (final HttpAction<Void> access = new HttpAction<Void>() {
				@Override
				protected Void call() throws Exception {
					try (final Version version = Version.M1) {
						assertEquals(expected[0], version);
						assertEquals(expected[1], version);
						assertEquals(expected[2], version);
						assertEquals(expected[3], version);
					}
					return null;
				}
			});
			assertNotNull("No call", access);

			try (final Version version = expected.length!=null? expected[expected.length-1] : null) {
				try (final Userinfo user = new Userinfo("john","");) {

					access.setData(user);
					while (access.hasMoreMessages()) {
						final Version result = access.call();
						if (expectedVersion.length>0){
							assertEquals("call should not fail due to non-existing Wiki page", expectedVersion[expectedVersion.length-1], result);
						} else {
							assertTrue("call should have returned a non-null result but was "+result+" on call "+access.toString(), result!