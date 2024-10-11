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
* It contains one unit test case for the {@link FileUpload#hasMoreMessages()} method.
*/
class FileUploadTest {
		
  /**
   * {@link FileUpload#hasMoreMessages()} returns: <code>false</code>,
   * which must be checked by the super classes for proper behavior.
   */
   @Test
   public void defaultHasMoreMessagesReturnsFalse() {
	assertFalse("FileUpload must return false for FileUpload.hasMoreMessages() for a MediaWiki instance",
		    FileUpload.hasMoreMessages(getBot()));
  }
	
    @Test
    public void testHasMoreMessagesWorks() throws ProcessException {
      //
      // For MediaWiki, you would want to send POST request to MediaWiki,
      // send a FileUpload to Mediawiki, get the FileContent, send the
      // POST request to the MediaWiki and get the new Version.
      // We will set the value to <b>true</b>
      //
      getBot().sendRequest("POST", "/wiki/Users/me/edit", new byte[] { (byte)0, (byte)1})
           .addParameter("u", "test@test.test")
           .execute()
           .processResponse();
        
      // The following test must be synchronized
      //
      while(hasMoreMessages())
        Thread.sleep(100);

      // At this point, the Post is sent
      //
      FileUpload.hasMoreMessages(getBot());
    }


    /**
     * {@link FileUpload#hasMoreMessages()} checks the values returned by MediaWiki in the
     * response: <b>true</b>, <b>false</b>, <b>false</b>, <b>false</b>
     */
    @Test
    public void hasMoreMessagesReturnsFalseForKnownVersions() throws ProcessException {
      //
      // To handle MediaWiki versions, we know which MediaWiki Bot it is connected to
      // (that does not include <b>any</b> information)
      //
      MediaWikiBot bot1 = MediaWikiBot.create(getBot().getServerHost() + "Bot1", getBot().getServerPort(), "", "");
      assertNotNull("MediaWikiBot.create() must not throw an exception",
          bot1);
      assertEquals("Bot1 must not return the version number if it is not the Bot1 version",
          getBot().getVersion(), bot1.getVersion());
      
      //
      // To handle MediaWiki versions, we know which Bot1 Bot it is connected to (it does not include
      // any information)
      //
      MediaWikiBot bot2 = MediaWiki.getInstance(getBot().getServerHost() + "Bot2", getBot().getServerPort(), "", "");
      assertNotNull("MediaWiki.getInstance() must not throw an exception",
          bot2);
      assertEquals("Bot2 must not return the version number if it is the Bot2 version",
          getBot().getVersion(), bot2.getVersion());
      
      FileUpload u1  = getFileUpload(bot1);
      String version1 = "13.11.7";
    
      //
      // And for MediaWiki versions 11.12.5 and 11.12.6
      //
      u1 = getFileUpload("8.10.15");
    
      //
      // After checking the version, there must be another version
      //
      FileUpload u2  = getFileUpload(bot2);
      assertNotNull("FileUpload.getFileUpload must not throw a ProcessException if Bot1 and Bot2 do not have MediaWiki Bot version info",
          u2);
    
      String version2 = "14.11.7";
    
      //
      //
}
}