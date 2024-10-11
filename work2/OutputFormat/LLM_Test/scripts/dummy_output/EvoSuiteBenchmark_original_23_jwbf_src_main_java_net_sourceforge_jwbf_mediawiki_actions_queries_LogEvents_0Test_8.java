// LogEvents_0Test.java
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
* It contains one unit test case for the {@link LogEvents#hasNext()} method.
*/
class LogEvents_0Test {
		
	private Collection<Element> leelements;
	private boolean leflag;
	private Collection<LogItem> leitems;
	private Collection<Element> leelementes;
	private Document lexml = null;
		
	public LogEvents_0Test(Collection<Document> leelements, Collection<Element> leelementes) {
		this.leelements = leelements;
		this.leelementes = leelementes;
		//this.leelelements = leelements;
		this.leelements = leelementes;

		this.leflag = Boolean.valueOf(true);
	}
	
	@Test
	void test_hasNext() {
		this.leelements = new Vector<>(leelements);
		this.leelementes = leelementes;
		this.leelements.addAll(leeelementes);
		
		for(Element elem : leelements){
			if(!this.leflag) {
				continue;
			}
			if(elem.getName().equals("{http://search.yahoo.com/mw/search/}start")) {
				if(!elem.getAttributeValue("type").equals("page")) {
					if(this.leflag==Boolean.valueOf(true)) {
						continue;
					}
				}
			}
			if(elem.getName().equals("{http://search.yahoo.com/mw/search/}end")) {
				if(!elem.getAttributeValue("type").equals("page")) {
					if(this.leflag==Boolean.valueOf(true)) {
						continue;
					}
				}
			}
		}
	}
	
	@Test
	void test_log_elements() throws IOException, JDOMException {
	}
	
	@Test
	void test_next() throws ProcessException, InterruptedException {
	}
	
	@Test
	void test_prev() throws ProcessException, InterruptedException {
	}

	@Test
	void test_each() throws ProcessException, InterruptedException, ProcessException, InterruptedException, JDOMException, IOException, VersionException, VersionException, IOException, LogItemException {
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try(
			final MediaWiki bot = new MediaWikiBot();
			final Reader input = new StringReader(bot.getSource().get());
			final JDOMConfig config = new JDOMConfig();

			MediaWiki bot.run(input,config)
		) {
			bot.run();
		}
	}
	
}