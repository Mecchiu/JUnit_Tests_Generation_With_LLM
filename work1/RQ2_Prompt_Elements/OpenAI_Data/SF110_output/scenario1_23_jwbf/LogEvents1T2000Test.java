// LogEventsTest.java
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
class LogEventsTest {

	/**
	* Test case for {@link LogEvents#next()} method.
	* It tests the {@link LogEvents#next()} method with a log event of type "delete".
	*/
	@Test
	void testNextDelete() {
		LogEvents logEvents = new LogEvents();
		LogItem logItem = logEvents.next();
		assertEquals("delete", logItem.getType());
	}
	
	/**
	* Test case for {@link LogEvents#next()} method.
	* It tests the {@link LogEvents#next()} method with a log event of type "block".
	*/
	@Test
	void testNextBlock() {
		LogEvents logEvents = new LogEvents();
		LogItem logItem = logEvents.next();
		assertEquals("block", logItem.getType());
	}
	
	/**
	* Test case for {@link LogEvents#next()} method.
	* It tests the {@link LogEvents#next()} method with a log event of type "protect".
	*/
	@Test
	void testNextProtect() {
		LogEvents logEvents = new LogEvents();
		LogItem logItem = logEvents.next();
		assertEquals("protect", logItem.getType());
	}
	
	/**
	* Test case for {@link LogEvents#next()} method.
	* It tests the {@link LogEvents#next()} method with a log event of type "rights".
	*/
	@Test
	void testNextRights() {
		LogEvents logEvents = new LogEvents();
		LogItem logItem = logEvents.next();
		assertEquals("rights", logItem.getType());
	}
	
	/**
	* Test case for {@link LogEvents#next()} method.
	* It tests the {@link LogEvents#next()} method with a log event of type "move".
	*/
	@Test
	void testNextMove() {
		LogEvents logEvents = new LogEvents();
		LogItem logItem = logEvents.next();
		assertEquals("move", logItem.getType());
	}
	
	/**
	* Test case for {@link LogEvents#next()} method.
	* It tests the {@link LogEvents#next()} method with a log event of type "upload".
	*/
	@Test
	void testNextUpload() {
		LogEvents logEvents = new LogEvents();
		LogItem logItem = logEvents.next();
		assertEquals("upload", logItem.getType());
	}
	
	/**
	* Test case for {@link LogEvents#next()} method.
	* It tests the {@link LogEvents#next()} method with a log event of type "newusers".
	*/
	@Test
	void testNextNewusers() {
		LogEvents logEvents = new LogEvents();
		LogItem logItem = logEvents.next();
		assertEquals("newusers", logItem.getType());
	}
	
	/**
	* Test case for {@link LogEvents#next()} method.
	* It tests the {@link LogEvents#next()} method with a log event of type "renameuser".
	*/
	@Test
	void testNextRenameuser() {
		LogEvents logEvents = new LogEvents();
		LogItem logItem = logEvents.next();
		assertEquals("renameuser", logItem.getType());
	}
	
	/**
	* Test case for {@link LogEvents#next()} method.
	* It tests the {@link LogEvents#next()} method with a log event of type "import".
	*/
	@Test
	void testNextImport() {
		LogEvents logEvents = new LogEvents();
		LogItem logItem = logEvents.next();
		assertEquals("import", logItem.getType());
	}
	
	/**
	* Test case for {@link LogEvents#next()} method.
	* It tests the {@link LogEvents#next()} method with a log event of type "patrol".
	*/
	@Test
	void testNextPatrol() {
		LogEvents logEvents = new LogEvents();
		LogItem logItem = logEvents.next();
		assertEquals("patrol", logItem.getType());
	}
}

// LogItem.java
package net.sourceforge.jwbf.mediawiki.contentRep;

import java.util.Date;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Thomas Stock
 */
@ToString
public class LogItem {

  @Getter @Setter private String type;
  @Getter @Setter private String action;
  @Getter @Setter private String comment;
  @Getter @Setter private String title;
  @Getter @Setter private String user;
  @Getter @Setter private String userid;
  @Getter @Setter private String timestamp;
  @Getter @Setter private String details;
  @Getter @Setter private String logid;
  @Getter @Setter private String logtype;
  @Getter @Setter private String logaction;
  @Getter @Setter private String logparams;
  @Getter @Setter private String logdeleted;
  @Getter @Setter private String logpage;
  @Getter @Setter private String logtitle;
  @Getter @Setter private String logtimestamp;
  @Getter @Setter private String loguser;
  @Getter @Setter private String loguserid;
  @Getter @Setter private String logcomment;
  @Getter @Setter private String logcommentid;
  @Getter @Setter private String logcommentdeleted;
  @Getter @Setter private String logcommenttext;
  @Getter @Setter private String logcommentraw;
  @Getter @Setter private String logpatrol;
  @Getter @Setter private String logpatrolauto;
  @Getter @Setter private String logpatrololdid;
  @Getter @Setter private String logpatrolnewid;
  @Getter @Setter private String logpatroltype;
  @Getter @Setter private String logpatrolnamespace;
  @Getter @Setter private String logpatroltitle;
  @Getter @Setter private String logpatroluser;
  @Getter @Setter private String logpatroluserid;
  @Getter @Setter private String logpatroltimestamp;
  @Getter @Setter private String logpatrolcomment;
  @Getter @Setter private String logpatrolcommentid;
  @Getter @Setter private String logpatrolcommentdeleted;
  @Getter @Setter private String logpatrolcommenttext;
  @Getter @Setter private String logpatrolcommentraw;
  @Getter @Setter private String logpatrolrevid;
  @Getter @Setter private String logpatrololdlen;
  @Getter @Setter private String logpatrolnewlen;
  @Getter @Setter private String logpatrolcurid;
  @Getter @Setter private String logpatrolcurtimestamp;
  @Getter @Setter private String logpatrolcurtitle;
  @Getter @Setter private String logpatrolcuruser;
  @Getter @Setter private String logpatrolcuruserid;
  @Getter @Setter private String logpatrolcurcomment;
  @Getter @Setter private String logpatrolcurcommentid;
  @Getter @Setter private String logpatrolcurcommentdeleted;
  @Getter @Setter private String logpatrolcurcommenttext;
  @Getter @Setter private String logpatrolcurcommentraw;
  @Getter @Setter private String logpatrolcurrevid;
  @Getter @Setter private String logpatrolcuroldlen;
  @Getter @Setter private String logpatrolcurnewlen;
  @Getter @Setter private String logpatrolprevid;
  @Getter @Setter private String logpatrolprevtimestamp;
  @Getter @Setter private String logpatrolprevtitle;
  @Get