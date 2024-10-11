// LogEvents_3Test.java
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
* It contains ten unit test cases for the {@link LogEvents#iterator()} method.
*/
class LogEvents_3Test {

		/**
		 * Test case for {@link LogEvents#iterator()}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator() throws JDOMException, IOException, ActionException, ProcessException, VersionException {
				
				// create a testbot
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				
				// create a LogEvents object
				LogEvents logEvents = new LogEvents(bot, "upload");
				
				// create a SAXBuilder
				SAXBuilder builder = new SAXBuilder();
				
				// create a JDOM document
				Document doc = builder.build(new StringReader(logEvents.generateRequest("upload").getRequest()));
				
				// create a root element
				Element root = doc.getRootElement();
				
				// create a query element
				Element query = root.getChild("query");
				
				// create a logevents element
				Element logevents = query.getChild("logevents");
				
				// create a letype attribute
				String letype = logevents.getAttributeValue("letype");
				
				// create a lelimit attribute
				String lelimit = logevents.getAttributeValue("lelimit");
				
				// create a format attribute
				String format = logevents.getAttributeValue("format");
				
				// test the attributes
				assertEquals("upload", letype);
				assertEquals("50", lelimit);
				assertEquals("xml", format);
				
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator2() throws JDOMException, IOException, ActionException, ProcessException, VersionException {
				
				// create a testbot
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				
				// create a LogEvents object
				LogEvents logEvents = new LogEvents(bot, "upload");
				
				// create a SAXBuilder
				SAXBuilder builder = new SAXBuilder();
				
				// create a JDOM document
				Document doc = builder.build(new StringReader(logEvents.generateRequest("upload").getRequest()));
				
				// create a root element
				Element root = doc.getRootElement();
				
				// create a query element
				Element query = root.getChild("query");
				
				// create a logevents element
				Element logevents = query.getChild("logevents");
				
				// create a letype attribute
				String letype = logevents.getAttributeValue("letype");
				
				// create a lelimit attribute
				String lelimit = logevents.getAttributeValue("lelimit");
				
				// create a format attribute
				String format = logevents.getAttributeValue("format");
				
				// test the attributes
				assertEquals("upload", letype);
				assertEquals("50", lelimit);
				assertEquals("xml", format);
				
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator3() throws JDOMException, IOException, ActionException, ProcessException, VersionException {
				
				// create a testbot
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				
				// create a LogEvents object
				LogEvents logEvents = new LogEvents(bot, "upload");
				
				// create a SAXBuilder
				SAXBuilder builder = new SAXBuilder();
				
				// create a JDOM document
				Document doc = builder.build(new StringReader(logEvents.generateRequest("upload").getRequest()));
				
				// create a root element
				Element root = doc.getRootElement();
				
				// create a query element
				Element query = root.getChild("query");
				
				// create a logevents element
				Element logevents = query.getChild("logevents");
				
				// create a letype attribute
				String letype = logevents.getAttributeValue("letype");
				
				// create a lelimit attribute
				String lelimit = logevents.getAttributeValue("lelimit");
				
				// create a format attribute
				String format = logevents.getAttributeValue("format");
				
				// test the attributes
				assertEquals("upload", letype);
				assertEquals("50", lelimit);
				assertEquals("xml", format);
				
		}
		
		/**
		 * Test case for {@link LogEvents#iterator()}.
		 * @throws IOException 
		 * @throws JDOMException 
		 * @throws VersionException 
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testIterator4() throws JDOMException, IOException, ActionException, ProcessException, VersionException {
				
				// create a testbot
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				
				// create a LogEvents object
				LogEvents logEvents = new LogEvents(bot, "upload");
				
				// create a SAXBuilder
				SAXBuilder builder = new SAXBuilder();
				
				// create a JDOM document
				Document doc = builder.build(new StringReader(logEvents.generateRequest("upload").getRequest()));
				
				// create a root element
				Element root = doc.getRootElement();
				
				// create a query element
				Element query = root.getChild("query");
				
				// create a logevents element
				Element logevents = query.getChild("logevents");
				
				// create a letype attribute
				String letype = logevents.getAttributeValue("letype");
				
				// create a lelimit attribute
				String le