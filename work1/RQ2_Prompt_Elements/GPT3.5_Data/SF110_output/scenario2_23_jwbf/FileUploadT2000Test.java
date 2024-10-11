// FileUploadTest.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleFile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileUpload}.
* It contains ten unit test cases for the {@link FileUpload#hasMoreMessages()} method.
*/
class FileUploadTest {

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * It tests if the method returns true when called for the first time.
     */
    @Test
    void testHasMoreMessagesFirst() {
        FileUpload fileUpload = new FileUpload();
        assertTrue(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * It tests if the method returns true when called for the second time.
     */
    @Test
    void testHasMoreMessagesSecond() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.hasMoreMessages();
        assertTrue(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * It tests if the method returns false when called for the third time.
     */
    @Test
    void testHasMoreMessagesThird() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * It tests if the method returns false when called for the fourth time.
     */
    @Test
    void testHasMoreMessagesFourth() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * It tests if the method returns false when called for the fifth time.
     */
    @Test
    void testHasMoreMessagesFifth() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * It tests if the method returns false when called for the sixth time.
     */
    @Test
    void testHasMoreMessagesSixth() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * It tests if the method returns false when called for the seventh time.
     */
    @Test
    void testHasMoreMessagesSeventh() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * It tests if the method returns false when called for the eighth time.
     */
    @Test
    void testHasMoreMessagesEighth() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * It tests if the method returns false when called for the ninth time.
     */
    @Test
    void testHasMoreMessagesNinth() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * It tests if the method returns false when called for the tenth time.
     */
    @Test
    void testHasMoreMessagesTenth() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        fileUpload.hasMoreMessages();
        assertFalse(fileUpload.hasMoreMessages());
    }
}