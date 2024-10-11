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
     * Test case: first is true and second is false.
     */
    @Test
    void testHasMoreMessagesFirstTrueSecondFalse() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.first = true;
        fileUpload.second = false;
        assertTrue(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * Test case: first is false and second is true.
     */
    @Test
    void testHasMoreMessagesFirstFalseSecondTrue() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.first = false;
        fileUpload.second = true;
        assertTrue(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * Test case: first is true and second is true.
     */
    @Test
    void testHasMoreMessagesFirstTrueSecondTrue() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.first = true;
        fileUpload.second = true;
        assertTrue(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * Test case: first is false and second is false.
     */
    @Test
    void testHasMoreMessagesFirstFalseSecondFalse() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.first = false;
        fileUpload.second = false;
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * Test case: first is true and second is null.
     */
    @Test
    void testHasMoreMessagesFirstTrueSecondNull() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.first = true;
        fileUpload.second = null;
        assertTrue(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * Test case: first is null and second is true.
     */
    @Test
    void testHasMoreMessagesFirstNullSecondTrue() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.first = null;
        fileUpload.second = true;
        assertTrue(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * Test case: first is null and second is false.
     */
    @Test
    void testHasMoreMessagesFirstNullSecondFalse() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.first = null;
        fileUpload.second = false;
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * Test case: first is false and second is null.
     */
    @Test
    void testHasMoreMessagesFirstFalseSecondNull() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.first = false;
        fileUpload.second = null;
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * Test case: first is null and second is null.
     */
    @Test
    void testHasMoreMessagesFirstNullSecondNull() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.first = null;
        fileUpload.second = null;
        assertFalse(fileUpload.hasMoreMessages());
    }

    /**
     * Test method for {@link FileUpload#hasMoreMessages()}.
     * Test case: first is true and second is true and hasMoreMessages is called twice.
     */
    @Test
    void testHasMoreMessagesFirstTrueSecondTrueTwice() {
        FileUpload fileUpload = new FileUpload();
        fileUpload.first = true;
        fileUpload.second = true;
        assertTrue(fileUpload.hasMoreMessages());
        assertTrue(fileUpload.hasMoreMessages());
    }
}