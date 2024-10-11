// LogEvents_2Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LogItem;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogEvents}.
* It contains ten unit test cases for the {@link LogEvents#next()} method.
*/
class LogEvents_2Test {

		/**
		 * Test case for {@link LogEvents#next()}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testNext() throws JDOMException, IOException, ActionException, ProcessException, VersionException {
			
			String xml = "<?xml version=\"1.0\"?>\n" + 
					"<api>\n" + 
					"  <query>\n" + 
					"    <logevents>\n" + 
					"      <item action=\"block\" logid=\"1\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"2\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"3\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"4\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"5\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"6\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"7\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"8\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"9\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"10\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"    </logevents>\n" + 
					"  </query>\n" + 
					"</api>";
			
			SAXBuilder builder = new SAXBuilder();
			Reader i = new StringReader(xml);
			Document doc = builder.build(new InputSource(i));
			Element root = doc.getRootElement();
			
			LogEvents le = new LogEvents(new MediaWikiBot(MW1_11), "block");
			le.findContent(root);
			
			Iterator<LogItem> it = le.iterator();
			
			assertTrue(it.hasNext());
			assertEquals("User:Test", it.next().getTitle());
			assertTrue(it.hasNext());
			assertEquals("User:Test", it.next().getTitle());
			assertTrue(it.hasNext());
			assertEquals("User:Test", it.next().getTitle());
			assertTrue(it.hasNext());
			assertEquals("User:Test", it.next().getTitle());
			assertTrue(it.hasNext());
			assertEquals("User:Test", it.next().getTitle());
			assertTrue(it.hasNext());
			assertEquals("User:Test", it.next().getTitle());
			assertTrue(it.hasNext());
			assertEquals("User:Test", it.next().getTitle());
			assertTrue(it.hasNext());
			assertEquals("User:Test", it.next().getTitle());
			assertTrue(it.hasNext());
			assertEquals("User:Test", it.next().getTitle());
			assertTrue(it.hasNext());
			assertEquals("User:Test", it.next().getTitle());
			assertFalse(it.hasNext());
			
		}
		
		/**
		 * Test case for {@link LogEvents#next()}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testNext2() throws JDOMException, IOException, ActionException, ProcessException, VersionException {
			
			String xml = "<?xml version=\"1.0\"?>\n" + 
					"<api>\n" + 
					"  <query>\n" + 
					"    <logevents>\n" + 
					"      <item action=\"block\" logid=\"1\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"2\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"3\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"4\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"5\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"6\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"7\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"8\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"9\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"      <item action=\"block\" logid=\"10\" page=\"User:Test\" timestamp=\"2007-01-01T00:00:00Z\" type=\"block\" user=\"Test\"/>\n" + 
					"    </logevents>\n" + 
					"  </query>\n" + 
					"</api>";
			
			