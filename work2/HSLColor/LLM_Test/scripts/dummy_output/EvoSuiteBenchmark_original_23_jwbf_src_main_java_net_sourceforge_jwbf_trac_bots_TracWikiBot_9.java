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
		private TracWikiBot bot;

		public TracWikiBotTest(WikiBot trac1) throws MalformedURLException {
			this.bot = (TracWikiBot) trac1;
		}

   @Test
  public void testFindUser() throws ActionException, ProcessException {

      String userinput = bot.readContent("TracWikiUser");
			String[] args = {"TracWikiUser", "/api/v1/users/"};
    	System.out.println("--TEST_USER-- ");
      assertNotNull(userinput);
      assertEquals("TracWikiUser", userinput);

      Userinfo user = bot.getUserinfo();
      assertNotNull(user.getId());
      assertNotNull(user.getUsername());
      assertNotNull(user.getProfileUrl());
  } 

  @Test
  public void testgetUserinfo() throws ActionException, ProcessException {
    assertNull(bot.getUserinfo());
      assertTrue(bot.getUserinfo() instanceof Userinfo);
    HttpBot httpBot = new GetRevision(bot);
    String[] args = {"/api/v1/users/"};
    httpBot.setAuthorizer(null); // prevent cache.
    ContentAccessable content =  httpBot.runGetContent(args);
      assertTrue(content instanceof Userinfo);
      assertNull(httpBot.getUserinfo());
      Userinfo result = httpBot.getUserinfo();

      /** the authorizer must already set the contentAccessable to a Userinfo so that it
       * gets the userid
	 * @throws MalformedURLException
	 *           where authorizer does not return a Userinfo yet
	 */
      assertNotNull(httpBot.getContent());
    assertNotNull(result.getId());
    assertNotNull(result.getUsername());
      assertNotNull(result.getProfileUrl());
  }


    @Test
  public void testPutUserinfo() throws ActionException, ProcessException {
    assertNull(bot.getUserinfo());
      assertTrue(bot.getUserinfo() instanceof Userinfo);
      Userinfo user = bot.getUserinfo();
      //System.out.println("user: " + user);
      ContentAccessable content =  httpBot.runPutContent(getUserInput(), user);
      assertEquals("Userinfo", content);
    assertEquals(user.getId().longValue(), ((Userinfo)content).getId().longValue());
    assertNull(httpBot.getUserinfo());
    Userinfo userinfo = new Userinfo((long)0);
    long uid = userinfo.getId();
    userinfo.setId((long)1);
    assertEquals(userinfo.getId(), ((Userinfo)content).getId());
    assertNotNull(httpBot.getUserinfo());
    assertEquals(user.getProfileUrl().longValue(), ((Userinfo)content).getProfileUrl().longValue());


/*  }
    /**
	 * @see TracWikiBot#delete(String)
	 */
}
}