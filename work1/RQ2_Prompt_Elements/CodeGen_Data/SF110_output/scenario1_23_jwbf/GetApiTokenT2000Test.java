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

    private FileStorage f;
    private FileStorage q;
    private HttpAction http;
    
    private final String XML_MS_1_12 = get(SupportedBy.MMS).get("xml", SupportedBy.MMS.value);
    private final String XML_MS_1_14 = get(SupportedBy.MMS).get("xml", SupportedBy.MMS.value);
    private final String XML_MS_15 = get(SupportedBy.MMS).get("xml", SupportedBy.MMS.value);
    private final String XML_MS_16 = get(SupportedBy.MMS).get("xml", SupportedBy.MMS.value);
    private final String XML_MS_1_13 = get(SupportedBy.MMS).get("xml", SupportedBy.MMS.value);
    private final String XML_MS_1_15 = get(SupportedBy.MMS).get("xml", SupportedBy.MMS.value);
    private final String XML_MS_1_16 = get(SupportedBy.MMS).get("xml", SupportedBy.MMS.value);
    
	@Test(expected = VersionException.class)
    public void XML_MS_1_12_hasErrors() throws VersionException {
        
        f = new FileStorage(XML_MS_1_12);
        f.store();
        
        q = new FileStorage(XML_MS_1_14);
        q.store();
        
        q = new FileStorage(XML_MS_15);
        q.store();
        
        q = new FileStorage(XML_MS_1_16);
        q.store();
        
    }
	
	@Test
	public void XML_MS_1_13_hasErrors() throws VersionException {
		
        HttpAction act = get(SupportedBy.HTTP);
        System.out.println(act.get().getEntity());
        HttpAction rq = new Get(act.get().getURL());
        rq.store();
        
        f = new FileStorage(XML_MS_1_13);
        f.store();
    }
	
    @Test
    public void XML_MS_1_14_hasErrors() throws VersionException {
        
        ContentRep cont = new ContentRep(XML_MS_1_14);
        for (ContentTag t : cont.getAll()) {
            assertEquals(ContentField.REPLACESTARS, t.getField());
            assertEquals(ContentField.TYPE, t.getType());
        }
    }
	
	@Test
    public void XML_MS_1_15_hasErrors() throws VersionException {
        
        FileStorage cont = new FileStorage(XML_MS_1_15);
        for (ContentTag t : cont.getAll()) {
            assertEquals(ContentField.REPLACESTARS, t.getField());
            assertEquals(ContentField.TYPE, t.getType());
        }
    }
	
	@Test
    public void XML_MS_1_16_hasErrors() throws VersionException {
        
        FileStorage cont = new FileStorage(XML_MS_1_16);
        for (ContentTag t : cont.getAll()) {
            assertEquals(ContentField.REPLACESTARS, t.getField());
            assertEquals(ContentField.TYPE, t.getType());
        }
    }
	
	
    @Test
    public void XML_MS_1_16_hasErrors() throws VersionException {
        
        ContentRep cont = new ContentRep(XML_MS_1_16);
        for (ContentTag t : cont.getAll()) {
            assertEquals(ContentField.REPLACESTARS, t.getField());
            assertEquals(ContentField.TYPE, t.getType());
        }
    }
	
	@Test
	public void XML_MS_1_12_canBeLoaded() throws VersionException {