// GetApiToken.java
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

/**
 * Action class using the MediaWiki-<a
 * href="http://www.mediawiki.org/wiki/API:Changing_wiki_content"
 * >Editing-API</a>. <br />
 * Its job is to get the token for some actions like delete or edit.
 *
 * @author Max Gensthaler
 * @author Thomas Stock
 */
@Slf4j
@SupportedBy({ MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
public final class GetApiToken extends MWAction {

    // to support different URIs for different actions.
    public enum Intoken {

        DELETE,
        EDIT,
        MOVE,
        PROTECT,
        EMAIL,
        BLOCK,
        UNBLOCK,
        IMPORT
    }

    private String token = "";

    private boolean first = true;

    private Intoken intoken = null;

    private Get msg;

    /**
     * Constructs a new <code>GetToken</code> action.
     *
     * @param intoken
     *          type to get the token for
     * @param title
     *          title of the article to generate the token for
     * @param si
     *          site info object
     * @param ui
     *          user info object
     * @throws VersionException
     *           if this action is not supported of the MediaWiki version
     *           connected to
     */
    public GetApiToken(Intoken intoken, String title, Version v, Userinfo ui) throws VersionException {
        this.intoken = intoken;
        generateTokenRequest(intoken, title);
        msg = new Get(token);
    }

    /**
     * Generates the next MediaWiki API token and adds it to <code>msgs</code>.
     *
     * @param intoken
     *          type to get the token for
     * @param title
     *          title of the article to generate the token for
     */
    private void generateTokenRequest(Intoken intoken, String title) {
        String action = "";
        switch (intoken) {
            case DELETE:
                action = "delete";
                break;
            case EDIT:
                action = "edit";
                break;
            case MOVE:
                action = "move";
                break;
            case PROTECT:
                action = "protect";
                break;
            case EMAIL:
                action = "email";
                break;
            case BLOCK:
                action = "block";
                break;
            case UNBLOCK:
                action = "unblock";
                break;
            case IMPORT:
                action = "import";
                break;
        }
        if (first) {
            token = "/api.php?action=query&prop=info&intoken=" + action + "&titles=" + title;
            first = false;
        } else {
            token = "/api.php?action=query&prop=info&intoken=" + action + "&titles=" + title + "&" + token.substring(1);
        }
    }

    /**
     * Returns the requested token after parsing the result from MediaWiki.
     *
     * @return the requested token
     */
    protected String getToken() {
        return token;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String processReturningText(String s, HttpAction hm) throws ProcessException {
        try {
            SAXBuilder builder = new SAXBuilder();
            Document doc = builder.build(new InputSource(new StringReader(s)));
            process(doc);
        } catch (JDOMException e) {
            log.error("Could not parse token from returning text", e);
        } catch (IOException e) {
            log.error("Could not parse token from returning text", e);
        }
        return "";
    }

    /**
     * {@inheritDoc}
     */
    public HttpAction getNextMessage() {
        return msg;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean hasMoreMessages() {
        return token.length() > 0;
    }

    /**
     * Processing the XML {@link Document} returned from the MediaWiki API.
     *
     * @param doc
     *          XML <code>Document</code>
     * @throws JDOMException
     *           thrown if the document could not be parsed
     */
    private void process(Document doc) {
        Element root = doc.getRootElement();
        Element pages = root.getChild("query").getChild("pages");
        Element page = (Element) pages.getChildren().get(0);
        Element tokenElement = page.getChild(intoken.toString() + "token");
        if (tokenElement != null) {
            token = tokenElement.getAttributeValue("token");
        } else {
            token = "";
        }
    }
}

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
* It contains ten unit test cases for the {@link GetApiToken#hasMoreMessages()} method.
*/
class GetApiTokenTest {

    /**
     * Test method for {@link GetApiToken#hasMoreMessages()}.
     * Test case: token is not empty.
     */
    @Test
    void testHasMoreMessagesTrue() {
        GetApiToken token = new GetApiToken(GetApiToken.Intoken.EDIT, "Test", MW1_12, new Userinfo("TestUser", "TestPassword"));
        token.processReturningText("<api><query><pages><page><edittoken token=\"testToken\" /></page></pages></query></api>", null);
        assertTrue(token.hasMoreMessages());
    }

    /**
     * Test method for {@link GetApiToken#hasMoreMessages()}.
     * Test case: token is empty.
     */
    @Test
    void testHasMoreMessagesFalse() {
        GetApiToken token = new GetApiToken(GetApiToken.Intoken.EDIT, "Test", MW1_12, new Userinfo("TestUser", "TestPassword"));
        token.processReturningText("<api><query><pages><page></page></pages></query></api>", null);
        assertFalse(token.hasMoreMessages());
    }

    /**
     * Test method for {@link GetApiToken#hasMoreMessages()}.
     * Test case: token is null.
     */
    @Test
    void testHasMoreMessagesNull() {
        GetApiToken token = new GetApiToken(GetApiToken.Intoken.EDIT, "Test", MW1_12, new Userinfo("TestUser", "TestPassword"));
        assertFalse(token.hasMoreMessages());
    }

    /**
     * Test method for {@link GetApiToken#hasMoreMessages()}.
     * Test case: token is not empty after multiple requests.
     */
    @Test