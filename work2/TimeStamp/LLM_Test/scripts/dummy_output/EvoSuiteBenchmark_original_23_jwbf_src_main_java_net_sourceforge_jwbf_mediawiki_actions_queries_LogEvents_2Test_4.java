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
* It contains one unit test case for the {@link LogEvents#iterator()} method.
*/
class LogEvents_2Test {
		/**
		* Parse the log events XML from the given reader.
		* An exception is thrown if the reader is null or no XML is returned.
		*
		* @param reader A valid reader of XML that contains the log events. This does not contain a <br>
		*                   content root.
		* @return An iterator over the log items in the reader.
		* @throws IOException
		*/
    @Test(expected = NullPointerException.class)
		public void test_1reader_null_thrown() throws IOException {
			// set reader
			Reader reader = null;
			// parse XML
			LogEvents.parse(reader);
		}
		/**
		* Parse the log events XML from the given SAXBuilder.
		* An exception is thrown if the xml is null or no XML is returned.
		*
		* @param parser A valid parser of XML that contains the log items. This does not contain a <br>
		*                   content root.
		* @return An iterator over the log items in the XML.
		* @throws XMLParseException
		* @throws JDOMException
		*/
    @Test(expected = NullPointerException.class)
		public void test_2xml_null_thrown() throws XMLParseException, JDOMException {
			// set reader
			SAXBuilder builder = null;
			// set XML reader
			Document doc = null;
			InputSource inputSource = null;
			
			// parse XML
			builder = new SAXBuilder();
			inputSource = new InputSource(new StringReader("<?xml version=\"1.0\"?>\n<log-events>\n"));
			doc = builder.build(inputSource);
			assertNotNull(doc);
		}
		/**
		* Parse the log events XML from the given reader. It does nothing when the reader is empty.
		*
		* @param reader A valid reader of XML that contains the log items. This does not contain a <br>
		*                   content root.
		* @return An iterator over the log items in the reader.
		* @throws IOException
		* @throws XOMException
		* @throws DocumentException
		* @throws SAXException
		* @generatedBy github.com/github/zi-kui/jwbf/CodeGeneratorBot.java
		* @version $Id$
		*/
		@Test
		public void test_3reader_empty_thrown() throws IOException, XOMException, DocumentException, SAXException {
			// read reader from a valid XML
			Document doc =  null;
			InputSource inputSource = null;
			// read XML from a valid file
			StringReader reader = null;
			Reader reader2 = null;
}
}