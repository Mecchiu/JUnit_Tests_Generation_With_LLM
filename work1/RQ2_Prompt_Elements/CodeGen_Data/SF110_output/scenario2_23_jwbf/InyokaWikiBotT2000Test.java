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

    @Test
    public void testGetArticle() throws ActionException, ProcessException {
        String name = "Inyoka";
        Userinfo userinfo = new Userinfo(name, "Inyoka", System.currentTimeMillis());

        Article a = new SimpleArticle(name);
        Set<Userinfo> users = new UserinfoSet(a);
        GetRevision action = new GetRevision();
        action.setUser(userinfo);
        assertFalse(a.hasContent(action));

        process(a, "Inyoka", 1, action);
        assertTrue(a.hasContent(action));

        articleContents(a, a);
        articleAttributes(a, a);
    }

    @Test
    public void testGetArticle2() throws ActionException, ProcessException {
        String name = "Inyoka";
        Userinfo userinfo = new Userinfo(name, "Inyoka", System.currentTimeMillis());

        Article a = new SimpleArticle(name);
        Set<Userinfo> users = new UserinfoSet(a);
        GetRevision action = new GetRevision();
        action.setUser(userinfo);
        assertFalse(a.hasContent(action));

        articleContents(a, a);
        articleAttributes(a, a);
    }


    private void articleContents(Article a, Article ai) throws ActionException {
        String content = ai.getContent();
        Set<String> contentTags = a.getContentTags();

        for (String s : contentTags) {
            articleContents(new SimpleArticle(s), a);
        }
    }

    private void articleAttributes(Article a, Article ai) throws ActionException {
        String content = ai.getContent().toLowerCase();
        Map<String, String> attributes = a.getAttributes();
        Set<String> tags = a.getTags();

        for (String s : contentTags) {
            String h = tags.contains(s)? "<" + s + ">" : "";
            attributes.put(s, h);
//            content = content.replaceAll(s, h);
//            content = content.replaceAll("(?i):" + s, "<" + s + ">");
//            content = content.replaceAll("(?i):" + s, "<" + s + ">");
            content = content.replaceAll("(?i):" + s, "<" + s + ">");
            content = content.replaceAll("(?i):" + s, "<" + s + ">" + h);
            content = content.replaceAll("(?i):" + s + ":", "=\"" + s + ":");
            content = content.replaceAll("(?i)[^\"*+<|>\"", "\\\"");
            content = content.replaceAll("(?i)<(?![^>]).+>", "</");
            assertEquals(content, attributes.get(s));
        }
    }

    @Test
    public void testGetUserid() throws ActionException {
        String name = "Inyoka";
        Userinfo userinfo = new Userinfo(name, "Inyoka", System.currentTimeMillis());

        wiki.add(userinfo);
        Article a = new SimpleArticle(name);
        Set<Userinfo> users = new UserinfoSet(a);
        assertFalse(Userinfo.isValid(a));
        Action.getUser(userinfo);
        assertFalse(Userinfo.isValid(a));

        articleContents(a, a);
        articleAttributes(a, a);
        articleContents(a, ai);
        articleAttributes(a, ai);
        articleContents(a, a);
    }
}
