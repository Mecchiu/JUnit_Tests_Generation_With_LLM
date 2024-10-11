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
		
    @Test
    @Slf4j
    public void test()      throws Exception {
    	try {
			final Document doc = new Document();
		    // setup reader
		    StringReader reader = new StringReader(new String("<?xml version=\"1.0\"?><logger>hello</logger>"));
		    Reader inputReader = reader;
			SAXBuilder parser = new SAXBuilder(true);
			parser.setFeature("http://apache.org/xml/features/validation/schema",false);
			parser.setFeature("http://apache.org/xml/features/xerces-implies-documentnormalization-with-external-dtd",false);
			parser.setFeature("http://apache.org/xml/features/nonvalidating/load-external-dtd",false);
			parser.setProperty("http://apache.org/xml/properties/internal/symbol-private", false);
			parser.setDocument(doc);
	            doc.importTree(inputReader);
		    
		    Collection<LogItem> items = parser.parse(reader).getRootElement().getChildren();
		    Document logDoc = parser.newDocument();
		    Element element = new Element("logger", new NamespaceHandler(doc.getRootElement()));
		    for (LogItem logItem : items) {
		        logItem.addTo(element);
		    }
		    reader.close();
		    ParserUtil.setParent(doc.getRootElement(), logDoc);

		    // read xml
			Iterator<Element> logItemIter = logDoc.getRootElement().getChildren();
			final Iterator<LogItem> it = parser.parse(new InputSource(new StringReader(logDoc.asXML()))).getRootElement().getChildren();
			// compare parsed log items and logDoc
	            while (it.hasNext()) {
	                assertEquals("Wrong log item", it.next(), new LogItem(logItemIter.nextElement()));
	                it.next();
	            }
	            assertEquals("Wrong number of log items", it.count(), doc.getRootElement().getContent().getContent().size());
        } finally {
        	if(reader!= null){
        		reader.close();
        	}
        }
    }
}