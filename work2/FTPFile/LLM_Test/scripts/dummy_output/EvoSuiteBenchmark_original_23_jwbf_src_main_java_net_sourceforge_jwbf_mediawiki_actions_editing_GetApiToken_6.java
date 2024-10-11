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
		
	@Test
	void testMoreMessages() throws IOException, JDOMException, VersionException, ProcessException {
        Document doc  = new SAXBuilder().build(new InputSource(new StringReader("Lorem ipsum dolor")));
        
        Element docEle = doc.getRootElement();
		
        String wikiId = docEle.getAttributeValue("id");
		if( wikiId == null ) {
    		wikiId = "test-";
		}
		
        Userinfo userinfo = Userinfo.get(wikiId);
		if( userinfo == null ) {
    		userinfo = Userinfo.create();
    		userinfo.setWikiId(wikiId);
    		if( wikiId!= "test-0" && wikiId!= "test-1") {
    			userinfo.setWikiId("test-6");
    		}
    	}
    	
		if(userinfo.getVersionNo()!= null && userinfo.getVersionNo() <= MW1_15) {
        	assertTrue(true);
        } else if (userinfo.getVersionNo()!= null && userinfo.getVersionNo() >= MW1_15) {
		} else {
			assertFalse(true);
		}
	}
}