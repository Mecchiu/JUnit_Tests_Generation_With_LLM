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
		
    @Test
    @Slf4j
    void hasNext_whenPage_returnsSuccess() {
        Vector<LogItem> result = new Vector<>();
        LogCollection collection = new LogCollection("foo", "bar", result);
        ListLogItemsBuilder list = new ListLogItemsBuilder("foo", "bar")
               .limit(10000)
               .limitCount(1000001)
               .result(collection)
               .redirectTo(collection);
        assertFalse(arrayOf("hasNextTest"));
        list.log();
        assertTrue("expect to have next " + arrayOf("hasNext"));
        assertTrue("expect list to be hasNextTest " + arrayOf("list"));
        assertArrayEquals("expect list after hasNext " + arrayOf("list"), arrayOf("foo", "bar", result), arrayOf("list", "hasNext Test"));
        assertArrayEquals("expect next to be from list after hasNext " + arrayOf("next"), arrayOf("42", "43", result), arrayOf("next", "42", "43", result));
        assertEquals("expect max to be 1 after hasNext " + arrayOf("list/next"),
            "42.0", arrayOf("list/next", "42.0", "43.0", result));
        assertEquals("expect count after hasNext " + arrayOf("list/next"),
            "4", arrayOf("list/next", "4", "5", result));
        assertEquals("expect from_next after hasNext " + arrayOf("list/next"),
            "42.0", arrayOf("list/from_next", "42.0", "43.0", result));
        assertEquals("expect from_next past after hasNext " + arrayOf("list/from_next"),
            "43.0", arrayOf("list/from_next", "43.0", "45.0", result));
        assertEquals("expect from_last after hasNext " + arrayOf("list/from_last"),
            "45.0", arrayOf("list/from_last", "45.0", "49.0", result));
        assertArrayEquals("expect all after hasNext " + arrayOf("list/all") +" "+ arrayOf("list/result")+ " (but "+ list.elementIndex()+ 
                ")",
            arrayOf("49.0", "50.0", "51.0", "52.0"), arrayOf("list/all", "hasNextTest", "list/result", "list/all"));
        assertFalse(list.log(true));
        logged("expect to find log item after hasNext " + arrayOf("log item"));
}
}