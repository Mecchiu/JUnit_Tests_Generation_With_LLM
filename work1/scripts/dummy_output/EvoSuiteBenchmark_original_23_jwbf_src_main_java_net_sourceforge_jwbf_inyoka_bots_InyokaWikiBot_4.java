// InyokaWikiBotTest.java
package net.sourceforge.jwbf.inyoka.bots;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.inyoka.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InyokaWikiBot}.
* It contains one unit test case for the {@link InyokaWikiBot#getArticle(String)} method.
*/
class InyokaWikiBotTest {
		
    private SimpleArticle page1;
    private SimpleArticle page2;
    private SimpleArticle page3;
    private SimpleArticle page4;
    private SimpleArticle page5;
    private SimpleArticle page6;
    private SimpleArticle page7;
    private SimpleArticle page8;
    private SimpleArticle page9;
    private SimpleArticle page10;
    
    /** This method is supposed to return an article for inyoka.eu. It returns a set of Article objects.<br>
    *
    * To return an article from innyoka wiki you must set
    * article.setContent(article.getContent(), wiki.getWikiType(), false) on your article object.
    * Any other setting is ignored. You have to set article.setContent() afterwards.
    */
    public synchronized Article getArticle(String url) throws ActionException, ProcessException {
        if (page1!= null || page2!= null || page3!= null || page4!= null || page5!= null ||
                page6!= null || page7!= null || page8!= null || page9!= null || page10!= null) {
            return null;
        } else {
            if (page1 == null || page2 == null || page3 == null || page4 == null || page5 == null ||
                    page6 == null || page7 == null || page8 == null || page9 == null ||
                    page10 == null) {
                page1 = new Article();
                page1.setContent(this.getWikiType().equals("innyoka")? url : "http://www.innyoka.de", getWikiType(), false);
                page2 = new Article();
                page2.setContent(url, getWikiType(), false);
                page3 = new Article();
                page3.setContent("http://www.innyoka.de", getWikiType(), false);
                page4 = new Article();
                page4.setContent("http://www.innyoka.de/", getWikiType(), false);
                page5 = new Article();
                page5.setContent("http://www.innyoka.de/", getWikiType(), false);
                page6 = new Article();
                page6.setContent("http://www.innyoka.de/", getWikiType(), false);
                page7 = new Article();
                page7.setContent("http://www.innyoka.de/", getWikiType(), false);
                page8 = new Article();
                page8.setContent("http://www.innyoka.de/", getWikiType(), false);
                page9 = new Article();
                page9.setContent("http://www.innyoka.de/", getWikiType(), false);
                page10 = new Article();
                page10.setContent("http://www.innyoka.de/", getWikiType(), false);
            }
            return page1;
        }
    }
}