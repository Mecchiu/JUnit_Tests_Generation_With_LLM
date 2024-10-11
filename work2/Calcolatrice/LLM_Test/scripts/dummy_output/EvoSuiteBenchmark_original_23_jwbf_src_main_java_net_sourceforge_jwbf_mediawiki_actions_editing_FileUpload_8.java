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
		
	static final Pattern pattern = Pattern.compile("\\\\/mediawiki([0-9]+)\\\\", Pattern.DOTALL);
	
	@Test
	void testUpload() {
		// Prepare
		log.info("Testing if media wiki has one upload");
		String version = MediaWiki.getVersion();
		if (!StringUtils.equals(version, "1.12")) {
			assertTrue(false, "No media wiki 1.12 uploaded yet");
		}
		
		String[] files = {"data/test001.php", "data/test002.php", "data/test003.php", "data/test004.php", "data/test005.php", "data/test006.php"};
		
		String user = "test";
		if (user!= null) {
			// Prepare bot
			MediaWikiBot bot = MediaWikiBot.getInstance();
			bot.setDataDir(".");
			log.info("BOT URL: " + bot.getProtocol() + "://" + bot.getHost() + ":" + bot.getPort() + "@" + bot.getProtocol() + "://");
			
			postGet(new String[]{ "user="+user+" bot=https://" + user + "&format=json" }, bot.getProtocol(), "data/fileupload/" + user+","+files[0]);
			assertTrue(waitFor(new Runnable() {
				@Override
				public void run() {
					try {
						assertTrue(bot.isActive());
					} catch (Exception e) {
						throw new RuntimeException(e.getMessage(), e);
					}
				}
  			}, 2000));
			
			
			postPost(new String[]{ "user="+user+" form=0" }, bot.getProtocol(), "data/fileupload/" + user+","+files[0]);
			assertTrue(waitFor(new Runnable() {
				@Override
				public void run() {
					try {
						assertTrue(bot.isActive());
					} catch (Exception e) {
						throw new RuntimeException(e.getMessage(), e);
					}
				}
  			}, 2000));
			
		} else
		{
			assertTrue(false);
		}
	}
	
	
	
	boolean isTestFile(File f, String content) {
		// Prepare
		log.info("Testing if media wiki has some specific content for a file ");
		if (!StringUtils.equals(f.toString(), "data/test")) {
			return false;
		}
		
		log.info("Get the url of the content: " + f.toString());
		String url = null;
		try {
			int index = f.toString().indexOf(".php?format=json");
			if (index > 0) {
				index += 9;
			} else {
				index = 9;
			}
			url= f.toString().substring(0, index);
		} catch (FileNotFoundException e) {
			throw new AssertionError(e);
		}
		String type = null;
}
}