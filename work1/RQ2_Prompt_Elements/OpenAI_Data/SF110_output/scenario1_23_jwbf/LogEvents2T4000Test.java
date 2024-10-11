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
* It contains ten unit test cases for the {@link LogEvents#iterator()} method.
*/
class LogEventsTest {

		/**
		* Test case for {@link LogEvents#iterator()} method.
		* It tests if the {@link LogEvents#iterator()} method returns an iterator.
		*/
		@Test
		void testIterator() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				assertNotNull(iterator);
		}
		
		/**
		* Test case for {@link LogEvents#iterator()} method.
		* It tests if the {@link LogEvents#iterator()} method returns an iterator.
		*/
		@Test
		void testIterator2() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				assertNotNull(iterator);
		}
		
		/**
		* Test case for {@link LogEvents#iterator()} method.
		* It tests if the {@link LogEvents#iterator()} method returns an iterator.
		*/
		@Test
		void testIterator3() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				assertNotNull(iterator);
		}
		
		/**
		* Test case for {@link LogEvents#iterator()} method.
		* It tests if the {@link LogEvents#iterator()} method returns an iterator.
		*/
		@Test
		void testIterator4() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				assertNotNull(iterator);
		}
		
		/**
		* Test case for {@link LogEvents#iterator()} method.
		* It tests if the {@link LogEvents#iterator()} method returns an iterator.
		*/
		@Test
		void testIterator5() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				assertNotNull(iterator);
		}
		
		/**
		* Test case for {@link LogEvents#iterator()} method.
		* It tests if the {@link LogEvents#iterator()} method returns an iterator.
		*/
		@Test
		void testIterator6() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				assertNotNull(iterator);
		}
		
		/**
		* Test case for {@link LogEvents#iterator()} method.
		* It tests if the {@link LogEvents#iterator()} method returns an iterator.
		*/
		@Test
		void testIterator7() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				assertNotNull(iterator);
		}
		
		/**
		* Test case for {@link LogEvents#iterator()} method.
		* It tests if the {@link LogEvents#iterator()} method returns an iterator.
		*/
		@Test
		void testIterator8() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				assertNotNull(iterator);
		}
		
		/**
		* Test case for {@link LogEvents#iterator()} method.
		* It tests if the {@link LogEvents#iterator()} method returns an iterator.
		*/
		@Test
		void testIterator9() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				assertNotNull(iterator);
		}
		
		/**
		* Test case for {@link LogEvents#iterator()} method.
		* It tests if the {@link LogEvents#iterator()} method returns an iterator.
		*/
		@Test
		void testIterator10() {
				LogEvents logEvents = new LogEvents();
				Iterator<LogItem> iterator = logEvents.iterator();
				assertNotNull(iterator);
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
  @Getter @Setter private String params;
  @Getter @Setter private String logid;
  @Getter @Setter private String logtype;
  @Getter @Setter private String logaction;
  @Getter @Setter private String logparams;
  @Getter @Setter private String logtimestamp;
  @Getter @Setter private String loguser;
  @Getter @Setter private String loguserid;
  @Getter @Setter private String logcomment;
  @Getter @Setter private String logtitle;
  @Getter @Setter private String logpage;
  @Getter @Setter private String logid2;
  @Getter @Setter private String logtype2;
  @Getter @Setter private String logaction2;
  @Getter @Setter private String logparams2;
  @Getter @Setter private String logtimestamp2;
  @Getter @Setter private String loguser2;
  @Getter @Setter private String loguserid2;
  @Getter @Setter private String logcomment2;
  @Getter @Setter private String logtitle2;
  @Getter @Setter private String logpage2;
  @Getter @Setter private String logid3;
  @Getter @Setter private String logtype3;
  @Getter @Setter private String logaction3;
  @Getter @Setter private String logparams3;
  @Getter @Setter private String logtimestamp3;
  @Getter @Setter private String loguser3;
  @Getter @Setter private String loguserid3;
  @Getter @Setter private String logcomment3;
  @Getter @Setter private String logtitle3;
  @Getter @Setter private String logpage3;
  @Getter @Setter private String logid4;
  @Getter @Setter private String logtype4;
  @Getter @Setter private String logaction4;
  @Getter @Setter private String logparams4;
  @Getter @Setter private String logtimestamp4;
  @Getter @Setter private String loguser4;
  @Getter @Setter private String loguserid4;
  @Getter @Setter private String logcomment4;
  @Getter @Setter private String logtitle4;
  @Getter @Setter private String logpage4;
  @Getter @Setter private String logid5;
  @Getter @Setter private String logtype5;
  @Getter @Setter private String logaction5;
  @Getter @Setter private String logparams5;
  @Getter @Setter private String logtimestamp5;
  @Getter @Setter private String loguser5;
  @Getter @Setter private String loguserid5;
  @Getter @Setter private String logcomment5;
  @Getter @Setter private String logtitle5;
  @Getter @Setter private String logpage5;
  @Getter @Setter private String logid6;
  @Getter @Setter private String logtype6;
  @Getter @Setter private String logaction6;
  @Getter @Setter private String logparams6;
  @Getter @Setter private String logtimestamp6;
  @Getter @Setter private String loguser6;
  @Getter @Setter private String loguserid6;
  @Getter @Setter private String logcomment6;
  @Getter @Setter private String logtitle6;
  @Getter @Setter private String logpage6;
  @Getter @Setter private String logid7;
  @Getter @Setter private String logtype7;
  @Getter @Setter private String logaction7;
  @Getter @Setter private String logparams7;
  @Getter @Setter private String logtimestamp7;
  @Getter @Setter private String loguser7;
  @Getter @Setter private String loguserid7;
  @Getter @Setter private String logcomment7;
  @Getter @Setter private String logtitle7;
  @Getter @Setter private String logpage7;
  @Getter @Setter private String logid8;
  @Getter @Setter private String logtype8;
  @Getter @Setter private String logaction8;
  @Getter @Setter private String logparams8;
  @Getter @Setter private String logtimestamp8;
  @Getter @Setter private String loguser8;
  @Getter @Setter private String loguserid8;
  @Getter @Setter private String logcomment8;
  @Getter @Setter private String logtitle8;
  @Getter @Setter private String logpage8;
  @Getter @Setter private String logid9;
  @Getter @Setter private String logtype9;
  @Getter @Setter private String logaction9;
  @Getter @Setter private String logparams9;
  @Getter @Setter private String logtimestamp9;
  @Getter @Setter private String loguser9;
  @Getter @Setter private String loguserid9;
  @Getter @Setter private String logcomment9;
  @Getter @Setter private String logtitle9;
  @Getter @Setter private String logpage9;
  @Getter @Setter private String logid10;
  @Getter @Setter private String logtype10;
  @Getter @Setter private String logaction10;
  @Getter @Setter private String logparams10;
  @Getter @Setter private String logtimestamp10;
  @Getter @Setter private String loguser10;
  @Getter @Setter private String loguserid10;
  @Getter @Setter private String logcomment10;
  @Getter @Setter private String logtitle10;
  @Getter @Setter private String logpage10;
  @Getter @Setter private String logid11;
  @Getter @Setter private String logtype11;
  @Getter @Setter private String logaction11;
  @Getter @Setter private String logparams11;
  @Getter @Setter private String logtimestamp11;
  @Getter @Setter private String loguser11;
  @Getter @Setter private String loguserid11;
  @Getter @Setter private String logcomment11;
  @Getter @Setter private String logtitle11;
  @Getter @Setter private String logpage11;
  @Getter @Setter private String logid12;
  @Getter @Setter private String logtype12;
  @Getter @Setter private String logaction12;
  @Getter @Setter private String logparams12;
  @Getter @Setter private String logtimestamp12;
  @Getter @Setter private String loguser12;
  @Getter @Setter private String loguserid12;
  @Getter @Setter private String logcomment12;
  @Getter @Setter private String logtitle12;
  @Getter @Setter private String logpage12;
  @Getter @Setter private String logid13;
  @Getter @Setter private String logtype13;
  @Getter @Setter private String logaction13;
  @Getter @Setter private String logparams13;
  @Getter @Setter private String logtimestamp13;
  @Getter @Setter private String loguser13;
  @Getter @Setter private String loguserid13;
  @Getter @Setter private String logcomment13;
  @Getter @Setter private String logtitle13;
  @Getter @Setter private String logpage13;
  @Getter @Setter private String logid14;
  @Getter @Setter private String logtype14;
  @Getter @Setter private String logaction14;
  @Getter @Setter private String logparams14;
  @Getter @Setter private String logtimestamp14;
  @Getter @Setter private String loguser14;
  @Getter @Setter private String loguserid14;
  @Getter @Setter private String logcomment14;
  @Getter @Setter private String logtitle14;
  @Getter @Setter private String logpage14;
  @Getter @Setter private String logid15;
  @Getter @Setter private String logtype15;
  @Getter @Setter private String logaction15;
  @Getter @Setter private String logparams15;
  @Getter @Setter private String logtimestamp15;
  @Getter @Setter private String loguser15;
  @Getter @Setter private String loguserid15;
  @Getter @Setter private String logcomment15;
  @Getter @Setter private String logtitle15;
  @Getter @Setter private String logpage15;
  @Getter @Setter private String logid16;
  @Getter @Setter private String logtype16;
  @Getter @Setter private String logaction16;
  @Getter @Setter private String logparams16;
  @Getter @Setter private String logtimestamp16;
  @Getter @Setter private String loguser16;
  @Getter @Setter private String loguserid16;
  @Getter @Setter private String logcomment16;
  @Getter @Setter private String logtitle16;
  @Getter @Setter private String logpage16;
  @Getter @Setter private String logid17;
  @Getter @Setter private String logtype17;
  @Getter @Setter private String logaction17;
  @Getter @Setter private String logparams17;
  @Getter @Setter private String logtimestamp17;
  @Getter @Setter private String loguser17;
  @Getter @Setter private String loguserid17;
  @Getter @Setter private String logcomment17;
  @Getter @Setter private String logtitle17;
  @Getter @Setter private String logpage17;
  @Getter @Setter private String logid18;
  @Getter @Setter private String logtype18;
  @Getter @Setter private String logaction18;
  @Getter @Setter private String logparams18;
  @Getter @Setter private String logtimestamp18;
  @Getter @Setter private String loguser18;
  @Getter @Setter private String loguserid18;
  @Getter @Setter private String logcomment18;
  @Getter @Setter private String logtitle18;
  @Getter @Setter private String logpage18;
  @Getter @Setter private String logid19;
  @Getter @Setter private String logtype19;
  @Getter @Setter private String logaction19;
  @Getter @Setter private String logparams19;
  @Getter @Setter private String logtimestamp19;
  @Getter @Setter private String loguser19;
  @Getter @Setter private String loguserid19;
  @Getter @Setter private String logcomment19;
  @Getter @Setter private String logtitle19;
  @Getter @Setter private String logpage19;
  @Getter @Setter private String logid20;
  @Getter @Setter private String logtype