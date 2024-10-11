// TracWikiBotTest.java
package net.sourceforge.jwbf.trac.bots;

import java.net.MalformedURLException;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.trac.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TracWikiBot}.
* It contains one unit test case for the {@link TracWikiBot#readContent(String)} method.
*/
class TracWikiBotTest {
		
        /**
		 * Test the function of the {@link TracWikiBot#readContent()} method
		 * of {@link TracWikiBot} that provides the function to get the article content.
		*/
    @Test
    public void readContentTest() throws MalformedURLException, ProcessException, ActionException {
        String url = "http://trac.edgewall.org/wiki/"
            + "TracWiki";
        System.setProperty("REVISION_MODE", "true");
        WikiBot wb = new WikiBot(url);
        TracWikiBot gbt = new TracWikiBot(url);

        // Test method for {@link TracWikiBot#readContent()}
        assertNotNull("TracWiki article should be available!",
                      gbt.readContent("TracWiki"));

        // Test for {@link TracWikiBot#readContent()} again after closing
        assertNull("TracWiki article should have been closed again!",
                    gbt.readContent("TracWiki"));
    }
    
    /**
     * Test the function of the {@link TracWikiBot#readContent()} method
     * of {@link WikiBot} that provides the function to get the article data.
     */
    @Test
    public void readDataTest() throws MalformedURLException, ProcessException, ActionException {

        String url = "http://trac.edgewall.org/wiki/"
            + "TracWiki";
        String data = "data";

        WikiBot wb = new WikiBot(url);

        // Test method for {@link WikiBot#readData(String,int)}
        assertNotNull("TracWiki article should be available!",
                      wb.readData(data, Userinfo.SILENT_MAX_WIKI_PROPERTY_COUNT));

        // Test method for {@link WikiBot#readData(String,int)}
        DataBase dbTest = wb.readData("data", Userinfo.SILENT_MAX_WIKI_PROPERTY_COUNT);
        assertNotNull("TracWiki article should be available!",
                      dbTest);

    }

    /**
     * Test the function of the {@link TracWikiBot#writeContent(ContentAccessable)} method
     * of {@link TracWikiBot} that provides the function to write an article to a wiki url.
     */
    @Test
    public void writeContentTest() throws MalformedURLException, ProcessException, ActionException {
        System.setProperty("REVISION_MODE", "true");
        HttpBot hb = new HttpBot("http://trac.edgewall.org/wiki/"
                                + "TracWiki");
      
        // Test for {@link TracBot#writeContent(ContentAccessable)} again after closing
        hb.writeContent(readContent("data2"));
        
        // Test for {@link TracBot#writeContent(ContentAccessable)} again after closing
        hb.writeContent(new ContentAccessable());
        hb.writeContent(readContent("data3"));
        
        // Test for all methods should be able to get the article data with TracBot
        hb.writeContent(new ContentAccessable());
        hb.writeContent(new ContentAccessable());
        hb.writeContent(readContent("data4"));
        
        
        hb.writeContent(readContent("data5"));
        
        
        hb.setCookies(new HashMap());
        hb.setUserinfo(new Users());

        hb.writeData("2data6");
        hb.writeData("5data7");
        hb.writeData("5data8");
    }
    
    /**
    * test of getting article data as returned by
    * {@link TracWikiBot#writeContent(ContentAccessable)} and
    * {@link TracWikiBot#readData(String,int)}
    */
    @Test
    public void testGetData() throws MalformedURLException, ProcessException, ActionException {
        WikiBot wb = new WikiBot("http://trac.edgewall.org/wiki/"
                              + "TracWiki");
        assertNotNull("TracWiki article should be available!",
                      wb.readData("data", Userinfo.SILENT_MAX_WIKI_PROPERTY_COUNT));
        assertTrue("TracWiki article should have access to TracWiki article data!",
                   wb.readData("data", Userinfo.SILENT_MAX_WIKI_PROPERTY_COUNT).size()>0);
        
        // Test for {@link
}
}